package Task4;

import java.math.BigInteger;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
        isPrime();
    }

    private int[] createArr() {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter the size of the array:");
//            int size = scan.nextInt();
//            int[] arr = new int[size];
            int[] arr = new int[]{1, 15, 12, 6, 2, 4, 8, 95, 13, 7};
//            System.out.println("Enter the elements of the array:");
//            for (int i = 0; i<size; i++){
//                arr[i] = scan.nextInt();
//            }
//            scan.close();
            return arr;
    }
    private static void isPrime(){
        task4 obj = new task4();
        int arr[] = obj.createArr();
        BigInteger bigInteger;
        for (int i = 0; i< arr.length; i++){
            bigInteger = BigInteger.valueOf(arr[i]);
            if (bigInteger.isProbablePrime((int) Math.log(arr[i]))){        //использование реализованного теста на простоту Рабина-Миллера
                System.out.println("[" + i + "] = " + arr[i] + " is prime.");
            }
        }
    }
}
