import java.util.Scanner;

public class GPAFunctionAPP {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many courses do you have?");
        int courses = scanner.nextInt();
        double[] grades = new double[courses];
        double[] credits = new double[courses];

       for (int i = 0; i < courses; i++) {
           System.out.println("Enter the numerical grade for the course " + (i + 1) + ": ");
           grades[i] = scanner.nextDouble();

           System.out.println("Enter credits for the course " + (i + 1) + ": ");
           credits[i] = scanner.nextDouble();

       }

       double gpa = computeGPA(grades, credits);

       System.out.printf("Your calculated GPA is: %.2f", gpa);

       scanner.close();
    }

    public static double computeGPA (double[] grades, double[] credits) {

        double totalGrades = 0;
        double totalCredits = 0;

        for (int i = 0; i < grades.length; i++) {
            totalGrades += grades[i] * credits[i];
            totalCredits += credits[i];
        }

        //grades[i]*credits[i], etc..

        //((3.33)(4) + (1.67)(3) + (4.0)(2))/(4+3+2)
        return totalGrades / totalCredits;
    }
}
