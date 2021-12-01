package prak1;

public class Prak1_3 {
    public static void sum_massiv() {
        int[] a = {3, 5, 7, 8, 12, 0, -3};
        int sum = 0;
        for(int mas : a) {
            sum += mas;
        }
        System.out.println("Сумма посчитанная циклом for " + sum);

        sum = 0;
        int i = 0;
        while (i < a.length) {
            sum += a[i];
            i++;
        }
        System.out.println("Сумма посчитанная циклом while " + sum);
        sum = 0;
        i = 0;
        do {
            sum += a[i];
            i++;
        } while (i < a.length);
        System.out.println("Сумма посчитанная циклом do...while " + sum);
    }
}
