package Modelo;

public class Celsius  extends Grado{

    public Celsius(Double valor, String unidad) {
        super( valor, unidad);
    }

    public Celsius parse (Farenhit c) {
        return new Celsius(c.getValor()*1.8+32,"F");
    }

    public Celsius parse (Kelvin c) {
        return new Celsius(c.getValor()*1.8+32,"K");
    }


}
