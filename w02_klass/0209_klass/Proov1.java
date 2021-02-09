public class Proov1 {
    public static void main(String[] args) {
        Isikukood alek = new Isikukood("50010180833");
        System.out.println(alek.sugu());
        System.out.println(alek.aasta());
        System.out.println(alek.kuuNumber());
        System.out.println(alek.kuuPaev());
    }
}