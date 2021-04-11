import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int one = scanner.nextInt();
        int two = scanner.nextInt();
        int three = scanner.nextInt();

        boolean testOne = one >= two && one <= three;
        boolean testTwo = one >= three && one <= two;

        boolean finalTest = testOne || testTwo;

        System.out.println(finalTest);
    }
}