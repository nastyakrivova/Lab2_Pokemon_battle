import pokemons.*;
//import moves.*;
import ru.ifmo.se.pokemon.*;

public class Main{
    public static void main(String[] arg){
        Battle b = new Battle();
        
        Pokemon p1 = new Gallade("Gallade", 1);
        Pokemon p2 = new Fufrou("Fufrou", 1);
        Pokemon p3 = new Kirlia("Kirlia", 1);
        
        Pokemon p4 = new Minior("Minior", 1);
        Pokemon p5 = new Ralts("Ralts", 1); 
        Pokemon p6 = new Silvally("Silvally", 1);
    
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5); 
        b.addFoe(p6);
        
        System.out.println("НАЧАЛО БИТВЫ");
        b.go();
        System.out.println("БИТВА ЗАВЕРШЕНА");

    }
}