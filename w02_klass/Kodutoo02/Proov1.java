public class Proov1 {
    public static void main(String[] args) {
        Taksosoid testTaksosoid = new Taksosoid();
        System.out.println("\nrandom tariif: "+testTaksosoid.getRandKoef());
        System.out.println(String.format("%.2f eur.",testTaksosoid.leiaSumma(17)));
        System.out.println(String.format("%.2f km.",testTaksosoid.leiaDistants(17)));
    }
}