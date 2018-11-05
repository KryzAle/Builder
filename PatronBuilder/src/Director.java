/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kryz Ale
 */
public class Director {
     public Director() {
    }
    // --------------------------
     public void construir( BuilderCoche builder )
    {
        builder.crearNuevoCoche();
        builder.construirMotor();
        builder.construirCarroceria();
        builder.construirElevalunas();
        builder.construirAireAcond();
    }
}
