package olgaztv.github.io;

//response json structure
public class JsonCat {

    private String name;
    private String weight;
    private Passport passport;

    static class Passport {
        private int number;
    }

    public String getName() {
        return name;
    }

    public String getWeight() {
        return weight;
    }

    public Passport getPassport() {
        return passport;
    }

    // {
    // "name": "Варя",
    //   "weight": "1.25",
    //    "passport": {
    //   "number": "2120111"
    // }
    //}
}
