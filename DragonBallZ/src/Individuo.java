public abstract class Individuo {
    private String nombre;
    protected int ki;
    private String nivel;
    private Resistencia resistencia;

    public abstract void darGolpe();

    public Individuo() {
    }

    public Individuo(Resistencia resistencia, String nombre, int ki, String nivel) {
        this.resistencia = resistencia;
        this.nombre = nombre;
        this.ki = ki;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getKi() {
        return ki;
    }

    public void setKi(int ki) {
        this.ki = ki;
    }

    public String getNivel() {
        return nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Resistencia getResistencia() {
        return resistencia;
    }

    public void setResistencia(Resistencia resistencia) {
        this.resistencia = resistencia;
    }
}
