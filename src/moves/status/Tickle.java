package moves.status;

import ru.ifmo.se.pokemon.*;

public class Tickle extends StatusMove {
    public Tickle(){
        super(Type.NORMAL, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon targetPokemon){
        targetPokemon.setMod(Stat.DEFENSE, -1);
    }

    @Override
    protected String describe(){
        return "applies Tickle";
    }
}
