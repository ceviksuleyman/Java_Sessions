package day04_dataCasting;

public class C03_AutoWidening {

    public static void main(String[] args) {

        //AutoWidening : Otomatik genisletme
        //byte -> short -> int -> long -> float -> double
        float sayi1=3.4f;
        System.out.println(sayi1);
        double sayi2=sayi1;
        System.out.println(sayi2);

        byte num1= 12;
        short num2 =num1;
        int num3=num2;
        float num4=num3;
        double num5=num4;
        System.out.println("num1= "+num1); //12
        System.out.println("num2= "+num2); //12
        System.out.println("num3= "+num3); //12
        System.out.println("num4= "+num4); //12.0
        System.out.println("num5= "+num5); //12.0

        byte s1=23;
        short s2=55;           //dar veri turundeki bir degeri,genis veri turundeki variable'a otomatik assign eder
        int s3=s1+s2;
        System.out.println("s3= "+s3); //78

        double s4= s1*s2;
        System.out.println("s4= "+s4); //1265.0 double oldugu ıcın ondalık seklınde sonucu yazar

        s4=(double) s2/s1; //2.391
        System.out.println("s4= "+s4);  // !!s4=s2/s1 Once Islem  o yüzden sonuç 2.0 ve veri kaybı olusur
                                        // s4=(double)s2/s1 seklınde yazmalıyız 2.391 sonuc
                                        //sayılardan bir tanesini double yapıyoruz ki sonucu 2.0 değil 2.391 verir




    }
}
