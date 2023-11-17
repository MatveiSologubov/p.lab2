import pokemons.Cinccino;
import pokemons.Lapras;
import pokemons.Minccino;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Pokemon lapras = new Lapras("Lapras", 1);
        Pokemon minccino = new Minccino("Minccino 1", 1);
        Pokemon cinccino = new Cinccino("Cinccino", 1);
        b.addAlly(lapras);
        b.addAlly(minccino);
        b.addFoe(cinccino);
        b.go();
    }
}