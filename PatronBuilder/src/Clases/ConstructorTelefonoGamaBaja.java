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
public class ConstructorTelefonoGamaBaja extends BuilderTelefono {
     public ConstructorTelefonoGamaBaja() {
    }
    // ------------------------------
    @Override
     public void instalarProcesador() {
        this.telef.setProcesador( "Procesador DualCore" );
    }
    // ------------------------------
    @Override
     public void instalarCarcasa() {
        this.telef.setCarcasa( "Carcasa calidad baja " );
    }
    // ------------------------------
    @Override
     public void instalarNPU() {
        this.telef.setGpu( false );
    }
    // ------------------------------
    @Override
     public void instalarGPU() {
        this.telef.setNpu( false );
    }
}
