package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Silvally extends Pokemon{
    public Silvally(String name, int level){
        super(name, level);
        setType(Type.NORMAL);
        setStats(95, 95, 95, 95, 95, 95);
        setMove(new RockSlide(), new TriAttack(), new XScissor());
    }
}
