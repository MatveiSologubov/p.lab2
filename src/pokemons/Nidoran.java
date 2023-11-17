package pokemons;

import moves.status.DoubleTeam;
import moves.status.Rest;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Nidoran extends Pokemon {
    public Nidoran(String name, int level){
        super(name, level);
        this.setType(Type.POISON);
        this.setStats(46, 57, 40, 40, 40, 50);
        this.setMove(new DoubleTeam(), new Rest());
    }
}
