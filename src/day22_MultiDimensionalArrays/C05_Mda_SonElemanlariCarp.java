package day22_MultiDimensionalArrays;

public class C05_Mda_SonElemanlariCarp {

    public static void main(String[] args) {

        // 2-Asagidaki multi dimensional array’in ic array’lerindeki son elemanlarin carpimini ekrana yazdiran
        // bir program yaziniz { {1,2,3}, {4,5}, {6} }

        int[][] arr={ {1,2,3}, {4,5,2}, {6,3} };
        int carpim=1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {//inner arraylar'i gezer arr[i].length

                if (j == arr[i].length - 1) {  // j = inner arr[i].length-1  son index'i ise 3,2,3

                    carpim*=arr[i][j];
                }
            }
        }
        System.out.println("son elemanlarin carpimi: "+carpim);

    }
}
