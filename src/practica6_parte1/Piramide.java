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
public class Piramide implements interface1 {
    private double altura;
    private double costado;

    public Piramide() {
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getCostado() {
        return costado;
    }

    public void setCostado(double costado) {
        this.costado = costado;
    }

    @Override
    public double calcularVolumen() throws ExcepcionPersonalizada {
        Scanner lector = new Scanner(System.in);
        double costado = 0;
        double altura = 0;
        double area;
        try {
            System.out.println("Introduce el costado de la piramide:");
            costado = lector.nextDouble();
            if(costado<=0){
                throw new ExcepcionPersonalizada();
            }
            System.out.println("Introduce la altura de la piramide");
            altura = lector.nextDouble();
        } catch (InputMismatchException ex) {
            Scanner lectorAux = new Scanner(System.in);
            System.out.println("Introduce el costado de la piramide");
            costado = lectorAux.nextDouble();
            System.out.println("Introduce la altura de la piramide");
            altura = lectorAux.nextDouble();
        }
        area = ((costado * costado) * altura) / 3;
        return altura;
    }

    @Override
    public void imprimirCaracteristicas() {
        System.out.println("Una pirámide regular es una pirámide recta cuya base"
                + " es un polígono regular. En este tipo de pirámides cada cara"
                + " lateral es un triángulo isósceles igual a los demás, su "
                + "altura se llama apotema de la pirámide.");
        System.out.println("El volumen de la esfera se calcula con la siguiente"
                + "formula (area*altura)/3");
    }

    @Override
    public double calcularArea() throws InputMismatchException {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el lado del cuadrado");
        double lado = lector.nextDouble();
        double area = Math.pow(lado, 2);
        return area;
    }


}