
public class Operation {
    public static int operation(int n1, String op, int n2) {
        switch (op) {
            case "+" : return n1 + n2;
            case "-" : return n1 - n2;
            case "*" : return n1 * n2;
            case "/" : return n1 / n2;
        }
        return 0;
    }
}
