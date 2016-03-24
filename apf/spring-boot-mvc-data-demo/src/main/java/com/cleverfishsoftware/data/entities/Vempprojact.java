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
    @NamedQuery(name = "Vempprojact.findAll", query = "SELECT v FROM Vempprojact v"),
    @NamedQuery(name = "Vempprojact.findByEmpno", query = "SELECT v FROM Vempprojact v WHERE v.empno = :empno"),
    @NamedQuery(name = "Vempprojact.findByProjno", query = "SELECT v FROM Vempprojact v WHERE v.projno = :projno"),
    @NamedQuery(name = "Vempprojact.findByActno", query = "SELECT v FROM Vempprojact v WHERE v.actno = :actno"),
    @NamedQuery(name = "Vempprojact.findByEmptime", query = "SELECT v FROM Vempprojact v WHERE v.emptime = :emptime"),
    @NamedQuery(name = "Vempprojact.findByEmstdate", query = "SELECT v FROM Vempprojact v WHERE v.emstdate = :emstdate"),
    @NamedQuery(name = "Vempprojact.findByEmendate", query = "SELECT v FROM Vempprojact v WHERE v.emendate = :emendate")})
public class Vempprojact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String empno;
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
    private BigDecimal emptime;
    @Temporal(TemporalType.DATE)
    private Date emstdate;
    @Temporal(TemporalType.DATE)
    private Date emendate;

    public Vempprojact() {
    }

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
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

    public BigDecimal getEmptime() {
        return emptime;
    }

    public void setEmptime(BigDecimal emptime) {
        this.emptime = emptime;
    }

    public Date getEmstdate() {
        return emstdate;
    }

    public void setEmstdate(Date emstdate) {
        this.emstdate = emstdate;
    }

    public Date getEmendate() {
        return emendate;
    }

    public void setEmendate(Date emendate) {
        this.emendate = emendate;
    }
    
}
