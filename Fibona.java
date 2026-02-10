Q 1.Create a java program to display fibonacci series till 30 terms.
class FibonacciSeries {
    public static void main(String[] args) {
        int n = 30;   // number of terms
        int a = 0, b = 1;

        System.out.println("Fibonacci Series till 30 terms:");

        for (int i = 1; i <= n; i++) {
            System.out.print(a + " ");

            Long next = a + b;
            a = b;
            b = next;
        }
    }
}