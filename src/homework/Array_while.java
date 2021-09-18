package homework;
import java.util.Scanner;

public class Array_while {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int[] mass= {1, 2, 5, 6, 7};
        int i=0;
        while ( i < 5) {
            sum=sum+mass[i];
            i++;
        }
        System.out.println("Сумма ="+sum);
    }
}
