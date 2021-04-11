import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String input = scanner.next().toLowerCase();
        boolean testInput = input.startsWith("j");

        System.out.println(testInput);
    }
}