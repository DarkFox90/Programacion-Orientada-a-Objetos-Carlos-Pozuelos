import java.util.Random;

public class HabilidadEspecial 
{
    private String nombre;
    private String efecto;
    private int Valor;
    private int probabilidad;

    public HabilidadEspecial(String nombre, String efecto, int valor, int probabilidad) 
    {
        this.nombre = nombre;
        this.efecto = efecto;
        this.Valor = valor;
        this.probabilidad = probabilidad;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public String getEfecto() 
    {
        return efecto;
    }

    public int getValor() 
    {
        return Valor;
    }

    public int getProbabilidad() 
    {
        return probabilidad;
    }

    public boolean seActiva()
    {
        Random random = new Random();
        int numero = random.nextInt(100) + 1;

        if (numero <= probabilidad) 
        {
            return true; // La habilidad se activa
        } 
        else 
        {
            return false; // La habilidad no se activa
        }
    }
    
    
}