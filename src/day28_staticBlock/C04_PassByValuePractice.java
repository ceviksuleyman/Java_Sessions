package day28_staticBlock;

public class C04_PassByValuePractice {

    public static void main(String[] args) {

        double fiyat = 100;

        System.out.println("indirim10 method'unda hesaplanan fiyat : "+indirim10(fiyat));
        System.out.println("indirim20 method'unda hesaplanan fiyat : "+indirim20(fiyat));
        System.out.println("indirim25 method'unda hesaplanan fiyat : "+indirim25(fiyat));
        System.out.println("method call sonrasi fiyat : "+fiyat);

    }
    public static double indirim10(double fiyat){
        fiyat *= 0.90;

        return fiyat;
    }
    public static double indirim20(double fiyat){
        fiyat *= 0.80;

        return fiyat;
    }
    public static double indirim25(double fiyat){
        fiyat *= 0.75;

        return fiyat;
    }
}
