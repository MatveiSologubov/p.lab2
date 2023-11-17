package moves.special;

import ru.ifmo.se.pokemon.*;

public class Blizzard extends SpecialMove {
    public Blizzard(){
        super(Type.ICE, 110, 70);
    }

    @Override
    protected void applyOppEffects(Pokemon targetPokemon){
        if (Math.random() <= 0.1){
            Effect.freeze(targetPokemon);
        }
    }

    @Override
    protected String describe() {
        return "applies Blizzard";
    }
}
