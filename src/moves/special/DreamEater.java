package moves.special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }

    @Override
    protected void applyOppDamage(Pokemon targetPokemon, double damage){
        if (targetPokemon.getCondition() == Status.SLEEP){
            targetPokemon.setMod(Stat.HP, (int) Math.round(damage));
        }
    }

    @Override
    protected void applySelfDamage(Pokemon targetPokemon, double damage){
        targetPokemon.setMod(Stat.HP, (int) -(Math.round(damage * 0.5)));
    }

    @Override
    protected String describe() {
        return "applies Dream Eater";
    }
}
