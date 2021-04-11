import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String inputText = scanner.nextLine();
        int parameter1 = scanner.nextInt();
        int parameter2 = scanner.nextInt();

        System.out.println(inputText.substring(parameter1, parameter2 + 1));
    }
}