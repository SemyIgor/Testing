/* Задание №1
        Давайте представим, что вы работаете над календарным приложением и вам нужно убедиться, что
        количество выходных в неделе правильно установлено.
        Исправьте следующий код так, чтобы утверждение было верно и код не выбрасывал ошибку */
public class Task01 {
    public static void assertConditionA(){
        System.out.println("Task01");
        String[] weekends = {"Суббота", "Воскресенье"};
        /* assert weekends.length == 3; // Заменить 3 на 2 */
        assert weekends.length == 2; // Заменено 3 на 2
        System.out.println("Выходные в конце недели длятся " +
                weekends.length + " дней");
    }
}
