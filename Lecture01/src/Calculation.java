import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class Calculation {
    public static void main() {
        int firstOperand = 5;
        int secondOperand = 6;
        char plus = '+';
        char minus = '-';
        char mul = '*';
        char div = '/';
        System.out.printf("%d %c %d = %.2f\n", firstOperand, plus, secondOperand, calculate(5, 6, plus));
        System.out.printf("%d %c %d = %.2f\n", firstOperand, minus, secondOperand, calculate(5, 6, minus));
        System.out.printf("%d %c %d = %.2f\n", firstOperand, mul, secondOperand, calculate(5, 6, mul));
        System.out.printf("%d %c %d = %.2f\n", firstOperand, div, secondOperand, calculate(5, 6, div));

        assert 30 == calculate(5, 6, mul);

        // Проверка базового функционала с целыми числами,
        // с использованием утверждений AssertJ:
        assertThat(Calculation.calculate(2, 6, '+')).isEqualTo(8);
        assertThat(Calculation.calculate(2, 2, '-')).isEqualTo(0);
        assertThat(Calculation.calculate(2, 7, '*')).isEqualTo(14);
        assertThat(Calculation.calculate(100, 50, '/')).isEqualTo(2);

        assertThatThrownBy(() -> Calculation.calculate(8, 4, '_'))
                .isInstanceOf(IllegalStateException.class);
    }

    public static float calculate(int firstOperand, int secondOperand, char operator) {
        float result = 0;
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
            default:
                throw new IllegalStateException("Ошибка! Неверно указан оператор " + "'" + operator + "'");
        }
        return result;
    }
}
