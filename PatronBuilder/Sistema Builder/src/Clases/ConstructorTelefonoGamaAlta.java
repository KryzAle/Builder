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
public class ConstructorTelefonoGamaAlta extends BuilderTelefono{
    public ConstructorTelefonoGamaAlta() {
    }
    // ------------------------------
    @Override
     public void instalarProcesador() {
        this.telef.setProcesador( "Procesador OctaCore" );
    }
    // ------------------------------
    @Override
     public void instalarCarcasa() {
        this.telef.setCarcasa( "Carcasa calidad Alta" );
    }
    // ------------------------------
    @Override
     public void instalarNPU() {
        this.telef.setGpu( true );
    }
    // ------------------------------
    @Override
     public void instalarGPU() {
        this.telef.setNpu( true);
    }
}
