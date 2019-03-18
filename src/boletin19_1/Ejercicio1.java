package boletin19_1;

import javax.swing.JOptionPane;

public class Ejercicio1 {
              
       public int []crearArray( int []lista, int tam){
        for (int i=0;i < tam; i++){
            lista[i]=darValor();
        }
        return lista;
    }
    
       public int darValor(){
           int numero = (int)(Math.random() * 50) + 1;
           return numero;
       }
       
       public int [] amosar(int []lista){
        for(int i=0;i<lista.length;i++)
            System.out.print(lista[i] + "  ");
            
        return lista;
       }
       
       public int [] amosarContrario(int [] lista){
           for (int i = Boletin19_1.tam - 1; i>= 0; i--){
               System.out.print(lista[i] + "  ");
           }
           return lista;
       }
}
