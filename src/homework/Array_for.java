package homework;
import java.util.Scanner;

public class Array_for {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int [] mass = {2, 5, 8, 9};
        int sum = 0;
        for(int i = 0; i<mass.length; i++) {
            sum = sum + mass[i];
            System.out.println(sum);

        }



    }
}
