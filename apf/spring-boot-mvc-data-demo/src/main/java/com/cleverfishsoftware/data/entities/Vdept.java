/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cleverfishsoftware.data.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author peter
 */
@Entity
@Table(catalog = "", schema = "DB2INST1")
@NamedQueries({
    @NamedQuery(name = "Vdept.findAll", query = "SELECT v FROM Vdept v"),
    @NamedQuery(name = "Vdept.findByDeptno", query = "SELECT v FROM Vdept v WHERE v.deptno = :deptno"),
    @NamedQuery(name = "Vdept.findByDeptname", query = "SELECT v FROM Vdept v WHERE v.deptname = :deptname"),
    @NamedQuery(name = "Vdept.findByMgrno", query = "SELECT v FROM Vdept v WHERE v.mgrno = :mgrno"),
    @NamedQuery(name = "Vdept.findByAdmrdept", query = "SELECT v FROM Vdept v WHERE v.admrdept = :admrdept")})
public class Vdept implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String deptno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(nullable = false, length = 36)
    private String deptname;
    @Size(max = 6)
    @Column(length = 6)
    private String mgrno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String admrdept;

    public Vdept() {
    }

    public String getDeptno() {
        return deptno;
    }

    public void setDeptno(String deptno) {
        this.deptno = deptno;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }

    public String getMgrno() {
        return mgrno;
    }

    public void setMgrno(String mgrno) {
        this.mgrno = mgrno;
    }

    public String getAdmrdept() {
        return admrdept;
    }

    public void setAdmrdept(String admrdept) {
        this.admrdept = admrdept;
    }
    
}
