package chapter5.game;

import java.util.ArrayList;

public class SimpleDotCom {
    ArrayList<String> locationCells;
    int numOfHits;

    void setLocationCells(ArrayList<String> loc) {
        locationCells = loc;
    }

    String checkYourSelf(String userInput) {
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0) {
            locationCells.remove(index);
            if (locationCells.isEmpty()) {
                result = "kill";
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

