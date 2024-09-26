package factotyMode;

public class Demo {
    public static void main(String[] args) {
        DetailPay detailPay = new DetailPay("AliPay");
        detailPay.pay();

        WxPayFactory wxPayFactory = new WxPayFactory();
        wxPayFactory.pay();
    }
}
