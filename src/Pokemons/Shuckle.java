package Pokemons;
import ru.ifmo.se.pokemon.*;
import Moves.*;
// Statistics are wrong, need to rewrite
public class Shuckle extends Pokemon {
        public final Type pt1 = Type.DRAGON , pt2 = Type.NORMAL;
        final double HP = 78;
        final double attack = 60;
        final double defense = 85;
        final double special_attack = 135;
        final double special_defense = 91;
        final double speed = 36;
        public Shuckle(final String name, final int level) {
            super(name, level);
            this.setStats(HP, attack, defense, special_attack, special_defense, speed);
            this.setMove(new DualChop(pt1, 10, 50));
            this.addMove(new DynamicPunch(pt1, 20, 54));
            this.addMove(new PoisonJab(pt1, 30, 20));
            this.addMove(new RockSlide(pt2, 50, 40));
        }
}