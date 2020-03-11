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
public class Cilindro implements interface1 {

    private double radio;
    private double altura;

    public Cilindro() {
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() throws InputMismatchException {
        Scanner lector = new Scanner(System.in);
        double radio;
        double altura;
        double area;
        System.out.println("Introduce el radio del cilindro");
        radio = lector.nextDouble();
        System.out.println("Introduce la altura del cilindro");
        altura = lector.nextDouble();
        area = 2 * Math.PI * radio * (radio + altura);
        return area;
    }

    @Override
    public double calcularVolumen() throws ExcepcionPersonalizada {
        Scanner lector = new Scanner(System.in);
        double radio;
        double altura;
        double volumen;
        System.out.println("Introoduce el radio del cilindro: ");
        radio=lector.nextDouble();
        System.out.println("Introduce la altura del cilindro: ");
        altura = lector.nextDouble();
        if(altura<=0 || radio<=0){
            throw new ExcepcionPersonalizada();
        }
        volumen= Math.PI*Math.pow(radio, 2)*altura;
        return volumen;
    }

    @Override
    public void imprimirCaracteristicas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
