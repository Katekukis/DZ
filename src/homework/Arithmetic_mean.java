package homework;
import java.util.Scanner;

public class Arithmetic_mean {
    public static void main(String[] args) {
        Scanner average = new Scanner(System.in);
        double[] mass = {1, 6, 9, 10, 30};
        double sum = 0;
        double result = 0;
        for (int i = 0; i < mass.length; i++){
            sum = sum + mass[i];
        }
        result = sum / mass.length;
        System.out.println("Среднее арифмитическое " + result);
    }
}

