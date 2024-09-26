package factotyMode;

public class AliPayFactory implements PayFactory{
    @Override
    public void pay() {
        System.err.println("factory pay");
    }
}
