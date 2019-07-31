package pers.pete.wechat.response;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType
@XmlRootElement(name = "xml")
@XmlType
public class UnifiedOrder extends BaseResponse {

  private String prepayId;

  private String tradeType;

  private String codeUrl;

  @XmlElement(name = "prepay_id")
  public String getPrepayId() {
    return prepayId;
  }

  public void setPrepayId(String prepayId) {
    this.prepayId = prepayId;
  }

  @XmlElement(name = "trade_type")
  public String getTradeType() {
    return tradeType;
  }

  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }

  @XmlElement(name = "code_url")
  public String getCodeUrl() {
    return codeUrl;
  }

  public void setCodeUrl(String codeUrl) {
    this.codeUrl = codeUrl;
  }

  @Override
  public String toString() {
    return "UnifiedOrder{" +
      "deviceInfo='" + deviceInfo + '\'' +
      ", prepayId='" + prepayId + '\'' +
      ", tradeType='" + tradeType + '\'' +
      ", codeUrl='" + codeUrl + '\'' +
      ", returnCode='" + returnCode + '\'' +
      ", returnMsg='" + returnMsg + '\'' +
      ", appid='" + appid + '\'' +
      ", mchId='" + mchId + '\'' +
      ", subMchId='" + subMchId + '\'' +
      ", nonceStr='" + nonceStr + '\'' +
      ", sign='" + sign + '\'' +
      ", resultCode='" + resultCode + '\'' +
      ", errCode='" + errCode + '\'' +
      ", errCodeDes='" + errCodeDes + '\'' +
      '}';
  }
}
