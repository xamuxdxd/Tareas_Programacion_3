import java.util.LinkedList;
import java.util.Queue;

public class ColaAutos {
    private Queue<Auto> cola;// para que sirve queue

    public ColaAutos() {
        cola = new LinkedList<Auto>();
    }

    public void encolar(Auto auto) {
        cola.add(auto);
    }

    public Auto desencolar() throws Exception {
        if (cola.isEmpty()) {
            throw new Exception("Cola sin autos ");
        }
        return cola.poll();
    }
   /* public String buscarcarro(String marca){
        StringBuilder sb = new StringBuilder();
        for (Auto auto : cola) {
            if(marca.contains()){

            }
        }
    }*/


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Auto auto : cola) {      //cualquier tipo de elemento,
            sb.append(auto + "\n");
        }
        return sb.toString();
    }
}
