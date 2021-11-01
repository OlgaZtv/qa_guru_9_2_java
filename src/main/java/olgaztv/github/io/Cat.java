package olgaztv.github.io;

public class Cat {
    int age;
    int year;
    int date;
    String month;
    String name;
    String breed;
    float weight;

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
        String DateOfBirth = "День рождения: "+ date +" "+ month +" "+ year;
        System.out.println(DateOfBirth);
    }


    public static void main(String[] args) {
        Cat varya = new Cat();
        Cat lera = new Cat();
        varya.age = 1;
        varya.year = 2020;
        varya.date = 5;
        varya.name = "Варвара";
        varya.month = "Октябрь";
        varya.breed = "Аббисинская";
        varya.weight = 4.01F;
        varya.sayName();
        varya.sayAge();
        varya.sayBreed();
        varya.sayWight();
        varya.sayDateOfBirth();
        lera.age = 2;
        lera.year = 2021;
        lera.date = 7;
        lera.name = "Лера";
        lera.month = "Январь";
        lera.breed = "Бангальская";
        lera.weight = 3.00F;
        lera.sayName();
        lera.sayAge();
        lera.sayBreed();
        lera.sayWight();
        lera.sayDateOfBirth();
        }
}
