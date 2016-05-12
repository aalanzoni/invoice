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
public class Codigo {
    private int clave;
    private String apodo;
    private String nombre;
    private int nro_a;
    private boolean auto_a;
    private int nro_b;    
    private boolean auto_b;

    public Codigo() {
        super();
    }

    public Codigo(int clave, String apodo, String nombre, int nro_a, int nro_b) {
        this.clave = clave;
        this.apodo = apodo;
        this.nombre = nombre;
        this.nro_a = nro_a;
        this.nro_b = nro_b;
    }

    public Codigo(int clave, String apodo, String nombre, int nro_a, boolean auto_a, int nro_b, boolean auto_b) {
        this.clave = clave;
        this.apodo = apodo;
        this.nombre = nombre;
        this.nro_a = nro_a;
        this.auto_a = auto_a;
        this.nro_b = nro_b;
        this.auto_b = auto_b;
    }

    public int getClave() {
        return clave;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNro_a() {
        return nro_a;
    }

    public void setNro_a(int nro_a) {
        this.nro_a = nro_a;
    }

    public boolean isAuto_a() {
        return auto_a;
    }

    public void setAuto_a(boolean auto_a) {
        this.auto_a = auto_a;
    }

    public int getNro_b() {
        return nro_b;
    }

    public void setNro_b(int nro_b) {
        this.nro_b = nro_b;
    }

    public boolean isAuto_b() {
        return auto_b;
    }

    public void setAuto_b(boolean auto_b) {
        this.auto_b = auto_b;
    }
}
