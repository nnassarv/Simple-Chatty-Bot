import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int numberOfElements = scanner.nextInt();
        int sumOfDivisibleNumbers = 0;

        for (int i = 0; i < numberOfElements; i++) {
            int number = scanner.nextInt();
            if (number % 6 == 0) {
                sumOfDivisibleNumbers += number;
            }
        }
        System.out.println(sumOfDivisibleNumbers);
    }
}