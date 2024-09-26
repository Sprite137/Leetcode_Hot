package strategyMode;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context(new FNS());
        System.err.println(context.genTips());
    }
}
