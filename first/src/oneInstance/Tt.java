package oneInstance;

public class Tt extends Ab{
    public int a=8;

    public int getA() {
        return a;
    }

    public void test_no(){
        System.err.println("gun");
    };

    public static void main(String[] args) {
        Ab ab = new Tt();
        ab.test_no();
        System.err.println(ab.getA());
    }
}
