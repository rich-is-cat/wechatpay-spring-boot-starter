package pers.pete.wechat.request;

import javax.xml.bind.annotation.XmlElement;

public abstract class BaseParam {

  /**
   * 公众账号ID.
   */
  protected String appid;

  /**
   * 商户号.
   */
  protected String mchId;

  /**
   * 子商户号, 普通商户版非必须, 服务商版必须.
   */
  protected String subMchId;

  /**
   * 随机字符串.
   */
  protected String nonceStr;

  /**
   * 签名.
   */
  protected String sign;

  /**
   * 签名类型.
   */
  protected String signType;

  @XmlElement(name = "appid", required = true)
  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  @XmlElement(name = "mch_id", required = true)
  public String getMchId() {
    return mchId;
  }

  public void setMchId(String mchId) {
    this.mchId = mchId;
  }

  @XmlElement(name = "sub_mch_id")
  public String getSubMchId() {
    return subMchId;
  }

  public void setSubMchId(String subMchId) {
    this.subMchId = subMchId;
  }

  @XmlElement(name = "nonce_str", required = true)
  public String getNonceStr() {
    return nonceStr;
  }

  public void setNonceStr(String nonceStr) {
    this.nonceStr = nonceStr;
  }

  @XmlElement(name = "sign", required = true)
  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  @XmlElement(name = "sign_type")
  public String getSignType() {
    return signType;
  }

  public void setSignType(String signType) {
    this.signType = signType;
  }
}
