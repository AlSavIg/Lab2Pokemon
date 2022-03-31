import Pokemons.Shuckle;
import ru.ifmo.se.pokemon.*;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();
        Pokemon p1 = new Shuckle("Чужой", 1);
        Pokemon p2 = new Pokemon("Хищник", 1);
        battle.addAlly(p1);
        battle.addFoe(p2);
        battle.go();
    }
}
