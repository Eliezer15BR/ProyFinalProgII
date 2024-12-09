/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class NodoP {
    private Producto pr;
    private NodoP sig,ant;

    public NodoP() {
        sig=ant=null;
    }

    public Producto getPr() {
        return pr;
    }

    public void setPr(Producto pr) {
        this.pr = pr;
    }

    public NodoP getSig() {
        return sig;
    }

    public void setSig(NodoP sig) {
        this.sig = sig;
    }

    public NodoP getAnt() {
        return ant;
    }

    public void setAnt(NodoP ant) {
        this.ant = ant;
    }
    
    
}
