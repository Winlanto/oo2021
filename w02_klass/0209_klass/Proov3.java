public class Proov3{
    public static void main(String[] args){
        Retsept pannkoogid = new Retsept();
        pannkoogid.lisa("piim", 500.0);
        pannkoogid.lisa("jahu", 250.0);
        pannkoogid.lisa("suhkur", 100.0);
        pannkoogid.lisa("munad", 50.0);
        pannkoogid.lisa("piim", 100.0);
        System.out.println("koostisosad"+pannkoogid.kysiAineNimed());
        System.out.println("Kogumass: "+pannkoogid.koguMass()+" g.");
        System.out.println("Originaalretsept: "+pannkoogid.kysiAined());
        Retsept paljuPannkooke=pannkoogid.koopia(3);
        System.out.println("portsioon kolmeks: "+paljuPannkooke.kysiAined());
        System.out.println("soovitud kogumass 500g: "+pannkoogid.soovitudMassigaKoopia(500).kysiAined());
    }
}