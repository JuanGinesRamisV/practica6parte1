/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6_parte1;

import java.util.InputMismatchException;

/**
 *
 * @author juang
 */
public interface interface1 {
    public double calcularArea () throws InputMismatchException;
    public double calcularVolumen() throws ExcepcionPersonalizada;
    void imprimirCaracteristicas();
}