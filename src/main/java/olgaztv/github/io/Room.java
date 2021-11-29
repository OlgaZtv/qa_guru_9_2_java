package olgaztv.github.io;

public class Room {
    int length;
    int width;
    int height;
    int phone;
    String city;
    String street;

    public void saySquare () {
        int Square = length * width;
        System.out.println(Square);
    }

    public void saySize () {
        int Size = length * width * height;
        System.out.println(Size);
    }

    public void sayPhone() {
        System.out.println(phone);
    }

    public void sayAddress() {
        String Address = city + " " + street;
        System.out.println(Address);
    }

    
    public static void main(String[] args) {
        Room komnata = new Room();
        komnata.length = 15;
        komnata.width = 10;
        komnata.height = 3;
        komnata.phone = 223315;
        komnata.city = "Санкт-Петербург";
        komnata.street = "ул. Марата";
        komnata.saySquare();
        komnata.saySize();
        komnata.sayPhone();
        komnata.sayAddress();
    }
}

