import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        
        int six = number % 10;
        int seven = (number % 100) / 10;
        int four = number / 100;
        
        System.out.println(six + seven + four);
    }
}
/*
> to extract the "six" simply use the "% 10"
> to extract the "seven" separate the remainder of 400 and then divide the result by 10
so it rounds up to 7
> to extract the "four" simply divide all by 100 so it rounds the answer (4.76) to 4

 */