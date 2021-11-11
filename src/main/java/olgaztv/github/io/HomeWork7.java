package olgaztv.github.io;

public class HomeWork7 {

    public static void main(String[] args) {

        Cat varya = new Cat();
        Cat lera = new Cat();
        InfoAboutCats info = new InfoAboutCats();

        Cat.sayClassName();
        Cat.Eyes.sayEyesParameter();

        varya.setAge(1);
        varya.setYear(2000);
        varya.setDate(5);
        varya.setName("Варвара");
        varya.setMonth("Октябрь");
        varya.setBreed("Аббисинская");
        varya.setWeight(4.01F);
        info.aboutCats(varya.getName(), varya.getBreed(), varya.getAge(), varya.getWeight(), varya.getDate(), varya.getYear(), varya.getMonth());

        lera.setAge(2);
        lera.setYear(2001);
        lera.setDate(7);
        lera.setName("Лера");
        lera.setMonth("Январь");
        lera.setBreed("Бенгальская");
        lera.setWeight(3.00F);
        info.aboutCats(lera.getName(), lera.getBreed(), lera.getAge(), lera.getWeight(), lera.getDate(), lera.getYear(), lera.getMonth());
    }
}

