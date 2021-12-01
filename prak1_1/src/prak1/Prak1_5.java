package prak1;

public class Prak1_5 {
    public static void garm_ryd()
    {
        System.out.println("Вывод первых десяти чисел гармонического ряда в виде ряда");
        for(int j = 1; j <= 10; j++){
            System.out.print("1/"+ j);
            if(j != 10) System.out.print(" + ");
        }
        System.out.print("\n");
        System.out.println("Вывод десяти чиел грамонического ряд в виде десятичных дробей");
        for(int j = 1; j <= 10 ; j++) {
            double d = (double)1/j;
            System.out.print(d + " ");
        }
        System.out.print("\n");
    }
}
