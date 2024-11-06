/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_3_captura;

import java.util.Scanner;
/**
 *
 * @author invitado
 */
public class EVA3_3_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nombre = capturarTexto("Introduce tu nombre");
        String apellido = capturarTexto("Introduce tu apellido");
        int edad = capturarNumero("Introduce tu edad");
        double salario = capturarNumeroDos("Introduce tu salario");
        System.out.println("Nomber: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
        System.out.println("Salario: " + salario);
    }
     public static String capturarTexto(String mensaje){
         Scanner captu = new Scanner(System.in);
         String texto;
         System.out.println(mensaje);
         texto = captu.nextLine();
         return texto;
     }
     public static int capturarNumero(String mensaje){
         Scanner captu = new Scanner(System.in);
         int numero;
         System.out.println(mensaje);
         numero = captu.nextInt();
         return numero;
     }
     public static double capturarNumeroDos(String mensaje){
         Scanner captu = new Scanner(System.in);
         double numero2;
         System.out.println(mensaje);
         numero2 = captu.nextInt();
         return numero2;
     }
    
}
