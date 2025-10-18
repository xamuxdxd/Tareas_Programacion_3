//Colas: FITO first in,first out
//Calculo la matricula de carros
public class Auto {
    private String placa;
    private String marca;
    private String modelo;
    private int anio;

//---------------------------------------------------
    public Auto(String placa, String marca, String modelo, int anio) {
        this.placa = placa;
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
    }

//--------------------------------------------------------------------

    public int getAnio() {
        return anio;
    }

    @Override
    public String toString() {
        return "Main:" +
                "placa:" + placa +
                ", marca:" + marca +
                ", modelo: " + modelo +
                ", anio: " + anio;
    }
}
