/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class LDobleCircularV {
    private NodoV p;

    public LDobleCircularV() {
        p=null;
    }

    public NodoV getP() {
        return p;
    }

    public void setP(NodoV p) {
        this.p = p;
    }
    public void adicionar(Vendedor a){
        NodoV nue=new NodoV();
        nue.setVe(a);
        if(getP()==null){
            setP(nue);
            nue.setAnt(nue);
            nue.setSig(nue);
        }
        else{
            NodoV r=getP();
            NodoV fin=r.getAnt();
            fin.setSig(nue);
            nue.setAnt(fin);
            r.setAnt(nue);
            nue.setSig(r);
        }
    }
    public void mostrar(){
        NodoV r=getP();
        if(r!=null){
            do{
                r.getVe().mostrar();
                r=r.getSig();
            }while(r!=getP());
        }
    }
    
}
