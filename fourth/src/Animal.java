/**
 * @author sprite-pc
 * @description:
 * @date 2024/8/17 18:40
 */
public class Animal {
    int legs;
    int arms;

    public void sleep(){
        System.err.println("animal sleep");
    }
}

class Dog extends Animal{
    public void sleep(){
        System.err.println("dog sleep");
    }
}

class Cat extends Animal{
    public void sleep(){
        System.err.println("cat sleep");
    }
}


class Test{
    public static void main(String[] args) {
        Animal cat = new Cat();
        cat.sleep();
        Animal dog = new Dog();
        dog.sleep();
    }
}
