/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class Vendedor extends Persona{
    private int idempleado;
    private String departamento,comision;

    public Vendedor(int idempleado, String departamento, String comision, String nombre, int ci, int edad) {
        super(nombre, ci, edad);
        this.idempleado = idempleado;
        this.departamento = departamento;
        this.comision = comision;
    }

    public int getIdempleado() {
        return idempleado;
    }

    public void setIdempleado(int idempleado) {
        this.idempleado = idempleado;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getComision() {
        return comision;
    }

    public void setComision(String comision) {
        this.comision = comision;
    }
    public void mostrar(){
        super.mostrar();
        System.out.println(" "+this.getIdempleado()+" "+this.getDepartamento()+" "+this.getComision()+" ");
    }
    
}
