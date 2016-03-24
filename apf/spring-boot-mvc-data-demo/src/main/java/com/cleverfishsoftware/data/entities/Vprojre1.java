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
    @NamedQuery(name = "Vprojre1.findAll", query = "SELECT v FROM Vprojre1 v"),
    @NamedQuery(name = "Vprojre1.findByProjno", query = "SELECT v FROM Vprojre1 v WHERE v.projno = :projno"),
    @NamedQuery(name = "Vprojre1.findByProjname", query = "SELECT v FROM Vprojre1 v WHERE v.projname = :projname"),
    @NamedQuery(name = "Vprojre1.findByProjdep", query = "SELECT v FROM Vprojre1 v WHERE v.projdep = :projdep"),
    @NamedQuery(name = "Vprojre1.findByRespemp", query = "SELECT v FROM Vprojre1 v WHERE v.respemp = :respemp"),
    @NamedQuery(name = "Vprojre1.findByFirstnme", query = "SELECT v FROM Vprojre1 v WHERE v.firstnme = :firstnme"),
    @NamedQuery(name = "Vprojre1.findByMidinit", query = "SELECT v FROM Vprojre1 v WHERE v.midinit = :midinit"),
    @NamedQuery(name = "Vprojre1.findByLastname", query = "SELECT v FROM Vprojre1 v WHERE v.lastname = :lastname"),
    @NamedQuery(name = "Vprojre1.findByMajproj", query = "SELECT v FROM Vprojre1 v WHERE v.majproj = :majproj")})
public class Vprojre1 implements Serializable {

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
    private String projdep;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String respemp;
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
    @Size(max = 6)
    @Column(length = 6)
    private String majproj;

    public Vprojre1() {
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

    public String getProjdep() {
        return projdep;
    }

    public void setProjdep(String projdep) {
        this.projdep = projdep;
    }

    public String getRespemp() {
        return respemp;
    }

    public void setRespemp(String respemp) {
        this.respemp = respemp;
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

    public String getMajproj() {
        return majproj;
    }

    public void setMajproj(String majproj) {
        this.majproj = majproj;
    }
    
}
