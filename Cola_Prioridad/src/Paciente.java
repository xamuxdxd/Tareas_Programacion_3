public class Paciente implements Comparable<Paciente>{
    private int prioridad;
    private String nombre;
    private String enfermedad;

    public Paciente(int prioridad, String nombre, String enfermedad) {
        this.prioridad = prioridad;
        this.nombre = nombre;
        this.enfermedad = enfermedad;
    }

    @Override
    public int compareTo(Paciente o) {// como quiero que se ordenen los pacientes
        // menos especifico : return this.prioridad - o.prioridad;
        //mas especifico:
        if(this.prioridad< o.prioridad)
            return -1;
        else
            return 1;


    }

    @Override
    public String toString() {
        return "Paciente\n" +
                "prioridad=" + prioridad +
                ", nombre='" + nombre + '\'' +
                ", enfermedad='" + enfermedad + "\n";
    }
}
