package homework;
import java.util.Scanner;

public class Min_max_array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] mass = {21, 45, 16, 67};
        int sum = 0;
        int max = mass[0];
        int min = mass[0];
        for (int i = 0; i < mass.length; i++) {

            if (mass[i] > max) {
                max = mass[i];

            }if (mass[i] < min) {
                min = mass[i];
            }
        }
        System.out.println("min= " + min + "\t" + "max= " + max);
    }
}