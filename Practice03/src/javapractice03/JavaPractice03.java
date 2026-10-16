package javapractice03;

public class JavaPractice03 {

    public static void main(String[] args) {

        int n = 6;
        int steps = 0;
        int max = n;
        int even = 0;
        int odd = 0;

        System.out.print("sequence: ");

        while (n != 1) {
            System.out.print(n + " ");

            if (n > max)
                max = n;

            if (n % 2 == 0) {
                even++;
                n = n / 2;
            } else {
                odd++;
                n = n * 3 + 1;
            }

            steps++;
        }

        // عدد آخر یعنی 1 که فرده و داخل حلقه نیومد
        System.out.println(n);
        odd++;

        System.out.println("steps: " + steps);
        System.out.println("max: " + max);
        System.out.println("even: " + even);
        System.out.println("odd: " + odd);
    }
}