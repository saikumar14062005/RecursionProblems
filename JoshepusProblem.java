package recursion.HardProblems;

public class JoshepusProblem {
    static int joshepus_problem(int n,int k ){
        if(n == 0){
            return 0;
        }
        return ((joshepus_problem(n-1,k)+3)% n);
    }
    public static void main(String[] args) {
        int k = joshepus_problem(7,3);
        System.out.println(k);
    }
}
