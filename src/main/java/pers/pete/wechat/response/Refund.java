package pers.pete.wechat.response;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType
@XmlRootElement(name = "xml")
@XmlType
public class Refund extends BaseResponse {

  // 子商户公众账号ID	sub_appid

  // 微信订单号
  private String transactionId;

  // 商户订单号
  private String outTradeNo;

  // 商户退款单号
  private String outRefundNo;

  // 微信退款单号
  private String refundId;

  // 申请退款金额
  private String refundFee;

  // 退款金额
  private String settlementRefundFee;

  // 订单金额
  private String totalFee;

  // 应结订单金额
  private String settlementTotalFee;

  // 货币种类
  private String feeType;

  // 现金支付金额
  private String cashFee;

  // 现金退款金额
  private String cashRefundFee;

  // 代金券退款总金额
  private String couponRefundFee;

  // 退款代金券使用数量
  private String couponRefundCount;

  @XmlElement(name = "transaction_id")
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  @XmlElement(name = "out_trade_no")
  public String getOutTradeNo() {
    return outTradeNo;
  }

  public void setOutTradeNo(String outTradeNo) {
    this.outTradeNo = outTradeNo;
  }

  @XmlElement(name = "out_refund_no")
  public String getOutRefundNo() {
    return outRefundNo;
  }

  public void setOutRefundNo(String outRefundNo) {
    this.outRefundNo = outRefundNo;
  }

  @XmlElement(name = "refund_id")
  public String getRefundId() {
    return refundId;
  }

  public void setRefundId(String refundId) {
    this.refundId = refundId;
  }

  @XmlElement(name = "refund_fee")
  public String getRefundFee() {
    return refundFee;
  }

  public void setRefundFee(String refundFee) {
    this.refundFee = refundFee;
  }

  @XmlElement(name = "settlement_refund_fee")
  public String getSettlementRefundFee() {
    return settlementRefundFee;
  }

  public void setSettlementRefundFee(String settlementRefundFee) {
    this.settlementRefundFee = settlementRefundFee;
  }

  @XmlElement(name = "total_fee")
  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }

  @XmlElement(name = "settlement_total_fee")
  public String getSettlementTotalFee() {
    return settlementTotalFee;
  }

  public void setSettlementTotalFee(String settlementTotalFee) {
    this.settlementTotalFee = settlementTotalFee;
  }

  @XmlElement(name = "fee_type")
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  @XmlElement(name = "cash_fee")
  public String getCashFee() {
    return cashFee;
  }

  public void setCashFee(String cashFee) {
    this.cashFee = cashFee;
  }

  @XmlElement(name = "cash_refund_fee")
  public String getCashRefundFee() {
    return cashRefundFee;
  }

  public void setCashRefundFee(String cashRefundFee) {
    this.cashRefundFee = cashRefundFee;
  }

  @XmlElement(name = "coupon_refund_fee")
  public String getCouponRefundFee() {
    return couponRefundFee;
  }

  public void setCouponRefundFee(String couponRefundFee) {
    this.couponRefundFee = couponRefundFee;
  }

  @XmlElement(name = "coupon_refund_count")
  public String getCouponRefundCount() {
    return couponRefundCount;
  }

  public void setCouponRefundCount(String couponRefundCount) {
    this.couponRefundCount = couponRefundCount;
  }
}
