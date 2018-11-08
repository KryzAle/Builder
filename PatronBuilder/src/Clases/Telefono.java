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
public class Telefono {
    private String procesador = "";
    private String carcasa = "";
    private Boolean npu = false;
    private Boolean gpu = false;
    // -------------------------------------------
    public Telefono() {
    }
    // -------------------------------------------
    public String getProcesador() {
        return this.procesador;
    }
    // -------------------------------------------
    public void setProcesador(String motor) {
        this.procesador = motor;
    }
    // -------------------------------------------
    public String getCarcasa() {
        return this.carcasa;
    }
    // -------------------------------------------
    public void setCarcasa(String carroceria) {
        this.carcasa = carroceria;
    }
    // -------------------------------------------
    public Boolean getNpu() {
        return npu;
    }
    // -------------------------------------------
    public void setNpu(Boolean npu) {
        this.npu = npu;
    }
    // -------------------------------------------
    public Boolean getGpu() {
        return gpu;
    }
    // -------------------------------------------
    public void setGpu(Boolean gpu) {
        this.gpu = gpu;
    }
}
