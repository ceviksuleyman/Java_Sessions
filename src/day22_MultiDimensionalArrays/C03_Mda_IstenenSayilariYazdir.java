package day22_MultiDimensionalArrays;

public class C03_Mda_IstenenSayilariYazdir {

    public static void main(String[] args) {
        // Verilen 2 katli multi-dimensional array'de outer index'i ve inner index'i ayni olan sayilarin toplamini yazin
        // int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};
        // [0][0] + [1][1] + [2][2] ......

        int[][] sayilar = {{3,5,6,9,4},{2,6,5,8},{3,1,8},{1,1,1,3,1}};

        int total=0;

        for (int i = 0; i < sayilar.length; i++) {

            for (int j = 0; j < sayilar[i].length; j++) {

                if (i == j) {

                    total+=sayilar[i][j];
                    System.out.println("["+i+"]"+"["+j+"]"+" = "+sayilar[i][j]);
                }
            }
        }
        System.out.println("toplam: "+total);
    }
}
