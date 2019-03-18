package boletin19_4;

public class Ejercicio4 {
    
    public String [] letras = {"A","B","C","D","E","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W","X","Y","Z"};
    public int [] numeros = {3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
    
    public void calcularLetra(int dni){
        int resto = dni%23;
        for (int i = 0; i < numeros.length; i++)
            if (i == resto){
                System.out.println("La letra de tu DNI es: " + letras[i]);
                break;
            }
    }
    
    
}
