package Array;

public class TwoSum {
    public static void main(String[] args){
        int[] array = {1,2,4,5,6,7,8,9};
        int target = 3;

        int[] idxSum = twoSum(array,target);
        System.out.print("{");
        for(int val : idxSum){
            System.out.print(val + " ");
        }
        System.out.println("}");

    }

    public static int[] twoSum(int[] array, int target){
        for(int i = 0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length; j++){
                if(array[i] + array[j] == target) {
                    int[] idxSum = {i,j};
                    return idxSum;
                }
            }
        }

        System.out.println("Nenhuma soma que resulte " + target + " encontrada!");
        return null;
    }
}
