public class Pokemon
{
    private String nombre;
    private String tipo;
    private int ataque;
    private int defensa;
    private HabilidadEspecial habilidad;

    public Pokemon(String nombre, String tipo, int ataque, int defensa, HabilidadEspecial habilidad) 
    {
        this.nombre = nombre;
        this.tipo = tipo;
        this.ataque = ataque;
        this.defensa = defensa;
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
        return ataque;
    }

    public int getDefensa()
    {
        return defensa;
    }

    public HabilidadEspecial getHabilidad()
    {
        return habilidad;
    }

    public boolean usarHabilidad()
    {
        return habilidad.seActiva();
    }

    public void aplicarHabilidad(Pokemon rival)
    {
        habilidad.aplicarEfecto(this, rival);
    }

    public int calcularAtaqueTotal(String tipoOponente)
    {
        int bonificacion = 0;
        if (tipo.equals("Fuego") && tipoOponente.equals("Planta")) bonificacion = 20;
        else if (tipo.equals("Planta") && tipoOponente.equals("Agua")) bonificacion = 20;
        else if (tipo.equals("Agua") && tipoOponente.equals("Fuego")) bonificacion = 20;
        else if (tipo.equals("Eléctrico") && tipoOponente.equals("Agua")) bonificacion = 20;
        else if (tipo.equals("Fuego") && tipoOponente.equals("Agua")) bonificacion = -10;
        else if (tipo.equals("Planta") && tipoOponente.equals("Fuego")) bonificacion = -10;
        else if (tipo.equals("Agua") && tipoOponente.equals("Planta")) bonificacion = -10;
        else if (tipo.equals("Agua") && tipoOponente.equals("Eléctrico")) bonificacion = -10;

        return ataque + bonificacion;
    }

    public void modificarAtaque(int cantidad)
    {
        this.ataque += cantidad;
    }

    public void modificarDefensa(int cantidad)
    {
        this.defensa += cantidad;
    }
}