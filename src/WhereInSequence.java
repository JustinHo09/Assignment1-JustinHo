import java.util.Scanner;

public class WhereInSequence {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number you wish to locate, or find closes location" +
                "to in the Not Fibonacci sequence:");
        long num = scan.nextLong();
        position(num);
    }

    public static int position(long target){
        NotFibonacci notFib= new NotFibonacci();

        int result=0;

        return result;
    }
}
