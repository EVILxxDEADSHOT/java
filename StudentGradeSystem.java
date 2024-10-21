import java.util.Scanner;

class StudentGradeSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStud = sc.nextInt();

        System.out.print("Enter the number of subjects: ");
        int numSub = sc.nextInt();

        String[] studNames = new String[numStud];
        int[][] grades = new int[numStud][numSub];

        for (int i = 0; i < numStud; i++) {
            System.out.print("Enter name of student " + (i + 1) + ": ");
            studNames[i] = sc.next();
        }

        for (int i = 0; i < numStud; i++) {
            System.out.println("Enter grades for " + studNames[i] + ":");
            for (int j = 0; j < numSub; j++) {
                System.out.print("Subject " + (j + 1) + ": ");
                grades[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < numStud; i++) {
            int tGrades = 0;
            int hGrade = grades[i][0];
            int lGrade = grades[i][0];

            for (int j = 0; j < numSub; j++) {
                tGrades += grades[i][j];
                if (grades[i][j] > hGrade) {
                    hGrade = grades[i][j];
                }
                if (grades[i][j] < lGrade) {
                    lGrade = grades[i][j];
                }
            }

            double aGrade = (double) tGrades / numSub;
            System.out.println("\nStudent: " + studNames[i]);
            System.out.println("Average Grade: " + aGrade);
            System.out.println("Highest Grade: " + hGrade);
            System.out.println("Lowest Grade: " + lGrade);
        }

        sc.close();
    }
}
