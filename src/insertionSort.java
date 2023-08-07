import java.util.Scanner;

public class insertionSort {
    // 삽입정렬 다시
    public int[] insertion_sort(int[] answer_list){
        for(int i = 1 ; i <answer_list.length ; i++){
            int temp = answer_list[i],j;
            for(j = i-1 ; j >= 0 ; j--){
                if(answer_list[j] > temp) answer_list[j+1]  = answer_list[j];
                else break;
            }
            answer_list[j+1] = temp;
        }
        return answer_list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size = sc.nextInt();
        int[] answer_list = new int[arr_size];

        for(int i = 0 ; i < arr_size ; i++ ){
            answer_list[i] = sc.nextInt();
        }

        int[] result_arr = new insertionSort().insertion_sort(answer_list);
        for(int reuslt_val : result_arr){
            System.out.print(reuslt_val + " ");
        }
    }
}
