package reflectStudy;


import com.sun.jdi.Value;

@SystemLog(id = "1")
public class ReflectExample {
    public static void main(String[] args) {
        SystemLog clazz = ReflectExample.class.getAnnotation(SystemLog.class);
        System.err.println(clazz.id());
    }
}
