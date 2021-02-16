import java.util.*;
public class Roulette {
    public int balans;
    public int kaivitusi = 0;
    Scanner kusi = new Scanner(System.in);

    public void lisaBalans(){
        System.out.println("Kui palju tahate balansile lisada?");
        int lisamiseks = kusi.nextInt();
        balans+=lisamiseks;
        System.out.println("balans: "+balans);
    }
    public void kusiPanust(){
        System.out.print("Kui suurt panust tahad teha?");
        int panus = kusi.nextInt();
    }
    public int kusiVoitja(){
        System.out.println("Mille peale panete?\n1. Punased\n2. Mustad\n3. 0 (roheline)");
        int loodavVoitja = kusi.nextInt();
        while (loodavVoitja>3 && loodavVoitja<1){
            System.out.print("vale klahvikombinatsioon");
            loodavVoitja = kusi.nextInt();
        }return loodavVoitja;
    }
    public void mangi(){
        kaivitusi++;
        Random voitja = new Random(37);
    }
}