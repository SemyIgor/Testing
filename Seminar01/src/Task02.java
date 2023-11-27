/*Задание №2
        Разберемся с использованием условий в утверждениях на примере переменной x.
        Нужно исправить код так, чтобы метод не выбрасывал ошибку.*/

public class Task02 {
    public static void assertConditionB(){
        System.out.println("Task02");
        int a = -1;
        /*assert a >= 0; // Заменить >= на <*/
        assert a < 0; // Заменено >= на <
        System.out.println("Тест по задаче Task02 пройден");
    }
}
