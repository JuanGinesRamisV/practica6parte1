/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6_parte1;

import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Practica6_parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        boolean salir=false;
        Scanner lector = new Scanner(System.in);
        int opcionMenuPrincipal;
        while(salir==false){
            menuPrincipal();
            opcionMenuPrincipal= lector.nextInt();
            switch(opcionMenuPrincipal){
                case 1:
                    
            }
        }
    }
    
    public static void menuPrincipal(){
        System.out.println("---------------------");
        System.out.println("1)Piramide");
        System.out.println("2)Cubo");
        System.out.println("3)Esfera");
        System.out.println("4)cilindro");
        System.out.println("---------------------");
        System.out.println("Selecciona una opción");
    }
}
