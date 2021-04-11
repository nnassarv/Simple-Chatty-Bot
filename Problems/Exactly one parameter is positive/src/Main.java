import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean checkOne = one > 0 && two <= 0 && three <= 0;
        boolean checkTwo = one <= 0 && two > 0 && three <= 0;
        boolean checkThree = one <= 0 && two <= 0 && three > 0;

        boolean review = checkOne || checkTwo || checkThree;

        System.out.println(review);
    }
}