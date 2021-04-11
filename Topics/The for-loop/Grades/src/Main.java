import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int grade = scanner.nextInt();
        int gradeA = 0;
        int gradeB = 0;
        int gradeC = 0;
        int gradeD = 0;

        for (int i = 1; i <= grade; i++) {
            int nextGrade = scanner.nextInt();
            if (nextGrade == 5) {
                gradeA++;
            } else if (nextGrade == 4) {
                gradeB++;
            } else if (nextGrade == 3) {
                gradeC++;
            } else if (nextGrade == 2) {
                gradeD++;
            }
        }
        System.out.println(gradeD + " " + gradeC + " " + gradeB + " " + gradeA);
    }
}
/*
        int number = scanner.nextInt();
        int max = 0;

        for (int i = 1; i <= number; i++) {
            int nextNumber = scanner.nextInt();
            if (nextNumber % 4 == 0 && nextNumber > max) {
                max = nextNumber;
            }
        }
        System.out.println(max);
        -------------------
        double a = scanner.nextInt();
        double b = scanner.nextInt();
        double add = 0;
        double numDivisible = 0;
        double average = 0;

        for (double start = a; a <= b; a++) {
            if (a % 3 == 0) {
                add += a;
                numDivisible++;
                average = add / numDivisible;
            }
        }
        System.out.println(average);
 */