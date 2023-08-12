import java.util.*;

public class coordinateSort {

    /*
        N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.

        정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

     */

    public static class coordinate implements Comparable<coordinate>{
        int x,y;

        coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
        // sort 정렬 메서드 재정의
        @Override
        public int compareTo(coordinate c) {
            if(c.x == this.x) return this.y - c.y;
            else return this.x - c.x;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();

        List<coordinate> answer_list = new LinkedList<>();
        for(int i = 0 ; i < row ; i++){
            answer_list.add(new coordinate(sc.nextInt(),sc.nextInt()));
        }
        Collections.sort(answer_list);
        for(coordinate cn : answer_list){
            System.out.println(cn.x + " " + cn.y);
        }
    }
}
