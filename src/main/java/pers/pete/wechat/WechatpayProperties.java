package pers.pete.wechat;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("wechat")
public class WechatpayProperties {

  /**
   * 应用唯一标识.
   */
  private String appid;

  /**
   * 商户号.
   */
  private String mchId;

  /**
   * 密钥.
   */
  private String apikey;

  /**
   * 回调地址.
   */
  private String notifyUrl;

  public String getAppid() {
    return appid;
  }

  public void setAppid(String appid) {
    this.appid = appid;
  }

  public String getMchId() {
    return mchId;
  }

  public void setMchId(String mchId) {
    this.mchId = mchId;
  }

  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }
}
