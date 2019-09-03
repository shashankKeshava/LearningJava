package firstObject;

class Movie {
    String title;
    int rating;

    void playIt() {
        System.out.print("Playing the movie!!!");
    }
}


public class MovieTestDrive {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title = "Aquaman";
        one.rating = 5;
        Movie two = new Movie();
        two.title = "Avengers: End Game";
        two.rating = 9;
    }
}
