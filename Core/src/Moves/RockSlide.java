package Moves;
import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(final Type type,
                     double pow,
                     double acc) {
        super(type, pow, acc);
    }

    protected void applyOppEffect(Pokemon p) {
        Effect e = new Effect().chance(0.5).turns(1).stat(Stat.SPEED, -1);
    }
}
