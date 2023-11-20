package recursion.HardProblems;

public class SubsetSumProblem {
    static int subsetsum(int[] arr,int sum,int i){
        if(sum == 0){
            return 1;
        }
        if(sum < 0){
            return 0;
        }
        if(i == arr.length){
            return 0;
        }
        return subsetsum(arr,sum-arr[i],i+1) + subsetsum(arr,sum,i+1);

    }
    public static void main(String[] args) {
        int[] arr = {10,15,20,5,22,3};
       int k =  subsetsum(arr,24,0);
        System.out.println(k);
    }
}
