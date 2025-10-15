package moves;

import ru.ifmo.se.pokemon.*;

public final class DazzlingGleam extends SpecialMove{
    public DazzlingGleam(){
        super(Type.FAIRY, 80, 100);
    }

    @Override
    protected String describe(){
        return "ослепляет всех";
    }
}
