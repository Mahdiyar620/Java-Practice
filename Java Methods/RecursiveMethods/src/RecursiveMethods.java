public class RecursiveMethods {

    // Tamrin 1: adad n ro migire va az n ta 1 ro nozuli chap mikone
    public static void printDown(int n) {
        if (n < 1) {            // halat paye: vaghti n az 1 kamtar shod tamum mishe
            return;
        }
        System.out.print(n + " ");
        printDown(n - 1);       // seda zadan khodesh ba adad kuchiktar
    }

    // Tamrin 2: base ro be tavane exp mirasune (base^exp)
    public static int power(int base, int exp) {
        if (exp == 0) {         // halat paye: har adadi be tavane 0 mishe 1
            return 1;
        }
        return base * power(base, exp - 1);
    }

    // Tamrin 3: jomle n-om dolbale Fibonacci ro hesab mikone
    // dobale: 1 1 2 3 5 8 13 ...
    public static int fibonacci(int n) {
        if (n == 1 || n == 2) {     // halat paye: do jomle avval 1 hastan
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);   // jam do jomle ghabli
    }

    // chap n jomle avval Fibonacci (har jomle ba fibonacci bazgashti hesab mishe)
    public static void printFibonacci(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }

    // Tamrin 4: adad sahih ro be adad binary (be sorat String) tabdil mikone
    public static String toBinary(int n) {
        if (n < 2) {                // halat paye: 0 ya 1 khodesh binary hast
            return "" + n;
        }
        // n ro taghsim bar 2 mikonim va baghimande ro akhar minevisim
        return toBinary(n / 2) + (n % 2);
    }

    // Tamrin 5: Borj Hanoi
    // n ta disk ro az miloye "from" be miloye "to" montaghel mikone, ba komak miloye "via"
    public static void hanoi(int n, String from, String to, String via) {
        if (n == 1) {               // halat paye: faghat yek disk
            System.out.println("Disk 1: " + from + " -> " + to);
            return;
        }
        hanoi(n - 1, from, via, to);    // n-1 disk ro mibarim miloye komaki
        System.out.println("Disk " + n + ": " + from + " -> " + to);   // bozorgtarin disk ro mibarim maghsad
        hanoi(n - 1, via, to, from);    // n-1 disk ro az miloye komaki mibarim maghsad
    }

    // Tamrin 6: meghdar haye tekrari ro az arraye hazf mikone
    // (in tamrin bazgashti nist, ba do halghe sade anjam mishe)
    public static int[] removeDuplicates(int[] arr) {
        int[] temp = new int[arr.length];   // arraye movaghat baraye adad haye bedune tekrar
        int count = 0;                      // tedad adad haye bedune tekrar

        for (int i = 0; i < arr.length; i++) {
            boolean exists = false;         // aya in adad ghablan zakhire shode?
            for (int j = 0; j < count; j++) {
                if (temp[j] == arr[i]) {
                    exists = true;
                }
            }
            if (exists == false) {
                temp[count] = arr[i];
                count++;
            }
        }

        // arraye nahayi ba andaze daghigh
        int[] result = new int[count];
        for (int i = 0; i < count; i++) {
            result[i] = temp[i];
        }
        return result;
    }

    public static void main(String[] args) {

        // Tamrin 1
        System.out.println("Tamrin 1 (nozuli):");
        printDown(5);
        System.out.println();

        // Tamrin 2
        System.out.println("Tamrin 2 (tavan):");
        System.out.println("2 be tavane 5 = " + power(2, 5));
        System.out.println("3 be tavane 0 = " + power(3, 0));

        // Tamrin 3
        System.out.println("Tamrin 3 (Fibonacci):");
        printFibonacci(8);

        // Tamrin 4
        System.out.println("Tamrin 4 (binary):");
        System.out.println("10 -> " + toBinary(10));
        System.out.println("5 -> " + toBinary(5));
        System.out.println("0 -> " + toBinary(0));

        // Tamrin 5
        System.out.println("Tamrin 5 (Borj Hanoi ba 3 disk):");
        hanoi(3, "A", "C", "B");

        // Tamrin 6
        System.out.println("Tamrin 6 (hazf tekrari):");
        int[] numbers = {1, 2, 2, 3, 3, 4};
        int[] unique = removeDuplicates(numbers);
        for (int i = 0; i < unique.length; i++) {
            System.out.print(unique[i] + " ");
        }
        System.out.println();
    }
}