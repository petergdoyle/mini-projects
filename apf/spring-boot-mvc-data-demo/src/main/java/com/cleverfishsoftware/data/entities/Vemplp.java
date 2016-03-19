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
    @NamedQuery(name = "Vemplp.findAll", query = "SELECT v FROM Vemplp v"),
    @NamedQuery(name = "Vemplp.findByEmployeenumber", query = "SELECT v FROM Vemplp v WHERE v.employeenumber = :employeenumber"),
    @NamedQuery(name = "Vemplp.findByPhonenumber", query = "SELECT v FROM Vemplp v WHERE v.phonenumber = :phonenumber")})
public class Vemplp implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String employeenumber;
    @Size(max = 4)
    @Column(length = 4)
    private String phonenumber;

    public Vemplp() {
    }

    public String getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }
    
}
