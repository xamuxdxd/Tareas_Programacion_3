import java.util.EmptyStackException;
import java.util.Stack;

public class Pila {
   private Stack<Character> pila;


   public Pila() {
       pila= new Stack<Character>();

   }
   public boolean esVacia() {
    return pila.isEmpty();
   }

   public void push(Character c) {
       pila.push(c);
   }

   public Character pop() throws Exception {
       if(esVacia())
           throw new Exception("Codigo no balanceado");
       return pila.pop();

   }
    public boolean balanceo(String codigo) throws Exception {

       for(int i=0; i<codigo.length(); i++){
           if(codigo.charAt(i)=='('){
               pila.push(codigo.charAt(i));
           }else{
               if(codigo.charAt(i)==')'){
                   if(this.pop()!='('){
                       return false;
                   }
               }
           }
       }

       if(esVacia())
           return true;
       return false;//cuando devuelva un elemento

    }
}
