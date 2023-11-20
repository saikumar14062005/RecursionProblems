package recursion.HardProblems;

import java.util.ArrayList;

public class SubsequencesOfString {

    static ArrayList<String> al = new ArrayList<>();
    static void subsequence(String str ,String ans){
        if(str.isEmpty()){
//            System.out.println(ans);
            al.add(ans);
            return;
        }
        subsequence(str.substring(1),ans+str.charAt(0));
        subsequence(str.substring(1),ans);
    }

    public static void main(String[] args) {
        subsequence("abc","");
        System.out.println(al);
    }
}
