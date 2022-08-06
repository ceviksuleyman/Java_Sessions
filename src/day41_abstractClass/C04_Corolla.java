package day41_abstractClass;

public class C04_Corolla extends C02_Toyota {

    @Override
    protected void yakit() {

    }
    // motor abstract method'unu Toyota parent'te concrete ettigimiz icin bu child
    // class'da implement yapmak zorunda kalmadik diger 2 abstract method'u mecburen
    // override ettik.

    @Override
    protected void kaporta() {

    }

     /*
    Corolla class'inin 2 tane parent'i var, Corolla parent'larinin ikisinin de
    standartlarina(abstract method) uymak zorundadir.

    Concrete bir class parent'i olan tum abstract class'larda abstract olan
    method'lari implement etmek zorundadir.
    Ancak Parent silsilesinde override edilerek concrete yapilan method'lari
    override etmek zorunda DEGILDIR.
     */

}
