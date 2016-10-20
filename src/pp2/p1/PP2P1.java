/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pp2.p1;
import java.util.Scanner;
/**
 *
 * @author osiri
 */
public class PP2P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //declaracion de variables
        int anno;
        String viciesto;
        //procedimiento
        anno = pediranno();
        viciesto = verificacion (anno);
        mostrar (viciesto,anno);
    }
    public static int pediranno () {
        int anno;
        Scanner teclado = new Scanner (System.in);
        System.out.println("*****   Anno Boleano   *****");
        System.out.println("Introduce el anno");
        anno = teclado.nextInt () ;
        return anno;
    }
    public static String verificacion (int anno){
        //Esta lista determina si el anno es viciesto
        if (anno % 4 == 0){
            if (anno % 100 == 0){
                if (anno % 400 == 0){
                    return "es";
                }else{
                    return "no es";
                }
            }else{
                return "es";
            }
        }else{
            return "no es";
        }
    }
    public static void mostrar (String b,int anno){
        System.out.println("el anno "+anno+" "+b+" viciesto");
    }
}
