import Pokemons.*;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        battle.addAlly(new Shuckle("SHuK", 2));
        battle.addAlly(new Beldum("BelD", 1));
        battle.addAlly(new Metagross("MetaGross", 3));
        battle.addFoe(new Hitmonlee("Hitman", 2));
        battle.addFoe(new Metang("Meta", 3));
        battle.addFoe(new Tyrogue("TiRoga", 1));
        battle.go();
    }
}
