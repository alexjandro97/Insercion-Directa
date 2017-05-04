/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inserciondirecta;

/**
 *
 * @author alexj
 */
public class InsercionDirecta {
    
    static int numeros[] = {10, 7, 21, 32, 4};
    static int auxiliar = 0;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ordenarNumeros(numeros);
        imprimirNumero(numeros);
    }

    static void ordenarNumeros(int numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros.length; j++){
                if(numeros[i] < numeros[j]){
                    auxiliar = numeros[j];
                    numeros[j]=numeros[i];
                    numeros[i] = auxiliar;
                    
                }
            }
        }
    }
    
    static void imprimirNumero(int numeros[]){
        for(int i = 0; i < numeros.length; i++){
            System.out.print(numeros[i] +"\t");
        }
    }
}
