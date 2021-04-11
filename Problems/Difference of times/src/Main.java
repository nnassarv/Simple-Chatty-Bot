import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int si1One = scanner.nextInt();
        int si1Two = scanner.nextInt();
        int si1Three = scanner.nextInt();
        int si1Four = scanner.nextInt();
        int si1Five = scanner.nextInt();
        int si1Six = scanner.nextInt();

        si1One = si1One * 60 * 60;
        si1Two = si1Two * 60;
        si1Four = si1Four * 60 * 60;
        si1Five = si1Five * 60;

        int differenceOne = (si1One + si1Two + si1Three) - (si1Four + si1Five + si1Six);
        differenceOne *= -1;
        
        System.out.println(differenceOne);


    }
}
