import java.util.*;

public class dollDrawing {
    /*

    게임개발자인 죠르디는 크레인 인형뽑기 기계를 모바일 게임으로 만들려고 합니다.

    죠르디는 게임의 재미를 높이기 위해 화면 구성과 규칙을 다음과 같이 게임 로직에 반영하려고 합니다.

    게임 화면은 1 x 1 크기의 칸들로 이루어진 N x N 크기의 정사각 격자이며 위쪽에는 크레인이 있고 오른쪽에는 바구니가 있습니다.

    (위 그림은 5 x 5 크기의 예시입니다). 각 격자 칸에는 다양한 인형이 들어 있으며 인형이 없는 칸은 빈칸입니다.

    모든 인형은 1 x 1 크기의 격자 한 칸을 차지하며 격자의 가장 아래 칸부터 차곡차곡 쌓여 있습니다.

    게임 사용자는 크레인을 좌우로 움직여서 멈춘 위치에서 가장 위에 있는 인형을 집어 올릴 수 있습니다. 집어 올린 인형은 바구니에 쌓이게 되는 데,

    이때 바구니의 가장 아래 칸부터 인형이 순서대로 쌓이게 됩니다.

    만약 같은 모양의 인형 두 개가 바구니에 연속해서 쌓이게 되면 두 인형은 터뜨려지면서 바구니에서 사라지게 됩니다.

    크레인 작동 시 인형이 집어지지 않는 경우는 없으나 만약 인형이 없는 곳에서 크레인을 작동시키는 경우에는 아무런 일도 일어나지 않습니다.

     */
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
