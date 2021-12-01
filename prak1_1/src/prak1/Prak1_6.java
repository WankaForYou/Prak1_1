package prak1;

import java.util.Arrays;
import java.util.Random;

public class Prak1_6 {
    public static void massivs()
    {
        System.out.println("Вывод неотсортированного массива сгенерированного методом random() класса Math");
        int[] num;
        num = new int[10];
        for(int j = 0; j < num.length; j++){
            num[j] = -10 + (int)(Math.random()*125);
            System.out.print(num[j] + " ");
        }
        Arrays.sort(num);
        System.out.print("\n");

        System.out.println("Вывод отсортированного массива сгенерированного методом random() класса Math");
        for(int mas : num){
            System.out.print(mas + " ");
        }
        System.out.print("\n");

        System.out.println("Вывод неотсортированного массива сгенерированного классом Pandom");
        int[] num1;
        num1 = new int[10];
        Random rand = new Random();
        for(int j = 0; j < num1.length; j++) {
            num1[j] = rand.nextInt(10)-5;
            System.out.print(num1[j] + " ");
        }
        System.out.print("\n");
        Arrays.sort(num1);
        System.out.println("Вывод неотсортированного массива сгенерированного классом Pandom");
        for(int mas : num1){
            System.out.print(mas + " ");
        }
        System.out.print("\n");
    }
}
