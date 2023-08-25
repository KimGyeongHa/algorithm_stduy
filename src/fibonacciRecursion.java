public class fibonacciRecursion {
    // 메모제이션으로 처리하는 방법연습
    public int finbonacci_function(int num){
        int[] fudo = new int[num+1];
        if(num == 1) return fudo[num] = 1;
        else if(num == 2) return fudo[num] = 1;
        else{
            return fudo[num] = finbonacci_function(num-1) + finbonacci_function(num-2);
        }
    }

    public static void main(String[] args) {
        fibonacciRecursion fr = new fibonacciRecursion();
        System.out.println(new fibonacciRecursion().finbonacci_function(7));
    }
}
