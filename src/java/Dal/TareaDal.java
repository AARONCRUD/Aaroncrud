
package Dal;


public class TareaDal {
    public class Tarea {
    private int id;
    private String descripcion;
    private boolean completada;

    // Constructores, getters y setters

    @Override
    public String toString() {
        return "Tarea [id=" + id + ", descripcion=" + descripcion + ", completada=" + completada + "]";
    }
}

}
