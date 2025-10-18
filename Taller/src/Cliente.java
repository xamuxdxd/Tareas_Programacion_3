public class Cliente {
    private String cedula;
    private int entradas;
    private String pelicula;
    private float costo;
//-----------------------------------------------------------


    public Cliente(String cedula, int entradas, String pelicula) {
        this.cedula = cedula;
        this.entradas = entradas;
        this.pelicula = pelicula;
        this.costo = costo* 5;
    }

    //------------------------------------------------------

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public int getEntradas() {
        return entradas;
    }

    public void setEntradas(int entradas) {
        this.entradas = entradas;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public float getCosto() {
        return costo;
    }
    //----------------------------------------------------------------


    @Override
    public String toString() {
        return "Cliente\n" +
                "cedula: " + cedula + "\n" +
                "entradas: " + entradas + "\n" +
                "pelicula: " + pelicula;
    }
}
