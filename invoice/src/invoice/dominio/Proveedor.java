/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package invoice.dominio;

/**
 *
 * @author Andres
 */
public class Proveedor {
    private int codigo;
    private String denominacion;
    private int telefono;
    private String mail;

    public Proveedor() {
        super();
    }

    public Proveedor(int codigo, String denominacion, int telefono, String mail) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.telefono = telefono;
        this.mail = mail;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDenominacion() {
        return denominacion;
    }

    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }
    
    
}
