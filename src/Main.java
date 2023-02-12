import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        System.out.println("Hello world!");
        Customer customer = new Customer("Michael", 19);
        System.out.println(customer.getAge() + " " + customer.getName());
        Field[] customerFields = customer.getClass().getDeclaredFields();

        for (Field field : customerFields) {

            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(customer, "David warner");
            }
        }
        System.out.println(customer.getAge() + " " + customer.getName());

        Method[] customerMethods = customer.getClass().getDeclaredMethods();
        for (Method method : customerMethods) {
            if (method.getName().equals("thisIsPublicStaticMethod")) {
                //method.setAccessible(true);
                method.invoke(null);
            }
            if (method.getName().equals("thisIsPrivateStaticMethod")) {
                method.setAccessible(true);
                method.invoke(null);
            }
            if (method.getName().equals("thisIsPrivateMethod")) {
                method.setAccessible(true);
                method.invoke(customer);
            }
        }
    }
}