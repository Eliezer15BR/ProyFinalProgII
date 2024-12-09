/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class NodoC {
    private Categoria pr;
    private NodoC sig;
    public NodoC(){
        sig=null;
    }

    public Categoria getPr() {
        return pr;
    }

    public void setPr(Categoria pr) {
        this.pr = pr;
    }

    public NodoC getSig() {
        return sig;
    }

    public void setSig(NodoC sig) {
        this.sig = sig;
    }
    
}
