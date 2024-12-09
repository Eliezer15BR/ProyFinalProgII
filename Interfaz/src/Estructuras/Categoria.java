/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Estructuras;

/**
 *
 * @author USUARIO
 */
public class Categoria {
    private Producto pr;
    private String tipo;

    public Categoria(Producto pr, String tipo) {
        this.pr = pr;
        this.tipo = tipo;
    }

    public Producto getPr() {
        return pr;
    }

    public void setPr(Producto pr) {
        this.pr = pr;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
}
