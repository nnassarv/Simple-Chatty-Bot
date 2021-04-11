import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here

        int groupA = scanner.nextInt();
        int groupB = scanner.nextInt();
        int groupC = scanner.nextInt();

        int totalNumberOfDesks = groupA / 2 + groupA % 2 + groupB / 2 + groupB % 2 +
                groupC / 2 + groupC % 2;

        System.out.println(totalNumberOfDesks);
    }
}