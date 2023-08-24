import java.util.Scanner;

public class recursive {
    static void DFS(int answer_val){
        if(answer_val > 0){
            DFS(answer_val-1);
            System.out.print(answer_val + " ");
        }
    }

    public static void main(String[] args) {
        DFS(3);
    }
}
