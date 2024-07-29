package oneInstance;

public class Hungry {
    private static final Hungry instance = new Hungry();

    private Hungry(){};

    private static Hungry getInstance(){
        return instance;
    }

//    public static final Hungry INSTANCE = new Hungry();
//
//    public Hungry getInstance(){
//        return INSTANCE;
//    }
}
