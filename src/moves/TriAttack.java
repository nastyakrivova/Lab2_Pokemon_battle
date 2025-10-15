package moves;
import ru.ifmo.se.pokemon.*;

public final class TriAttack extends SpecialMove{
    public TriAttack(){
        super(Type.NORMAL, 80, 100);
    }

    @Override
    public void applyOppEffects(Pokemon opp){
        if(Math.random() <= 0.0667){
            Effect.paralyze(opp);
        }else if(Math.random() <= 0.0667*2){
            Effect.burn(opp);
        }else if(Math.random() <= 0.0667*3){
            Effect.freeze(opp);
        }
    }

    @Override
    public String describe(){
        return "замораживает сжигает или парализует с вероятностью 20%";
    }
}
