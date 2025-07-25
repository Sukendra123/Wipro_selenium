package programs_day5;

interface A {
    void display();
}

interface B {
    void display();
}

interface C {
    void display();
}

// Class implementing all three interfaces
class MyClass implements A, B, C {
    // Only one implementation needed for display() since all are same
    public void display() {
        System.out.println("Display method from A, B, and C");
    }
}

public class Interfaceswithcommonmethodscall {
    public static void main(String[] args) {
        MyClass obj = new MyClass();

        // Calling display using the object
        obj.display();

        // You can also use interface references
        A a = obj;
        B b = obj;
        C c = obj;

        a.display();
        b.display();
        c.display();
    }
}
