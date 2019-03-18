package boletin19_3;

import Utils.PedirValor;

public class Boletin19_3 {

    public static int tam;
    
    public static void main(String[] args) {
        
        Ejercicio3 obx = new Ejercicio3();
        tam = 4;
        int []notas = new int [tam];
        String []alumnos = new String [tam];
        obx.crearArray(notas, tam);
        obx.amosar(notas);
        obx.crearArray(alumnos, tam);
        obx.amosar(alumnos);
        System.out.println("\n*******");
        obx.notaAlumno(PedirValor.pedirString("Introduce el nombre del alumno que se quiera buscar: "), notas, alumnos);
        System.out.println("*******");
        obx.alumnosAprobados(notas, alumnos);
        System.out.println("\n*******");
        obx.ordenarPorNotas(notas, alumnos);
        obx.amosar(notas);
        obx.amosar(alumnos);
    }
    
}
