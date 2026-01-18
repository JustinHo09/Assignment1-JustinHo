import java.util.Scanner;

public class Subsequence {

    public static void main(String[] args){

        Scanner scan= new Scanner(System.in);
        String text1;
        String text2;

        System.out.println("Please enter the first text:");
        text1=scan.nextLine();
        System.out.println("Please enter the second text:");
        text2=scan.nextLine();

        System.out.println(subsequence(text1, text2));
    }

    public static int subsequence(String text1, String text2){

        int result=0;
        int size;
        String temp;

        if(text1.length()<=text2.length()){
            temp=text1;
        }else{
            temp=text2;
        }
        size=temp.length();


        for( int i = 0; i<size; i++){

        }

        return result;
    }
}
