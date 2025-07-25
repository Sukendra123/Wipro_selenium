package programs_day5;
//used to define a method but does not return any value
public class VoidExample {
    // method with void return type
    void greet() {
        System.out.println("Hello! Welcome to Java.");
    }

    public static void main(String[] args) {
        VoidExample obj = new VoidExample();
        obj.greet();  // calling the method
    }
}