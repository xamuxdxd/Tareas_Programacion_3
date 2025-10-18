import java.util.Stack;

public class Piratas {
    private int cantidad;
    private float ganancia;
    private int precio;
    private Stack<Cliente> clientePirata;

    public Piratas() {
        this.cantidad = 17;
        this.ganancia = 0.f;
        this.precio = 5;
        this.clientePirata = new Stack<>();
    }
    //------------------metodos--------------
    public void agregarCliente(Cliente cliente) throws Exception {
        if(cliente.getEntradas() > this.cantidad) {
            throw new Exception("No hay espacio en la sala");
        }else{
            this.cantidad= this.cantidad - cliente.getEntradas();
            this.ganancia = this.ganancia + (cliente.getEntradas()* precio);
            clientePirata.push(cliente);
        }
    }

    @Override
    public String toString() {
        return "Piratas:\n" +
                "cantidad: " + cantidad + "\n" +
                "ganancia: " + ganancia + "\n" +
                "precio: " + precio ;
    }
}
