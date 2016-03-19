/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cleverfishsoftware.data.entities;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
    @NamedQuery(name = "Vprojact.findAll", query = "SELECT v FROM Vprojact v"),
    @NamedQuery(name = "Vprojact.findByProjno", query = "SELECT v FROM Vprojact v WHERE v.projno = :projno"),
    @NamedQuery(name = "Vprojact.findByActno", query = "SELECT v FROM Vprojact v WHERE v.actno = :actno"),
    @NamedQuery(name = "Vprojact.findByAcstaff", query = "SELECT v FROM Vprojact v WHERE v.acstaff = :acstaff"),
    @NamedQuery(name = "Vprojact.findByAcstdate", query = "SELECT v FROM Vprojact v WHERE v.acstdate = :acstdate"),
    @NamedQuery(name = "Vprojact.findByAcendate", query = "SELECT v FROM Vprojact v WHERE v.acendate = :acendate")})
public class Vprojact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String projno;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private short actno;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 5, scale = 2)
    private BigDecimal acstaff;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date acstdate;
    @Temporal(TemporalType.DATE)
    private Date acendate;

    public Vprojact() {
    }

    public String getProjno() {
        return projno;
    }

    public void setProjno(String projno) {
        this.projno = projno;
    }

    public short getActno() {
        return actno;
    }

    public void setActno(short actno) {
        this.actno = actno;
    }

    public BigDecimal getAcstaff() {
        return acstaff;
    }

    public void setAcstaff(BigDecimal acstaff) {
        this.acstaff = acstaff;
    }

    public Date getAcstdate() {
        return acstdate;
    }

    public void setAcstdate(Date acstdate) {
        this.acstdate = acstdate;
    }

    public Date getAcendate() {
        return acendate;
    }

    public void setAcendate(Date acendate) {
        this.acendate = acendate;
    }
    
}
