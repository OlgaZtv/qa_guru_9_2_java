package olgaztv.github.io;

import java.util.Arrays;

public class Room {
    int length = 15;
    int width  = 10;
    int height  = 3;
    int phone = 223315;
    String[] appointment = new String[] {"Кухня", "Спальня", "Гостиная"};
    String city = "Санкт-Петербург";
    String street = "ул. Марата";

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

    public void sayAppointment() {
             System.out.println(Arrays.toString(appointment));
        }



    public static void main(String[] args) {
        Room room = new Room();
        room.saySquare();
        room.saySize();
        room.sayPhone();
        room.sayAddress();
        room.sayAppointment();
    }
}

