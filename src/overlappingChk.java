import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class overlappingChk {
    /*
        현수네 반에는 N명의 학생들이 있습니다.

        선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.

        만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,

        N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.

     */
    public String overlapping_chk(int[] answer_arr){
        String result = "D";

        Set<Integer> reuslt_set = new HashSet<>();
        for(int temp : answer_arr){
            reuslt_set.add(temp);
        }
        if(answer_arr.length == reuslt_set.size()) result = "U";

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_size = sc.nextInt();
        int[] answer_arr = new int[arr_size];
        for(int i = 0 ; i < arr_size ; i++){
            answer_arr[i] = sc.nextInt();
        }
        System.out.println(new overlappingChk().overlapping_chk(answer_arr));
    }
}
