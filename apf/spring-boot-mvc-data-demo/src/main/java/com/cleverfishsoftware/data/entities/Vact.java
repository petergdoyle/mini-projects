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
    @NamedQuery(name = "Vact.findAll", query = "SELECT v FROM Vact v"),
    @NamedQuery(name = "Vact.findByActno", query = "SELECT v FROM Vact v WHERE v.actno = :actno"),
    @NamedQuery(name = "Vact.findByActkwd", query = "SELECT v FROM Vact v WHERE v.actkwd = :actkwd"),
    @NamedQuery(name = "Vact.findByActdesc", query = "SELECT v FROM Vact v WHERE v.actdesc = :actdesc")})
public class Vact implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(nullable = false)
    private short actno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String actkwd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(nullable = false, length = 20)
    private String actdesc;

    public Vact() {
    }

    public short getActno() {
        return actno;
    }

    public void setActno(short actno) {
        this.actno = actno;
    }

    public String getActkwd() {
        return actkwd;
    }

    public void setActkwd(String actkwd) {
        this.actkwd = actkwd;
    }

    public String getActdesc() {
        return actdesc;
    }

    public void setActdesc(String actdesc) {
        this.actdesc = actdesc;
    }
    
}
