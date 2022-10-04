package riaw_new_era_characters;

public class Spell {
    public String title;
    public int damage;

    public Spell(String title, int damage) {
        this.title = title;
        this.damage = damage;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}
