public class factorial {
    public int factorial_function(int num) {
        if (num == 1) return 1;
        else return num * factorial_function(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(new factorial().factorial_function(5));
    }
}
