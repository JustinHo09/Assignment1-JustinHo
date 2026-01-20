import java.util.Scanner;

public class WhereInSequence {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number you wish to locate, or find closes location" +
                "to in the Not Fibonacci sequence:");
        long num = scan.nextLong();
        position(num);
    }

    public static long position(long target){
        NotFibonacci notFibon= new NotFibonacci();
        boolean found=false;
        long result=0;
        int counter=1;
        while(!found){
            if(notFibon.notFib(counter)==target){
                found=true;
                result=counter-1;
            }
            counter++;
        }
        System.out.print("The output is: "+result);
        return result;
    }
}
