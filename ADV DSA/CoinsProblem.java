import java.util.ArrayList;

public class CoinsProblem {
    public static void main(String[] args) {
        int arr[] = {1,2,5,10};
        int target = 18;
        String a = "";
        int u = 0;
        ArrayList<String> ans = new ArrayList<>();
        coins(a,arr,target,ans,u);
        System.out.println(ans);
    }

    public static void coins(String a,int arr[],int target,ArrayList<String> ans,int u) {
        if(target == 0) {
            ans.add(a);
            return;
        }

        for(int i = u;i < arr.length;i++) {
            if(target >= arr[i]) {
                coins(a+Integer.toString(arr[i]),arr,target-arr[i],ans,u++);

            }
        }
    }

    
}
