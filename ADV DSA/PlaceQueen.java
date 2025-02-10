public class PlaceQueen {
    public static void main(String[] args) {
        int q = 2;
        boolean ch[] = {false,false,false,false};
        place(ch,"",q);
    }

    public static void place(boolean ch[],String ans,int q) {
        if(q == 0) {
            System.out.println(ans);
            return;
        }

        for(int i = 0;i < ch.length;i++) {
            if(ch[i] == false) {
                ch[i] = true;
                place(ch,ans+"c"+i+"q"+q,q-1);
                ch[i] = false;
            }
        }
    }
    
}
