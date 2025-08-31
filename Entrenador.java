import java.util.ArrayList;

public class Entrenador {
    private String nombre;
    private String especialidad;
    private ArrayList<Miembro> miembros;

    public Entrenador(String nombre, String especialidad, ArrayList<Miembro> miembros) { //cambié un parametro por el arraylist para que hiciera sentido crear un entrendor
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.miembros = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public ArrayList<Miembro> getMiembros() {
        return miembros;
    }

  public void asignarMiembro(Miembro miembro) { //cambie alumno por miembro para evitar confusión 
        miembros.add(miembro);
    }

    public boolean eliminarMiembro(Miembro miembro) {
        if (miembros.remove(miembro)) {
            return true;
        } else {
            return false;
        }
    }
}

