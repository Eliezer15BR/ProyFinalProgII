/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class LDobleP {
    private NodoP p;

    public LDobleP() {
        p=null;
    }

    public NodoP getP() {
        return p;
    }

    public void setP(NodoP p) {
        this.p = p;
    }
    public void adicionar(Producto a){
        NodoP nue=new NodoP();
        nue.setPr(a);
        if(getP()==null)
            setP(nue);
        else{
            NodoP r=getP();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
            nue.setAnt(r);
        }
    }
    public void mostrar(){
        NodoP r=getP();
        while(r!=null){
            r.getPr().mostrar();
            r=r.getSig();
        }
    }
    
    
}
