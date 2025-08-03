public class Pokemon
{
    private String nombre;
    private String tipo;
    private int Ataque;
    private int Defensa;
    private HabilidadEspecial habilidad;

    public Pokemon(String nombre, String tipo, int ataque, int defensa, HabilidadEspecial habilidad) 
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.Ataque = ataque;
        this.Defensa = defensa;
        this.habilidad = habilidad;
    }


    public String getNombre()
    {
        return nombre;
    }
    
    public String getTipo()
    {
        return tipo;
    }

    public int getAtaque()
    {
        return Ataque;
    }

    public int getDefensa()
    {
        return Defensa;
    }

    public HabilidadEspecial getHabilidad()
    {
        return habilidad;
    }
}