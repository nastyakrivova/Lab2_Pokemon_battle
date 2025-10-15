package moves;

import ru.ifmo.se.pokemon.*;

public final class Charm extends StatusMove{
    public Charm(){
        super(Type.FAIRY, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon opp){
        Effect eff = new Effect();
        eff.stat(Stat.ATTACK, -2);
        opp.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "атака противника -2";
    }
}
