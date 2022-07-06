package day15_overloading_forloop;

public class C07_Faktoryel {

    public static void main(String[] args) {
        /*
        input olarak verilen bir tamsayi icin faktoryel hesaplayip yazdiran bir method olusturun
        * verilen sayi negatif veya 20' den buyuk olursa
        * "girilen sayinin faktoryeli hesaplanamaz" uyarisi yazdirin..
         */
        int input=5;

        faktoriyelHesapla(input);
    }

    public static void faktoriyelHesapla(int input) {
        int faktoryel=1;

        if (input<0 || input>20){
            System.out.println("Verilen sayi icin faktoryel hesaplanamaz");
        }else if (input==0){
            System.out.println("0!=1'dir");
        }else {

            for (int i = 1; i <=input ; i++) {
                faktoryel*=i;
            }
            System.out.println("faktoryel degeri: "+faktoryel);
        }
    }
}
