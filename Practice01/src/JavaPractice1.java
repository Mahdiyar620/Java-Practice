public class JavaPractice1 {

    public static void main(String[] args) {

        int n = 70405;  

        if (n <= 0) {
            System.out.println("Number must be positive!");
        } else {
            System.out.println("n = " + n);   

            int count = 0;     
            int sum = 0;      
            int product = 1;   
            int max = 0;       
            int min = 9;      
            int even = 0;     
            int odd = 0;       
            int rev = 0;       

            while (n > 0) {
                int d = n % 10;   // last number

                count++;
                sum = sum + d;

                if (d != 0)
                    product = product * d;

                if (d > max)
                    max = d;
                if (d < min)
                    min = d;

                if (d % 2 == 0)
                    even++;
                else
                    odd++;

                rev = rev * 10 + d;
                n = n / 10;
            }

            System.out.println("Number of digits = " + count);
            System.out.println("Sum of digits = " + sum);
            System.out.println("Product of non-zero digits = " + product);
            System.out.println("Biggest digit = " + max);
            System.out.println("Smallest digit = " + min);
            System.out.println("Even digits = " + even);
            System.out.println("Odd digits = " + odd);
            System.out.println("Reversed number = " + rev);
        }
    }
}