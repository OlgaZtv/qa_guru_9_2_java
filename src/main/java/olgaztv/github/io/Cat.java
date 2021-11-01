package olgaztv.github.io;

public class Cat {

    public static String commonName = "Кошки";

    private int age;
    private int year;
    private int date;
    private float weight;
    private String month;
    private String name;
    private String breed;

    public static void sayClassName() {
        System.out.println(Cat.class.getName());
        System.out.println(commonName);
    }


    static class Eyes {
        public static String color = "Серый";
        static int quantity = 2;

        public static void sayEyesParameter() {
            System.out.println("Цвет глаз " + color);
            System.out.println("Количество глаз " + quantity);
        }
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.length() >= 0) {
            this.breed = breed;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 2000) {
            this.year = year;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 0) {
            this.name = name;
        }
    }
    }


