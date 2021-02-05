public class Funktsioonid2 {
    public static int midiNumbriks(String tahtinimetus) {
        if (tahtinimetus.equals("do")) {
            return 60;
        }
        if (tahtinimetus.equals("doD")) {
            return 61;
        }
        if (tahtinimetus.equals("re")) {
            return 62;
        }
        if (tahtinimetus.equals("mib")) {
            return 63;
        }
        if (tahtinimetus.equals("mi")) {
            return 64;
        }
        if (tahtinimetus.equals("fa")) {
            return 65;
        }
        if (tahtinimetus.equals("fa")) {
            return 66;
        }
        if (tahtinimetus.equals("faD")) {
            return 66;
        }
        if (tahtinimetus.equals("sol")) {
            return 67;
        }
        if (tahtinimetus.equals("solD")) {
            return 68;
        }
        if (tahtinimetus.equals("la")) {
            return 69;
        }
        if (tahtinimetus.equals("sib")) {
            return 70;
        }
        if (tahtinimetus.equals("si")) {
            return 71;
        }
        return -1;
    }

    public static int[] midiNumbriteks(String[] tahtnimetused) {
        int[] vastus = new int[tahtnimetused.length];
        for (int i = 0; i < tahtnimetused.length; i++) {
            vastus[i] = midiNumbriks(tahtnimetused[i]);
        }
        return vastus;
    }

    /*public static int suurim(int[] m) {
        if (m != null) {
            if (m.length != 0) {
                int meeles = m[0];
                for (int i = 1; i < m.length; i++) {
                    if (m[i] > meeles) {
                        meeles = m[i];
                    }
                }return meeles;
            }else{
                throw new RuntimeException("elemednid puudu!");
            }
        } else {
            throw new RuntimeException("tyhi muutuja!");
        }
    }*/
    public static int suurim(int[] m) {
        if (m == null) {
            throw new RuntimeException("tyhi viit");
        }
        if (m.length == 0) {
            throw new RuntimeException("elemendid puudu");
        }
        int meeles = m[0];
        for (int i = 1; i < m.length; i++) {
            if (m[i] > meeles) {
                meeles = m[i];
            }
        }
        return meeles;
    }

    public static void main(String[] args) {
        int[] sendid = {1, 2, 5};
        int[] eurod = new int[4];
        eurod[0] = 1;
        eurod[1] = 2;
        eurod[2] = 5;
        eurod[3] = 10;
        int[] ostudeTahvel = null;
        int[] ostud = {};

        System.out.println(suurim(new int[]{3, 6, 9}));
        System.out.println(suurim(sendid));

        try {
            System.out.println(suurim(ostud));
            //elemendid puuduvad
            System.out.println(suurim(ostudeTahvel));
            //tühi viit
        } catch (RuntimeException ex) {
            System.out.println("Tekkis probleem: " + ex.getMessage());
        }
        System.out.println(midiNumbriks("mi"));

        int[] mnumbrid = midiNumbriteks(new String[]{"mi", "mi", "re", "mi", "do", "doD", "sib", "sib"});
        for (int mnr : mnumbrid) {
            System.out.println(mnr);
            }
    }
}