import java.util.Scanner;

public class Input {

    String number1;
    String operation;
    String number2;

    int num1;
    int num2;

    void input() {
        System.out.print("Введите операцию - ");
        Scanner in = new Scanner(System.in);
        number1 = in.next();
        operation = in.next();
        number2 = in.next();

        if (CheckNumber.isOperation(operation) == false) {
            System.out.println("Ошибка. Введите");
            System.exit(-1);
        }

        if (CheckNumber.isArabic(number1, number2)) {
            num1 = Integer.parseInt(number1);
            num2 = Integer.parseInt(number2);
            System.out.println(Operation.operation(num1, operation, num2));
        } else if (CheckNumber.isRome(number1, number2)) {
            num1 = RomeNumber.convertRomToArab(number1);
            num2 = RomeNumber.convertRomToArab(number2);
            int result = Operation.operation(num1, operation, num2);
            if (result <= 0) {
                System.out.println("Ошибка. Отрицатеьное число быть не может.");
                System.exit(1);
            } else System.out.println(RomeNumber.convertArabToRom(result));

        } else {
            System.out.println("Ошибка. Числа не римские и не арабские.");
            System.exit(-1);
        }
    }
}
