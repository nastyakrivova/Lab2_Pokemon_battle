package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Minior extends Pokemon{
    public Minior(String name, int level){
        super(name, level);
        setType(Type.ROCK, Type.FLYING);
        setStats(60, 60, 100, 60, 100, 60);
        setMove(new RockSlide(), new TriAttack(), new XScissor(), new FireFang());
    }
}
