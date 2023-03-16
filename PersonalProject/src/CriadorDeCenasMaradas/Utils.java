package CriadorDeCenasMaradas;

import java.util.Random;

public class Utils {
    private static final Random RANDOM = new Random();

    public static int getRandomNum(int min, int max) {
        return RANDOM.nextInt((max - min) + 1) + min;
    }
}


