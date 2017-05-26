/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

/**
 *
 * @author NataliaPabon
 */
public class NSensores extends Exception {

    public NSensores() {
        super("El numero de sensores debe ser 3");
    }
}
