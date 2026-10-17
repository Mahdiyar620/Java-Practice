package javapractice05;

public class JavaPractice05 {

    public static void main(String[] args) {

        int target=37;

        int g1=50;
        int g2=25;
        int g3=25;
        int g4=150;
        int g5=40;
        int g6=37;
        int g7=10;

        int k=1;
        int talash=0;
        int score=100;
        boolean b=true;

        while (k<=7 && b)
        {
            int guess;

            switch (k) {
                case 1:
                    guess=g1;
                    break;

                case 2:
                    guess=g2;
                    break;

                case 3:
                    guess=g3;
                    break;

                case 4:
                    guess=g4;
                    break;

                case 5:
                    guess=g5;
                    break;

                case 6:
                    guess=g6;
                    break;

                default:
                    guess=g7;
            }

            System.out.println("hads: "+guess);

            if (guess<1 || guess>100)
                System.out.println("kharej az baze");
            else
            {
                talash++;
                boolean tekrari=false;

                if (k>=2 && guess==g1)
                    tekrari=true;
                if (k>=3 && guess==g2)
                    tekrari=true;
                if (k>=4 && guess==g3)
                    tekrari=true;
                if (k>=5 && guess==g4)
                    tekrari=true;
                if (k>=6 && guess==g5)
                    tekrari=true;
                if (k>=7 && guess==g6)
                    tekrari=true;

                if (tekrari)
                {
                    score=score-15;
                    System.out.println("hads tekrari -15");
                }
                else if (guess==target)
                {
                    System.out.println("dorost hads zadi");
                    b=false;
                }
                else
                {
                    score=score-10;
                    if (guess>target)
                        System.out.println("bozorg tar az hadaf -10");
                    else
                        System.out.println("koochek tar az hadaf -10");
                }

                if (score<0)
                    score=0;
            }

            k++;
        }

        if (b)
            System.out.println("nabordi, adad: "+target);
        else
            System.out.println("tedad talash: "+talash);

        System.out.println("emtiaz: "+score);
    }
}
