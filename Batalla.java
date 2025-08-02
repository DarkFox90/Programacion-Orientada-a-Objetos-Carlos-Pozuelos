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