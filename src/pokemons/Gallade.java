package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Gallade extends Kirlia{
    public Gallade(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC, Type.FIGHTING);
        setStats(68, 125, 65, 65, 115, 80);
        setMove(new Facade(), new Confide(), new Charm(), new DazzlingGleam());
    }
}
