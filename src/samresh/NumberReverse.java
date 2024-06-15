package samresh;

public class NumberReverse {
    public static void main(String[] args) {

        int n =23422;

        while(n>0){
            int temp=n%10;
            System.out.print(temp);
            n=n/10;
        }


    }
}
