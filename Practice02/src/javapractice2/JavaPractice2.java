package javapractice2;

public class JavaPractice2 {

    public static void main(String[] args) {

        int n = 28;
        int count = 0;
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
                sum = sum + i;
            }
        }

        System.out.println("number of divisors: " + count);
        System.out.println("sum of divisors: " + sum);

        if (count == 2) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
            System.out.print("divisors: ");
            for (int i = 2; i < n; i++) {
                if (n % i == 0)
                    System.out.print(i + " ");
            }
            System.out.println();
        }

        if (sum - n == n)
            System.out.println("perfect");
        else
            System.out.println("not perfect");
    }
}