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
    @NamedQuery(name = "Vstafac2.findAll", query = "SELECT v FROM Vstafac2 v"),
    @NamedQuery(name = "Vstafac2.findByProjno", query = "SELECT v FROM Vstafac2 v WHERE v.projno = :projno"),
    @NamedQuery(name = "Vstafac2.findByActno", query = "SELECT v FROM Vstafac2 v WHERE v.actno = :actno"),
    @NamedQuery(name = "Vstafac2.findByActdesc", query = "SELECT v FROM Vstafac2 v WHERE v.actdesc = :actdesc"),
    @NamedQuery(name = "Vstafac2.findByEmpno", query = "SELECT v FROM Vstafac2 v WHERE v.empno = :empno"),
    @NamedQuery(name = "Vstafac2.findByFirstnme", query = "SELECT v FROM Vstafac2 v WHERE v.firstnme = :firstnme"),
    @NamedQuery(name = "Vstafac2.findByMidinit", query = "SELECT v FROM Vstafac2 v WHERE v.midinit = :midinit"),
    @NamedQuery(name = "Vstafac2.findByLastname", query = "SELECT v FROM Vstafac2 v WHERE v.lastname = :lastname"),
    @NamedQuery(name = "Vstafac2.findByEmptime", query = "SELECT v FROM Vstafac2 v WHERE v.emptime = :emptime"),
    @NamedQuery(name = "Vstafac2.findByStdate", query = "SELECT v FROM Vstafac2 v WHERE v.stdate = :stdate"),
    @NamedQuery(name = "Vstafac2.findByEndate", query = "SELECT v FROM Vstafac2 v WHERE v.endate = :endate"),
    @NamedQuery(name = "Vstafac2.findByType", query = "SELECT v FROM Vstafac2 v WHERE v.type = :type")})
public class Vstafac2 implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String actdesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String empno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(nullable = false, length = 12)
    private String firstnme;
    private Character midinit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(nullable = false, length = 15)
    private String lastname;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 5, scale = 2)
    private BigDecimal emptime;
    @Temporal(TemporalType.DATE)
    private Date stdate;
    @Temporal(TemporalType.DATE)
    private Date endate;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(nullable = false, length = 1)
    private String type;

    public Vstafac2() {
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

    public String getActdesc() {
        return actdesc;
    }

    public void setActdesc(String actdesc) {
        this.actdesc = actdesc;
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public String getFirstnme() {
        return firstnme;
    }

    public void setFirstnme(String firstnme) {
        this.firstnme = firstnme;
    }

    public Character getMidinit() {
        return midinit;
    }

    public void setMidinit(Character midinit) {
        this.midinit = midinit;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public BigDecimal getEmptime() {
        return emptime;
    }

    public void setEmptime(BigDecimal emptime) {
        this.emptime = emptime;
    }

    public Date getStdate() {
        return stdate;
    }

    public void setStdate(Date stdate) {
        this.stdate = stdate;
    }

    public Date getEndate() {
        return endate;
    }

    public void setEndate(Date endate) {
        this.endate = endate;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
}
