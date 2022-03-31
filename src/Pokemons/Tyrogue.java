package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;

public class Tyrogue extends Pokemon {
    public final Type pt1 = Type.DRAGON , pt2 = Type.NORMAL;
    final double HP = 78;
    final double attack = 60;
    final double defense = 85;
    final double special_attack = 135;
    final double special_defense = 91;
    final double speed = 36;
    public Tyrogue(final String name, final int level) {
        super(name, level);
        this.setStats(HP, attack, defense, special_attack, special_defense, speed);
        this.setMove(new Facade(pt1, 10, 50));
        this.addMove(new Confide(pt1, 20, 54));
        this.addMove(new Rest(pt1, 30, 20));
    }
}