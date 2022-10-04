package riaw_new_era_characters;

import java.util.HashMap;
import java.util.Map;

public class Magic {
    Map<String, Integer> spells = new HashMap<>();

    public Magic(Map<String, Integer> spells) {
        //this.spells = spells;
        spells = new HashMap<>();
    }

    public Map<String, Integer> getSpells() {
        return spells;
    }

    public void setSpells(Map<String, Integer> spells) {
        this.spells = spells;
    }

    public Map<String, Integer> setSpell(String spell_title, int spell_damage) {
        spells.put(spell_title, spell_damage);
        return spells;
    }

    public Map<String, Integer> setSpell(Spell spell) {
        spells.put(spell.getTitle(), spell.getDamage());
        return spells;
    }
}


