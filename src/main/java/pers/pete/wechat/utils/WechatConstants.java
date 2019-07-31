package pers.pete.wechat.utils;

public class WechatConstants {

  /**
   * 成功
   */
  public static String SUCCESS = "SUCCESS";

  /**
   * 失败
   */
  public static String FAIL = "FAIL";

  /**
   * 签名类型
   */
  public static String MD5 = "MD5";

  /**
   * 签名类型
   */
  public static String HMAC_SHA256 = "HMAC-SHA256";

  /**
   * 签名
   */
  public static String FIELD_SIGN = "sign";

  /**
   * 签名类型
   */
  public static String FIELD_SIGN_TYPE = "sign_type";

  /**
   * 返回状态码
   */
  public static String FIELD_RETURN_CODE = "return_code";

  /**
   * 返回信息
   */
  public static String FIELD_RETURN_MSG = "return_msg";

  /**
   * 业务结果
   */
  public static String FIELD_RESULT_CODE = "result_code";

  /**
   * 错误代码
   */
  public static String FIELD_ERR_CODE = "err_code";
  /**
   * 错误代码描述
   */
  public static String FIELD_ERR_CODE_DES = "err_code_des";

  /**
   * 统一下单
   */
  public static String UNIFIED_ORDER_URL = "https://api.mch.weixin.qq.com/pay/unifiedorder";
  /**
   * 查询订单
   */
  public static String ORDER_QUERY_URL = "https://api.mch.weixin.qq.com/pay/orderquery";
  /**
   * 关闭订单
   */
  public static String CLOSE_ORDER_URL = "https://api.mch.weixin.qq.com/pay/closeorder";
  /**
   * 申请退款
   */
  public static String REFUND_URL = "https://api.mch.weixin.qq.com/secapi/pay/refund";
  /**
   * 查询退款
   */
  public static String REFUND_QUERY_URL = "https://api.mch.weixin.qq.com/pay/refundquery";
}
