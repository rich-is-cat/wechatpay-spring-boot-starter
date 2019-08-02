package pers.pete.wechat;

import pers.pete.wechat.request.OrderqueryParam;
import pers.pete.wechat.request.RefundParam;
import pers.pete.wechat.request.UnifiedorderParam;
import pers.pete.wechat.response.Orderquery;
import pers.pete.wechat.response.Refund;
import pers.pete.wechat.response.UnifiedOrder;
import pers.pete.wechat.service.WechatTradeService;

public class WechatpayTemplate {

  private WechatTradeService wechatTradeService;

  public WechatpayTemplate(String appid, String mchId, String apikey, String notifyUrl) {
    this.wechatTradeService = new WechatTradeService(appid, mchId, apikey, notifyUrl);
  }

  /**
   * trade-1 查询订单.
   */
  public Orderquery orderquery(OrderqueryParam param) {
    return wechatTradeService.orderquery(param);
  }

  /**
   * trade-2 统一下单 C扫B.
   */
  public UnifiedOrder unifiedOrder(UnifiedorderParam param) {
    return wechatTradeService.unifiedOrder(param);
  }

  /**
   * trade-3 B扫c.
   */

  /**
   * trade-4 申请退款.
   */
  public Refund refund(RefundParam param) {
    return wechatTradeService.refund(param);
  }


  /*public static void main(String[] args) {
    try {
      UnifiedorderParam param = new UnifiedorderParam();
      param.setNonceStr(WechatUtil.nonceStr());
      param.setBody("描述");
      param.setOutTradeNo(System.currentTimeMillis() + "");
      param.setTotalFee("1");
      param.setSpbillCreateIp("123.12.12.123");
      param.setNotifyUrl("http://www.weixin.qq.com/wxpay/pay.php");
      //UnifiedOrder result = service.unifiedOrder(param);
      //System.out.println(result.toString());

      OrderqueryParam param2 = new OrderqueryParam();
      param2.setNonceStr(WechatUtil.nonceStr());
      param2.setOutTradeNo("1564385954667");
      Orderquery orderquery = service.orderquery(param2);
      System.out.println(orderquery.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }*/

}
