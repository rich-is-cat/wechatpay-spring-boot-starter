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
   * 子商户号	.
   */
  private String subMchId;

}
