/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class NodoV {
    private Vendedor ve;
    private NodoV sig,ant;

    public NodoV() {
        sig=ant=null;
    }

    public Vendedor getVe() {
        return ve;
    }

    public void setVe(Vendedor ve) {
        this.ve = ve;
    }

    public NodoV getSig() {
        return sig;
    }

    public void setSig(NodoV sig) {
        this.sig = sig;
    }

    public NodoV getAnt() {
        return ant;
    }

    public void setAnt(NodoV ant) {
        this.ant = ant;
    }
    
    
}
