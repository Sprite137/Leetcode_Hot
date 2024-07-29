import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class HashCodeTest {
    static class Person{
        int age;

        String name;

        public Person(int age, String name){
            this.age = age;
            this.name = name;
        }

        @Override
        public int hashCode(){
            return name.hashCode()+String.valueOf(age).hashCode();
        }

        @Override
        public boolean equals(Object B){
            if (this.hashCode() != B.hashCode()){
                return false;
            }
            else {
                return true;
            }
        }

    }

    public  static int test(){
        try {
            System.err.println("try");
            return 1;
        }
        catch (Exception e){
            return 3;
        }
        finally {
            System.err.println("finally");
            return 2;
        }
    }

    public static void main(String[] args) {
//        Person A = new Person(10,"xz");
//        Person B = new Person(10,"xz");
//        HashSet<Person> set = new HashSet<>();
//        System.err.println(A.equals(B));
//        set.add(A);
//        set.add(B);
//        System.err.println(set);
//        int[] num = new int[10];
//        try {
//            for(int i=0;i<11;i++){
//                num[i] = i;
//            }
//        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
//        f
        String x = "1230";
//        String b = "123";
//        x = x.intern();
//        System.err.println(x==b);
//        System.err.println(test());
        Comparator<Character> comparator = new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return o2-o1;
            }
        };
//        System.err.println(comparator.compare('a', 'b'));
//        int index = 0;
//        Character[] a = new Character[4];
//        for(Character ch: x.toCharArray()){
//            a[index++] = ch;
//        }
//        Integer[] num = {1,2,3,1};
//        System.err.println(1);
//        Arrays.sort(num,((o1, o2) -> o2-o1));
//        System.err.println(Arrays.toString(num));
        Map<Integer,Integer> map = new HashMap<>(0);
        map.put(1,1);
        System.err.println(map);
//        ConcurrentHashMap
    }
}
