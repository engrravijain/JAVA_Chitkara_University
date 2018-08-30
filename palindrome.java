import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.printf("x = ");
        int x = scan.nextInt();
        int sum = 0; int temp = x;
        while (temp>0){
            sum = (sum*10) + (temp%10);
            temp /= 10;
        }
        if (x == sum) {
            System.out.println(x + " is palindrome");
        } else {
            System.out.println(x + " is not palindrome");
        }
        scan.close();
    }
}