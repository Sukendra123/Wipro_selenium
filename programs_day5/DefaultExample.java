package programs_day5;

//allows us to define a concrete method in an interface
//Normally interfaces have only abstract methods
//But with default, we can provide a working method inside the interface
// Any class implementing the the interface can use it directly or override it.


interface MyInterface {
    // default method
    default void showMessage() {
        System.out.println("This is a default method in interface.");
    }
}

public class DefaultExample implements MyInterface {
    public static void main(String[] args) {
        DefaultExample obj = new DefaultExample();
        obj.showMessage();  // calls default method
    }
}
