import java.util.Scanner;

public class sum_of_two_numbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("a = ");
        int a = scan.nextInt();
        System.out.printf("b = ");
        int b = scan.nextInt();
        System.out.printf("Sum = " + (a+b));
        scan.close();
    }
}