public class Funktsioonid{
    public static String temperatuuriHinnang(int t){
        if (t < 18){return "Täna on külm";}
        return "täna on soe";
    }

    public static double ringiPindala(double r){
        return Math.PI*r*r;
    }

    public static double taksoSoit(double s){
        return (s*0.99)+2;
    }

    public static void main(String[] args){
        System.out.println("pindala on "+ringiPindala(8));
        System.out.println(temperatuuriHinnang(-5));
        System.out.println("Takso "+taksoSoit(5));
        if(args.length==1){
            System.out.println(taksoSoit(Integer.parseInt(args[0])));

            System.out.println(taksoSoit(Integer.parseInt(args[0])));
        }
    }
}