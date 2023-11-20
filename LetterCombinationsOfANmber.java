package recursion.HardProblems;

import java.util.ArrayList;

public class LetterCombinationsOfANmber{
     static ArrayList<String> al = new ArrayList<>();
//        static  int[] arr = {}
    static void LetterCombinations(String str , String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }
        String key = al.get(str.charAt(0)-48);
        for(int i = 0 ; i < key.length();i++){
            LetterCombinations(str.substring(1),ans+key.charAt(i));
        }

    }

    public static void main(String[] args) {
        al.add(" ");
      al.add(" ");
    al.add(2,"abc");
    al.add(3,"def");
    al.add(4,"ghi");
    al.add(5,"jkl");
    al.add(6,"mno");
    al.add(7,"pqrs");
    al.add(8,"tuv");
    al.add(9,"wxyz");
    LetterCombinations("846","");
    }
}
