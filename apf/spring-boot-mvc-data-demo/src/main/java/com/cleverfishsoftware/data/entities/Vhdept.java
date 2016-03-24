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
    @NamedQuery(name = "Vhdept.findAll", query = "SELECT v FROM Vhdept v"),
    @NamedQuery(name = "Vhdept.findByDeptno", query = "SELECT v FROM Vhdept v WHERE v.deptno = :deptno"),
    @NamedQuery(name = "Vhdept.findByDeptname", query = "SELECT v FROM Vhdept v WHERE v.deptname = :deptname"),
    @NamedQuery(name = "Vhdept.findByMgrno", query = "SELECT v FROM Vhdept v WHERE v.mgrno = :mgrno"),
    @NamedQuery(name = "Vhdept.findByAdmrdept", query = "SELECT v FROM Vhdept v WHERE v.admrdept = :admrdept"),
    @NamedQuery(name = "Vhdept.findByLocation", query = "SELECT v FROM Vhdept v WHERE v.location = :location")})
public class Vhdept implements Serializable {

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
    @Size(max = 16)
    @Column(length = 16)
    private String location;

    public Vhdept() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
}
