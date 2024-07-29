package oneInstance;

public class DoubleFull {
//    private static volatile DoubleFull singleton;
//
//    public DoubleFull getInstance(){
//        if(singleton==null){
//            synchronized (DoubleFull.class){
//                if(singleton==null){
//                    singleton = new DoubleFull();
//                }
//            }
//        }
//
//        return singleton;
//    }

   private static volatile DoubleFull singleton;

   public DoubleFull getInstance(){
       if(singleton==null){
           synchronized (DoubleFull.class){
               if(singleton==null){
                   singleton = new DoubleFull();
               }
           }
       }
       return singleton;
   }

}
