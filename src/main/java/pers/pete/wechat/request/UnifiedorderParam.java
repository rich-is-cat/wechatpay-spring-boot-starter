package pers.pete.wechat.request;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType
@XmlRootElement(name = "xml")
@XmlType
public class UnifiedorderParam extends BaseParam {

  /**
   * 开发票入口开放标识.
   */
  private String receipt;

  /**
   * 商品描述.
   */
  private String body;

  /**
   * 商品详情.
   */
  private String detail;

  /**
   * 商户订单号.
   */
  private String outTradeNo;

  /**
   * 货币类型.
   */
  private String feeType;

  /**
   * 总金额.
   */
  private String totalFee;

  /**
   * 终端IP.
   */
  private String spbillCreateIp;

  /**
   * 交易起始时间.
   */
  private String time_start;

  /**
   * 交易结束时间.
   */
  private String timeExpire;

  /**
   * 通知地址.
   */
  private String notifyUrl;

  /**
   * 交易类型.
   */
  @XmlElement(name = "trade_type", required = true)
  private String tradeType = "NATIVE";

  @XmlElement(name = "receipt")
  public String getReceipt() {
    return receipt;
  }

  public void setReceipt(String receipt) {
    this.receipt = receipt;
  }

  @XmlElement(name = "body", required = true)
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  @XmlElement(name = "detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @XmlElement(name = "out_trade_no", required = true)
  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  @XmlElement(name = "fee_type")
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  @XmlElement(name = "total_fee", required = true)
  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }

  @XmlElement(name = "spbill_create_ip", required = true)
  public String getSpbillCreateIp() {
    return spbillCreateIp;
  }

  public void setSpbillCreateIp(String spbillCreateIp) {
    this.spbillCreateIp = spbillCreateIp;
  }

  @XmlElement(name = "time_start")
  public String getTime_start() {
    return time_start;
  }

  public void setTime_start(String time_start) {
    this.time_start = time_start;
  }

  @XmlElement(name = "time_expire")
  public String getTimeExpire() {
    return timeExpire;
  }

  public void setTimeExpire(String timeExpire) {
    this.timeExpire = timeExpire;
  }

  @XmlElement(name = "notify_url", required = true)
  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }
}
