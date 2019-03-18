package boletin19_2;

public class Ejercicio2 {
    
    public int []crearArray( int []lista, int tam){
        for (int i=0;i < tam; i++){
            lista[i]=darValor();
        }
        return lista;
    }
    
    private int darValor(){
           int numero = (int)(Math.random() * 11);
           return numero;
       }

    public int [] amosar(int []lista){
        for(int i=0;i<lista.length;i++)
            System.out.println(lista[i]);
        return lista;
       }   
    
     public void numAprobadosESuspensos(int [] lista){
         int aprobados = 0; int suspensos = 0;
         for (int i = 0; i < Boletin19_2.tam; i++){
             if (lista[i] >= 5){
                aprobados ++;
            }
             else {
                suspensos ++;
            }
         }
        
         System.out.println("El numero de aprobados es de: " + aprobados + ", y el numero de suspensos es de: " + suspensos); 
     }
    
    public void notaMedia(int [] lista){
        
            int sumaNotas = 0;
            for (int i = 0; i < Boletin19_2.tam; i++){
                sumaNotas = sumaNotas + lista[i];
            }
            System.out.println("La nota media de la clase es de: " + (sumaNotas/Boletin19_2.tam));
    }
    
    public void notaMasAlta(int [] lista){
        
        int notaAlta = 0;
        for (int i = 0; i < Boletin19_2.tam; i++){
            if (notaAlta < lista [i]){
                notaAlta = lista[i];
            }
        }
        System.out.println("La nota mas alta de la clase es de: " + notaAlta);
    }
}
