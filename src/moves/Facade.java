package moves;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove{

    public Facade(){
        super(Type.NORMAL, 70, 100);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def){
        double finalDamage = super.calcBaseDamage(att, def);
        if(specialCondition(att)){
            return finalDamage*2;
        }
        return finalDamage;
    }

    public final static boolean specialCondition(Pokemon att){
        if(att.getCondition() == Status.BURN || att.getCondition() == Status.POISON || att.getCondition() == Status.PARALYZE){
            return true;
        }
        return false;
    }
}
