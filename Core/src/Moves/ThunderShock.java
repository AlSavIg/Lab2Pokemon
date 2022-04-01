package Moves;
import ru.ifmo.se.pokemon.*;

public class ThunderShock extends SpecialMove {
    public ThunderShock(final Type type,
                        double pow,
                        double acc) {
        super(type, pow, acc);
    }

    protected void applyOppEffect(Pokemon p) {
        Effect.confuse(p);
    }
}
