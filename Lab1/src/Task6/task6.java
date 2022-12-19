package Task6;

import java.util.Arrays;
import java.util.Scanner;

public class task6 {
    public static void main(String[] args) {
        buildMatrix(createArr());
    }

    private static double[] createArr() {
//            Scanner scan = new Scanner(System.in);
//            System.out.println("Enter the size of the array:");
//            int size = scan.nextInt();
//            int[] arr = new int[size];
        double[] arr = new double[]{1.2, 15, 12.69, 6.6666, 2.3, 4, 8.56, 95.6, 13, 7.0};
//            System.out.println("Enter the elements of the array:");
//            for (int i = 0; i<size; i++){
//                arr[i] = scan.nextInt();
//            }
//            scan.close();
        return arr;
    }

    private static void buildMatrix(double[] arr){
        double[][] matrix = new double[arr.length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            matrix[i] = arr;
            double elToShift = arr[0];
            arr = Arrays.copyOfRange(arr, 1, arr.length + 1);
            arr[arr.length - 1] = elToShift;
        }
        Arrays.stream(matrix).map(Arrays::toString).forEach(System.out::println);
    }
}
