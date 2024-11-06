/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_5_dia_de_la_semana;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_5_DIA_DE_LA_SEMANA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner captu = new Scanner(System.in);
         int dia;
         System.out.println("Numero del dia de la semana");
         dia = captu.nextInt();
    System.out.println("El dia es: " + diaDeLaSemana(dia));
    }
    //determinar el menor de dos numeros
    public static String diaDeLaSemana(int num){
        switch(num){
            case 1:
                return "Lunes";
            case 2:
                return "Martes";
            case 3:
                return "Miercoles";
            case 4:
                return "Jueves";
            case 5:
                return "Viernes";
            case 6:
                return "Sabado";
            case 7:
                return "Domingo";
            default:
                return "Invalido";
        }
    }
   
}
