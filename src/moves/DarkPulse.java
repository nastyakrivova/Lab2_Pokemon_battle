package moves;
import ru.ifmo.se.pokemon.*;

public final class DarkPulse extends SpecialMove{
    public DarkPulse(){
        super(Type.DARK, 80, 100);
    }

    @Override
    public void applyOppEffects(Pokemon opp){
        if (Math.random() <= 0.2) {
            Effect.flinch(opp);
        }
    }

    @Override
    public String describe(){
        return "напуган с вероятностью 20%";
    }
}
