public class AntraUzduotis {
    public static void main(String[] args) {

        long sk1 = 10;
        long sk2 = 5;

        long dviejuSandauga = sandauga(sk1, sk2);
        System.out.println(dviejuSandauga);


        int sk3 = 15;
        int sk4 = 25;

        double dviejuDalyba = dalyba(sk3, sk4);
        System.out.println(dviejuDalyba);

        boolean arDalinasiIs5 = liekana(sk3);
        System.out.println(arDalinasiIs5);
    }
    
    public static long sandauga(long x, long y){
        long atsakymas = x * y;
        long atsakymas1 = atsakymas;
        return atsakymas1;
    }


    public static double dalyba(double x, double y){
        double atsakymas = x / y;
        return atsakymas;
    }

    public static boolean liekana(int x){
        return x % 5 == 0 && x % 3 == 0;
    }

}
