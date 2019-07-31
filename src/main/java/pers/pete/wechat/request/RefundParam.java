package pers.pete.wechat.request;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType
@XmlRootElement(name = "xml")
@XmlType
public class RefundParam extends BaseParam {

  // 微信订单号
  // private String transactionId;

  // 商户订单号
  private String outTradeNo;

  // 商户退款单号
  private String outRefundNo;

  // 订单金额 单位为分
  private String totalFee;

  // 申请退款金额 单位为分
  private String refundFee;

  // 退款货币种类
  private String refundFeeType;

  // 退款原因
  private String refundDesc;

  // 退款资金来源
  private String refundAccount;

  // 退款结果通知url
  private String notifyUrl;

  @XmlElement(name = "out_trade_no", required = true)
  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  @XmlElement(name = "out_refund_no", required = true)
  public String getOutRefundNo() {
    return outRefundNo;
  }

  public void setOutRefundNo(String outRefundNo) {
    this.outRefundNo = outRefundNo;
  }

  @XmlElement(name = "total_fee", required = true)
  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }

  @XmlElement(name = "refund_fee", required = true)
  public String getRefundFee() {
    return refundFee;
  }

  public void setRefundFee(String refundFee) {
    this.refundFee = refundFee;
  }

  @XmlElement(name = "refund_fee_type")
  public String getRefundFeeType() {
    return refundFeeType;
  }

  public void setRefundFeeType(String refundFeeType) {
    this.refundFeeType = refundFeeType;
  }

  @XmlElement(name = "refund_desc")
  public String getRefundDesc() {
    return refundDesc;
  }

  public void setRefundDesc(String refundDesc) {
    this.refundDesc = refundDesc;
  }

  @XmlElement(name = "refund_account")
  public String getRefundAccount() {
    return refundAccount;
  }

  public void setRefundAccount(String refundAccount) {
    this.refundAccount = refundAccount;
  }

  @XmlElement(name = "notify_url")
  public String getNotifyUrl() {
    return notifyUrl;
  }

  public void setNotifyUrl(String notifyUrl) {
    this.notifyUrl = notifyUrl;
  }
}
