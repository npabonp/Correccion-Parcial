/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Logica.BaseDeDatos;
import Logica.Ciudad;

import Logica.EstacionMet;
import Logica.MilimetrosA;
import Logica.NivelCE;
import Logica.Sensor;
import Logica.TemperaturaA;
import Logica.UIM;
import java.io.*;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author NataliaPabon
 */
public class Main {

    public static void MostrarPromedios() {
        for (Ciudad ciudad : BaseDeDatos.ciudades) {
            for (EstacionMet estacion : ciudad.getEstaciones()) {
                System.out.println(estacion.PromedioAT() + " " + estacion.PromedioCA() + " " + estacion.PromedioNEL());
            }
        }
    }

    public static void main(String[] args) {

        try {
            BaseDeDatos.CargarDatos("Archivo.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Elija una opcion");
        System.out.println("1.Registrar nuevas estaciones");
        System.out.println("2.Ver promedio de  los datos de los sensores");
        Scanner leer = new Scanner(System.in);
        int opcion = leer.nextInt();
        if (opcion == 1) {
            BaseDeDatos.leerNuevasEstaciones();
        }
        if (opcion == 2) {
            MostrarPromedios();
        }
    }
}
