package prak1;

import java.util.Scanner;

public class Prak1_7 {
    public static void fact()
    {
        Scanner scan = new Scanner(System.in);
        int fac = 1;
        int n = scan.nextInt();
        if (n >= 1) {
            for (int i = 1; i <= n; i++) {
                fac *= i;
            }
            System.out.println("Факториал равен " + fac);
        }
        else System.out.println("Неправильное число");
    }
}
