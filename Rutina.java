//eliminé el atributo de ejercicio ya que me hacía conflicto a la hora de crear una rutina

public class Rutina {
    private String tipo;
    private String nombre;


    public Rutina(String tipo, String nombre) {
        this.tipo = tipo;
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNombre() {
        return nombre;
    }

    

     public String toString() {
        return nombre + '\'' +
               ", tipo='" + tipo + '\'';
               
    }
}


