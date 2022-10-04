package riaw_new_era_characters;

public class Damage implements Hit {
    public int damage;
    public int expensMana;
    public Character hit;
    public Character injured;


    @Override
    public int minusMana() {
        return hit.getMana() - expensMana;
    }

    @Override
    public int minusHealthPoints() {
        return injured.getHealthPoints() - damage;
    }

    @Override
    public boolean die() {
        if (injured.getHealthPoints() <= 0) {
            return true;
        } else {
            return false;
        }
    }
}
