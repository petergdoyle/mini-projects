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
    @NamedQuery(name = "Vproj.findAll", query = "SELECT v FROM Vproj v"),
    @NamedQuery(name = "Vproj.findByProjno", query = "SELECT v FROM Vproj v WHERE v.projno = :projno"),
    @NamedQuery(name = "Vproj.findByProjname", query = "SELECT v FROM Vproj v WHERE v.projname = :projname"),
    @NamedQuery(name = "Vproj.findByDeptno", query = "SELECT v FROM Vproj v WHERE v.deptno = :deptno"),
    @NamedQuery(name = "Vproj.findByRespemp", query = "SELECT v FROM Vproj v WHERE v.respemp = :respemp"),
    @NamedQuery(name = "Vproj.findByPrstaff", query = "SELECT v FROM Vproj v WHERE v.prstaff = :prstaff"),
    @NamedQuery(name = "Vproj.findByPrstdate", query = "SELECT v FROM Vproj v WHERE v.prstdate = :prstdate"),
    @NamedQuery(name = "Vproj.findByPrendate", query = "SELECT v FROM Vproj v WHERE v.prendate = :prendate"),
    @NamedQuery(name = "Vproj.findByMajproj", query = "SELECT v FROM Vproj v WHERE v.majproj = :majproj")})
public class Vproj implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String projno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(nullable = false, length = 24)
    private String projname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String deptno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String respemp;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(precision = 5, scale = 2)
    private BigDecimal prstaff;
    @Temporal(TemporalType.DATE)
    private Date prstdate;
    @Temporal(TemporalType.DATE)
    private Date prendate;
    @Size(max = 6)
    @Column(length = 6)
    private String majproj;

    public Vproj() {
    }

    public String getProjno() {
        return projno;
    }

    public void setProjno(String projno) {
        this.projno = projno;
    }

    public String getProjname() {
        return projname;
    }

    public void setProjname(String projname) {
        this.projname = projname;
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getRespemp() {
        return respemp;
    }

    public void setRespemp(String respemp) {
        this.respemp = respemp;
    }

    public BigDecimal getPrstaff() {
        return prstaff;
    }

    public void setPrstaff(BigDecimal prstaff) {
        this.prstaff = prstaff;
    }

    public Date getPrstdate() {
        return prstdate;
    }

    public void setPrstdate(Date prstdate) {
        this.prstdate = prstdate;
    }

    public Date getPrendate() {
        return prendate;
    }

    public void setPrendate(Date prendate) {
        this.prendate = prendate;
    }

    public String getMajproj() {
        return majproj;
    }

    public void setMajproj(String majproj) {
        this.majproj = majproj;
    }
    
}
