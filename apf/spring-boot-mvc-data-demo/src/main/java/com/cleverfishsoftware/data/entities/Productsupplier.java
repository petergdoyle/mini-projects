/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cleverfishsoftware.data.entities;

import java.io.Serializable;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author peter
 */
@Entity
@Table(catalog = "", schema = "DB2INST1")
@NamedQueries({
    @NamedQuery(name = "Productsupplier.findAll", query = "SELECT p FROM Productsupplier p"),
    @NamedQuery(name = "Productsupplier.findByPid", query = "SELECT p FROM Productsupplier p WHERE p.productsupplierPK.pid = :pid"),
    @NamedQuery(name = "Productsupplier.findBySid", query = "SELECT p FROM Productsupplier p WHERE p.productsupplierPK.sid = :sid")})
public class Productsupplier implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProductsupplierPK productsupplierPK;

    public Productsupplier() {
    }

    public Productsupplier(ProductsupplierPK productsupplierPK) {
        this.productsupplierPK = productsupplierPK;
    }

    public Productsupplier(String pid, String sid) {
        this.productsupplierPK = new ProductsupplierPK(pid, sid);
    }

    public ProductsupplierPK getProductsupplierPK() {
        return productsupplierPK;
    }

    public void setProductsupplierPK(ProductsupplierPK productsupplierPK) {
        this.productsupplierPK = productsupplierPK;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (productsupplierPK != null ? productsupplierPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Productsupplier)) {
            return false;
        }
        Productsupplier other = (Productsupplier) object;
        if ((this.productsupplierPK == null && other.productsupplierPK != null) || (this.productsupplierPK != null && !this.productsupplierPK.equals(other.productsupplierPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cleverfishsoftware.data.entities.Productsupplier[ productsupplierPK=" + productsupplierPK + " ]";
    }
    
}
