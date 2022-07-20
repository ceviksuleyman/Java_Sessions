package day26_constructor;

public class KamyonRun {

    public static void main(String[] args) {

        Kamyon kamyon1 = new Kamyon();
        System.out.println("*** Kamyon1 Ozellikleri ***"+kamyon1);


        Kamyon kamyon2 = new Kamyon("MERCEDES","4240",2005,500000);
        System.out.println("*** Kamyon2 Ozellikleri ***"+kamyon2);


        Kamyon kamyon3 = new Kamyon("MAN","as900",2007,400000);
        System.out.println("*** Kamyon3 Ozellikleri ***"+kamyon3);


        Kamyon kamyon4 = new Kamyon("Scania","s540");
        System.out.println("*** Kamyon4 Ozellikleri ***"+kamyon4);

    }
}
