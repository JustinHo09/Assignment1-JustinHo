import java.util.Scanner;

public class NotFibonacci {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter how many terms of the Not Fibonacci " +
                "sequence you want to see:");
        int num= scan.nextInt();
        //recFib(num);
        notFib(num);

    }

    public static long notFib(int term){

        long current=0;
        long [] terms= new long[term];
        long a=0;
        long b=2;
        String sequence= "The NotFibonacci sequence is: ";
        if(term == 1){
            terms[0]=a;
            System.out.println(sequence + a+".");
            return current;
        }else{
            terms[0]=a;
            terms[1]=b;
        }
        if(term > 2){
            for( int i=2; i<term; i++){
                current= ((3*b)/2) + (2*a);
                terms[i] = current;
                a=b;
                b=current;
            }
        }

        for(int j=0;j<term;j++){

            sequence= sequence + terms[j] + ", ";

        }

        System.out.println(sequence);
        return current;

    }

    public static long recFib(long term){
        if(term<=1){
            System.out.println(0);
            return 0;
        }else if(term ==2){
            System.out.println(2);
            return 2;
        }
        System.out.println(((3*(recFib(term-1)))/2)+(2*(recFib(term-2))));
        return ((3*(recFib(term-1)))/2)+(2*(recFib(term-2)));
    }
}
