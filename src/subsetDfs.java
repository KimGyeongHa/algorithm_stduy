public class subsetDfs {
    static int dfsCnt;
    static int[] dfsArr;
    static void DFS(int n){
        if(dfsCnt < n){
            for(int i= 1 ; i < dfsArr.length ; i++){
                if(dfsArr[i] == 1)System.out.print(i + " ");
            }
            System.out.println();
            n = n-1;
        }else{
            dfsArr[n] = 1;
            DFS(n+1);
            dfsArr[n] = 0;
            DFS(n+1);
        }
    }


    public static void main(String[] args) {
        int n = 3;
        dfsArr = new int[n+1];
        dfsCnt = 3;
        DFS(1);
    }
}
