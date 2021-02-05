public class Arvutus2{
    public static void main (String[] args){
        System.out.println("Argumente: "+args.length);
        if (args.length == 1) {
            System.out.println("Ainuke: ");
        }else if (args.length == 2) {
            System.out.println("Loodetavasti kaks arvu");
            int arv1=Integer.parseInt(args[0]);
            int arv2 = Integer.parseInt(args[1]);
            System.out.println(arv1*arv2);
        }else if (args.length == 3) {
            System.out.println("Loodetavasti kolm arvu");
            int arv1 = Integer.parseInt(args[0]);
            int arv2 = Integer.parseInt(args[1]);
            int arv3 = Integer.parseInt(args[2]);
            System.out.println(arv1 + arv2 + arv3);
        }else if (args.length >= 4) {
            System.out.println("Loodetavasti arvu on " + (args.length)+".");
            int summa = 0;
            for (int i = 0; i < args.length; i++) {
                summa = summa + Integer.parseInt(args[i]);
            }
            System.out.println("Argumentide summa on "+summa+".");
        }/*for(String a: args){
            System.out.println(a);
        }for(int i=0; i < args.length; i++){
            System.out.println("Kohal"+i+" on "+args[i]);
        }*/
    }
}