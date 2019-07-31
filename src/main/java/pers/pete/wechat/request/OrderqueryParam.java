package pers.pete.wechat.request;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import java.io.UnsupportedEncodingException;

@XmlAccessorType
@XmlRootElement(name = "xml")
@XmlType
public class OrderqueryParam extends BaseParam {

  /**
   * 商户订单号.
   */
  private String outTradeNo;


  @XmlElement(name = "out_trade_no", required = true)
  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

}
