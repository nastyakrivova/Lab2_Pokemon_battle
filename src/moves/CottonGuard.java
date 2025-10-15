package moves;
import ru.ifmo.se.pokemon.*;

public final class CottonGuard extends StatusMove{
    public CottonGuard(){
        super(Type.GRASS, 0, 0);
    }

    @Override
    protected void applySelfEffects(Pokemon self){
        Effect eff = new Effect();
        eff.stat(Stat.DEFENSE, 3);
        self.addEffect(eff);
    }

    @Override
    protected String describe(){
        return "повышает защиту на 3";
    }
}
