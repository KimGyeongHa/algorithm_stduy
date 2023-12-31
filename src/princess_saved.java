import java.util.*;
import java.util.stream.Stream;

public class princess_saved {
    /*
        설명

        정보 왕국의 이웃 나라 외동딸 공주가 숲속의 괴물에게 잡혀갔습니다.

        정보 왕국에는 왕자가 N명이 있는데 서로 공주를 구하러 가겠다고 합니다.

        정보왕국의 왕은 다음과 같은 방법으로 공주를 구하러 갈 왕자를 결정하기로 했습니다.

        왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.

        그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.

        그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.

        한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.

        그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.

        이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.

     */

    static int find_last_prince(Queue<Integer> prince_stack,int remove_prince_cycle){
        int result = 0;

        while(!prince_stack.isEmpty()){
            for(int i=0 ; i < remove_prince_cycle - 1; i++) prince_stack.offer(prince_stack.poll());
            prince_stack.remove();
            if (prince_stack.size() == 1) break;
        }

        /*
           Stack으로 시도하다 실패
           while(!prince_stack.isEmpty()){
            remove_loc++;
            if(remove_loc == remove_prince_cycle){
                prince_stack.remove(2);
                remove_loc = 1;
            }
            if(prince_stack.size() == 1) result = prince_stack.pop();
        }*/
        return prince_stack.poll();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> que = new LinkedList<>();

        int stack_size = sc.nextInt();
        int remove_prince_cycle = sc.nextInt();

        for(int i=1 ; i <= stack_size ; i++) que.offer(i);

        System.out.println(find_last_prince(que,remove_prince_cycle));
    }
}
