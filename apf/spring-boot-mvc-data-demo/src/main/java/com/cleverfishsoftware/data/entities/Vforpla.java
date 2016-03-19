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
    @NamedQuery(name = "Vforpla.findAll", query = "SELECT v FROM Vforpla v"),
    @NamedQuery(name = "Vforpla.findByProjno", query = "SELECT v FROM Vforpla v WHERE v.projno = :projno"),
    @NamedQuery(name = "Vforpla.findByProjname", query = "SELECT v FROM Vforpla v WHERE v.projname = :projname"),
    @NamedQuery(name = "Vforpla.findByRespemp", query = "SELECT v FROM Vforpla v WHERE v.respemp = :respemp"),
    @NamedQuery(name = "Vforpla.findByProjdep", query = "SELECT v FROM Vforpla v WHERE v.projdep = :projdep"),
    @NamedQuery(name = "Vforpla.findByFrstinit", query = "SELECT v FROM Vforpla v WHERE v.frstinit = :frstinit"),
    @NamedQuery(name = "Vforpla.findByMidinit", query = "SELECT v FROM Vforpla v WHERE v.midinit = :midinit"),
    @NamedQuery(name = "Vforpla.findByLastname", query = "SELECT v FROM Vforpla v WHERE v.lastname = :lastname")})
public class Vforpla implements Serializable {

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
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String respemp;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String projdep;
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

    public Vforpla() {
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

    public String getRespemp() {
        return respemp;
    }

    public void setRespemp(String respemp) {
        this.respemp = respemp;
    }

    public String getProjdep() {
        return projdep;
    }

    public void setProjdep(String projdep) {
        this.projdep = projdep;
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
    
}
