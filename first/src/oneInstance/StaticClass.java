package oneInstance;

public class StaticClass {

//    public static class StaticClassInstance{
//        public static final StaticClass instance = new StaticClass();
//    }
//    public static StaticClass getInstance(){
//        return StaticClassInstance.instance;
//    }

    static class SingletonClass{
        final static StaticClass singleton  = new StaticClass();

        public StaticClass getInstance(){
            return singleton;
        }
    }

    public StaticClass getInstance(){
        return SingletonClass.singleton;
    }

}
