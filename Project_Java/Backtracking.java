import java.util.*;
public class Backtracking {
    static String[] arr = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    List<String> l = new ArrayList<>();
    public static void keypad(String ans,int idx,String digit) {
        if(ans.length() == digit.length()) {
            System.out.println(ans);
            return;
        }
        int d  = digit.charAt(idx)-'0';
        String s = arr[d];
        for(int i = 0;i < s.length();i++) {
            keypad(ans+s.charAt(i), idx + 1, digit);
        }

    }
    public static void main(String[] args) {
        keypad("",0,"23");
        int[] coins = {2,3,5};

        find(8,coins,0,new ArrayList<>());

    }   
    public static void find(int target,int coins[],int idx,List<Integer> ans) {
        if(target == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0;i < coins.length;i++) {
            if(coins[i] <=target) {
                ans.add(coins[i]);
            }
            find(target-coins[i],coins,i,ans);
            ans.remove(ans.size()-1);
        }

    } 
    public static void place(int q,String ans,int visited[]) {
        if(q == 0) {
            System.out.println(ans);
            return;
        }
        for(int i = 0;i < visited.length;i++) {
            if(visited[i]!= 1) {
                visited[i] = 1;
                place(q-1,ans+"b"+i+"Q"+q+"  ",visited);
                visited[i] = 0;
            }
        }
    }
}
