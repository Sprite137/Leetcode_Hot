import java.util.ArrayList;
import java.util.List;

/**
 * @author sprite-pc
 * @description:
 * @date 2024/10/10 21:51
 */
public class TestOOM {
    static class TestClass{
        String name;
        int age;
        boolean sex;

        TestClass(String name, int age, boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
    }
    public static void main(String[] args) {
        List<TestClass> list = new ArrayList<>();



        while (true){
            list.add(new TestClass("11111111111111111111111111111",10,true));
        }
    }
}
