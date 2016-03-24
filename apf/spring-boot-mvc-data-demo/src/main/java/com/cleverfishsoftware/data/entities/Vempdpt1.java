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
    @NamedQuery(name = "Vempdpt1.findAll", query = "SELECT v FROM Vempdpt1 v"),
    @NamedQuery(name = "Vempdpt1.findByDeptno", query = "SELECT v FROM Vempdpt1 v WHERE v.deptno = :deptno"),
    @NamedQuery(name = "Vempdpt1.findByDeptname", query = "SELECT v FROM Vempdpt1 v WHERE v.deptname = :deptname"),
    @NamedQuery(name = "Vempdpt1.findByEmpno", query = "SELECT v FROM Vempdpt1 v WHERE v.empno = :empno"),
    @NamedQuery(name = "Vempdpt1.findByFrstinit", query = "SELECT v FROM Vempdpt1 v WHERE v.frstinit = :frstinit"),
    @NamedQuery(name = "Vempdpt1.findByMidinit", query = "SELECT v FROM Vempdpt1 v WHERE v.midinit = :midinit"),
    @NamedQuery(name = "Vempdpt1.findByLastname", query = "SELECT v FROM Vempdpt1 v WHERE v.lastname = :lastname"),
    @NamedQuery(name = "Vempdpt1.findByWorkdept", query = "SELECT v FROM Vempdpt1 v WHERE v.workdept = :workdept")})
public class Vempdpt1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Size(max = 3)
    @Column(length = 3)
    private String deptno;
    @Size(max = 36)
    @Column(length = 36)
    private String deptname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String empno;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private Character frstinit;
    private Character midinit;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(nullable = false, length = 15)
    private String lastname;
    @Size(max = 3)
    @Column(length = 3)
    private String workdept;

    public Vempdpt1() {
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

    public String getEmpno() {
        return empno;
    }

    public void setEmpno(String empno) {
        this.empno = empno;
    }

    public Character getFrstinit() {
        return frstinit;
    }

    public void setFrstinit(Character frstinit) {
        this.frstinit = frstinit;
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

    public String getWorkdept() {
        return workdept;
    }

    public void setWorkdept(String workdept) {
        this.workdept = workdept;
    }
    
}
