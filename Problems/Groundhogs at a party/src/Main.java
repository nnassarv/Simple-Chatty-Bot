import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int chocolates = scanner.nextInt();
        boolean weekend = scanner.nextBoolean();

        boolean weekdayChocolates = chocolates >= 10 && chocolates <= 20;
        boolean weekendChocolates = chocolates >= 15 && chocolates <= 25;

        boolean goodParty = weekdayChocolates && !weekend || weekendChocolates && weekend;
        System.out.println(goodParty);
    }
}
