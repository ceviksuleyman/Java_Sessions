package day17_nestedForLoop;

public class C02_NestedForLoop {

    public static void main(String[] args) {
        /*
        verilen sayiya gore carpim tablosu olusturun
          input =3
          1 2 3
          2 4 6
          3 6 9
         */
        int input=5;

        for (int i = 1; i <=input ; i++) {  //satir sayisini burda ayarladi

            for (int j = 1; j <=input ; j++) {

                System.out.print(i*j +" ");
            }
            System.out.println("");
        }

    }
}
