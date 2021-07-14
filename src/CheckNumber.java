
public class CheckNumber {
    //Создаем етод который проверяет арабские это числа или нет.
    //Если да, то парсим их в инты и проверяе их что бы они были не больше 10 и не меньше 0
    public static boolean isArabic(String n1, String n2) {
        int n_1;
        int n_2;

        try {
            n_1 = Integer.parseInt(n1);
            n_2 = Integer.parseInt(n2);
        } catch (Exception e) {
            return false;
        }
        if ((n_1 > 0 && n_1 <= 10) && (n_2 > 0 && n_2 < 10)) {
            return true;
        }
        else {
            System.out.println("Ошибка. Введите число от 0 до 10");
            System.exit(-1);
        }
        return false;
    }
    //Создаем метод который проверяет Римские это числа или нет.
    //Если да, то
    public static boolean isRome(String n1, String n2) {

        if (RomeNumber.convertRomToArab(n1) > 0 && RomeNumber.convertRomToArab(n2) > 0) {
            return true;
        }
        return false;
    }
    //Создаем метод boolean(true/false) который проверяет символы на корректность
    //Если строка совпадает  символами, то выводим true, если нет то возвращаем false
    public static boolean isOperation(String op) {
        if (op.equals("+") || op.equals("-") || op.equals("*") || op.equals("/")) {
            return true;
        }
        return false;
    }
}
