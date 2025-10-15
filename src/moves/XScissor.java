package moves;

import ru.ifmo.se.pokemon.*;

public final class XScissor extends PhysicalMove{
    public XScissor(){
        super(Type.BUG, 80, 100);
    }

    @Override
    public String describe(){
        return "наносится перекрестный удар";
    }
}
