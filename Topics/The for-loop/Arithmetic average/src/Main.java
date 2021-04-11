import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

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
    }
}