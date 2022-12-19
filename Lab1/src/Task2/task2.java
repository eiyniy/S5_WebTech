package Task2;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        int x = -6;
        int y = -3;
        //Scanner scanner = new Scanner(System.in);
        //int x = scanner.nextInt();
        //int y = scanner.nextInt();
        //scanner.close();
        boolean flag = false;
        if((x >= -6 && x <= 6) && (y <= 0 && y >= -3)){
            flag = true;
        } else if ((x >= -4 && x <= 4) && (y >= 0 && y <= 5)) {
            flag = true;
        }
        System.out.println(flag);
    }
}
