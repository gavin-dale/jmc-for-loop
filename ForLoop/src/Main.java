public class Main {
    public static void main(String[] args) {
        System.out.println("10,000 at 2% = " + calculateInterest(10000.00, 2.0));

//        for( init; termination; increment) {
//
//       }

        for(int i=0; i<5; i++){
            System.out.println("Loop " + i + " hello!");
        }

        for(int i=2; i<9; i++) {
            System.out.println(calculateInterest(10000.00, i));
        }

        for(int i=9; i>2; i--) {
            System.out.println(calculateInterest(10000.00, i));
        }

        int primeCount = 0;
        for(int i=0; i<5; i++) {
            if(isPrime(i)) {
                System.out.println("The number " + i + " is prime.");
                primeCount++;
                if(primeCount == 3 ) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n) {
        if(n ==1) {
            return false;
        }

        for(int i=2; i <= n/2; i++) {
            if(n % 1 == 0) {
                return false;
            }
        }
        return true;
    }


    public static double calculateInterest(double amount, double interestRate) {
        return(amount * (interestRate/100));
    }
}
