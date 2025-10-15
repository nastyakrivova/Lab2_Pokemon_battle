package pokemons;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Ralts extends Pokemon{
    public Ralts(String name, int level){
        super(name, level);
        setType(Type.PSYCHIC, Type.FAIRY);
        setStats(28, 25, 25, 45, 35, 40);
        setMove(new Facade(), new Confide());
    }
}
