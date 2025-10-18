import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Clinica {
    private PriorityQueue<Paciente> pacientes;
    //constructor
    public Clinica(){
        pacientes = new PriorityQueue<Paciente>();
    }
    //metodo
    public void encolar(Paciente p){
        pacientes.add(p);
    }
    public Paciente desencolar()throws Exception{
        if(pacientes.isEmpty())
            throw new Exception("Ya no existe pacientes encolados");
        return pacientes.poll();
    }

    // transformar de Queue a una lista
    public List<Paciente> listarPacientes() {
        return new ArrayList<>(pacientes);

    }




}


