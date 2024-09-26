package factotyMode;

public class DetailPay {
    public Factory factory;

    public DetailPay(String s){
        if(s.equals("AliPay")){
            this.factory = new AliPay();
        }
        else{
            this.factory = new WxPay();
        }
    }

    public  DetailPay(){};

    public void pay(){
        factory.pay();
    }
}
