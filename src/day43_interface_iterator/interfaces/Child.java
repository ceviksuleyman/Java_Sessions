package day43_interface_iterator.interfaces;

public class Child implements InterfaceBodyliMethod {

    @Override
    public void motor() {

    }

    @Override
    public void yakit() {

    }

    @Override
    public String aku() {
        return null;
    }

    /*
    Parent interface'de abstract olan 3 method'u implement ettigimizde
    Java itirazini durdurur.

    Sonradan ekledigimiz default veya static keyword ile tanimladigimiz
    method'lari implement etmememiz sorun olmadi.
     */
    public static void main(String[] args) {

        InterfaceBodyliMethod.direksiyon(); // static Tum arabalarin direksiyonu vardir.

        Child obje = new Child();

        obje.teker();  // default Tum arabalarin tekeri vardir.
    }
}
