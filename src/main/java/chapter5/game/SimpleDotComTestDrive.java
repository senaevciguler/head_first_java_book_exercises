package chapter5.game;

import chapter5.game.SimpleDotCom;

import java.util.ArrayList;

public class SimpleDotComTestDrive {
    public static void main(String[] args) {
        SimpleDotCom dot = new SimpleDotCom();

        ArrayList<String> locations = new ArrayList<>();
        locations.add("2");
        locations.add("3");
        locations.add("4");
        dot.setLocationCells(locations);
        String userGuess = "2";
        String result = dot.checkYourSelf(userGuess);

    }
}

