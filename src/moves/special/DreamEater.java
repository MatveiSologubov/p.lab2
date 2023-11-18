package moves.special;

import ru.ifmo.se.pokemon.*;

public class DreamEater extends SpecialMove {
    public DreamEater(){
        super(Type.PSYCHIC, 100, 100);
    }

    private boolean isEnemyAsleep = false;

    @Override
    protected void applyOppDamage(Pokemon targetPokemon, double damage){
        if (targetPokemon.getCondition() == Status.SLEEP){
            targetPokemon.setMod(Stat.HP, (int) Math.round(damage));
            isEnemyAsleep = true;
        }
        else { isEnemyAsleep = false; }
    }

    @Override
    protected void applySelfDamage(Pokemon targetPokemon, double damage){
        if (isEnemyAsleep){
            targetPokemon.setMod(Stat.HP, (int) -(Math.round(damage * 0.5)));
        }
    }

    @Override
    protected String describe() {
        return "applies Dream Eater";
    }
}
