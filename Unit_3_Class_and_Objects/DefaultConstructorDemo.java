package Unit_3_Class_and_Objects;

public class DefaultConstructorDemo {

    // Default Constructor
    DefaultConstructorDemo(){
        System.out.println("Default constructor called.");
    }

    public static void main(String[] args) {
        System.out.println("Before creating object.");
        DefaultConstructorDemo obj = new DefaultConstructorDemo();
        System.out.println("After creating object.");
    }
}