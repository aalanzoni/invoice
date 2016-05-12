/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package invoice.dominio;

import java.math.BigInteger;
import java.sql.Date;

/**
 *
 * @author Andres
 */
public class Factura {
    private Date fecha;
    private Codigo codigo;
    private String letra;
    private BigInteger numero;
    private float importe;
    private float descuento;
    private float neto;

    public Factura() {
        super();
    }

    public Factura(Date fecha, Codigo codigo, String letra, BigInteger numero, float importe, float descuento, float neto) {
        this.fecha = fecha;
        this.codigo = codigo;
        this.letra = letra;
        this.numero = numero;
        this.importe = importe;
        this.descuento = descuento;
        this.neto = neto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Codigo getCodigo() {
        return codigo;
    }

    public void setCodigo(Codigo codigo) {
        this.codigo = codigo;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public BigInteger getNumero() {
        return numero;
    }

    public void setNumero(BigInteger numero) {
        this.numero = numero;
    }

    public float getImporte() {
        return importe;
    }

    public void setImporte(float importe) {
        this.importe = importe;
    }

    public float getDescuento() {
        return descuento;
    }

    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    public float getNeto() {
        return neto;
    }

    public void setNeto(float neto) {
        this.neto = neto;
    }
    
    
    
}
