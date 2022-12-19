package Task7;

import java.util.Arrays;
import java.util.Scanner;

public class task7 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(shellSort(createArr())));
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

    public static double[] shellSort(double[] array) {
        int i = 0;
        while (i < array.length - 1){
            if (array[i] > array[i+1]){
                double temp = array[i+1];
                array[i+1] = array[i];
                array[i] = temp;
                if(i > 0)
                    i--;
            }
            else {
                i++;
            }
        }
        return array;
    }

}
