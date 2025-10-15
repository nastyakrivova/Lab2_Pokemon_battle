package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Fufrou extends Pokemon{
    public Fufrou (String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(75, 80, 60, 65, 90, 102);
        setMove(new WorkUp(), new TailWhip(), new DarkPulse(), new CottonGuard());
    }
}
