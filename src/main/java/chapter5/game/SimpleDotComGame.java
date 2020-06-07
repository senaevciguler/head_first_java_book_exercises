package chapter5.game;

import chapter5.game.GameHelper;

import java.util.ArrayList;

public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();
        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) (Math.random() * 5);
        ArrayList<Integer> locations = new ArrayList<>();
        locations.add(randomNum);
        locations.add(randomNum+1);
        locations.add(randomNum+2);
        boolean isAlive = true;
        while (isAlive == true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourSelf(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took " + numOfGuesses + " guesses");
            } // close if
        } // close while
    }
}
