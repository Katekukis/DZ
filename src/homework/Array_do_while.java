package homework;
import java.util.Scanner;

public class Array_do_while {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] mass= {2, 6, 7, 7};
        int i=0;
        do {
            sum = sum + mass[i];
            i++;
        }
        while ( i < 4);
        System.out.println("Сумма ="+sum);
    }
}
