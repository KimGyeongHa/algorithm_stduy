import java.util.Arrays;
import java.util.Scanner;

public class decisonAlgorithm {
    static boolean count(int[] answer_arr,int cd_size,int mid){
        boolean is_ture = false;
        int sum = 0,cnt = 1;

        for(int x : answer_arr){
           if(sum+x > mid){
               cnt++;
               sum = x;
           }else sum += x;
        }

        if(cnt <= cd_size) is_ture = true;

        return is_ture;
    }
    public int binary_serach_decision(int[] answer_arr,int cd_size){
        int result = 0;
        int lt = Arrays.stream(answer_arr).max().getAsInt();
        int rt = Arrays.stream(answer_arr).sum();

        while(lt <= rt){
            int mid = (lt+rt) / 2;
            if(count(answer_arr,cd_size,mid)){
                result = mid;
                rt = mid-1;
            }else lt = mid + 1;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] answer_arr = new int[sc.nextInt()];
        int cd_size= sc.nextInt();
        int lt = 0;
        int rt = 0;

        for(int i = 0 ; i < answer_arr.length ; i++){
            answer_arr[i] = sc.nextInt();
        }
        System.out.println(new decisonAlgorithm().binary_serach_decision(answer_arr,cd_size));
    }
}
