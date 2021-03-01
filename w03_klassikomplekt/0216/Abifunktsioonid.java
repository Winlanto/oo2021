public class Abifunktsioonid{
	public static int kaivitusi=0;
	public int eksemplariKaivitusi=0;
	public String tekst;
	public static int kolmestSuurem(int a, int b, int c){
		int s1=a;
		kaivitusi++;
		if(b>s1){s1=b;}
		return (c>s1)?c:s1;
	}

	public boolean kasPalindroom(){
		Abifunktsioonid.kaivitusi++;
		this.eksemplariKaivitusi++;
		boolean vastus=true;
		for(int i=0; i<tekst.length(); i++){
			if(tekst.charAt(i)!=tekst.charAt(tekst.length()-1-i)){
				vastus=false;
			}
		}return vastus;
	}
}