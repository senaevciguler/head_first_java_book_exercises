package chapter2.movie;

public class MovieTestDriver {
    public static void main(String[] args) {
        Movie one = new Movie();
        one.title ="the blind side";
        one.genre = "biography";
        one.rating = 5;
        one.playIt();

        Movie two = new Movie();
        two.title = "Harry Potter";
        two.genre = "fantastic";
        two.rating = 4;
        two.playIt();

        Movie three = new Movie();
        three.title = "Forrest Gump";
        three.genre = "comedy-drama";
        three.rating = 5;
        three.playIt();


    }
}
