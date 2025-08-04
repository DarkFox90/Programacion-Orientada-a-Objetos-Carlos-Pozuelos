import java.util.Scanner;

public class main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el nombre del Entrenador 1: ");
        String nombre1 = scanner.nextLine();
        Entrenador e1 = new Entrenador(nombre1);

        System.out.print("Ingrese el nombre del Entrenador 2: ");
        String nombre2 = scanner.nextLine();
        Entrenador e2 = new Entrenador(nombre2);

        List<Pokemon> pokedex = crearPokedex();

        for (int i = 0; i < 4; i++)
        {
            
        }
        
    }
}