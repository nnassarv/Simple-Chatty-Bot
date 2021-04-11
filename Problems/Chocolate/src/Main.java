import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();

        boolean test1 = k % n == 0;
        boolean test2 = k % m == 0;
        boolean test3 = k % (n * m) == 0;
        boolean enoughChocolate = n * m >= k;
        boolean tests = test1 || test2 || test3;


        if (enoughChocolate && tests) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}