/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class LSimpleC {
    private NodoC p;

    public LSimpleC() {
        p=null;
    }

    public NodoC getP() {
        return p;
    }

    public void setP(NodoC p) {
        this.p = p;
    }
    public void adicionar(Categoria a){
        NodoC nue=new NodoC();
        nue.setPr(a);
        if(getP()==null)
            setP(nue);
        else{
            NodoC r=new NodoC();
            while(r.getSig()!=null)
                r=r.getSig();
            r.setSig(nue);
        }
    }
    public void mostrar(){
        NodoC r=getP();
        while(r!=null) {
            System.out.println(" "+r.getPr().getTipo()+" ");
            r.getPr().getPr().mostrar();
            r=r.getSig();
        }
    }
}
