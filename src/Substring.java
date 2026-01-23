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
        System.out.println("Input: "+text1+ " & "+text2);
        System.out.println("Output: "+substring(text1,text2));
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
        String temp;


        for (int i = 0; i < small.length; i++) {

            for (int j = 0; j < big.length; j++) {

                temp = "";

                if (small[i] == big[j]){
                    count=0;

                    while(i+count< small.length && j+count< big.length &&
                            small[i+count] == big[j+count]) {

                        temp = temp + small[i + count];
                        count++;
                    }
                    if(temp.length()>longest.length()){
                        longest=temp;
                    }
                }
            }
        }
        return longest;
    }
}
