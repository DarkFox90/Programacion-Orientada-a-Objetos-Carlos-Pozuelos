import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Entrenador
{
    private String nombre;
    private List<Pokemon> pokemones;
    private List<Pokemon> pokemonesUsados;
    private int rondasGanadas;

    public Entrenador(String nombre) 
    {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
        this.pokemonesUsados = new ArrayList<>();
        this.rondasGanadas = 0;
    }

    public String getNombre()
    {
        return nombre;
    }

    public List<Pokemon> getPokemones()
    {
        return pokemones;
    }

    public List<Pokemon> getPokemonesUsados()
    {
        return pokemonesUsados;
    }

    public int getRondasGanadas()
    {
        return rondasGanadas;
    }

    public void ganarRonda()
    {
        rondasGanadas++;
    }


    public void agregarPokemon(Pokemon p)
    {
        if (pokemones.size() < 4)
        {
            pokemones.add(p);
        }
    }

    public Pokemon seleccionarPokemon(Scanner scanner)
    {
        List <Pokemon> disponibles = new ArrayList<>();
        for (Pokemon p : pokemones)
        {
            if (!pokemonesUsados.contains(p))
            {
                disponibles.add(p);
            }
        }

        System.out.println("pokemones disponibles para " + nombre + ":");
        for (int i = 0; i < disponibles.size(); i++)
        {
            System.out.println(i + ". " + disponibles.get(i).getNombre());
        }
        
           int opcion = -1;
        boolean valido = false;
        while (!valido) {
            System.out.print("Selecciona el índice del Pokémon: ");
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                if (opcion >= 0 && opcion < disponibles.size()) {
                    valido = true;
                } else {
                    System.out.println("Índice fuera de rango.");
                }
            } else {
                System.out.println("Entrada inválida.");
                scanner.next();
            }
        }

        Pokemon elegido = disponibles.get(opcion);
        pokemonesUsados.add(elegido);
        return elegido;
    }
}