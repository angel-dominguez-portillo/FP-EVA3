/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examen_unidad3;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EXAMEN_UNIDAD3 {
final static Scanner captu = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num, cali, i;
       System.out.println("Numero de alumnos");
       num = captu.nextInt();
       int[] alumno; 
       for(i = 1; num >= i; i++){
           int salir = 0;
           System.out.println("cual es la calificacion del alumno " + i + "? ");
           cali = captu.nextInt();
           alumno [] = {cali};
           do{
               
               if(num >= 0 && num <= 100){
                   System.out.println("Se le a asignado de calificacion al alumno " + i + ": " + cali);
                   salir = salir + 1;
               }else{
                   System.out.println("La calificacion es del 0 al 100");
               }
           }while(salir != 1);
           
       }
       
       
    }
    
    
    //public static promedios(int num,int cal){
        //int promrdio;
        
          // return promedio;
      // }
    
}
