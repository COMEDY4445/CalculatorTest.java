import java.util.Arrays;

public enum RomeNumber {
    I (1), II (2), III (3), IV (4), V (5), VI (6), VII (7), VIII (8), IX (9), X (10);

    public int romeNumber;

    RomeNumber(int romeNumber) {
        this.romeNumber = romeNumber;
    }

    public static int convertRomToArab(String n) {
        for (RomeNumber rn : RomeNumber.values()) {
            if (rn.name().equals(n)) {
                return RomeNumber.valueOf(n).romeNumber;
            }
        }
        return -1;
    }

    public static String convertArabToRom(int a) {
        for (RomeNumber ri : RomeNumber.values()) {
            if (ri.ordinal() == a) {
                return String.valueOf(RomeNumber.values()[ri.ordinal() - 1]);
            }
        }
        return null;
    }
}
