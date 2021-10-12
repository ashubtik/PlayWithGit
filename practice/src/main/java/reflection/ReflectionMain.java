package reflection;

import java.lang.reflect.Field;

public class ReflectionMain {
    public static void main(String[] args) {
        ReflectionClass a = new ReflectionClass();
        Field f = null;
        try {
            f = ReflectionClass.class.getDeclaredField("shit");
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
        assert f != null;
        f.setAccessible(true);
        String fieldValue = null;
        try {
            fieldValue = (String)f.get(a);
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println(fieldValue);
    }
}
