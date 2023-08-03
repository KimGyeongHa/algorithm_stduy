import javax.swing.text.html.parser.Parser;
import java.util.Scanner;
import java.util.Stack;

public class postfix {
    static int postfix_val(String input_values){
        Stack<Integer> number_stack = new Stack<>();

        // isdigit -> 숫자인지 문자인지 판단
        for(char c : input_values.toCharArray()){
            if(String.valueOf(c).matches("[0-9]"))  number_stack.push(Integer.valueOf(String.valueOf(c)));
            else {
                switch (c){
                    case '+' :
                        number_stack.push(number_stack.pop() + number_stack.pop());
                        break;
                    case '-' :
                        int fir_pop = number_stack.pop();
                        int sec_pop = number_stack.pop();
                        number_stack.push(Integer.max(fir_pop,sec_pop) - Integer.min(fir_pop,sec_pop));
                        break;
                    case '/' :
                        number_stack.push(number_stack.pop() / number_stack.pop());
                        break;
                    case '*' :
                        number_stack.push(number_stack.pop() * number_stack.pop());
                        break;
                }
            }
        }
        return number_stack.pop();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(postfix_val(sc.nextLine()));
    }
}
