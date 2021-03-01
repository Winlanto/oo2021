public class Proov1{
	public static void main(String[] arg){
		System.out.println(Abifunktsioonid.kolmestSuurem(5, 8, 4));
		System.out.println(Abifunktsioonid.kolmestSuurem(5, 9, 4));
		System.out.println(Abifunktsioonid.kaivitusi);
		Abifunktsioonid a1=new Abifunktsioonid();
		a1.tekst="udu";
		Abifunktsioonid a2=new Abifunktsioonid();
		a2.tekst="Juku";
		System.out.println(a1.kasPalindroom());
		System.out.println(a2.kasPalindroom());
		System.out.println(a2.kasPalindroom());
		System.out.println(Abifunktsioonid.kaivitusi);
		System.out.println(a1.eksemplariKaivitusi);
		System.out.println(a2.eksemplariKaivitusi);
	}
}