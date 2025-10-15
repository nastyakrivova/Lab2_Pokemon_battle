package moves;

import ru.ifmo.se.pokemon.*;

public final class WorkUp extends StatusMove {
    public WorkUp(){
        super(Type.NORMAL, 30, 0);
    }
    @Override
    protected void applySelfEffects(Pokemon self){
        Effect eff = new Effect();
        eff.stat(Stat.ATTACK, 1);
        eff.stat(Stat.SPECIAL_ATTACK, 1);
        self.addEffect(eff);
    }
    @Override
    protected String describe(){
        return "атака +1, спец.атака +1";
    }
}
