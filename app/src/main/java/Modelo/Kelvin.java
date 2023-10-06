package Modelo;

public class Kelvin extends Grado{

    public Kelvin (Double valor, String unidad) {
        super( valor, unidad);
    }

    public Kelvin parse (Farenhit c) {
        return new Kelvin(c.getValor()*1.8+32,"F");
    }

    public Kelvin parse (Kelvin c) {
        return new Kelvin(c.getValor()*1.8+32,"K");
    }


}
