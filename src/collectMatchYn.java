import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class collectMatchYn {
    static String collectChk(String answers){
        String result = "YES";

        // queue에 add로 null 삽입시 에러, offer 사용 시 null false 반환
        // Linked List 와 Array Deque 차이 (https://velog.io/@djawnstj/%EC%9E%90%EB%A3%8C%EA%B5%AC%EC%A1%B0-Java%EC%9D%98-LinkedList%EC%99%80-ArrayDeque)
        Queue<Character> answer_que = new ArrayDeque<>();

        for(char c : answers.toCharArray()) {
            if(c == '(')answer_que.offer(c);
            else {
                if(answer_que.isEmpty()) return result = "NO";
                answer_que.poll();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(collectChk(sc.nextLine()));
    }
}
