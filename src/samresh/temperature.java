package samresh;

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter temperature in C :");
        float temp_C = input.nextFloat();

        float temp_F = temp_C * 1.8f + 32 ;
        System.out.println(temp_F);
    }
}
