/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;

/**
 *
 * @author NataliaPabon
 */
public class EstacionMet {

    private String NombreE;
    private String Ubicacion;
    private String FechaIn;
    private Sensor[] sensores;
    private ArrayList<Mediciones> mediciones;

    public EstacionMet(String NombreE, ArrayList<Mediciones> datos) {
        this.NombreE = NombreE;
        this.mediciones = datos;
    }

    public EstacionMet(String NombreE, String Ubicacion, String FechaIn, ArrayList<Mediciones> datos, Sensor[] sensores) {
        this(NombreE, datos);
        this.sensores = sensores;
        this.Ubicacion = Ubicacion;
        this.FechaIn = FechaIn;
    }

    public void informacion() {
        sensores[0].toString();
        sensores[1].toString();
        sensores[2].toString();
    }

    public double PromedioAT() {
        double promedioT = 0;
        for (int k = 0; k < mediciones.size(); k++) {
            promedioT += mediciones.get(k).getTemperatura();
        }
        promedioT = promedioT / mediciones.size();
        return promedioT;
    }

    public double PromedioCA() {
        double PromedioCA = 0;
        for (int k = 0; k < mediciones.size(); k++) {
            PromedioCA += mediciones.get(k).getMilimetrosDeAgua();
        }
        PromedioCA = PromedioCA / mediciones.size();
        return PromedioCA;

    }

    public double PromedioNEL() {
        double PromedioNEL = 0;
        for (int k = 0; k < mediciones.size(); k++) {
            PromedioNEL += mediciones.get(k).getNivelDeCarga();
        }
        PromedioNEL = PromedioNEL / mediciones.size();
        return PromedioNEL;
    }

    public ArrayList<Mediciones> getDatos() {
        return mediciones;
    }

    public void setDatos(ArrayList<Mediciones> datos) {
        this.mediciones = datos;
    }

    public Sensor[] getSensores() {
        return sensores;
    }

    public void setSensores(Sensor[] sensores) {
        this.sensores = sensores;
    }

    public String getNombreE() {
        return NombreE;
    }

    public void setNombreE(String NombreE) {
        this.NombreE = NombreE;
    }

    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public String getFechaIn() {
        return FechaIn;
    }

    public void setFechaIn(String FechaIn) {
        this.FechaIn = FechaIn;
    }

    @Override
    public String toString() {
        return "EstacionMet{" + "NombreE=" + NombreE + ", Ubicacion=" + Ubicacion + ", FechaIn=" + FechaIn + ", sensores=" + sensores + '}';
    }

}
