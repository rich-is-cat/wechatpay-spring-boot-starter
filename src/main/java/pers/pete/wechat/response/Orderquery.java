package pers.pete.wechat.response;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType
@XmlRootElement(name = "xml")
@XmlType
public class Orderquery extends BaseResponse {

  // 用户标识		
  private String openid;

  // 是否关注公众账号
  private String isSubscribe;

  // 用户子标识
  private String subOpenid;

  // 是否关注子公众账号	
  private String subIsSubscribe;

  // 交易类型		
  private String tradeType;

  // 交易状态		
  private String tradeState;

  // 付款银行		
  private String bankType;

  // 商品详情		
  private String detail;

  // 标价金额		
  private String totalFee;

  // 标价币种		
  private String feeType;

  // 应结订单金额		
  private String settlementTotalFee;

  // 现金支付金额		
  private String cashFee;

  // 现金支付货币类型		
  private String cashFeeType;

  // 代金券金额		
  private String couponFee;

  // 代金券使用数量		
  private String couponCount;

  // 微信支付订单号		
  private String transactionId;

  // 商户订单号		
  private String outTradeNo;

  // 商家数据包		
  private String attach;

  // 支付完成时间		
  private String timeEnd;

  // 交易状态描述		
  private String tradeStateDesc;

  @XmlElement(name = "openid")
  public String getOpenid() {
    return openid;
  }

  public void setOpenid(String openid) {
    this.openid = openid;
  }

  @XmlElement(name = "is_subscribe")
  public String getIsSubscribe() {
    return isSubscribe;
  }

  public void setIsSubscribe(String isSubscribe) {
    this.isSubscribe = isSubscribe;
  }

  @XmlElement(name = "sub_openid")
  public String getSubOpenid() {
    return subOpenid;
  }

  public void setSubOpenid(String subOpenid) {
    this.subOpenid = subOpenid;
  }

  @XmlElement(name = "sub_is_subscribe")
  public String getSubIsSubscribe() {
    return subIsSubscribe;
  }

  public void setSubIsSubscribe(String subIsSubscribe) {
    this.subIsSubscribe = subIsSubscribe;
  }

  @XmlElement(name = "trade_type")
  public String getTradeType() {
    return tradeType;
  }

  public void setTradeType(String tradeType) {
    this.tradeType = tradeType;
  }

  @XmlElement(name = "trade_state")
  public String getTradeState() {
    return tradeState;
  }

  public void setTradeState(String tradeState) {
    this.tradeState = tradeState;
  }

  @XmlElement(name = "bank_type")
  public String getBankType() {
    return bankType;
  }

  public void setBankType(String bankType) {
    this.bankType = bankType;
  }

  @XmlElement(name = "detail")
  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
  }

  @XmlElement(name = "total_fee")
  public String getTotalFee() {
    return totalFee;
  }

  public void setTotalFee(String totalFee) {
    this.totalFee = totalFee;
  }

  @XmlElement(name = "fee_type")
  public String getFeeType() {
    return feeType;
  }

  public void setFeeType(String feeType) {
    this.feeType = feeType;
  }

  @XmlElement(name = "settlement_total_fee")
  public String getSettlementTotalFee() {
    return settlementTotalFee;
  }

  public void setSettlementTotalFee(String settlementTotalFee) {
    this.settlementTotalFee = settlementTotalFee;
  }

  @XmlElement(name = "cash_fee")
  public String getCashFee() {
    return cashFee;
  }

  public void setCashFee(String cashFee) {
    this.cashFee = cashFee;
  }

  @XmlElement(name = "cash_fee_type")
  public String getCashFeeType() {
    return cashFeeType;
  }

  public void setCashFeeType(String cashFeeType) {
    this.cashFeeType = cashFeeType;
  }

  @XmlElement(name = "coupon_fee")
  public String getCouponFee() {
    return couponFee;
  }

  public void setCouponFee(String couponFee) {
    this.couponFee = couponFee;
  }

  @XmlElement(name = "coupon_count")
  public String getCouponCount() {
    return couponCount;
  }

  public void setCouponCount(String couponCount) {
    this.couponCount = couponCount;
  }

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

  @XmlElement(name = "attach")
  public String getAttach() {
    return attach;
  }

  public void setAttach(String attach) {
    this.attach = attach;
  }

  @XmlElement(name = "time_end")
  public String getTimeEnd() {
    return timeEnd;
  }

  public void setTimeEnd(String timeEnd) {
    this.timeEnd = timeEnd;
  }

  @XmlElement(name = "trade_state_desc")
  public String getTradeStateDesc() {
    return tradeStateDesc;
  }

  public void setTradeStateDesc(String tradeStateDesc) {
    this.tradeStateDesc = tradeStateDesc;
  }

  @Override
  public String toString() {
    return "Orderquery{" +
      "openid='" + openid + '\'' +
      ", isSubscribe='" + isSubscribe + '\'' +
      ", subOpenid='" + subOpenid + '\'' +
      ", subIsSubscribe='" + subIsSubscribe + '\'' +
      ", tradeType='" + tradeType + '\'' +
      ", tradeState='" + tradeState + '\'' +
      ", bankType='" + bankType + '\'' +
      ", detail='" + detail + '\'' +
      ", totalFee='" + totalFee + '\'' +
      ", feeType='" + feeType + '\'' +
      ", settlementTotalFee='" + settlementTotalFee + '\'' +
      ", cashFee='" + cashFee + '\'' +
      ", cashFeeType='" + cashFeeType + '\'' +
      ", couponFee='" + couponFee + '\'' +
      ", couponCount='" + couponCount + '\'' +
      ", transactionId='" + transactionId + '\'' +
      ", outTradeNo='" + outTradeNo + '\'' +
      ", attach='" + attach + '\'' +
      ", timeEnd='" + timeEnd + '\'' +
      ", tradeStateDesc='" + tradeStateDesc + '\'' +
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
      ", deviceInfo='" + deviceInfo + '\'' +
      '}';
  }
}

