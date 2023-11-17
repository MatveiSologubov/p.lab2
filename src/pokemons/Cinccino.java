package pokemons;

import moves.physical.BulletSeed;

public class Cinccino extends Minccino{
    public Cinccino(String name, int level){
        super(name, level);
        this.setStats(75, 95, 60, 65, 60, 115);
        this.addMove(new BulletSeed());
    }
}
