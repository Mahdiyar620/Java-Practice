import java.util.Scanner;

public class StringArrayMethods {

    // Tamrin 1: avvalin harf esm hame daneshjoo ha ro chap mikone
    public static void printFirstLetters(String[] names) {
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].charAt(0));
        }
    }

    // Tamrin 2: akharin harf esm hame daneshjoo ha ro chap mikone
    public static void printLastLetters(String[] names) {
        for (int i = 0; i < names.length; i++) {
            int lastIndex = names[i].length() - 1;   // index akharin harf
            System.out.println(names[i].charAt(lastIndex));
        }
    }

    // Tamrin 3: esm hame daneshjoo ha ro bar'aks chap mikone
    // (az akharin harf ta avvalin harf)
    public static void printReversed(String[] names) {
        for (int i = 0; i < names.length; i++) {
            for (int j = names[i].length() - 1; j >= 0; j--) {
                System.out.print(names[i].charAt(j));
            }
            System.out.println();   // raftan be khat badi ba'd az har esm
        }
    }

    // Tamrin 4: mishmore chand daneshjoo ba esm morede nazar (searchName) hast
    public static int countName(String[] names, String searchName) {
        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(searchName)) {   // baraye moghayese String az equals estefade mikonim
                count++;
            }
        }
        return count;
    }

    // Tamrin 5: az list "esm va famil" faghat esm ro chap mikone
    // esm ta avvalin fasele (space) hast
    public static void printFirstNames(String[] fullNames) {
        for (int i = 0; i < fullNames.length; i++) {
            int spaceIndex = fullNames[i].indexOf(' ');   // jaye avvalin fasele
            if (spaceIndex == -1) {
                // agar fasele nabud, hamun kole matn ro chap mikonim
                System.out.println(fullNames[i]);
            } else {
                System.out.println(fullNames[i].substring(0, spaceIndex));
            }
        }
    }

    public static void main(String[] args) {

        // list esm daneshjoo ha
        String[] students = {"Ali", "Reza", "Sara", "Ali", "Mina"};

        // Tamrin 1
        System.out.println("Tamrin 1 (avvalin harf ha):");
        printFirstLetters(students);

        // Tamrin 2
        System.out.println("Tamrin 2 (akharin harf ha):");
        printLastLetters(students);

        // Tamrin 3
        System.out.println("Tamrin 3 (esm ha bar'aks):");
        printReversed(students);

        // Tamrin 4 (esm ro az karbar migirim)
        Scanner input = new Scanner(System.in);
        System.out.print("Tamrin 4 - yek esm vared konid: ");
        String searchName = input.nextLine();
        int result = countName(students, searchName);
        System.out.println("Tedad daneshjooyi ba esm " + searchName + ": " + result);

        // Tamrin 5
        String[] fullNames = {"Ali Ahmadi", "Reza Karimi", "Sara Hosseini", "Mina Rahmani"};
        System.out.println("Tamrin 5 (faghat esm):");
        printFirstNames(fullNames);
    }
}
