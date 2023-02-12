import java.sql.SQLOutput;

public class Customer {

    private final String name;
    private int age;

    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void walk(){
        System.out.println("Walking......");
    }

    private void thisIsPrivateMethod(){
        System.out.println("I am Private Method");
    }

    private static void thisIsPrivateStaticMethod(){
        System.out.println("I am Private Static Method");
    }
    public static void thisIsPublicStaticMethod(){
        System.out.println("I am Public Static Method");
    }

}
