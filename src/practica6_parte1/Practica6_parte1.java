/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6_parte1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author juang
 */
public class Practica6_parte1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ExcepcionPersonalizada {
        // TODO code application logic here
        boolean salir = false;
        Scanner lector = new Scanner(System.in);
        int opcionMenuPrincipal; //variables para movernos por los diferentes menus
        int opcionMenuSecundario;
        Piramide piramide = new Piramide(); //objetos para llamar a los metodos
        Esfera esfera = new Esfera();
        Cubo cubo = new Cubo();
        Cilindro cilindro = new Cilindro();
        while (salir == false) {
            menuPrincipal();
            opcionMenuPrincipal = lector.nextInt();
            switch (opcionMenuPrincipal) {
                case 1://piramide
                    menuSecundario();
                    opcionMenuSecundario = lector.nextInt();
                    switch (opcionMenuSecundario) {
                        case 1: {
                            try {
                                System.out.println("El volumen equivale a " + piramide.calcularVolumen());
                            } catch (ExcepcionPersonalizada ex) {
                                Logger.getLogger(Practica6_parte1.class.getName()).log(Level.SEVERE, null, ex);
                                Logger.getLogger(ex.getMessage());
                            }
                        }
                        break;
                        case 2: {
                            try {
                                System.out.println("El area de la piramide equivale a "
                                        + piramide.calcularArea());
                            } catch (InputMismatchException ex) {
                                System.out.println("No se han introducido los "
                                        + "valores correctamente y la operación"
                                        + "no se puede ejecutar de forma correcta"
                                        + "intentalo de nuevo");
                            }
                        }
                        break;
                        case 3:
                            piramide.imprimirCaracteristicas();
                            break;
                    }
                    break;
                //------------------
                case 2://cubo
                    menuSecundario();
                    opcionMenuSecundario = lector.nextInt();
                    switch (opcionMenuSecundario) {
                        case 1: {
                            try {
                                System.out.println("El volumen equivale a "
                                        + cubo.calcularVolumen());
                            } catch (ExcepcionPersonalizada ex) {
                                Logger.getLogger(Practica6_parte1.class.getName()).log(Level.SEVERE, null, ex);
                                Logger.getLogger(ex.getMessage());
                            }
                        }
                        break;
                        case 2:
                            try {
                                System.out.println("El area equivale a "
                                        + cubo.calcularArea());
                            } catch (InputMismatchException aa) {
                                System.out.println("NO se han introducido los"
                                        + "valores correctamente vuelve a inte"
                                        + "tarlo de nuevo");
                            }
                            break;
                        case 3:
                            cubo.imprimirCaracteristicas();
                            break;
                    }
                    break;

                //--------------
                case 3://esfera
                    menuSecundario();
                    opcionMenuSecundario = lector.nextInt();
                    switch (opcionMenuSecundario) {
                        case 1: {
                            try {
                                System.out.println("El volumen equivale a: "
                                        + esfera.calcularVolumen());
                            } catch (ExcepcionPersonalizada ex) {
                                Logger.getLogger(Practica6_parte1.class.getName()).log(Level.SEVERE, null, ex);
                                Logger.getLogger(ex.getMessage());
                            }
                        }
                        break;
                        case 2:
                            try {
                                System.out.println("El area equivale a: "
                                        + esfera.calcularArea());
                            } catch (InputMismatchException ex) {
                                System.out.println("No se han introducido los"
                                        + "valores correctamente vuelve a inter"
                                        + "ntralo de nuevo");
                            }
                            break;
                        case 3:
                            esfera.imprimirCaracteristicas();
                            break;
                    }
                    break;

                //-------------
                case 4://cilindro
                    menuSecundario();
                    opcionMenuSecundario = lector.nextInt();
                    switch (opcionMenuSecundario) {
                        case 1:
                            try {
                                System.out.println("El volumen del cilindro es "
                                        + cilindro.calcularVolumen());
                            } catch (InputMismatchException ex) {
                                System.out.println("NO se han introducido los"
                                        + "valores correctamente vuelve a inte"
                                        + "tarlo de nuevo");
                            }
                            break;
                        case 2:
                            try {
                                System.out.println("El area del cilindro és de"
                                        + cilindro.calcularArea());
                            } catch (InputMismatchException ex) {
                                System.out.println("No se han introducido los valores"
                                        + "correctamente vuelve a intentarlo de"
                                        + "nuevo");
                            }
                            break;
                    }
                    break;

            }
        }
    }

    public static void menuPrincipal() {
        System.out.println("----------------------------");
        System.out.println("1)Piramide");
        System.out.println("2)Cubo");
        System.out.println("3)Esfera");
        System.out.println("4)Cilindro");
        System.out.println("----------------------------");
        System.out.println("Selecciona una opción:");
    }

    public static void menuSecundario() {
        System.out.println("----------------------------");
        System.out.println("1)Calcular volumen");
        System.out.println("2)Calcular área");
        System.out.println("3)Mostar caracteristicas");
        System.out.println("----------------------------");
        System.out.println("Selecciona una opción:");
    }
}
