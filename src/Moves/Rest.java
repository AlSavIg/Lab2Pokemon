package Moves;
import ru.ifmo.se.pokemon.*;

public class Rest extends SpecialMove {
    public Rest(final Type type, double pow, double acc) {
            super(type, pow, acc);
        }

        protected void applySelfEffects(Pokemon p){
            p.setMod(Stat.HP, -1);
            Effect.sleep(p);
    }
 }
