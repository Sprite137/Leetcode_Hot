public class Test {
    int leg = 0;

    public Test(){
        System.err.println(leg+1);

    }

    public void hello(){
        System.err.println(leg+3);
    }

    public static void main(String[] args) {
        Test x = new Test();

    }
}
