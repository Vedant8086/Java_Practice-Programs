public class Path_Finder {
    public static void main(String[] args) {
        char ch[][] = {
            {' ','X','X','X'},
            {' ',' ',' ','X'},
            {' ','X',' ','X'},
            {' ',' ',' ',' '}
        };
        int n = 3,m = 3;
        Path(ch, 0, 0,n,m,"");
    }
    public static void Path(char[][] ch,int i,int j,int n,int m,String ans) {
        if(i == n && j == m) {
            System.out.println(ans);
            return;
        }
        if(i > n || j > m || ch[i][j] == 'X') return;
        Path(ch, i, j+1, n, m,ans+"H");
        Path(ch, i+1, j, n, m,ans+"V");
    }
}
