import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        String input1NoSpace = input1.replace(" ", "");
        String input2NoSpace = input2.replace(" ", "");

        System.out.println(input1NoSpace.equals(input2NoSpace));
    }
}