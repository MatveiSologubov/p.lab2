package moves.status;

import ru.ifmo.se.pokemon.*;

public class Rest extends StatusMove {

    @Override
    protected void applySelfEffects(Pokemon targetPokemon){
        targetPokemon.setMod(Stat.HP, -(int)(targetPokemon.getStat(Stat.HP)));
        targetPokemon.addEffect(new Effect().condition(Status.SLEEP). turns(2));
    }

    @Override
    protected String describe() {
        return "applies Rest";
    }
}
