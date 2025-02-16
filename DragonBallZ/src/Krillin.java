public class Krillin extends Humano implements AtaqueComun, SubeNivel{

    public Krillin(Resistencia resistencia, String nombre, int ki, String nivel, String piel) {
        super(resistencia, nombre, ki, nivel, piel);
    }

    @Override
    public String lanzarKamehameha() {
        return "Soy Krillin y lanzo KamehameHa!!";
    }
    @Override
    public void darGolpe() {
        System.out.println("Doy golpes de humano");
    }
    public String lanzarKienzan(){
        return "Soy Krillin y lanzo mi Kienzan";
    }

    @Override
    public void aumentarKi() {
        setKi(getKi()+500);
    }
}
