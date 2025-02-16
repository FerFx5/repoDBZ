public class Goku extends Sayayin implements AtaqueComun, SubeNivel{
    public Goku(Resistencia resistencia, String nombre, int ki, String nivel, String cola) {
        super(resistencia, nombre, ki, nivel, cola);
    }

    public String lanzarKamehameha() {
        return "Soy Goku Kamehameha!!!!!";
    }

    public void aumentarKi(){
         setKi(getKi()+1000);
    }

}
