package Array;

import java.util.*;

public class RemoveDuplicates {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>(Arrays.asList(1,1,1,2,2,2));
        List<Integer> expectedNums = new ArrayList<>();

        int[] numsArray = {1,1,1,2,2,2};

        int k = removeDuplicates(nums, expectedNums);
        int k_array = removeDuplicates(numsArray);

        System.out.println(k + ", " + expectedNums);
        System.out.print(k_array + ", {");

        for(int i = 0 ; i < k-2 ; i++){
            System.out.print(numsArray[i] + " ");
        }
        System.out.println("}");
    }

    //My method
    public static int removeDuplicates(List<Integer> nums, List<Integer> expectedNums){
        int k = 0;
        for(int i = 0 ; i < nums.size(); i++){
            if(!expectedNums.contains(nums.get(i)))
                expectedNums.add(nums.get(i));
            else
                k++;
        }

        return k;
    }

    //Method from leetcode task
    //Ainda não terminei, à corrigir!!!
    public static int removeDuplicates(int[] nums){
        int curr = 1;
        int k = 0;

        for(int i = 1 ; i < nums.length; i++){
            if(nums[i] != nums[i-1]){
                nums[curr] = nums[i];
                curr++;
            }
            else
                k++;
        }

        return k;
    }
}
