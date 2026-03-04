package Array;

public class RemoveElement {
    public static void main(String[] args){
        int[] nums = {3,2,2,3};

        int k = removeElement(nums, 3);

        System.out.printf("%d  nums: {", k);
        for(int i = 0 ; i < k ; i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println("}");
    }

    public static int removeElement(int[] nums, int val){
       int count = 0;

       for(int i = 0 ; i < nums.length; i++){
           if(nums[i] != val){
               nums[count] = nums[i];
               count++;
           }
       }

       return count;
    }
}
