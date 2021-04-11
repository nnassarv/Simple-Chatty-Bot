import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int inputValue = scanner.nextInt();

        boolean checkValue = inputValue < 10 && inputValue > 0;
        System.out.println(checkValue);
    }
}
