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
    @NamedQuery(name = "Vdepmg1.findAll", query = "SELECT v FROM Vdepmg1 v"),
    @NamedQuery(name = "Vdepmg1.findByDeptno", query = "SELECT v FROM Vdepmg1 v WHERE v.deptno = :deptno"),
    @NamedQuery(name = "Vdepmg1.findByDeptname", query = "SELECT v FROM Vdepmg1 v WHERE v.deptname = :deptname"),
    @NamedQuery(name = "Vdepmg1.findByMgrno", query = "SELECT v FROM Vdepmg1 v WHERE v.mgrno = :mgrno"),
    @NamedQuery(name = "Vdepmg1.findByFirstnme", query = "SELECT v FROM Vdepmg1 v WHERE v.firstnme = :firstnme"),
    @NamedQuery(name = "Vdepmg1.findByMidinit", query = "SELECT v FROM Vdepmg1 v WHERE v.midinit = :midinit"),
    @NamedQuery(name = "Vdepmg1.findByLastname", query = "SELECT v FROM Vdepmg1 v WHERE v.lastname = :lastname"),
    @NamedQuery(name = "Vdepmg1.findByAdmrdept", query = "SELECT v FROM Vdepmg1 v WHERE v.admrdept = :admrdept")})
public class Vdepmg1 implements Serializable {

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
    @Size(max = 12)
    @Column(length = 12)
    private String firstnme;
    private Character midinit;
    @Size(max = 15)
    @Column(length = 15)
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String admrdept;

    public Vdepmg1() {
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

    public String getAdmrdept() {
        return admrdept;
    }

    public void setAdmrdept(String admrdept) {
        this.admrdept = admrdept;
    }
    
}
