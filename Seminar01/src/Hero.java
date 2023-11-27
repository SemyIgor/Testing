import java.util.List;

public class Hero {
    String heroName;
    int armorStrength;
    String heroWeapon;
    List <String> heroBag;
    boolean isHuman;

    public Hero(String heroName, int armorStrength, String heroWeapon, List<String> heroBag, boolean isHuman) {

        this.heroName = heroName;
        this.armorStrength = armorStrength;
        this.heroWeapon = heroWeapon;
        this.heroBag = heroBag;
        this.isHuman = isHuman;
    }

    public String getHeroName() {
        return heroName;
    }

    public void setHeroName(String heroName) {
        this.heroName = heroName;
    }

    public int getArmorStrength() {
        return armorStrength;
    }

    public void setArmorStrength(int armorStrength) {
        this.armorStrength = armorStrength;
    }

    public String getHeroWeapon() {
        return heroWeapon;
    }

    public void setHeroWeapon(String heroWeapon) {
        this.heroWeapon = heroWeapon;
    }

    public List<String> getHeroBag() {
        return heroBag;
    }

    public void setHeroBag(List<String> heroBag) {
        this.heroBag = heroBag;
    }

    public boolean isHuman() {
        return isHuman;
    }

    public void setHuman(boolean human) {
        isHuman = human;
    }
}
