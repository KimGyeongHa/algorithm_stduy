import java.util.*;

public class leastLecentlyUsed {
    public int[] lru_algorithm(int cache_size , int[] cache_arr){
      /*
        List<Integer> reuslt_arr = new LinkedList<>();

        for(int i = 0 ; i < cache_arr.length ; i++){
            if(reuslt_arr.contains(cache_arr[i])){
                reuslt_arr.remove(reuslt_arr.indexOf(cache_arr[i]));
                reuslt_arr.add(0,cache_arr[i]);
            }else reuslt_arr.add(0,cache_arr[i]);
        }

        */
        int[] result_arr = new int[cache_size];
        int pos = -1;
        int cnt = 0;
        for(int temp : cache_arr){
            for(int i=0 ; i <cache_size ; i++) if(temp == result_arr[i]) pos = i;
            if(pos == -1) {
                for(int j = cache_size-1 ; j >= 1 ; j--){
                    result_arr[j] = result_arr[j-1];
                }
                result_arr[0] =temp;
            }else {
                for(int j = pos ; j >= 1 ; j--){
                    result_arr[j] = result_arr[j-1];
                }
                result_arr[0] =temp;
                pos = -1;
            }
        }

        return result_arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cache_size = sc.nextInt();
        int cache_memory_sizee_memory_size = sc.nextInt();
        int[] cache_arr = new int[cache_memory_sizee_memory_size];


        for(int i = 0 ; i < cache_memory_sizee_memory_size ; i ++){
            cache_arr[i] = sc.nextInt();
        }

        int[] result_queue  = new leastLecentlyUsed().lru_algorithm(cache_size,cache_arr);
        for(int i = 0  ; i  < cache_size ; i ++){
            System.out.print(result_queue[i] + " ");
        }

    }



}
