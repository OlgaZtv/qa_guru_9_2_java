package olgaztv.github.io;

public class InfoAboutCats {

    Cat cat = new Cat();
    Cat.Eyes eyes = new Cat.Eyes();


    public void aboutCats(String name, String breed, int age, float weight, int date, int year, String month) {
        System.out.println("Name " + name);
        System.out.println(breed + " порода");
        System.out.println("Возраст: " + age);
        System.out.println("Вес: " + weight);
        String DateOfBirth = "День рождения: " + date + " " + month + " " + year;
        System.out.println(DateOfBirth);
    }
}

