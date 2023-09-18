package OOP;
import java.lang.reflect.*;

public class Reflection {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Employee e = new Employee("Diya", 60000);
        Class cls = e.getClass(); //one of the feature of reflection
        System.out.println(("Class  name is " + cls.getName()));
        Method[] methods = cls.getMethods();
        for (Method m : methods) {
            System.out.println(m.getName());
        }

        try {
            System.out.println(methods[3].invoke(e, null)); // methods[3] is getclass. So it executes and give the class... it is use for giving the method's index number and get details....
        } catch (IllegalAccessException ex) {
            throw new RuntimeException(ex);
        } catch (InvocationTargetException ex) {
            throw new RuntimeException(ex);
        }
    }
}
