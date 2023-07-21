public class Animal {
    private String name;
    private int age;

    public static void method(){
        System.out.println("java");
    }
    public static void method(String word){
        System.out.println("Java");
    }
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
