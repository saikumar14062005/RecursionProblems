package recursion.HardProblems;

public class TowersOfHanoi {
    static void towersofhanoi(int n,int src,int aux,int dest){
        if(n == 1){
            System.out.println(src+" -> "+dest);
            return;
        }
        towersofhanoi(n-1,src,dest,aux);
        towersofhanoi(1,src,aux,dest);
        towersofhanoi(n-1,aux,src,dest);
    }
    public static void main(String[] args) {
        towersofhanoi(6,1,2,3);
    }
}
