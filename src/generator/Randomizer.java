package generator;

import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {
    int result;

    public Randomizer (int min, int max) {
        generateRandomNumber(min, max);
    }

    private int generateRandomNumber(int min, int max) {
        return ThreadLocalRandom.current().nextInt(min, max + 1);
    }

    public int getResult() {
        return result;
    }
}
