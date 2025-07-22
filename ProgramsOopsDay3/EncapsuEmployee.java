package ProgramsOopsDay3;

public class EncapsuEmployee {
	private String name;
    private double salary;

    // Getter and Setter
    public void setName(String n) {
        name = n;
    }

    public void setSalary(double s) {
        salary = s;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Salary: ₹" + salary);
    }
}




