/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int studentCount = sc.nextInt();
        sc.nextLine(); 

        // Arrays to store student names and marks
        String[] names = new String[studentCount];
        int[][] marks = new int[studentCount][];

        // Input student details
        for (int i = 0; i < studentCount; i++) {
            System.out.println("\nStudent " + (i + 1) + ":");
            System.out.print("Enter name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter number of subjects: ");
            int subjectCount = sc.nextInt();

            marks[i] = new int[subjectCount];

            for (int j = 0; j < subjectCount; j++) {
                System.out.print("Enter mark for subject " + (j + 1) + ": ");
                marks[i][j] = sc.nextInt();
            }
            sc.nextLine(); // consume newline
        }

        // Print Report
        System.out.println("\n===== STUDENT GRADE REPORT =====");
        for (int i = 0; i < studentCount; i++) {
            int total = 0, highest = marks[i][0], lowest = marks[i][0];
            for (int mark : marks[i]) {
                total += mark;
                if (mark > highest) highest = mark;
                if (mark < lowest) lowest = mark;
            }
            double average = (double) total / marks[i].length;

            System.out.println("\nStudent: " + names[i]);
            System.out.println("Average Score: " + average);
            System.out.println("Highest Score: " + highest);
            System.out.println("Lowest Score: " + lowest);
        }

        sc.close();
    }
}