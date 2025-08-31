public class Miembro {
    private String nombre;
    private String membresia;
    private Entrenador entrenador;
    private Rutina rutina;
    private static int nextId = 1;
    private final int id;

    public Miembro(String nombre, String membresia, Rutina rutina) {
        this.nombre = nombre;
        this.membresia = membresia;
        this.rutina = rutina;
        this.id = nextId++;
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

    public int getId() {
        return id;
    }

    public void setRutina(Rutina rutina) {
        this.rutina = rutina;
    }

    //agregué un to string para que me aparezca a la hora de hacer sysout a la información
    public String toString() {
        return "Miembro: " +
               "nombre='" + nombre + '\'' +
               ", membresia= '" + membresia + '\'' +
               "   rutina: " + rutina;
    }

    
}
