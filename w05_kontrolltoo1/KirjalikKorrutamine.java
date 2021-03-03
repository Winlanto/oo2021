import java.io.File;
import java.util.Scanner;
import java.text.DecimalFormat;

public class KirjalikKorrutamine {
    int arv1, arv2, arvuPikus;
    int numbrid1[] = new int[10];
    int vahetulemused[] = new int[10];

    public void KirjalikKorrutamine(int arv1, int arv2){
        int i=0;
        while(arv1!=0){
            numbrid1[i]= arv1%10;
            arv1=arv1/10;
            i++;
        }this.arvuPikus=i;
        for (i = arvuPikus; i==0;i--){
            System.out.print(numbrid1[i]);
        }
    }
    public void setArvud(int arv1, int arv2){this.arv1 = arv1; this.arv2=arv2;}
    public String getArvud(){return "Praegused arvud: "+arv1+", "+arv2;}

    public String toString(){return (arv1+" * "+ arv2+" = "+arv1*arv2)+"\n"/*+KirjalikKorrutamine(arv1, arv2)*/;}

    public static void main(String[] args) throws Exception{
        //sisendifaili seadistamine
        File sisend = new File ("testid.txt");
        Scanner sc = new Scanner(sisend);
        KirjalikKorrutamine test = new KirjalikKorrutamine();
        while (sc.hasNextInt()){
            test.setArvud(sc.nextInt(), sc.nextInt());
            System.out.println(test.getArvud());
            System.out.println("Arvu 1 pikus: "+test.arvuPikus);
            System.out.println(test);
        }test.KirjalikKorrutamine(2522, 2131);
    }
}