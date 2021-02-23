import java.util.*;
import java.lang.Math;

public class Taksosoid {
    double soiduAlguseSumma = 1.5;
    double currentKoef;

    Scanner kysi = new Scanner(System.in);
    Random randomDouble = new Random();

    public double getRandKoef() {
        double koef = randomDouble.nextDouble();
        while (koef>0.75 || koef<0.25){koef=randomDouble.nextDouble();}
        koef=(double) Math.round(koef*100)/100;
        currentKoef = koef;
        return koef;
    }

    public double kysiTaksoklass() {
        System.out.println("\nPraegune tariif: " + getRandKoef() + " eur/km.");
        System.out.println("Millist taksoklassi Teie soovite?\n1. Tavaline\n2. Comfort");
        double tulemus = 0;
        double valik = kysi.nextInt();
        if (valik == 1){tulemus=1;}
        else if (valik == 2){tulemus=1.25;}
        while (valik != 1 && valik != 2) {
            System.out.println("Millist taksoklassi Teie soovite?\n1. Tavaline\n2. Comfort");
            valik = kysi.nextInt();
        }return tulemus;
    }

    public double leiaSumma(int distants){
        double taksoklass = kysiTaksoklass();
        double summa = (taksoklass*(currentKoef*distants))+soiduAlguseSumma;
        return summa;
    }

    public double leiaDistants(int summa){
        double taksoklass = kysiTaksoklass();
        double distants = (taksoklass*(summa/currentKoef)) +soiduAlguseSumma;
        return distants;
    }
}