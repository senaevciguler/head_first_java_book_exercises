package chapter1;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word = "bottles";

        while (beerNum > 0) {

            System.out.println(beerNum + "" + word + " of beer on the wall");
            System.out.println(beerNum + "" + word + " of beer");
            System.out.println("take one down");
            System.out.println("pass it around");
            beerNum = beerNum - 1;
            if (beerNum == 1) {
                word = "bottle";
                System.out.println(beerNum + "" + word + " of beer on the wall");
                continue;
            }
            else if (beerNum == 0){
                System.out.println("no more bottles of the beer on the wall");

            }
        }

    }
}

