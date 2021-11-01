package olgaztv.github.io;

public class Cat {
    int age = 5;
    int year = 2020;
    int date = 5;
    String month = "Октябрь";
    String name = "Варвара";
    String breed = "Аббисинская";
    float weight = 4.01F;

    public void sayName() {
        System.out.println(name);
    }

    public void sayBreed() {
        System.out.println(breed + " порода");
    }

    public void sayAge() {
        System.out.println(age);
    }

    public void sayWight() {
        System.out.println(weight);
    }

    public void sayDateOfBirth() {
        String DateOfBirth = date +" "+ month +" "+ year;
        System.out.println(DateOfBirth);
    }


    public static void main(String[] args) {
        Cat varya = new Cat();
        varya.sayName();
        varya.sayAge();
        varya.sayBreed();
        varya.sayWight();
        varya.sayDateOfBirth();
        }
}
