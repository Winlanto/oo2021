public class Arvutus1{
    public static void main (String[] args){
        double mass=73.5;
        System.out.println(mass+10);
        System.out.println(mass*2);
        System.out.println(mass/2);

        String nimi="Alek";
        int vanus = 7;
        if(vanus>7){
            System.out.println("tasuline");
        }else{
            System.out.println("tasuta");
        }
        long molekule = 78697665345879687L;
        short palk = 25000;
        short kogupalk = (short)(palk*(short)2);
        System.out.println(molekule*1000);
        System.out.println(kogupalk);
        byte loendur = 20;
        float vahemaa = 100.25f;
        char symbol = 'o';
        boolean kasKorrras = false;
        //byte, short, int, long
        //float double
        //char
        //boolean
    }
}