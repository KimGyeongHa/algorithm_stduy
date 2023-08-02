import java.util.*;

public class dollDrawing {

    static int drowing_doll_count(List<Queue<Integer>> drawing_machine, int[] drawing_pick){
       int result = 0;
       Stack<Integer> stack = new Stack<>();

       for(int pick : drawing_pick){
           pick = pick != 0 ? pick-1 : pick;
           Queue<Integer> machine_num =  drawing_machine.get(pick);
           if(!machine_num.isEmpty()) stack.add(machine_num.poll());
       }

       int compare_num = stack.get(0);

       for(int i = 1 ; i < stack.size() ; i++){
           if(stack.get(i) == compare_num){
               result++;
               compare_num = stack.get(i);
           }
       }

       return result;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int stack_size = sc.nextInt();
        List<Queue<Integer>> stack_list = new LinkedList<>();
        Queue<Integer> stack_values = null;

        for(int i=0 ; i< stack_size ; i++){
            stack_values = new LinkedList<>();
            for(int j = 0 ; j < stack_size ; j++){
                int zero_chk = sc.nextInt();
                if(zero_chk != 0 ) stack_values.add(zero_chk);
            }
            stack_list.add(stack_values);
        }

        /*

        int[][] drawing_machine = new int[arr_size][arr_size];

        for(int i=0 ; i< drawing_machine.length; i++){
            for(int j=0 ; j < drawing_machine[i].length ; j++){
                drawing_machine[i][j] = sc.nextInt();
            }
        }
        */


        int drawing_pick_size = sc.nextInt();
        int[] drawing_pick = new int[drawing_pick_size];

        for(int i=0 ; i< drawing_pick_size ; i++){
            drawing_pick[i] = sc.nextInt();
        }

        System.out.println(drowing_doll_count(stack_list, drawing_pick));

    }
}
