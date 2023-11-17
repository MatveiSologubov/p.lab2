package moves.status;

import ru.ifmo.se.pokemon.*;

public class DoubleTeam extends StatusMove {
    public DoubleTeam(){
        super(Type.NORMAL, 0,100);
    }

    @Override
    protected void applySelfEffects(Pokemon targetPokemon){
        targetPokemon.setMod(Stat.EVASION, +1);
    }

    @Override
    protected String describe() {
        return "applies Double Team";
    }
}
