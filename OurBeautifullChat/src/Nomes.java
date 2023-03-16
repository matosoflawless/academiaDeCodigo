import java.util.Random;

public enum Nomes {


    NANDO,
    OLIVIO,
    DOGGY,
    SANTANA,
    ESPETACULODIGOEU;

    public static Nomes getRandomEnumName() {
        Nomes[] values = Nomes.values();
        int length = values.length;
        int randIndex = new Random().nextInt(length);
        return values[randIndex];
    }


}
