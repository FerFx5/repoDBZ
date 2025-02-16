public class Sayayin extends Individuo {
    String cola;

    public Sayayin(Resistencia resistencia, String nombre, int ki, String nivel, String cola) {
        super(resistencia, nombre, ki, nivel);
        this.cola = cola;
    }

    public String getCola() {
        return cola;
    }

    public void setCola(String cola) {
        this.cola = cola;
    }

    public void darGolpe(){
        System.out.println("Soy un Sayayin y doy golpes Sayayines");
    }
    public void puedeVolarConEnergia(){
        System.out.println("Soy un Sayayín y puedo volar!");
    };
}
