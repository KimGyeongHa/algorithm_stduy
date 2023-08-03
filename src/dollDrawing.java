import java.util.*;

public class dollDrawing {

    static int remove_doll_count(List<Queue<Integer>> drawing_machine, int[] drawing_pick){
        int result = 0;
        Stack<Integer> stack_list = new Stack<>();

        // 각 열의 값에서 뽑은 값을 stack으로 이동하는 로직
        for(int pick : drawing_pick){
            Queue<Integer> machine_num = drawing_machine.get(pick-1);
            if(!machine_num.isEmpty()) {
                int poll_num = machine_num.poll();
                if(stack_list.size() > 1 && stack_list.peek() == poll_num){
                    result += 2;
                    stack_list.remove(stack_list.peek());
                }else stack_list.add(poll_num);
            }
        }
       return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int arr_size = sc.nextInt();
        List<Queue<Integer>> stack_list = new LinkedList<>();
        Queue<Integer> stack_values = null;

        // 이중배열에 값 담기
        int[][] drawing_machine = new int[arr_size][arr_size];

        for(int i=0 ; i < drawing_machine.length; i++){
            for(int j=0 ; j < drawing_machine[0].length ; j++){
                drawing_machine[i][j] = sc.nextInt();
            }
        }

        // 이중배열의 각 열의 값들을 stack에 넣기
        int arrCnt = 0;
        for(int i= 0 ; i < arr_size ; i++){
            stack_values = new ArrayDeque<>();
            for(int j = 0 ; j < arr_size ; j++) if(drawing_machine[j][arrCnt] != 0) stack_values.add(drawing_machine[j][arrCnt]);
            arrCnt++;
            stack_list.add(stack_values);
        }

        // 사용자 움직임 배열
        int drawing_pick_size = sc.nextInt();
        int[] drawing_pick = new int[drawing_pick_size];

        for(int i=0 ; i< drawing_pick_size ; i++){
            drawing_pick[i] = sc.nextInt();
        }

        System.out.println(remove_doll_count(stack_list, drawing_pick));

    }
}
