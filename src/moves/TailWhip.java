package moves;

import ru.ifmo.se.pokemon.*;

public final class TailWhip extends StatusMove{
    public TailWhip(){
        super(Type.NORMAL, 0, 100);
    }
    @Override
    public void applyOppEffects(Pokemon opp){
        Effect eff = new Effect();
        eff.stat(Stat.DEFENSE, -1);
        opp.addEffect(eff);
    }
    @Override
    public String describe(){
        return "защита противника -1";
    }
}
