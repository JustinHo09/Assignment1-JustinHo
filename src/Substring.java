import java.util.Scanner;

public class Substring {

    public static void main (String [] args){
        Scanner scan= new Scanner(System.in);
        String text1;
        String text2;

        System.out.println("Please enter the first text:");
        text1=scan.nextLine();
        System.out.println("Please enter the second text:");
        text2=scan.nextLine();
        substring(text1,text2);
    }

    public static String substring(String text1, String text2){
        String longest="";

        char [] small;
        char [] big;
        int count;

        if(text1.length()<=text2.length()){
            small=text1.toCharArray();
            big=text2.toCharArray();
        }else{
            small=text2.toCharArray();
            big=text1.toCharArray();
        }



        

        System.out.println(longest);
        return longest;
    }
}
