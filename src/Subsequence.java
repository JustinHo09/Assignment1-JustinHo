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
        char [] small;
        char [] big;

        if(text1.length()<=text2.length()){
            small=text1.toCharArray();
            big=text2.toCharArray();
        }else{
            small=text2.toCharArray();
            big=text1.toCharArray();
        }

        int [] sizes= new int[small.length];

        for(int k=0; k<small.length;k++){
            result=0;
            int start = 0;
            for (int i = k; i < small.length; i++) {
                for (int j = start; j < big.length; j++) {
                    if (small [i] == big [j]) {
                        result++;
                        start = j + 1;
                        break;
                    }
                }

            }
            sizes[k]=result;
        }

        for(int p=0; p<sizes.length;p++){
            if(sizes[p] > result){
                result=sizes[p];
            }
        }
        return result;
    }
}
