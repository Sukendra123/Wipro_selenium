package programs_day5;

//Used to define class-level members (shared across all objects).


public class StaticExample {
    static int count = 0;  // static variable

    // static method
    static void showCount() {
        System.out.println("Count is: " + count);
    }

    public static void main(String[] args) {
        StaticExample.count = 10;  // no need to create object
        StaticExample.showCount(); // calling static method directly
    }
}
