package moves.special;

import ru.ifmo.se.pokemon.Effect;
import ru.ifmo.se.pokemon.Pokemon;
import ru.ifmo.se.pokemon.SpecialMove;
import ru.ifmo.se.pokemon.Type;

public class ThunderWave extends SpecialMove {
    public ThunderWave(){
        super(Type.ELECTRIC, 0, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon targetPokemon){
        Effect.paralyze(targetPokemon);
    }

    @Override
    protected String describe(){
        return "applies Thunder Wave";
    }
}
