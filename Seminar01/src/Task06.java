import static org.assertj.core.api.Assertions.assertThat;
public class Task06 {
    /**
     * Найдите ошибку
     */
    public static void expectedValue() {
        System.out.println("Task06");
        assertThat(sum(2, 3)).isEqualTo(5);
    }
    public static int sum(int a, int b) {
        return a + b;
    }
}
