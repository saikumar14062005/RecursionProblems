package recursion.HardProblems;

public class BalancedParenthesis {
    static void bal_parenthesis(int n,char arr[],int i , int o ,int c){
        if(i == arr.length){
            System.out.println(arr);
        }
        if(o < n){
            arr[i] = '(';
            bal_parenthesis(n,arr,i+1,o+1,c);
        }
        if(c < o){
            arr[i] = ')';
            bal_parenthesis(n,arr,i+1,o,c+1);
        }

    }
    public static void main(String[] args) {
        char[] arr = new char[8];
        bal_parenthesis(4,arr,0,0,0);
    }
}
