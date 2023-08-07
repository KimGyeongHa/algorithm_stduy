import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class selectedSort {
    /*
        설명

        N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.

        정렬하는 방법은 선택정렬입니다.
     */
    public Queue<Integer> sort_list(Queue<Integer> answer_queue){
        Queue<Integer> result_queue =  new LinkedList<>();

        while(!answer_queue.isEmpty()){
            int temp = answer_queue.poll();
            for(int temp_queue : answer_queue){
                if(temp > temp_queue) {
                    answer_queue.offer(temp);
                    temp = 0;
                    break;
                }
            }
            if(temp != 0){
                result_queue.offer(temp);
            }
        }
        return result_queue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int queue_size= sc.nextInt();
        Queue<Integer> answer_queue = new LinkedList<>();

        for(int i = 0 ; i < queue_size ; i++){
            answer_queue.offer(sc.nextInt());
        }

        selectedSort srt = new selectedSort();
        Queue<Integer> result_queue = srt.sort_list(answer_queue);

        for(int result_val : result_queue){
            System.out.print(result_val + " ");
        }
    }
}
