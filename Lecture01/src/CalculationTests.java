import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CalculationTests {
    public static void main() {
        if (8 != Calculation.calculate(2, 6, '+')) {
            throw new AssertionError("Ошибка при сложении");
        }
        if (5 != Calculation.calculate(13, 8, '-')) {
            throw new AssertionError("Ошибка при вычитании");
        }
        if (8 != Calculation.calculate(2, 4, '*')) {
            throw new AssertionError("Ошибка при умножении");
        }
        if (7 != Calculation.calculate(35, 5, '/')) {
            throw new AssertionError("Ошибка при делении");
        }
        /*
         * Случаи с неправильными аргументами
         * аргумент operator типа char, должен вызывать исключение, если
         * он получает не базовые символы (+, -, *, /)
         */
        try {
            Calculation.calculate(35, 7, '/');
        } catch (IllegalStateException e) {
            if (!e.getMessage().equals("Unexpected value operator: -")) {
                throw new AssertionError("Ошибка в методе");
            }
        }

        // Использование утверждений
        float banner1;
        banner1 = Calculation.calculate(13, 8, '-');
        assert 5 == banner1;
        System.out.println();
        float banner2;
        banner2 = Calculation.calculate(3, 6, '+');
        assert 9 == banner2;
        float banner3;
        banner3 = Calculation.calculate(2, 4, '*');
        assert 8 == banner3;
        float banner4;
        banner4 = Calculation.calculate(35, 5, '/');
        assert 7 == banner4;

        assert 7 == Calculation.calculate(35, 5, '/');

        System.out.println(banner1 + ", " + banner2 + ", " + banner3 + ", " + banner4);

        // Проверка базового функционала с целыми числами, с
        // использованием утверждений AssertJ:
        assertThat(Calculation.calculate(2, 6, '+')).isEqualTo(8);
        assertThat(Calculation.calculate(2, 2, '-')).isEqualTo(0);
        assertThat(Calculation.calculate(2, 7, '*')).isEqualTo(14);
        assertThat(Calculation.calculate(100, 50, '/')).isEqualTo(2);
    }
}
