package javapractice04;

public class JavaPractice04 {

    public static void main(String[] args) {

        int mojoodi=10000000;
        int k=1;
        boolean b=true;

        while (b)
        {
            int choice=0;
            int amount=0;

            switch (k) {
                case 1:
                    choice=1;
                    break;

                case 2:
                    choice=2;
                    amount=2000000;
                    break;

                case 3:
                    choice=3;
                    amount=3000000;
                    break;

                case 4:
                    choice=3;
                    amount=25000;
                    break;

                default:
                    choice=4;
            }

            System.out.println("1:mojoodi 2:variz 3:bardasht 4:khorooj");
            System.out.println("entekhab: "+choice);

            switch (choice) {
                case 1:
                    System.out.println("mojoodi: "+mojoodi);
                    break;

                case 2:
                    if (amount<=0)
                        System.out.println("mablagh bayad mosbat bashad");
                    else
                    {
                        mojoodi=mojoodi+amount;
                        System.out.println("variz anjam shod, mojoodi jadid: "+mojoodi);
                    }
                    break;

                case 3:
                    if (amount<=0)
                        System.out.println("mablagh bayad mosbat bashad");
                    else if (amount>mojoodi)
                        System.out.println("mojoodi kafi nist");
                    else if (amount%50000!=0)
                        System.out.println("mablagh bayad mazrab 50000 bashad");
                    else
                    {
                        mojoodi=mojoodi-amount;
                        System.out.println("bardasht anjam shod, mojoodi jadid: "+mojoodi);
                    }
                    break;

                case 4:
                    System.out.println("khorooj");
                    b=false;
                    break;

                default:
                    System.out.println("input number is invalid");
            }

            k++;
        }
    }
}