import java.util.Stack;

public class Antman {
    private int cantidad;
    private float ganancia;
    private int precio;
    private Stack<Cliente> clienteAntman;

    public Antman() {
        this.cantidad = 17;
        this.ganancia = 0.f;
        this.precio = 5;
        this.clienteAntman = new Stack<>();
    }
    //------------------metodos--------------
    public void agregarCliente(Cliente cliente) throws Exception {
        if(cliente.getEntradas() > this.cantidad) {
            throw new Exception("No hay espacio en la sala");
        }else{
            this.cantidad= this.cantidad - cliente.getEntradas();
            this.ganancia = this.ganancia + (cliente.getEntradas()* precio);
            clienteAntman.push(cliente);
        }
    }

    @Override
    public String toString() {
        return "Antman:\n" +
                "cantidad: " + cantidad + "\n" +
                "ganancia: " + ganancia + "\n" +
                "precio: " + precio;
    }
}
