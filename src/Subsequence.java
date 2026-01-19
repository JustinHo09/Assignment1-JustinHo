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
        String small;
        String big;
        String sub="";

        if(text1.length()<=text2.length()){
            small=text1;
            big=text2;
        }else{
            small=text2;
            big=text1;
        }

        for(int i=0; i<small.length();i++){
            boolean found=false;
            int j=0;
            while(!found && j<big.length()){
                if(small.charAt(i) == big.charAt(j)){
                    sub=sub + small.charAt(i);
                    big=big.substring(j+1);
                    found=true;
                }else{
                    j++;
                }
            }
        }
        result=sub.length();
        return result;
    }
}
