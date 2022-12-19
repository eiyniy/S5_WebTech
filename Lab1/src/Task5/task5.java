package Task5;

import java.util.Arrays;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
        int[] initArr = createArr();

        System.out.println("Initial array:");
        Arrays.stream(initArr).forEach(value -> System.out.print(value + " "));
        int resultK = minKElem(initArr);
        System.out.println("\nK = " + resultK);
    }

    private static int[] createArr() {
//                    Scanner scan = new Scanner(System.in);
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

    private static int minKElem (int[] arr){
        int result = 0, currMax = arr[0];
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i + 1] <= currMax){
                result++;
            }
            else{
                currMax = arr[i + 1];
            }
        }
        return result;
    }
}
