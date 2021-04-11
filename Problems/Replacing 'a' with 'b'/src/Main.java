import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        String sample = scanner.next();
        String newSample = sample.replace("a", "b");

        System.out.println(newSample);
    }
}