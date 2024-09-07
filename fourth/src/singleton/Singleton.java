package singleton;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/9/5 0:41
 */
public class Singleton {
    // 饿汉
    public static volatile Singleton singleton = new Singleton();

    public Singleton getSingleton(){
        return singleton;
    }

    // 懒汉
    public Singleton getSingletonLazy(){
        if(singleton == null){
            return new Singleton();
        }
        return singleton;
    }

    // 双重检查锁
    public Singleton getSingletonDoubleLock(){
        if(singleton == null){
            synchronized (this){
                if(singleton == null){
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

}
