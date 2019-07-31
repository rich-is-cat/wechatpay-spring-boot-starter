package pers.pete.wechat.utils;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.Field;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WechatUtil {

  private static Pattern humpPattern = Pattern.compile("[A-Z]");


  /**
   * JavaBean转换成xml
   * 默认编码UTF-8
   */
  public static String convertToXml(Object obj) {
    return convertToXml(obj, "UTF-8");
  }

  /**
   * JavaBean转换成xml
   */
  public static String convertToXml(Object obj, String encoding) {
    String result = null;
    try {
      JAXBContext context = JAXBContext.newInstance(obj.getClass());
      Marshaller marshaller = context.createMarshaller();
      marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
      marshaller.setProperty(Marshaller.JAXB_ENCODING, encoding);

      StringWriter writer = new StringWriter();
      marshaller.marshal(obj, writer);
      result = writer.toString();
    } catch (Exception e) {
      e.printStackTrace();
    }
    return result;
  }

  /**
   * xml转换成JavaBean
   */
  @SuppressWarnings("unchecked")
  public static <T> T converyToJavaBean(String xml, Class<T> c) {
    T t = null;
    try {
      JAXBContext context = JAXBContext.newInstance(c);
      Unmarshaller unmarshaller = context.createUnmarshaller();
      t = (T) unmarshaller.unmarshal(new StringReader(xml));
    } catch (Exception e) {
      e.printStackTrace();
    }

    return t;
  }

  /**
   * 生成随机字符串
   *
   * @return 随机字符串
   */
  public static String nonceStr() {
    return UUID.randomUUID().toString().replaceAll("-", "");
  }

  /**
   * 签名.
   */
  public static String generateSignature(Object param, String apiKey, SignType signType) {
    Class clazz = param.getClass();
    List<Field> fields = new ArrayList<>(Arrays.asList(clazz.getDeclaredFields()));
    Class superClazz = clazz.getSuperclass();
    if (null != superClazz && !superClazz.getName().toLowerCase().equals("java.lang.object")) {
      fields.addAll(Arrays.asList(clazz.getSuperclass().getDeclaredFields()));
    }
    Map<String, String> map = new HashMap<>();
    for (Field field : fields) {
      field.setAccessible(true);
      try {
        if (null != field.get(param)) {
          map.put(humpToLine(field.getName()), String.valueOf(field.get(param)));
        }
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }
      /*try {
        if (null != field.get(param) && field.isAnnotationPresent(XmlElement.class)) {
          map.put(field.getAnnotation(XmlElement.class).name(), String.valueOf(field.get(param)));
        }
      } catch (IllegalAccessException e) {
        e.printStackTrace();
      }*/
    }

    // 排序组装数据
    List<String> keyList = new ArrayList<>(map.keySet());
    Collections.sort(keyList);

    // 组装待签名字符串
    StringBuilder stringBuilder = new StringBuilder();
    for (String key : keyList) {
      // 签名字段直接跳过
      if (WechatConstants.FIELD_SIGN.equals(key)) {
        continue;
      }
      // 参数值为空，则不参与签名
      if (map.get(key).trim().length() > 0) {
        stringBuilder.append(key).append("=").append(map.get(key).trim()).append("&");
      }
    }
    stringBuilder.append("key=").append(apiKey);
    String preSign = stringBuilder.toString();
    // 对字符串签名
    switch (signType) {
      case MD5:
        return md5(preSign).toUpperCase();
      case HMAC_SHA256:
        return hmacSHA256(preSign, apiKey).toUpperCase();
      default:
        throw new RuntimeException("Sign type is invalid");
    }
  }

  /**
   * 使用md5加密
   *
   * @param str 待加密的字符串
   * @return 加密后的字符串
   */
  private static String md5(String str) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      MessageDigest md5 = MessageDigest.getInstance("MD5");
      byte[] bytes = md5.digest(str.getBytes(StandardCharsets.UTF_8));
      for (byte b : bytes) {
        stringBuilder.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 3);
      }
      return stringBuilder.toString();
    } catch (NoSuchAlgorithmException e) {
      throw new RuntimeException("md5 encode failed");
    }
  }

  /**
   * 使用hmacSHA256加密
   *
   * @param str 待加密的字符串
   * @param key 密钥
   * @return 加密后的字符串
   */
  private static String hmacSHA256(String str, String key) {
    try {
      StringBuilder stringBuilder = new StringBuilder();
      Mac hmacSHA256 = Mac.getInstance("HmacSHA256");
      SecretKeySpec secretKeySpec = new SecretKeySpec(key.getBytes(StandardCharsets.UTF_8), "HmacSHA256");
      hmacSHA256.init(secretKeySpec);
      byte[] bytes = hmacSHA256.doFinal(str.getBytes(StandardCharsets.UTF_8));
      for (byte b : bytes) {
        stringBuilder.append(Integer.toHexString((b & 0xFF) | 0x100), 1, 3);
      }
      return stringBuilder.toString();
    } catch (NoSuchAlgorithmException | InvalidKeyException e) {
      throw new RuntimeException("hmacsha256 encode failed");
    }
  }

  /**
   * 驼峰转下划线.
   */
  private static String humpToLine(String str) {
    Matcher matcher = humpPattern.matcher(str);
    StringBuffer sb = new StringBuffer();
    while (matcher.find()) {
      matcher.appendReplacement(sb, "_" + matcher.group(0).toLowerCase());
    }
    matcher.appendTail(sb);
    return sb.toString();
  }

}
