import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String a = scanner.nextLine();

        //characters are starting from left to right
        char one = a.charAt(0);
        char two = a.charAt(1);
        char three = a.charAt(2);
        char four = a.charAt(3);

        boolean isSymmetric = one == four && two == three;

        if (isSymmetric) {
            System.out.println("1");
        } else {
            System.out.println("2");
        }
    }
}