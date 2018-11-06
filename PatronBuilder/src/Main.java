/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kryz Ale
 */
public class Main
{
    public static void main(String[] args)
    {
        // Crear el objeto Director
         Director objetoFabrica = new Director();
        // Crear los objetos ConcreteBuilder
         BuilderTelefono gamaBaja  = new ConstructorTelefonoGamaBaja();
         BuilderTelefono gamaMedia = new ConstructorTelefonoGamaMedia();
         BuilderTelefono gamaAlta  = new ConstructorTelefonoGamaAlta();
        // Construir un coche con equipamiento base
         objetoFabrica.construir( gamaBaja );
         Telefono telefonogamabaja = gamaBaja.getTelefono();
        // Construir un coche con equipamiento medio
        objetoFabrica.construir( gamaMedia );
        Telefono telefonogamamedia = gamaMedia.getTelefono();
        // Construir un coche con equipamiento full
        objetoFabrica.construir( gamaAlta );
        Telefono telefonogamaalta = gamaAlta.getTelefono();
        // Mostrar la información de cada coche creado
        mostrarCaracteristicas( telefonogamabaja );
        mostrarCaracteristicas( telefonogamamedia );
        mostrarCaracteristicas( telefonogamaalta );
    }
    // --------------------------------
    public static void mostrarCaracteristicas( Telefono telef )
    {
        System.out.println( "Procesador: " + telef.getProcesador() );
        System.out.println( "Carcasa: " + telef.getCarcasa() );
        System.out.println( "NPU: " + telef.getNpu() );
        System.out.println( "GPU: " + telef.getGpu() );
    }
}
