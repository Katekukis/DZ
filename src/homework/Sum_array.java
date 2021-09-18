package homework;
import java.util.Scanner;

public class Sum_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] mass = new int[7];
        for (int i = 0; i < mass.length; i++) {
            System.out.println(" Введите число");
            mass[i] = input.nextInt();

            sum = sum + mass[i];
        }
        System.out.println(" Сумма равна = " + sum);
    }
}
