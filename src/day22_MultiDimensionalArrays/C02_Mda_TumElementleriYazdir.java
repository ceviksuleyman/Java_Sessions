package day22_MultiDimensionalArrays;

public class C02_Mda_TumElementleriYazdir {

    public static void main(String[] args) {

        //Verilen bir multi-dimensional array'in tum elementlerini yazdiran bir method olusturun.

        int[][] sayilar = {{1,5,6,9,4},{2,5,5,8},{3,1,6}};
         //                    0           1        2
        elementleriYazdir(sayilar);
    }

    public static void elementleriYazdir(int[][] sayilar) {

        for (int i = 0; i < sayilar.length; i++) { // i=0,1,2 index'li outer array'i gezicek

            for (int j = 0; j < sayilar[i].length; j++) { //  inner array'lerin elementlerini gezicek

                System.out.print(sayilar[i][j]+" ");
            }
        }

    }
}
