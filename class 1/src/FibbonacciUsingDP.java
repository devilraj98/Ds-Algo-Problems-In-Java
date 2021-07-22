public class FibbonacciUsingDP {

    private static int fib(int n ) {

        int arrStorage[] =new int[n+1];

        arrStorage[1] = 1;
        arrStorage[0] = 0;

        for (int i = 2;i<=n;i++){

            arrStorage[i] = arrStorage[i-1] +arrStorage[i-2];
        }

        return arrStorage[n];

    }
    public static void main(String[] args) {
        System.out.println(fib(9));
    }
}
