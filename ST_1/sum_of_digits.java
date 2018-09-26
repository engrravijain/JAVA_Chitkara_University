import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("x = ");
        int x = scan.nextInt();
        int sum = 0;
        while (x>0){
            sum += (x%10);
            x /= 10;
        }
        System.out.println("Sum of digits = " + sum);
        scan.close();
    }
}