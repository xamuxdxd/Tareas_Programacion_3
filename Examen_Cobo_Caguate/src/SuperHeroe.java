import java.util.PriorityQueue;

public class SuperHeroe implements Comparable<SuperHeroe> {
    private int id;
    private String nombre;
    private String universo;
    private int nivelPoder;
    private String habilidad;
// defecto:

// con parametros
    public SuperHeroe(int id, String nombre, String universo, int nivelPoder, String habilidad) {
        this.id = id;
        this.nombre = nombre;
        this.universo = universo;
        this.nivelPoder = nivelPoder;
        this.habilidad = habilidad;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUniverso() {
        return universo;
    }

    public void setUniverso(String universo) {
        this.universo = universo;
    }

    public int getNivelPoder() {
        return nivelPoder;
    }

    public void setNivelPoder(int nivelPoder) {
        this.nivelPoder = nivelPoder;
    }

    public String getHabilidad() {
        return habilidad;
    }

    public void setHabilidad(String habilidad) {
        this.habilidad = habilidad;
    }

    @Override
    public String toString() {
        return "SuperHeroe: \n" +
                "id: " + id +
                ", nombre: " + nombre  +
                ", universo: " + universo  +
                ", nivelPoder: " + nivelPoder +
                ", habilidad: " + habilidad + "\n";
    }

    @Override
    public int compareTo(SuperHeroe o) {
        if(this.nivelPoder< o.nivelPoder)
            return -1;
        else
            return 1;
    }
}
