package programs_day5;

interface Printable {
    void connectDevice();
}

interface Scannable {
    void connectDevice();
}

interface Faxable {
    void connectDevice();
}

class AllInOneMachine implements Printable, Scannable, Faxable {
    public void connectDevice() {
        System.out.println("Device connected successfully.");
    }
}

public class Interfaceswithcommmethodscall {
    public static void main(String[] args) {
        AllInOneMachine machine = new AllInOneMachine();
        machine.connectDevice();  // One method serves all interfaces
    }
}
