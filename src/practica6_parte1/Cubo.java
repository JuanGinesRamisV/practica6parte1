/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6_parte1;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author juang
 */
public class Cubo implements interface1{
    private double costado;
    private Scanner lector = new Scanner(System.in);

    public Cubo() {
    }

    public double getCostado() {
        return costado;
    }

    public void setCostado(double costado) {
        this.costado = costado;
    }

    @Override
    public double calcularArea() throws InputMismatchException {
        double lado;
        double area=0;
        System.out.println("Introduce el lado del cubo");
        lado=lector.nextDouble();
        area=(lado*lado)*6;
        return area;
        }

    @Override
    public double calcularVolumen() throws ExcepcionPersonalizada {
        double lado;
        double area=0;
        try{
            System.out.println("Intoduce el lado del cubo");
            lado=lector.nextDouble();
            if(lado<=0){
                throw new ExcepcionPersonalizada();
            }
            area=Math.pow(lado, 3);
        }catch(InputMismatchException ex){
            lector.next();
            System.out.println("Introduce de nuevo el lado del cubo");
            lado=lector.nextDouble();
            area=Math.pow(lado,3);
        }
        return area;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("El cubo es un cuerpo geométrico que forma parte de "
                + "la geometría espacial. Se lo caracteriza como un poliedro "
                + "(hexaedro regular) o un paralelepípedo \n rectangular u ortoedro"
                + " con todas las caras y aristas congruentes y perpendiculares "
                + "(a = b = c).");
        }
    
    

    
}
