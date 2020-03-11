/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica6_parte1;

/**
 *
 * @author juang
 */
public class ExcepcionPersonalizada extends Exception {

    public ExcepcionPersonalizada() {
        super("el numero no puede ser negativo");
    }

    public ExcepcionPersonalizada(String string) {
        super("el numero no puede ser negativo");
    }

}
