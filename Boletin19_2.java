package boletin19_2;

public class Boletin19_2 {

    public static int tam;
    
    public static void main(String[] args) {
        
        Ejercicio2 obx = new Ejercicio2();
        tam = 4;
        int []alumnos = new int [tam]; 
        obx.crearArray(alumnos, tam);
        obx.amosar(alumnos);
        //obx.numAprobadosESuspensos(alumnos);
        //obx.notaMedia(alumnos);
        obx.notaMasAlta(alumnos);
    }
    
}
