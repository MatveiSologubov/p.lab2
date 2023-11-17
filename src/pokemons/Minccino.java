package pokemons;

import moves.special.ThunderWave;
import moves.special.Thunderbolt;
import moves.status.Tickle;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Minccino extends Pokemon {
    public Minccino(String name, int level){
        super(name, level);
        this.setType(Type.NORMAL);
        this.setStats(55, 50, 40, 40, 40, 75);
        this.setMove(new ThunderWave(), new Thunderbolt(), new Tickle());
    }
}
