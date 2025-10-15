package moves;

import ru.ifmo.se.pokemon.*;

public class FireFang extends PhysicalMove{
    public FireFang(){
        super(Type.FIRE, 65, 95);
    }

    @Override
    public void applyOppEffects(Pokemon opp){
        if(Math.random() <= 0.1){
            Effect.flinch(opp);
        }
        if(Math.random() <= 0.1){
            Effect.burn(opp);
        }
    }

    @Override
    public String describe(){
        return "кусает огненными клыками";
    }
}
