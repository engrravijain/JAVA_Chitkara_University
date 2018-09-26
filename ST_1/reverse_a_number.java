import java.util.Scanner;

public class reverse_a_number {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("x = ");
        int x = scan.nextInt();
        int sum = 0; int temp = x;
        while (temp>0){
            sum = (sum*10) + (temp%10);
            temp /= 10;
        }
        System.out.printf("reverse of " + x + " = " + sum);
        System.out.println();
        scan.close();
    }
}