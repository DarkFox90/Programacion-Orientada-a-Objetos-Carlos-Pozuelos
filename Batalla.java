import java.util.Scanner;
public class Batalla
{
    private Entrenador entrenador1;
    private Entrenador entrenador2;
    private int rondasTotales;
    private int rondaActual;

    public Batalla(Entrenador entrenador1, Entrenador entrenador2, int rondasTotales) 
    {
        this.entrenador1 = entrenador1;
        this.entrenador2 = entrenador2;
        this.rondasTotales = rondasTotales;
        this.rondaActual = 0;
    }

    public void iniciarBatalla(Scanner scanner)
    {
        while (rondaActual <= rondasTotales)
        {
            System.out.println("ronda" + rondaActual);
            Pokemon p1 = entrenador1.seleccionarPokemon(scanner);
            Pokemon p2 = entrenador2.seleccionarPokemon(scanner);

            System.out.print(entrenador1.getNombre() + "usar habilidad especial (y/n): ");
            boolean usar1 = scanner.next().equalsIgnoreCase("y");

            System.out.print(entrenador2.getNombre() + "usar habilidad especial (y/n): ");
            boolean usar2 = scanner.next().equalsIgnoreCase("y");

            if (usar1 && p1.usarHabilidad())
            {
                p1.aplicarHabilidad(p2);
            }

            if (usar2 && p2.usarHabilidad())
            {
                p2.aplicarHabilidad(p1);
            }

            int ataque1 = p1.calcularAtaqueTotal(p2.getTipo());
            int ataque2 = p2.calcularAtaqueTotal(p1.getTipo());

            System.out.println(p1.getNombre() + "ataque total: " + ataque1);
            System.out.println(p2.getNombre() + "ataque total: " + ataque2);

            if (ataque1 > ataque2)
            {
                entrenador1.ganarRonda();
                System.out.println(entrenador1.getNombre() + "gana la ronda!");
            }

            else if (ataque2 > ataque1)
            {
                entrenador2.ganarRonda();
                System.out.println(entrenador2.getNombre() + "gana la ronda!");
            }

            else
            {
                System.out.println("Empate en la ronda!");
            }

            rondaActual++;
        }
    }

    public Entrenador determinarGanador()
    {
        if (entrenador1.getRondasGanadas() > entrenador2.getRondasGanadas()) 
        {
            return entrenador1;
        } 
        else if (entrenador2.getRondasGanadas() > entrenador1.getRondasGanadas()) 
        {
            return entrenador2;
        } 
        else 
        {
            return null; 
        }
    }

    public Entrenador getEntrenador1() 
    {
        return entrenador1;
    }

    public Entrenador getEntrenador2() 
    {
        return entrenador2;
    }

    public int getRondasTotales() 
    {
        return rondasTotales;
    }

    public int getRondaActual() 
    {
        return rondaActual;
    }

    
}