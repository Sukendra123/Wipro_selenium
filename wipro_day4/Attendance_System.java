package wipro_day4;



import java.util.*;

// Interface
interface Attendance {
 void mark(String studentName, String status);
 void showAttendance();
}

// Class that implements the interface
public class Attendance_System implements Attendance {
 ArrayList<String> names = new ArrayList<>();
 ArrayList<String> statuses = new ArrayList<>();

 public void mark(String studentName, String status) {
     names.add(studentName);
     statuses.add(status);
 }

 public void showAttendance() {
     System.out.println(" Attendance Record:");
     for (int i = 0; i < names.size(); i++) {
         System.out.println(names.get(i) + " - " + statuses.get(i));
     }
 }

 // Main method
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     Attendance_System app = new Attendance_System();

     while (true) {
         System.out.print("Enter student name (or 'done' to finish): ");
         String name = scanner.nextLine();
         if (name.equalsIgnoreCase("done")) {
             break;
         }

         System.out.print("Enter status (Present/Absent): ");
         String status = scanner.nextLine();

         app.mark(name, status);
     }

     app.showAttendance();
 }
}
