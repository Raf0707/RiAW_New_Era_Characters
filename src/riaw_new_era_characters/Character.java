package riaw_new_era_characters;

import java.util.HashMap;
import java.util.Map;

public class Character {
    /**
     * @name - имя персонажа
     * @habitat - среда (место) обитания персонажа
     * @healthPoints - жизнь
     * @damage - урон
     * @mana - энергия (мана)
     * @magicСapabilities - магические способности (название ; урон)
     * @currentGeoPosition - геопозиция игрока
     * @x, @y, @z - координаты x, y, z из класса геопозиции
     */

    private String name;
    private String habitat;
    private int healthPoints;
    private int damage;
    private int mana;

    private CurrentGeoPosition currentGeoPosition;

    private int x = currentGeoPosition.getX();
    private int y = currentGeoPosition.getY();
    private int z = currentGeoPosition.getZ();
    private Map<String, Integer> magicСapabilities = new HashMap<>();

    public Character(String name, String habitat,
                     int healthPoints, int damage,
                     int mana, Map<String, Integer> magicСapabilities) {
        this.name = name;
        this.habitat = habitat;
        this.healthPoints = healthPoints;
        this.damage = damage;
        this.mana = mana;
        this.magicСapabilities = magicСapabilities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public Map<String, Integer> getMagicСapabilities() {
        return magicСapabilities;
    }

    public void setMagicСapabilities(Map<String, Integer> magicСapabilities) {
        this.magicСapabilities = magicСapabilities;
    }

    public int[] getCharacterGeoPosition() {
        return currentGeoPosition.getCoords(x, y, z);
    }
}
