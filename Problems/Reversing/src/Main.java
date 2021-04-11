import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();

        int first = number % 10;
        int second = number / 10 % 10;
        int third = number / 100;

        int result = first * 100 + second * 10 + third;

        System.out.println(result);
    }
}
