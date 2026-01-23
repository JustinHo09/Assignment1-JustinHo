public class RemoveElements {

    public static void main(String [] args){
        double[] test= {0,5,8,10,12,54,-9,3,12,-43,345,54,-98,15};
        int target=12;
        int num=removeElement(test,target);
        String input="Input array: ";
        for(int i=0;i<test.length;i++){
            input= input + test[i]+", ";
        }
        System.out.println(input);
        System.out.println("Input target: "+ target);
        System.out.println("Output: There are : "+num+" elements >= "+target);
    }

    public static int removeElement(double [] nums, double val){
        int k=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]>=val){
                nums[k]=nums[i];
                k++;
            }
        }
        return k;
    }
}
