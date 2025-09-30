import java.util.Stack;

public class Pila  {
    private Stack<Publicaciones>pila;

    public Pila() {
        pila = new Stack<Publicaciones>();
    }
//------------------------------------------------------------------
    public boolean esVacio() {
        return pila.isEmpty();
    }

    public void push(Publicaciones obj) {
        pila.push(obj);
    }


    public Publicaciones pop() throws Exception {
        if(esVacio())
            throw new Exception("Pila sin elementos");
        return pila.pop();

    }

    public Publicaciones peek() throws Exception {
        if(esVacio())
            throw new Exception("Pila vacia");
        return pila.peek();
    }
//----------------------------------------------------------------------------

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(int i = pila.size() - 1; i >= 0; i--) {
            sb.append(pila.get(i).toString());
        }
        return "Pila:\n" + sb.toString();
    }
}
