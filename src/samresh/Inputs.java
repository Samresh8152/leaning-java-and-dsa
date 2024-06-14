package samresh;

import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("enter your roll number   ");
        int rollno = input.nextInt();

        System.out.println("enter name");
        String name = input.next();

        System.out.println("enter marks ");
        float marks = input.nextFloat();

        System.out.println("your roll number is " + rollno );
        System.out.println("your name  is " + name);
        System.out.println("your marks are  " + marks);


    }
}
