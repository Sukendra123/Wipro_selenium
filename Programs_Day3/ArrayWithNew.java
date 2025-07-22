package Programs_Day3;

public class ArrayWithNew {
	public static void main(String[] args) {
        int[] marks = new int[5];
        marks[0] = 90;
        marks[1] = 85;
        marks[2] = 88;
        marks[3] = 92;
        marks[4] = 80;

        for (int i = 0; i < marks.length; i++) {
            System.out.println("Mark " + (i + 1) + ": " + marks[i]);
        }
    }


}
