public class Exercise01 {

    // Tamrin 1: do kalame ro migire va posht sare ham michasbune
    public static String joinWords(String a, String b) {
        return a + b;
    }

    // Tamrin 2: az avval ta harf x-om kalame a ro bar migardune
    // agar x bishtar az tedad harf haye a bashe, null (yani khali) bar migardune
    public static String firstChars(String a, int x) {
        if (x > a.length()) {
            return null;
        }
        return a.substring(0, x);
    }

    // Tamrin 3: az harf x-om ta harf y-om kalame a ro bar migardune
    // (shomaresh harf ha az 1 shoru mishe)
    // agar x ya y bozorgtar az tedad harf haye a bashan ya x az y bozorgtar bashe, null bar migardune
    public static String part(String a, int x, int y) {
        if (x < 1 || x > a.length() || y > a.length() || x > y) {
            return null;
        }
        return a.substring(x - 1, y);
    }

    // Tamrin 4: x harf avval a ro ba x harf avval b jabeja mikone
    // agar x bishtar az tedad harf haye a ya b bashe false bar migardune, vagarna true
    // chon String ro nemishe taghir dad, kalame haye jadid ro hamin ja chap mikonim
    public static boolean swapFirst(String a, String b, int x) {
        if (x > a.length() || x > b.length()) {
            return false;
        }
        String firstA = a.substring(0, x);   // x harf avval a
        String firstB = b.substring(0, x);   // x harf avval b

        String newA = firstB + a.substring(x);   // x harf avval b + baghiye a
        String newB = firstA + b.substring(x);   // x harf avval a + baghiye b

        System.out.println("   a ba'd az jabejayi: " + newA);
        System.out.println("   b ba'd az jabejayi: " + newB);
        return true;
    }

    // Tamrin 5: Overloading -> chand method ba ye esm (area) ama parametr haye motefavet

    // masahat daere
    public static double area(int r) {
        return 3.14 * r * r;
    }

    // masahat mostatil
    public static double area(int a, int b) {
        return a * b;
    }

    // masahat mosalas
    public static double area(double base, double height) {
        return 0.5 * base * height;
    }

    // Tamrin 6: morattab sazi soudi (Bubble Sort) bedune Arrays.sort()
    public static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // agar adad balayi az adad badi bozorgtar bud, jashun ro avaz mikonim
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        // Tamrin 1
        System.out.println("Tamrin 1:");
        System.out.println("   " + joinWords("Hello", "World"));

        // Tamrin 2
        System.out.println("Tamrin 2:");
        System.out.println("   " + firstChars("Programming", 4));
        System.out.println("   " + firstChars("Java", 10));

        // Tamrin 3
        System.out.println("Tamrin 3:");
        System.out.println("   " + part("Programming", 4, 7));
        System.out.println("   " + part("Java", 3, 2));

        // Tamrin 4
        System.out.println("Tamrin 4:");
        boolean result1 = swapFirst("Hello", "World", 2);
        System.out.println("   natije: " + result1);
        boolean result2 = swapFirst("Hello", "World", 20);
        System.out.println("   natije: " + result2);

        // Tamrin 5
        System.out.println("Tamrin 5:");
        System.out.println("   Daere (r = 5): " + area(5));
        System.out.println("   Mostatil (4 x 6): " + area(4, 6));
        System.out.println("   Mosalas (ghaede 3.0, ertefa 8.0): " + area(3.0, 8.0));

        // Tamrin 6
        System.out.println("Tamrin 6:");
        int[] numbers = {5, 2, 9, 1, 7, 3};
        sortArray(numbers);
        System.out.print("   ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
