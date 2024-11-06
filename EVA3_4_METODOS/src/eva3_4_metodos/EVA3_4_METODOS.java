/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva3_4_metodos;

/**
 *
 * @author invitado
 */
public class EVA3_4_METODOS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         System.out.println("Mayor de 8 y 7 = " + buscarMayor(8, 7));
    }
    //determinar el menor de dos numeros
    public static int buscarMayor(int num1, int num2){
        if(num1 > num2){
            return num1;
        }else{
            return num2;
        }
    }
    
}
