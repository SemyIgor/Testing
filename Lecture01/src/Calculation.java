public class Calculation {

    public static float calculate(int firstOperand, int secondOperand, char operator) {
        float result;
        switch (operator) {
            case '+':
                result = firstOperand + secondOperand;
                break;
            case '-':
                result = firstOperand - secondOperand;
                break;
            case '*':
                result = firstOperand * secondOperand;
                break;
            case '/':
                if (secondOperand != 0) {
                    result = (float) firstOperand / secondOperand;
                    break;
                } else {
                    throw new ArithmeticException("Ошибка - деление на 0");
                }
                // break;
            case '^':
                //                    result = (float) Math.pow(firstOperand, secondOperand);
                if (!(firstOperand < 0)) {
                    result = Math.round(Math.pow(firstOperand, (float) 1 / secondOperand));
                } else {
                    throw new AssertionError("Negative");
                }
                break;
            default:
                throw new IllegalStateException("Ошибка! Неверно указан оператор " + "'" + operator + "'");
        }
        return result;
    }
}
