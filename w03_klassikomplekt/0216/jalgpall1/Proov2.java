public class Proov2{
	public static void main(String[] arg){
		LiikuvObjekt o1=new LiikuvObjekt(4, 3, 2, 1);
		LiikuvObjekt o2=new LiikuvObjekt(6, 6);
		System.out.println(o1+" "+o2);
		o1.liigu();
		o2.liigu();
		System.out.println(o1+" "+o2);
		/*Pall p1=new Pall(5, 5, 1, 1, 0.8);
		//p1.liigu(1);
		//System.out.println(p1);
		p1.liigu(2);
		System.out.println(p1);*/
	}
}