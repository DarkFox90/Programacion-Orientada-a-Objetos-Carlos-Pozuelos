public class Miembro {
    private String nombre;
    private String membresia;
    private Entrenador entrenador;
    private Rutina rutina;

    public Miembro(String nombre, String membresia, Entrenador entrenador, Rutina rutina) {
        this.nombre = nombre;
        this.membresia = membresia;
        this.entrenador = entrenador;
        this.rutina = rutina;
    }

    public String getNombre() {
        return nombre;
    }

    public String getMembresia() {
        return membresia;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public Rutina getRutina() {
        return rutina;
    }

    
}