import java.util.List;

public class Entrenador
{
    private String nombre;
    private List<Pokemon> Pokemones;
    private int pokemonesUsados;
    private int rondasGanadas;

    public Entrenador(String nombre, List<Pokemon> pokemones, int pokemonesUsados, int rondasGanadas) 
    {
        this.nombre = nombre;
        this.Pokemones = pokemones;
        this.pokemonesUsados = pokemonesUsados;
        this.rondasGanadas = rondasGanadas;
    }

    public String getNombre()
    {
        return nombre;
    }

    public List<Pokemon> getPokemones()
    {
        return Pokemones;
    }

    public int getPokemonesUsados()
    {
        return pokemonesUsados;
    }

    public int getRondasGanadas()
    {
        return rondasGanadas;
    }

    public void seleccionarPokemon()
    {
        // Lógica para seleccionar un Pokémon del equipo del entrenador
        // Por ejemplo, podrías elegir el primer Pokémon disponible
        if (!Pokemones.isEmpty()) {
            Pokemon pokemonSeleccionado = Pokemones.get(0);
            System.out.println(nombre + " ha seleccionado a " + pokemonSeleccionado.getNombre());
        } else {
            System.out.println(nombre + " no tiene Pokémon disponibles.");
        }
    }
   
}