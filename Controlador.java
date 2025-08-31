import java.util.ArrayList;

//agregué un constructor para que pudiera funcionar mis funciones en Main
public class Controlador {
    private Gimnasio gimnasio;

    public Controlador(Gimnasio gimnasio){
        this.gimnasio = gimnasio;
    }

    //cambié el parametro de verMIembros a un array para que pudiera retornar el valor correcto
    public ArrayList<Miembro> verMiembros(){
        return gimnasio.getMiembrosActivos();
    }

    public ArrayList<Entrenador> verEntrenadores() {
        return gimnasio.getEntrenadoresActivos();
    }

    
}
