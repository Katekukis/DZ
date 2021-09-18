package homework;
import java.util.Arrays;
import java.util.Scanner;

public class Array_decrease_increase {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

                int [] mass = {75, 30, 1, 8, 90};
                for (int i = 0; i < mass.length; i++)
                Arrays.sort(mass);
                System.out.println(Arrays.toString(mass));

                for (int i = mass.length - 1; i >= 0; i--)
                    System.out.print(mass[i] + " ");
                Arrays.sort( mass );
                System.out.println();
            }
        }
