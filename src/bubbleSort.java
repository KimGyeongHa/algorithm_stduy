import java.util.Scanner;

public class bubbleSort {
    // 버블정렬
    public int[] bubble_sort(int[] answer_list){

        for(int i = 0 ; i < answer_list.length ; i++){
            for(int j = i+1 ; j < answer_list.length ; j++){
                if(answer_list[i] > answer_list[j]){
                    int temp = answer_list[i];
                    answer_list[i] = answer_list[j];
                    answer_list[j] = temp;
                }
            }
        }

        return answer_list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();

        int[] answer_list = new int[arr_size];
        for(int i = 0; i < arr_size ; i++){
            answer_list[i] = sc.nextInt();
        }

        int[] result_list = new bubbleSort().bubble_sort(answer_list);

        for(int reuslt_val: result_list){
            System.out.print(reuslt_val + " ");
        }
    }
}
