package Clases;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kryz Ale
 */
public abstract class BuilderTelefono {
    protected Telefono telef;
    // ------------------------------
    public Telefono getTelefono() {
        return this.telef;
    }
    // ------------------------------
     public void crearNuevoTelefono() {
        this.telef = new Telefono();
    }
    // ------------------------------------
    // Métodos que deberán ser construídos por las clases que hereden de ésta
     public abstract void instalarProcesador();
     public abstract void instalarCarcasa();
     public abstract void instalarNPU();
     public abstract void instalarGPU();
}
