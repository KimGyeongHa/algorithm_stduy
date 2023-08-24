import com.sun.deploy.util.StringUtils;

public class binaryToRecursive {

    public void binary_recursive(int answer_val){
        if(answer_val != 0){
            binary_recursive(answer_val/2);
            System.out.print(answer_val%2 + " ");
        }
    }

    public static void main(String[] args) {
        new binaryToRecursive().binary_recursive(50);
    }
}
