public class Androide extends Individuo {
    boolean manchas;

    public Androide(Resistencia resistencia, String nombre, int ki, String nivel, boolean manchas) {
        super(resistencia, nombre, ki, nivel);
        this.manchas = manchas;
    }

    @Override
    public void darGolpe() {
        System.out.println("Doy golpes de un Androide");
    }
}
