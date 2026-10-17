package javapractice06;

public class JavaPractice06 {

    public static void main(String[] args) {

        int n=6;

        int s1=18;
        int s2=9;
        int s3=14;
        int s4=20;
        int s5=7;
        int s6=12;

        if (n<=0)
            System.out.println("tedad daneshjoo bayad mosbat bashad");
        else
        {
            int k=1;
            int sum=0;
            int max=0;
            int min=20;
            int ghabol=0;
            int momtaz=0;
            boolean b=true;

            while (k<=n)
            {
                int grade;

                switch (k) {
                    case 1:
                        grade=s1;
                        break;

                    case 2:
                        grade=s2;
                        break;

                    case 3:
                        grade=s3;
                        break;

                    case 4:
                        grade=s4;
                        break;

                    case 5:
                        grade=s5;
                        break;

                    default:
                        grade=s6;
                }

                if (grade<0 || grade>20)
                {
                    System.out.println("nomre "+k+" namotabar ast");
                    b=false;
                }
                else
                {
                    sum=sum+grade;

                    if (grade>max)
                        max=grade;
                    if (grade<min)
                        min=grade;
                    if (grade>=10)
                        ghabol++;
                    if (grade>=18)
                        momtaz++;
                }

                k++;
            }

            if (b)
            {
                double average=sum*1.0/n;
                int kamtar=0;

                k=1;
                while (k<=n)
                {
                    int grade;

                    switch (k) {
                        case 1:
                            grade=s1;
                            break;

                        case 2:
                            grade=s2;
                            break;

                        case 3:
                            grade=s3;
                            break;

                        case 4:
                            grade=s4;
                            break;

                        case 5:
                            grade=s5;
                            break;

                        default:
                            grade=s6;
                    }

                    if (grade<average)
                        kamtar++;

                    k++;
                }

                int p=(ghabol*20000+n)/(2*n);
                int sahih=p/100;
                int ashar=p%100;

                System.out.println("miangin: "+average);
                System.out.println("bishtarin: "+max);
                System.out.println("kamtarin: "+min);
                System.out.println("ghabol shode: "+ghabol);
                System.out.println("momtaz: "+momtaz);
                System.out.println("kamtar az miangin: "+kamtar);

                System.out.print("darsad ghaboli: "+sahih+".");
                if (ashar<10)
                    System.out.print("0");
                System.out.println(ashar+"%");
            }
            else
                System.out.println("lotfan nomre ha ra eslah konid");
        }
    }
}