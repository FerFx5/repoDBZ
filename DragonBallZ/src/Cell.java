public class Cell extends Androide implements AtaqueComun, AutoDestruccion {

    public Cell(Resistencia resistencia, String nombre, int ki, String nivel, boolean manchas) {
        super(resistencia, nombre, ki, nivel, manchas);
    }

    @Override
    public String lanzarKamehameha() {
        return "Soy Cell y lanzo un Kamehaaaaaaaaa";
    }

    @Override
    public String autoDestruirse() {
        return "Soy Cell y exploto!";
    }

}
