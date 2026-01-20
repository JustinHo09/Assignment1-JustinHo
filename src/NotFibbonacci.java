import java.util.Scanner;

public class NotFibbonacci {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter what term of NotFib you want to see:");
        int num= scan.nextInt();
        notFib(num);

    }

    public static long[] notFib(int term){

        long current;
        long [] terms= new long[term+1];
        long a=0;
        long b=2;
        String sequence= "The NotFibbonacci sequence is: ";
        if(term == 0){
            terms[0]=a;
            System.out.println(sequence + a+".");
            return terms;
        }else{
            terms[0]=a;
            terms[1]=b;
        }
        if(term > 1){
            for( int i=2; i<=term; i++){
                current= ((3*b)/2) + (2*a);
                terms[i] = current;
                a=b;
                b=current;
            }
        }

        for(int j=0;j<terms.length;j++){

            sequence= sequence + terms[j] + ", ";

        }

        System.out.println(sequence);
        return terms;

    }
}
