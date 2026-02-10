Q 2.Create a java program to display all the prime numbers between 1 to 100.

class PrimeNumbers {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 to 100:");
            for (int num = 2; num <= 100; num++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(num + " ");
            }
        }
    }
}
