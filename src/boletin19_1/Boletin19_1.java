package boletin19_1;
//para el commit
public class Boletin19_1 {

    public static int tam;
    
    public static void main(String[] args) {
       
        Ejercicio1 obx = new Ejercicio1();
        tam = 6;
        int []numeros = new  int [tam];
        obx.crearArray(numeros, tam);
        obx.amosar(numeros);
        System.out.println("\n*******");
        obx.amosarContrario(numeros);
    }
    
}