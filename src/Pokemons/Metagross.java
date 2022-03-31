package Pokemons;
import Moves.Facade;
import Moves.IceBeam;
import Moves.Psychic;
import Moves.Rest;
import ru.ifmo.se.pokemon.Type;

public class Metagross extends Metang {
    public final Type pt1 = Type.DRAGON , pt2 = Type.NORMAL;
    final double HP = 78;
    final double attack = 60;
    final double defense = 85;
    final double special_attack = 135;
    final double special_defense = 91;
    final double speed = 36;
    public Metagross(final String name, final int level) {
        super(name, level);
        this.setStats(HP, attack, defense, special_attack, special_defense, speed);
        this.setMove(new Rest(pt1, 10, 50));
        this.addMove(new IceBeam(pt1, 20, 54));
        this.addMove(new Psychic(pt1, 20, 54));
        this.addMove(new Facade(pt1, 20, 54));
    }
}
