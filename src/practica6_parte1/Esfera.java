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
public class Esfera implements interface1 {

    private double radio;
    Scanner lector = new Scanner(System.in);

    public Esfera() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    
    @Override
    public double calcularArea() throws InputMismatchException {
        double radio;
        double area;
        System.out.println("Introduce el radio de la esfera");
        System.out.println(Math.pow(2.5, 2));
        radio = lector.nextDouble();
        area = 4 * Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularVolumen () throws ExcepcionPersonalizada{
        double radio;
        double volumen=0;
        try {
            System.out.println("Introduce el radio de la esfera");
            radio = lector.nextDouble();
            if(radio<=0){
                throw new ExcepcionPersonalizada();
            }
            volumen = (4 * (Math.PI * Math.pow(radio, 3))) / 3;

        } catch (InputMismatchException ex) {
            lector.next();
            System.out.println("Introduce el radio de nuevo");
            radio=lector.nextDouble();
            volumen = (4 * (Math.PI * Math.pow(radio, 3))) / 3;
        }
        return volumen;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("En geometría, una superficie esférica es una superficie"
                + " de revolución formada por el conjunto de todos los puntos del "
                + "espacio que equidistan de un punto llamado centro.\n"
                + "Para los puntos cuya distancia es menor que la longitud del radio,"
                + " se dice que forman el interior de la superficie esférica. "
                + "La unión del interior y la superficie \n esférica se llama bola "
                + "cerrada en topología, o esfera, como en geometría elemental "
                + "del espacio.1​Obviamente, la esfera es un sólido geométrico.");
    }

}
