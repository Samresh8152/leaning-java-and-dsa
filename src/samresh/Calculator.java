package samresh;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
         System.out.println("enter two operants");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("enter operation");
        char ch = input.next().charAt(0);

        if(ch=='+'){
            System.out.println(a+b);
        }
        else if(ch=='-'){
            System.out.println(a-b);
        }
        else if(ch=='*'){
            System.out.println(a*b);
        }
        else if(ch=='/'){
            System.out.println(a/b);
        }
        }
    }

