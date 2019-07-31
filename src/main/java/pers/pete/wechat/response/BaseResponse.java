package pers.pete.wechat.response;

import javax.xml.bind.annotation.XmlElement;

public abstract class BaseResponse {

  protected String returnCode;

  protected String returnMsg;

  protected String appid;

  protected String mchId;

  protected String subMchId;

  protected String nonceStr;

  protected String sign;

  protected String resultCode;

  protected String errCode;

  protected String errCodeDes;

  protected String deviceInfo;

  @XmlElement(name = "return_code")
  public String getReturnCode() {
    return returnCode;
  }

  public void setReturnCode(String returnCode) {
    this.returnCode = returnCode;
  }

  @XmlElement(name = "return_msg")
  public String getReturnMsg() {
    return returnMsg;
  }

  public void setReturnMsg(String returnMsg) {
    this.returnMsg = returnMsg;
  }

  @XmlElement(name = "appid")
  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  @XmlElement(name = "mch_id")
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

  @XmlElement(name = "nonce_str")
  public String getNonceStr() {
    return nonceStr;
  }

  public void setNonceStr(String nonceStr) {
    this.nonceStr = nonceStr;
  }

  @XmlElement(name = "sign")
  public String getSign() {
    return sign;
  }

  public void setSign(String sign) {
    this.sign = sign;
  }

  @XmlElement(name = "result_code")
  public String getResultCode() {
    return resultCode;
  }

  public void setResultCode(String resultCode) {
    this.resultCode = resultCode;
  }

  @XmlElement(name = "err_code")
  public String getErrCode() {
    return errCode;
  }

  public void setErrCode(String errCode) {
    this.errCode = errCode;
  }

  @XmlElement(name = "err_code_des")
  public String getErrCodeDes() {
    return errCodeDes;
  }

  public void setErrCodeDes(String errCodeDes) {
    this.errCodeDes = errCodeDes;
  }

  @XmlElement(name = "device_info")
  public String getDeviceInfo() {
    return deviceInfo;
  }

  public void setDeviceInfo(String deviceInfo) {
    this.deviceInfo = deviceInfo;
  }
}
