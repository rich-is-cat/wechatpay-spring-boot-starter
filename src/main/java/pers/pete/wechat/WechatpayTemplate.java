package pers.pete.wechat;

import pers.pete.wechat.request.OrderqueryParam;
import pers.pete.wechat.request.UnifiedorderParam;
import pers.pete.wechat.response.Orderquery;
import pers.pete.wechat.service.WechatTradeService;
import pers.pete.wechat.utils.WechatUtil;

import java.io.IOException;

public class WechatpayTemplate {

  public static void main(String[] args) {
    WechatTradeService service = new WechatTradeService("Qianyuan65473988wzmlbjdyfq123456");
    try {
      UnifiedorderParam param = new UnifiedorderParam();
      param.setAppid("wx91b68a2d97cfe9e8");
      param.setMchId("1468432402");
      param.setSubMchId("1496793802");
      param.setNonceStr(WechatUtil.nonceStr());
      param.setBody("描述");
      param.setOutTradeNo(System.currentTimeMillis() + "");
      param.setTotalFee("1");
      param.setSpbillCreateIp("123.12.12.123");
      param.setNotifyUrl("http://www.weixin.qq.com/wxpay/pay.php");
      //UnifiedOrder result = service.unifiedOrder(param);
      //System.out.println(result.toString());

      OrderqueryParam param2 = new OrderqueryParam();
      param2.setAppid("wx91b68a2d97cfe9e8");
      param2.setMchId("1468432402");
      param2.setSubMchId("1496793802");
      param2.setNonceStr(WechatUtil.nonceStr());
      param2.setOutTradeNo("1564385954667");
      Orderquery orderquery = service.orderquery(param2);
      System.out.println(orderquery.toString());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
