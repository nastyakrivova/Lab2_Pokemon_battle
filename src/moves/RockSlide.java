package moves;

import ru.ifmo.se.pokemon.*;

public final class RockSlide extends PhysicalMove{
    public RockSlide(){
        super(Type.ROCK, 75, 90);
    }

    @Override
    public void applyOppEffects(Pokemon opp){
        if(Math.random() <= 0.3){
            Effect.flinch(opp);
        }
    }

    @Override
    public String describe(){
        return "обрушивает камни на противника";
    }
}
