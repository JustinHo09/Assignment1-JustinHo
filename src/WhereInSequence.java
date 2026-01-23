import java.util.Scanner;

public class WhereInSequence {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number you wish to locate, or find closes location" +
                "to in the Not Fibonacci sequence:");
        long num = scan.nextLong();
        System.out.print("Output: The closest value is at index: "+position(num));
    }

    public static long position(long target){
        NotFibonacci notFibon= new NotFibonacci();
        boolean found=false;
        long result=0;
        int counter=1;
        long next;
        if(target<=1){
            return result;
        } else if(target > 0) {
            long current=2;
            while (!found) {
                next = notFibon.notFib(counter + 1); 
                if (current == target) {
                    found = true;
                    result = counter - 1;
                } else if (current < target && target < next) {
                    found = true;
                    result = counter - 1;

                }
                current = next;
                counter++;

            }
        }
        System.out.println();
        return result;
    }
}
