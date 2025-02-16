import java.sql.SQLOutput;

public class DBZ {
    public static void main(String[] args) {

        Resistencia miResistencia=Resistencia.MEDIA;
        Resistencia miiResistencia=Resistencia.ALTA;
        Resistencia miiiResistencia=Resistencia.BAJA;

        Goku goku=new Goku(miResistencia,"Goku",2000,"Base","no");
        System.out.println("Mi nombre es "+goku.getNombre());
        System.out.println("Mi resistencia es "+miResistencia);
        System.out.println("Mi ki es de "+ goku.getKi());
        System.out.println("Por el momento estoy en Sayayín "+goku.getNivel());
        goku.aumentarKi();
        System.out.println("Ahora mi Ki es de "+goku.getKi());
        goku.setNivel("SS1");
        System.out.println("Aaaaaaaa ahora mi nivel es de un "+goku.getNivel());
        goku.aumentarKi();
        System.out.println("Ahora mi Ki es de "+goku.getKi());
        goku.setNivel("SS2");
        System.out.println("Aaaaaaaa ahora mi nivel es de un "+goku.getNivel());
        System.out.println(goku.lanzarKamehameha());


        Cell cell=new Cell(miiResistencia,"Cell",5000,"Final",true);
        System.out.println("Soy "+cell.getNombre());
        System.out.println("Mi nivel de pelea es "+miiResistencia);
        System.out.println("Eres un insecto");
        System.out.println(cell.getKi());
        cell.darGolpe();
        System.out.println(cell.lanzarKamehameha());
        System.out.println(cell.autoDestruirse());

        Krillin krillin=new Krillin(miiiResistencia,"Krillin",800,"base","blanca");
        System.out.println("Hola soy "+krillin.getNombre());
        System.out.println("Voy a arriesgarme a lanzar ataques, pero no creo lograr mucho ");
        krillin.lanzarKamehameha();
        krillin.darGolpe();
        krillin.lanzarKienzan();
        System.out.println(krillin.getResistencia());
        System.out.println(krillin.getKi()+" Mi ki es insuficiente");
        krillin.aumentarKi();
        System.out.println(krillin.getKi()+" Mi ki sigue siendo insuficiente");
        System.out.println(krillin.getNivel());
        System.out.println(krillin.piel);

    }
}
