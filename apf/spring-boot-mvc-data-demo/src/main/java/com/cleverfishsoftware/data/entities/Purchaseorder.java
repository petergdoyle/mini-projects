/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cleverfishsoftware.data.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author peter
 */
@Entity
@Table(catalog = "", schema = "DB2INST1")
@NamedQueries({
    @NamedQuery(name = "Purchaseorder.findAll", query = "SELECT p FROM Purchaseorder p"),
    @NamedQuery(name = "Purchaseorder.findByPoid", query = "SELECT p FROM Purchaseorder p WHERE p.poid = :poid"),
    @NamedQuery(name = "Purchaseorder.findByStatus", query = "SELECT p FROM Purchaseorder p WHERE p.status = :status"),
    @NamedQuery(name = "Purchaseorder.findByOrderdate", query = "SELECT p FROM Purchaseorder p WHERE p.orderdate = :orderdate"),
    @NamedQuery(name = "Purchaseorder.findByComments", query = "SELECT p FROM Purchaseorder p WHERE p.comments = :comments")})
public class Purchaseorder implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Long poid;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(nullable = false, length = 10)
    private String status;
    @Temporal(TemporalType.DATE)
    private Date orderdate;
    @Lob
    private Object porder;
    @Size(max = 1000)
    @Column(length = 1000)
    private String comments;
    @JoinColumn(name = "CUSTID", referencedColumnName = "CID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customer custid;

    public Purchaseorder() {
    }

    public Purchaseorder(Long poid) {
        this.poid = poid;
    }

    public Purchaseorder(Long poid, String status) {
        this.poid = poid;
        this.status = status;
    }

    public Long getPoid() {
        return poid;
    }

    public void setPoid(Long poid) {
        this.poid = poid;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getOrderdate() {
        return orderdate;
    }

    public void setOrderdate(Date orderdate) {
        this.orderdate = orderdate;
    }

    public Object getPorder() {
        return porder;
    }

    public void setPorder(Object porder) {
        this.porder = porder;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Customer getCustid() {
        return custid;
    }

    public void setCustid(Customer custid) {
        this.custid = custid;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (poid != null ? poid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Purchaseorder)) {
            return false;
        }
        Purchaseorder other = (Purchaseorder) object;
        if ((this.poid == null && other.poid != null) || (this.poid != null && !this.poid.equals(other.poid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cleverfishsoftware.data.entities.Purchaseorder[ poid=" + poid + " ]";
    }
    
}
