package recursion.HardProblems;

public class AllPermutationsOfString {
    static void permutationsOfString(char arr[],int fi){
        if(fi == arr.length-1){
            System.out.println(arr);
            return;
        }
        for(int i = fi; i< arr.length;i++){
            char temp = arr[fi];
            arr[fi] = arr[i];
            arr[i] = temp;
            permutationsOfString(arr,fi+1);
            temp = arr[fi];
            arr[fi] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        String arr = "abc";
          permutationsOfString(arr.toCharArray(),0);
    }

}
