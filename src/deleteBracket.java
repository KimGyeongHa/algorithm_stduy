import java.io.BufferedReader;
import java.util.*;

public class deleteBracket {
    static String bracket_del(String bracketContainsStr){
        StringBuffer br= new StringBuffer();
        // LIFO
        Stack<Character> stak = new Stack<>();
        /*
            for(char c : bracketContainsStr.toCharArray()) {
               stak.add(c);
               if(stak.contains('(') && stak.contains(')')) {
                   int stak_size = stak.size();
                   for(int i=stak.lastIndexOf('(') ; i < stak_size ; i++) stak.pop();
               }else if(!stak.contains('(') && stak.contains(')')) {
                   stak.clear();
                   break;
               }
            }
        */

        for(char c : bracketContainsStr.toCharArray()){
            if(c == ')'){
                while(stak.pop() != '(');
            }else stak.add(c);
        }


        Iterator<Character> it = stak.iterator();
        while(it.hasNext()){
            br.append(it.next());
        }

        return br.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(bracket_del(sc.nextLine()));
    }
}
