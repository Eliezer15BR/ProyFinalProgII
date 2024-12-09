/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class Comprador extends Persona{
    private int totalGasto;
    private PilaCom pc;

    public Comprador(int totalGasto, PilaCom pc, String nombre, int ci, int edad) {
        super(nombre, ci, edad);
        this.totalGasto = totalGasto;
        this.pc = pc;
    }
    

    public int getTotalGasto() {
        return totalGasto;
    }

    public void setTotalGasto(int totalGasto) {
        this.totalGasto = totalGasto;
    }

    public PilaCom getPc() {
        return pc;
    }

    public void setPc(PilaCom pc) {
        this.pc = pc;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(" "+this.getTotalGasto());
        this.pc.mostrar();
    }
     
}
