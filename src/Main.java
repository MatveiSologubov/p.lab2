import pokemons.*;
import ru.ifmo.se.pokemon.Battle;
import ru.ifmo.se.pokemon.Pokemon;

public class Main {
    public static void main(String[] args) {
        Battle battle = new Battle();

        Pokemon lapras = new Lapras("Lapras", 1);
        Pokemon minccino = new Minccino("Minccino", 1);
        Pokemon cinccino = new Cinccino("Cinccino", 1);
        Pokemon nidoran = new Nidoran("Nidoran", 1);
        Pokemon nidorino = new Nidorino("Nidorino", 1);
        Pokemon nidoking = new Nidoking("Nidoking", 1);

        battle.addAlly(lapras);
        battle.addAlly(minccino);
        battle.addAlly(cinccino);
        battle.addFoe(nidoran);
        battle.addFoe(nidorino);
        battle.addFoe(nidoking);

        battle.go();
    }
}