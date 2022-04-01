package Moves;
import ru.ifmo.se.pokemon.*;


public class DualChop extends PhysicalMove {
    public DualChop(final Type type,
                    double pow,
                    double acc)
    {
        super(type, pow, acc);
    }

    protected void applyOppEffects(Pokemon p){
        Effect.poison(p);
    }
}
