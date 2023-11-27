import java.util.Arrays;
import java.util.List;

public class MainS01 {
    public static void main(String[] args) {
//        Task01.assertConditionA();
//        Task02.assertConditionB();
       /* System.out.println(Task03.sum(2_147_483_647, 5)); */ /* Would be overflown */
//         System.out.println(Task03.sum(2_147_483_640, 5));  /* Wouldn't be overflown */
//        Task04.happyNY();
//        Task05.checkingShoppingCart();
//        Task06.expectedValue();

/*        String[] colors = {"aqua","yellow", "blue", "orange", "green", "violet", "gold"};
        Task07.testingJavaCollectionsAssertJ(colors); */

        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);
        Task08.checkingHero(emmett);

    }
}