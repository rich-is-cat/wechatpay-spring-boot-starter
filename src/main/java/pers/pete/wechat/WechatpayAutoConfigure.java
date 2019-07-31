package pers.pete.wechat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(WechatpayTemplate.class)
@EnableConfigurationProperties(WechatpayProperties.class)
public class WechatpayAutoConfigure {

  private WechatpayProperties properties;

  @Autowired
  public WechatpayAutoConfigure(WechatpayProperties properties) {
    this.properties = properties;
  }

  @Bean
  @ConditionalOnMissingBean
  public WechatpayTemplate wechatpayTemplate() {
    return new WechatpayTemplate();
  }

}
