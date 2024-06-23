package simpleDotComVersion;

public class SimpleDotCom {
    int[] locationsCells;
    int numOfHits = 0;

    String checkYourself(String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "miss";

        for (int cell : locationsCells) {
            if (guess == cell) {
                result = "hit";
                numOfHits++;
                break;
            }
        }
        if (numOfHits == locationsCells.length) {
            result = "kill";
        }
        System.out.println(result);
        return result;
    }

    void setLocationsCells(int[] locations) {
        locationsCells = locations;
    }
}
