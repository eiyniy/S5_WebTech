package Task1;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Enter x:");
        int x = 5;
        System.out.println(x);
        //Scanner scan = new Scanner(System.in);
        //int x = scan.nextInt();
        System.out.println("Enter y:");
        int y = 12;
        System.out.println(y);
        //int y = scan.nextInt();
        //scan.close();
        System.out.println("Result: " + ((1 + Math.pow(2, Math.sin(x+y)))/(2 + Math.abs(x - (2*x)/(1 + x*x*y*y))) + x));
    }
}
