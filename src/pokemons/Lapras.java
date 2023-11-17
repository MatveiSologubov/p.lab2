package pokemons;

import moves.physical.Bulldoze;
import moves.special.Blizzard;
import moves.special.DragonPulse;
import moves.special.DreamEater;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.Type;

public class Lapras extends Pokemon {
    public Lapras(String name, int level){
        super(name, level);
        this.setType(Type.WATER, Type.ICE);
        this.setStats(130, 85, 80, 85, 95, 60);
        this.setMove(new DragonPulse(), new Bulldoze(), new DreamEater(), new Blizzard());
    }
}
