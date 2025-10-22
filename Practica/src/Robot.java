public class Robot {
    private int codigo;
    private String nombre;
    private String faccion;
    private int poder;
    private String funcion;
    //por defecto
    public Robot() {
        this.codigo = 0;
        this.nombre = "sin nombre";
        this.faccion = "Autobot";
        this.poder = 0;
        this.funcion = "desactivada";
    }
    // valores especificos
    public Robot(int codigo, String nombre, String faccion, int poder, String funcion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.faccion = faccion;
        this.poder = poder;
        this.funcion = funcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFaccion() {
        return faccion;
    }

    public void setFaccion(String faccion) {
        this.faccion = faccion;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public String toString() {
        return "Robot: " +
                "codigo: " + codigo +
                ", nombre: " + nombre +
                ", faccion: " + faccion +
                ", poder: " + poder +
                ", funcion: " + funcion;
    }
}

