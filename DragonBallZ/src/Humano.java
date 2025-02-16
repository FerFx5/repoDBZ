public abstract class Humano extends Individuo{
    String piel;

    public Humano(Resistencia resistencia, String nombre, int ki, String nivel, String piel) {
        super(resistencia, nombre, ki, nivel);
        this.piel = piel;
    }
}
