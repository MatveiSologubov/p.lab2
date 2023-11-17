import pokemons.Lapras;
import pokemons.Minccino;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon lapras1 = new Lapras("Lapras 1", 1);
        Pokemon lapras2 = new Lapras("Lapras 2", 1);
        Pokemon minccino1 = new Minccino("Minccino 1", 1);
        Pokemon minccino2 = new Minccino("Minccino 2", 1);
        b.addAlly(lapras1);
        b.addAlly(lapras2);
        b.addFoe(minccino1);
        b.addFoe(minccino2);
        b.go();
    }
}