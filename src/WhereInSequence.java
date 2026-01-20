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
        long current;
        long next;
        while(!found){
            current=notFibon.notFib(counter);
            next=notFibon.notFib(counter+1);
            if(current==target){
                found=true;
                result=counter-1;
            }else if(current<target && target < next){
                if(target-current < next-target){
                    found=true;
                    result=counter-1;
                }else{
                    found=true;
                    result=counter;
                }
            }
            counter++;
        }
        System.out.print("The closest value is at index: "+result);
        return result;
    }
}
