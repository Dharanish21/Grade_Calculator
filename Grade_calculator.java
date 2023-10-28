import java.util.Scanner;
public class SimpleGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many subjects do you have? ");
        int numSubjects = scanner.nextInt();
        System.out.print("The highest mark for each subject is 100");
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            totalMarks += scanner.nextInt();
        }
        double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;
        char grade;
        switch ((int) averagePercentage / 10) {
            case 9:
            case 10:
                grade = 'A';
                break;
            case 8:
                grade = 'B';
                break;
            case 7:
                grade = 'C';
                break;
            case 6:
                grade = 'D';
                break;
            default:
                grade = 'F';
        }
        System.out.println("Total Marks: " + totalMarks);
        System.out.printf("Average Percentage: %.2f%%\n", averagePercentage);
        System.out.println("Your Grade: " + grade);
        scanner.close();
    }
}
