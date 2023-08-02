import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;


public class findMaxVal {
    static int find_k_maxVal(int[] list_arr,int list_size, int k){
        int result = -1;
        int temp = 0;
        int __k = 0;
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());
        for(int i = 0 ; i < list_size ; i++){
            for(int j = i+1 ; j < list_size ; j++){
                for(int l = j+1 ; l < list_size ; l++){
                    set.add(list_arr[i] + list_arr[j]+ list_arr[l]);
                }
            }
        }
        Iterator<Integer> it = set.iterator();

        while(it.hasNext()){
            int iter_val = it.next();
            __k++;
            if(k == __k) {
                result = iter_val;
                break;
            }
        }

        return result;
    }
    public static void main(String[] args) throws  Exception{
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int list_size = Integer.parseInt(sc.next());
        int k = Integer.parseInt(sc.next());

        int[] answerArr = new int[list_size];

        for(int i=0 ; i < list_size ; i++) {
            answerArr[i] = Integer.parseInt(sc.next());
        }

        System.out.print(find_k_maxVal(answerArr,list_size,k));
    }
}