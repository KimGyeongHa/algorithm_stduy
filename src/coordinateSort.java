import java.util.*;

public class coordinateSort {

    /*
        N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.

        정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

     */

    public static class coordinate{
        int x,y;

        coordinate(int x, int y){
            this.x = x;
            this.y = y;
        }
    }

    public List<coordinate> coordinate_sort(List<coordinate> answer_arr){

        Collections.sort(answer_arr, new Comparator<coordinate>() {
            @Override
            public int compare(coordinate o1, coordinate o2) {
                if(o1.y > o2.y) o2.y = o1.y;

                return 0;
            }
        });

        /*
        1회전 후 고장

        for(int i=0 ; i < answer_arr.length-1 ; i++){
            if(answer_arr[i][0] > answer_arr[i+1][0]) {
                for (int j = 0; j < answer_arr[i].length; j++) {
                    int temp = answer_arr[i][j];
                    answer_arr[i][j] = answer_arr[i + 1][j];
                    answer_arr[i + 1][j] = temp;
                }
            }

            for(int j = i+1 ; j > 0 ; j--){
                if(answer_arr[j][0] == answer_arr[j-1][0] && answer_arr[j-1][1] > answer_arr[j][1]){
                    int temp = answer_arr[j-1][1];
                    answer_arr[j-1][1] = answer_arr[j][1];
                    answer_arr[j][1] = temp;
                }
            }
        */


        return answer_arr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        //int[][] answer_arr = new int[row][2];


        List<coordinate> answer_list = new LinkedList<>();
        for(int i = 0 ; i < row ; i++){
            answer_list.add(new coordinate(sc.nextInt(),sc.nextInt()));
        }

        List<coordinate> result_arr = new coordinateSort().coordinate_sort(answer_list);

       /* for(int i=0; i < row ; i++){
            for(int j=0 ; j < 2 ; j++){
                answer_arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0 ; i < result_arr.length ; i++){
            for(int j = 0 ; j < result_arr[0].length ; j++){
                System.out.print(result_arr[i][j] + " ");
            }
            System.out.println();
        }*/

    }
}
