import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculatorTests {
    public static void tests() {

        // Проверка арифметического калькулятора с использованием утверждений AssertJ:
        assertThat(Calculator.calculate(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculate(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculate(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculate(100, 50, '/')).isEqualTo(2);
        assertThat(Calculator.calculate(625, 4, '^')).isEqualTo(5);

//        Проверка граничных условий расчёта дисконта
        assertThat(Calculator.calculatingDiscount(2000, 15)).isEqualTo(1700);
        assertThat(Calculator.calculatingDiscount(2000, 0)).isEqualTo(2000);
        assertThat(Calculator.calculatingDiscount(2000, 100)).isEqualTo(0);

//        Проверка заграничных условий расчёта дисконта
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, -20))
                .isInstanceOf(IllegalStateException.class);
        assertThatThrownBy(() -> Calculator.calculatingDiscount(100, 120))
                .isInstanceOf(IllegalStateException.class);

//        Архаичный, но любопытный вариант проверки заграничных условий расчёта дисконта
        try {
            Calculator.calculatingDiscount(100, 20);
        } catch (IllegalStateException e) {
            if(e.getMessage().equals("Negative discount")) {
                throw new AssertionError("Отрицательная скидка недопустима");
            } else if (e.getMessage().equals("Too much discount")) {
                throw new AssertionError("Скидка больше стоимости - это вредительство");
            }
        }
    }
}
