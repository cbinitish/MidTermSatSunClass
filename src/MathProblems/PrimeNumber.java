package MathProblems;

public class PrimeNumber {
    static void printTwinPrime(int n)
    {

        boolean prime[] = new boolean[n + 1];

        for (int i = 0; i <= n; i++)
            prime[i] = true;

        for (int p = 2; p * p <= n; p++) {

            // If prime[p] is not changed,
            // then it is a prime
            if (prime[p] == true) {

                // Update all multiples of p
                for (int i = p * 2; i <= n; i += p)
                    prime[i] = false;
            }
        }

        // to check for twin prime numbers
        // display th twin prime
        for (int i = 2; i <= n - 2; i++) {

            if (prime[i] == true &&
                    prime[i + 2] == true)

                // Display the result
                System.out.print(" (" + i + ", " +
                        (i + 2) + ")");
        }
    }

    // Driver Program to test above function
    public static void main(String args[])
    {
        int n = 25;
        printTwinPrime(n);
    }
}

