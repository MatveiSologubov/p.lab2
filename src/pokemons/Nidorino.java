package pokemons;

import moves.status.Leer;

public class Nidorino extends Nidoran {
    public Nidorino(String name, int level){
        super(name, level);
        this.setStats(61, 72, 57, 55, 55, 65);
        this.addMove(new Leer());
    }
}
