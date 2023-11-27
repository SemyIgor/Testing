import static org.assertj.core.api.Assertions.assertThat;

public class Task08 {
    /**
     * Удовлетворить всем условиям:
     * <p>
     * 1. Проверить, что герой создался с именем Emmett
     * <p>
     * 2. Проверить, что значение прочности брони героя равно 50
     * <p>
     * 3. Проверить, что у героя оружие типа sword
     * <p>
     * 4. Проверить содержимое инвентаря героя (размер 3, содержимое "Bow", "Axe",
     * "Gold", порядок не важен)
     * <p>
     * 5. Проверить, что герой это человек (свойство isHuman)
     * <p>
     */
    public static void checkingHero(Hero hero) {
//        List<String> heroBag = Arrays.asList("Bow", "Axe", "Gold");
//        Hero emmett = new Hero("Emmett", 50, "sword", heroBag, true);

        assertThat(hero.getHeroName()).isEqualTo("Emmett");
        assertThat(hero.getArmorStrength()).isEqualTo(50);
        assertThat(hero.getHeroWeapon()).isEqualTo("sword");

//       Есть два варианта. На семинаре был такой (плюс добавилось ".isNotEmpty":
        assertThat(hero.getHeroBag())
                .isNotEmpty()
                .hasSize(3)
                .contains("Bow","Axe", "Gold");
//        У меня был такой:
        assertThat(hero.getHeroBag().size()).isEqualTo(3);
        assertThat(hero.getHeroBag()).contains("Bow","Axe", "Gold");

        assertThat(hero.isHuman()).isTrue();

    }


}
