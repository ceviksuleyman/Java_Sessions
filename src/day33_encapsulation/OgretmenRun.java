package day33_encapsulation;

public class OgretmenRun {

    public static void main(String[] args) {

        Ogretmen ogr1 = new Ogretmen();

        // NOTE => Bu yontemde data hiding degil, daha anlasilir bir kod amaclanmis olur !!
        ogr1.setIsim("Murtaza");
        System.out.println("ogr1.getIsim() = " + ogr1.getIsim());

    }
}
