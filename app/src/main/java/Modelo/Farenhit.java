package Modelo;

public class Farenhit extends Grado{
    public Farenhit(Double valor, String unidad) {
        super( valor, unidad);
    }

    public Farenhit parse (Celsius c) {
        return new Farenhit(c.getValor()*1.8+32,"C");
    }

    public Farenhit parse (Kelvin c) {
        return new Farenhit(c.getValor()*1.8+32,"K");
    }


}
