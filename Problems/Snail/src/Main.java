import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int increasePerDay = a - b;
        int days = (h - b - 1) / increasePerDay + 1;

        System.out.println(days);
    }
}
