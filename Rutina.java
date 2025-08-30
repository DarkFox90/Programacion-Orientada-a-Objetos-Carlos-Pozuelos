import java.util.ArrayList;

public class Rutina {
    private String tipo;
    private String nombre;
    private ArrayList<String> ejercicios;


    public Rutina(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.ejercicios = new ArrayList<>();
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<String> getEjercicios() {
        return ejercicios;
    }

    //cambié el tipo de ejercicio porque no tengo ninguna clase llamada Ejercicio
    public void agregarEjercicio(String ejercicio) {
        ejercicios.add(ejercicio);
    }
    
}
