import java.util.Arrays;
import java.util.Scanner;

public class decisionAlgorithm2 {

    static int count(int[] answer_arr,int mid){
        int temp = 1;

        int ep = answer_arr[0];
        for(int i = 1 ; i < answer_arr.length ; i++) {
            if (answer_arr[i] - ep >= mid) {
                ep = answer_arr[i];
                temp++;
            }
        }
        return temp;
    }

    public int find_max_distance(int[] answer_arr,int hourse_cnt){
        int result = 0;
        Arrays.sort(answer_arr);

        int lt = answer_arr[0];
        int rt = answer_arr[answer_arr.length-1];

        while (lt <= rt){
            int mid = (lt+rt)/2;
            if(count(answer_arr,mid) == hourse_cnt){
                result = mid;
                lt = mid + 1;
            }else rt = mid-1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int[] answer_arr = new int[arr_size];

        int hourse_cnt = sc.nextInt();

        for(int i = 0 ; i < arr_size ; i++) answer_arr[i] = sc.nextInt();

        System.out.println(new decisionAlgorithm2().find_max_distance(answer_arr,hourse_cnt));
    }

}
