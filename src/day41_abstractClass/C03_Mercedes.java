package day41_abstractClass;

public class C03_Mercedes extends C01_Araba {

    /*
 abstract bir parent'in concrete child class'i inherit ederse parent abstract
 class'daki tum abstract method'lari override etmek zorundadir.
 Abstract bir class, abstract baska bir class'i parent edinirse(Toyota) parent
 class'daki tum abstract method'lari override etmek zorunda degildir.
  */
    @Override
    protected void yakit() {

    }

    @Override
    protected void kaporta() {

    }

    @Override
    protected void motor() {

    }
}
