/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.persistence;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author ohernandez
 */
@Entity
@Table(name = "producto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Producto.findAll", query = "SELECT p FROM Producto p")})
public class Producto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "pk_id_producto")
    private Integer pkIdProducto;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "nombre_producto")
    private String nombreProducto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad")
    private int cantidad;
    @JoinColumn(name = "fk_id_tipo", referencedColumnName = "pk_id_tipo")
    @ManyToOne(optional = false)
    private TipoProducto fkIdTipo;

    public Producto() {
    }

    public Producto(Integer pkIdProducto) {
        this.pkIdProducto = pkIdProducto;
    }

    public Producto(Integer pkIdProducto, String nombreProducto, int cantidad) {
        this.pkIdProducto = pkIdProducto;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
    }

    public Integer getPkIdProducto() {
        return pkIdProducto;
    }

    public void setPkIdProducto(Integer pkIdProducto) {
        this.pkIdProducto = pkIdProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public TipoProducto getFkIdTipo() {
        return fkIdTipo ;
    }

    public void setFkIdTipo(TipoProducto fkIdTipo) {
        this.fkIdTipo = fkIdTipo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (pkIdProducto != null ? pkIdProducto.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Producto)) {
            return false;
        }
        Producto other = (Producto) object;
        return !((this.pkIdProducto == null && other.pkIdProducto != null) || (this.pkIdProducto != null && !this.pkIdProducto.equals(other.pkIdProducto)));
    }

    @Override
    public String toString() {
        return this.nombreProducto;
    }
    
}
