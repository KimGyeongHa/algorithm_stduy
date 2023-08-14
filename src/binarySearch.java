import java.util.*;

public class binarySearch  {

    public int find_num(int[] answer_list,int arr_size,int find_num){
        int result = 0;

        Arrays.sort(answer_list);
        int lt = 0;
        int rt = arr_size-1;

        while(true){
            int mid = (lt+rt)/2;
            if(answer_list[mid] < find_num) lt = mid + 1;
            else if(answer_list[mid] > find_num) rt = mid - 1;
            else {
                result = mid+1;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr_size= sc.nextInt();
        int find_num = sc.nextInt();

        int[] answer_arr = new int[arr_size];
        for(int i = 0 ; i < arr_size ; i++){
            answer_arr[i] = sc.nextInt();
        }

        System.out.println(new binarySearch().find_num(answer_arr,arr_size,find_num));


    }

}
