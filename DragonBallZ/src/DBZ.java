import java.sql.SQLOutput;

public class DBZ {
    public static void main(String[] args) {

        Resistencia miResistencia=Resistencia.MEDIA;
        Resistencia miiResistencia=Resistencia.ALTA;

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

    }
}
