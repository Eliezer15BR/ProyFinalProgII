/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class Compra {
    private Producto pr;
    private int idCompra;
    private String metodo_pago;

    public Compra() {
    }
    
    
    public Compra(Producto pr, int idCompra, String metodo_pago) {
        this.pr = pr;
        this.idCompra = idCompra;
        this.metodo_pago = metodo_pago;
    }

    public Producto getPr() {
        return pr;
    }

    public void setPr(Producto pr) {
        this.pr = pr;
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public String getMetodo_pago() {
        return metodo_pago;
    }

    public void setMetodo_pago(String metodo_pago) {
        this.metodo_pago = metodo_pago;
    }
    public void mostrar(){
        System.out.println(" "+this.getIdCompra()+" "+this.getMetodo_pago()+" ");
        this.getPr().mostrar();
    }
}
