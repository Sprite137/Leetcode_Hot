package factotyMode;

public class WxPayFactory implements PayFactory{
    @Override
    public void pay() {
        System.err.println("factory WxPay");
    }
}
