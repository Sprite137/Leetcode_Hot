package oneInstance;

public class Full {

//    private static Full singleton;
//    public Full getInstance(){
//        if(singleton==null){
//            singleton = new Full();
//        }
//        return singleton;
//    }

    private static Full INSTANCE;

    public Full getINSTANCE(){
        if(INSTANCE==null){
            INSTANCE = new Full();
        }
        return INSTANCE;
    }
}
