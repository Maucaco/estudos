public class fibonnaci {
    public static void main(String[] args) {
        int fibo = 1;
        int a1 = 0;
        int a = 0;
        int quantidade = 30;
        System.out.println(fibo);

        while (quantidade>0) {
            a1 = a;
            a = fibo;
            fibo = a + a1;
            System.out.println(fibo);
            quantidade--;
        }
    }
}