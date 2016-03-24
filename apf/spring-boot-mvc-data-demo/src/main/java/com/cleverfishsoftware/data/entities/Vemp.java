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
    @NamedQuery(name = "Vemp.findAll", query = "SELECT v FROM Vemp v"),
    @NamedQuery(name = "Vemp.findByEmpno", query = "SELECT v FROM Vemp v WHERE v.empno = :empno"),
    @NamedQuery(name = "Vemp.findByFirstnme", query = "SELECT v FROM Vemp v WHERE v.firstnme = :firstnme"),
    @NamedQuery(name = "Vemp.findByMidinit", query = "SELECT v FROM Vemp v WHERE v.midinit = :midinit"),
    @NamedQuery(name = "Vemp.findByLastname", query = "SELECT v FROM Vemp v WHERE v.lastname = :lastname"),
    @NamedQuery(name = "Vemp.findByWorkdept", query = "SELECT v FROM Vemp v WHERE v.workdept = :workdept")})
public class Vemp implements Serializable {

    private static final long serialVersionUID = 1L;
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
    @Size(max = 3)
    @Column(length = 3)
    private String workdept;

    public Vemp() {
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

    public String getWorkdept() {
        return workdept;
    }

    public void setWorkdept(String workdept) {
        this.workdept = workdept;
    }
    
}
