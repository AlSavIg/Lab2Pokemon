package Moves;
import ru.ifmo.se.pokemon.*;

public class Facade extends SpecialMove{
    public Facade(final Type type,
                  double pow,
                  double acc)
    {
        super(type, pow, acc);
    }
    protected void applyOppEffects(Pokemon p){
        Effect.poison(p);
    }
}
