import java.util.Scanner;

/* writ function to impliment 4 basic arithmetic operations
A => addition
M => multiplication
S => subtraction
D => division
R => remainder
*/

public class AMSDR {
    
    int add (int x, int y) {
        return x+y;
    }

    int multiply (int x, int y) {
        return x*y;
    }

    int subtraction (int x, int y) {
        return x-y;
    }

    float division (int x, int y) {
        return (float)x/y;
    }

    int remainder (int x, int y) {
        return x%y;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AMSDR obj = new AMSDR();
        System.out.printf("x = ");
        int x = scan.nextInt();
        System.out.printf("y = ");
        int y = scan.nextInt();
        System.out.println("Sum = " + obj.add(x,y));
        System.out.println("Multiplicaton = " + obj.multiply(x,y));
        System.out.println("Subtraction = " + obj.subtraction(x,y));
        System.out.println("Division = " + obj.division(x,y));
        System.out.println("Remainder = " + obj.remainder(x,y));
        scan.close();
    }
}