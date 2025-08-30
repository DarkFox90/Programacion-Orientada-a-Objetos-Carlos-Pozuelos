import java.util.ArrayList;

public class Gimnasio {
    private ArrayList<Miembro> miembrosActivos;
    private ArrayList<Entrenador> entrenadoresActivos;
    private ArrayList<Rutina> rutinas;

    public void agregarMiembro(Miembro miembro){
        miembrosActivos.add(miembro);
    }

    public void agregarMiembro(Entrenador entrenador){
            entrenadoresActivos.add(entrenador);
        }

    public void agregarMiembro(Rutina rutina){
        rutinas.add(rutina);
    }

   

}