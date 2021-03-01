public class Proov1{
	public static void main(String[] arg){
		Vektor v1=new Vektor(2, 5);
		Vektor v2=new Vektor(1, 1);
		System.out.println(v1.x);
		System.out.println(v1.korruta(0.5).y);
		v1.liidaJuurde(v2);
		System.out.println(v1.x);
		//Liitke v1 juurde veel pool v2-te, kuvage tulemus
		//v1.liidaJuurde(v2.korruta(0.5));
		Vektor v3=v2.korruta(0.5);
		v1.liidaJuurde(v3);
		System.out.println(v1.x);
	}
}