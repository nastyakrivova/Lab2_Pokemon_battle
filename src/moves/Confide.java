package moves;

import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove{
    public Confide(){
        super(Type.NORMAL, 0, 0);
    }

    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect eff = new Effect();
        eff.stat(Stat.SPECIAL_ATTACK, -1);
        opp.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "спец.атака противника -1";
    }
}
