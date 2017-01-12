/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin14;

/**
 *
 * @author otorradomiguez
 */
public class TempErroException extends Exception {

    public TempErroException() {
        super("La temperatura debe ser superior a 80ºC");
    }
}
