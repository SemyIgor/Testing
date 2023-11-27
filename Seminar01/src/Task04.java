import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;

/*Задание №4.
        Найдите и исправьте логическую ошибку в коде, который планирует поздравление с Новым Годом в полночь.*/
public class Task04 {
    public static void happyNY() {
        System.out.println("Task04");
//        Создаём сущность calendar класса Calendar
        Calendar calendar = Calendar.getInstance();
//        Создаём шаблон форматирования
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
       /* System.out.println("dateFormat -> " + dateFormat); */

//        Получаем из calendar текущую Дату-Время и преобразуем в строку по созданному шаблону dateFormat
        String currentDateTime = dateFormat.format(calendar.getTime());
        System.out.println("Текущая дата -> " + currentDateTime);
        currentDateTime = "01/01/2023 00:00:00";

//        ================= Код ненужный, но полезный =============================================
//        Создаём formatter по шаблону
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("formatter -> " + formatter);

//        Создаём переменную класса LocalDateTime и сохраняем в ней указанную и заданную шаблоном дату
        LocalDateTime ldt = LocalDateTime.parse("01/01/2023 00:00:00", formatter);
        System.out.println("Переменная LocalDateTime -> " + ldt);

//        Преобразуем эту переменную в строку
        String ldtStr = ldt.format(formatter);
        System.out.println("Переменная LocalDateTime в строковом виде -> " + ldtStr);
//        ------------------- Окончание ненужного кода -----------------------------------------------

//        Сравниваем строку currentDateTime с требуемой Датой - Временем в строковой форме
        assert currentDateTime.equals("01/01/2023 00:00:00") : "Еще 2023 год :(";
        System.out.println("С новым годом!");
       /* На семинаре не раскрыли тему "Исправить код". По сути, в коде должна осуществляться
       *  постоянная проверка текущего времени на равенство 01.01.2023 00:00:00, то есть фиксирующая
       *  момент наступления Нового года. То есть, должен быть цикл, а в момент наступления нового
       *  года мы должны этот цикл закончить (выйти из него). Да и сама идея проверки в виде попытки
       *  поймать момент наступления нового года просто смешна. Что-то было упомянуто про заглушку,
       *  и это вариант решения проблемы. Мы тогда должны будем смоделировать currentDateTime, равным
       *  ожидаемому моменту (в данном коде это строка 21 currentDateTime = "01/01/2023 00:00:00";).
       *  Тогда мы сможем увидеть сообщение "С новым годом!" и выход из цикла */
    }
}
