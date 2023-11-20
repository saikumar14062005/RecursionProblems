package recursion.HardProblems;

public class LuckeyNumber {

    static  boolean luckyNumber(int num,int counter){
        if(num % counter == 0){
            return false;
        }
        if(num < counter){
            return true;
        }
       return luckyNumber(num-(num/counter),counter+1);
    }
    public static void main(String[] args) {
        boolean k = luckyNumber(8,2);
        System.out.println(k);
    }

}
