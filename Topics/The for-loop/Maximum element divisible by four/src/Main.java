import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int max = 0;

        for (int i = 1; i <= number; i++) {
            int nextNumber = scanner.nextInt();
            if (nextNumber % 4 == 0 && nextNumber > max) {
                max = nextNumber;
            }
        }
        System.out.println(max);
    }
}