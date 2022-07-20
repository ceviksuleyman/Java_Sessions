package day26_constructor;

public class Student {


    String name = "cevik";
    int age = 15;
    String phone = "0453433434";

    public Student() {

    }

    public Student(String name, int age, String phone) {
        this.phone = phone;
        this.name = name;
        //this.age = age;
    }

    @Override
    public String toString() {
        return
                        "\nname  : " + name +
                        "\nage   : " + age +
                        "\nphone : " + phone;

    }
}