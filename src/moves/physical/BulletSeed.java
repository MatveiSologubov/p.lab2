package moves.physical;

import ru.ifmo.se.pokemon.*;

public class BulletSeed extends PhysicalMove {
    public BulletSeed(){
        super(Type.GRASS, 25, 100);
    }

    @Override
    protected void applyOppEffects(Pokemon targetPokemon){
        int hitNumber = calcHitNumber();
        for (int i = 0; i < hitNumber; i++) {
            targetPokemon.setMod(Stat.HP, (int)(this.power * calcCriticalHit()));
        }
    }

    private int calcHitNumber(){
        int probability = (int)(Math.random() * 8);
        if (probability <= 2) return 1;
        else if (probability <= 5) return 2;
        else if (probability == 6) return 3;
        else return 4;
    }

    protected double calcCriticalHit(){
        if (Math.random() * 24 < 1) {
            System.out.println("Critical!");
            return 2;
        }
        return 1;
    }

    @Override
    protected String describe() {
        return "applies Bullet Seed";
    }
}
