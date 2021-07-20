import javax.print.DocFlavor;
import java.util.Scanner;

public class Input { //Создаем класс с полями

    String number1; //поля
    String operation; //поля
    String number2; //поля

    int num1; //поля
    int num2; //поля

    void input() throws InterruptedException { //Создаем метод считывания со строки
        System.out.print("Введите операцию - ");
        Scanner in = new Scanner(System.in); //Создаем обьект считывания
        number1 = in.next(); //присваевем перемен.number1 считывания с клавы
        operation = in.next(); //присваевем перемен.operation считывания с клавы
        number2 = in.next(); //присваевем перемен.number2 считывания с клавы

        if (CheckNumber.isOperation(operation) == false) { //Создаем проверку если(if) и обращ.к классу CheckNumber
            System.out.println("Ошибка. Введите");
            System.exit(-1);
        }

        if (CheckNumber.isArabic(number1, number2)) { //Создаем проверку если(if)
            num1 = Integer.parseInt(number1); //
            num2 = Integer.parseInt(number2);
            System.out.println(Operation.operation(num1, operation, num2));

        } else if (CheckNumber.isRome(number1, number2)) {
            num1 = RomeNumber.convertRomToArab(number1);
            num2 = RomeNumber.convertRomToArab(number2);
            int result = Operation.operation(num1, operation, num2);
            if (result <= 0) {
                System.out.println("Ошибка. Отрицатеьное число быть не может.");
                System.exit(1);
            } else System.out.println(RomeNumber.ArabToRome(result));

        } else {
            System.out.println("Ошибка. Числа не римские и не арабские.");
            System.exit(-1);
        }
    }
}
