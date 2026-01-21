public class RemoveElements {

    public static void main(String [] args){
        double[] test= {0,5,8,10,12,54,-9,3,12,-43,345,54,-98,15};
        removeElement(test,12);
    }

    public static int removeElement(double [] nums, double val){
        int k=0;

        for(int i=0; i<nums.length;i++){
            if(nums[i]>=val){
                nums[k]=nums[i];
                k++;
            }
        }
        System.out.println("There are : "+k+" elements >= "+val);
        return k;
    }
}
