package boletin19_3;
 
import Utils.PedirValor;
import javax.swing.JOptionPane;

public class Ejercicio3 {

public int []crearArray( int []lista, int tam){
        for (int i=0;i < tam; i++){
            lista[i]=darValorNotas();
        }
        return lista;
    }

private int darValorNotas(){
        int numero = (int)(Math.random() * 11);
        return numero;
    }

public String []crearArray(String []lista, int tam){
        for (int i=0; i< tam; i++){
            lista[i]=darValorAlumnos();
        }
        return lista;
}

private String darValorAlumnos(){
        String nombre = PedirValor.pedirString("Introduce el nombre del alumno");
        return nombre;
    }

public int [] amosar(int []lista){
        for(int i=0;i<lista.length;i++)
            System.out.print(lista[i] + "  ");
        return lista;
    }

public String [] amosar(String []lista){
        for(int i=0; i<lista.length; i++)
            System.out.print(lista[i] + "  ");
        return lista;
}

public void notaAlumno(String nome, int []notas, String []alumnos){
        for (int i=0; i< alumnos.length; i++){
             if (alumnos[i] == null ? nome == null : alumnos[i].equals(nome)){
                System.out.println("La nota del alumno " +nome+ " es: " +notas[i]);    
            }
        }    
    }
    
public void alumnosAprobados(int []notas, String []alumnos){
        System.out.println("Los almunos aprobados son los siguientes: ");
        for (int i=0; i < alumnos.length; i++){
            if (notas[i] >= 5)
                System.out.print(alumnos[i] + "  ");
        }
    
}

public void ordenarPorNotas (int [] notas, String [] alumnos){
        for (int i = 0; i < alumnos.length - 1; i++){
            for (int j = i+1; j < alumnos.length; j++){
                if (notas[j] < notas [i]){
                    int aux1 = notas [i];
                    notas [i] = notas [j];
                    notas [j] = aux1;
                    String aux2 = alumnos[i];
                    alumnos [i] = alumnos[j];
                    alumnos [j] = aux2;
                }      
            }
        }
    
}



}
