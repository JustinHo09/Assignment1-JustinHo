import java.util.Scanner;

public class NotFibonacci {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many terms of the Not Fibonacci " +
                "sequence you want to see:");
        int num= scan.nextInt();
        if(num>0) {
            System.out.print("The NotFibonacci sequence is: ");
        }
        notFib(num);

    }

    public static long notFib(int term){
        long current=0;
        long a=0;
        long b=2;
        if(term <=0){
            System.out.println("Not a valid input try again");
            return 0;
        }
        if(term == 1){
            System.out.print(a);
            return current;
        }
        System.out.print(a);
        System.out.print(", ");
        System.out.print(b);
        System.out.print(", ");
        if(term > 2){
            for( int i=2; i<term; i++){
                current= ((3*b)/2) + (2*a);
                a=b;
                b=current;
                System.out.print(b);
                System.out.print(", ");
            }
        }

        return current;

    }
}
