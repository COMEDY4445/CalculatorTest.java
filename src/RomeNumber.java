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

    public static String ArabToRome(int input) throws InterruptedException {
        if (input < 1 || input > 3999){
            System.out.println("Невозможно преобразовать результат в арабские цифры. Программа будет закрыта...");
            System.exit(0);
        }
        String s = "";
        while (input >= 1000) {
            s += "M";
            input -= 1000;        }
        while (input >= 900) {
            s += "CM";
            input -= 900;
        }
        while (input >= 500) {
            s += "D";
            input -= 500;
        }
        while (input >= 400) {
            s += "CD";
            input -= 400;
        }
        while (input >= 100) {
            s += "C";
            input -= 100;
        }
        while (input >= 90) {
            s += "XC";
            input -= 90;
        }
        while (input >= 50) {
            s += "L";
            input -= 50;
        }
        while (input >= 40) {
            s += "XL";
            input -= 40;
        }
        while (input >= 10) {
            s += "X";
            input -= 10;
        }
        while (input >= 9) {
            s += "IX";
            input -= 9;
        }
        while (input >= 5) {
            s += "V";
            input -= 5;
        }
        while (input >= 4) {
            s += "IV";
            input -= 4;
        }
        while (input >= 1) {
            s += "I";
            input -= 1;
        }
        return s;
    }
}
