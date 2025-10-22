import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ColaSuperHeroe {
    private PriorityQueue<SuperHeroe> superHeroes;


    public ColaSuperHeroe() {
        superHeroes = new PriorityQueue<SuperHeroe>();
    }

    public void encolar(SuperHeroe s){
        superHeroes.add(s);
    }

    public List<SuperHeroe> listaHeroes(){
        return new ArrayList<>(superHeroes);
    }


}
