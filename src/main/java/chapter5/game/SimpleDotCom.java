package chapter5.game;

public class SimpleDotCom {
    int[] locationCells;
    int numOfHits;

    void setLocationCells(int[] locs) {
        locationCells = locs;
    }

    String checkYourSelf(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";
        for (int cell : locationCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

}
