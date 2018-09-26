import java.util.Scanner;

public class temprature {
    
    float f2c (float x) {
        return (5*(x-32))/9;
    }

    float c2f (float y) {
        return ((float)(y*1.8)+32);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        temprature t = new temprature();
        System.out.printf("1. Fahrenhite to Celcius.\n2. Celcius to Fahrenhite.\n3. hit 0 to quit.\n");
        System.out.printf("Enter your choice: ");
        int choice = scan.nextInt();
        while (choice != 0) {
            switch (choice) {
                case 1:
                    System.out.printf("Enter temp in Fahrenhite: ");
                    float x = scan.nextFloat();
                    System.out.println(x + " in Celcius is = " + t.f2c(x));
                    System.out.printf("Enter your choice: ");
                    choice = scan.nextInt();
                    break;
                case 2:
                    System.out.printf("Enter temp in Celcius: ");
                    float y = scan.nextFloat();
                    System.out.println(y + " in Fahrenhite is = " + t.c2f(y));
                    System.out.printf("Enter your choice: ");
                    choice = scan.nextInt();
                    break;
                default:
                    System.out.println("Invalid option selected. Please enter your choice again !!!");
                    System.out.printf("Enter your choice: ");
                    choice = scan.nextInt();
            }
        }
        scan.close();
    }
}