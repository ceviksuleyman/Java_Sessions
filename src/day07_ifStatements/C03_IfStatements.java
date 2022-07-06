package day07_ifStatements;

public class C03_IfStatements {

    public static void main(String[] args) {

        //bir if statement 'a { } kullanilmazsa ilk satiri sart ile baglar sonraki satirlar bagimsiz olur !!!
        //eger birden fazla satir ayni if sartina baglanmissa mutlaka {  } kullanmaliyiz

        int sayi=-23;

        if(sayi>0)
            System.out.println("sayi pozitif"); //degere bagli
            System.out.println("pozitif kalacaktir"); //her zaman calisir
            System.out.println("ucuncu satir"); //her zaman calisir

        if(sayi%2==0)
            System.out.println("sayi çift"); //degere bagli
            System.out.println("cift kalacaktir");//her zman calisir

        if (sayi%5==0)
            System.out.println("sayi 5 in katı"); //degere bagli

    }
}
