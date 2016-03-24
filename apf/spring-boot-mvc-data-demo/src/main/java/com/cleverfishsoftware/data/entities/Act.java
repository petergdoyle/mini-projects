/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cleverfishsoftware.data.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author peter
 */
@Entity
@Table(catalog = "", schema = "DB2INST1", uniqueConstraints = {
    @UniqueConstraint(columnNames = {"ACTNO", "ACTKWD"})})
@NamedQueries({
    @NamedQuery(name = "Act.findAll", query = "SELECT a FROM Act a"),
    @NamedQuery(name = "Act.findByActno", query = "SELECT a FROM Act a WHERE a.actno = :actno"),
    @NamedQuery(name = "Act.findByActkwd", query = "SELECT a FROM Act a WHERE a.actkwd = :actkwd"),
    @NamedQuery(name = "Act.findByActdesc", query = "SELECT a FROM Act a WHERE a.actdesc = :actdesc")})
public class Act implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Short actno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String actkwd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String actdesc;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "act1", fetch = FetchType.LAZY)
    private Act act;
    @JoinColumn(name = "ACTNO", referencedColumnName = "ACTNO", nullable = false, insertable = false, updatable = false)
    @OneToOne(optional = false, fetch = FetchType.LAZY)
    private Act act1;

    public Act() {
    }

    public Act(Short actno) {
        this.actno = actno;
    }

    public Act(Short actno, String actkwd, String actdesc) {
        this.actno = actno;
        this.actkwd = actkwd;
        this.actdesc = actdesc;
    }

    public Short getActno() {
        return actno;
    }

    public void setActno(Short actno) {
        this.actno = actno;
    }

    public String getActkwd() {
        return actkwd;
    }

    public void setActkwd(String actkwd) {
        this.actkwd = actkwd;
    }

    public String getActdesc() {
        return actdesc;
    }

    public void setActdesc(String actdesc) {
        this.actdesc = actdesc;
    }

    public Act getAct() {
        return act;
    }

    public void setAct(Act act) {
        this.act = act;
    }

    public Act getAct1() {
        return act1;
    }

    public void setAct1(Act act1) {
        this.act1 = act1;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (actno != null ? actno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Act)) {
            return false;
        }
        Act other = (Act) object;
        if ((this.actno == null && other.actno != null) || (this.actno != null && !this.actno.equals(other.actno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.cleverfishsoftware.data.entities.Act[ actno=" + actno + " ]";
    }
    
}
