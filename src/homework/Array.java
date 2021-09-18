package homework;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
            int [] mass = new int [5];
        for (int i = 0; i < mass.length; i++) {
            System.out.println(" Введите число");
            mass[i] = input.nextInt();
        }
        for (int j = 0; j<mass.length; j++) {
            System.out.println("[" +j +"]=" +mass [j] + "\t");
        }
    }
}
