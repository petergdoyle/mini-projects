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
    @NamedQuery(name = "Vphone.findAll", query = "SELECT v FROM Vphone v"),
    @NamedQuery(name = "Vphone.findByLastname", query = "SELECT v FROM Vphone v WHERE v.lastname = :lastname"),
    @NamedQuery(name = "Vphone.findByFirstname", query = "SELECT v FROM Vphone v WHERE v.firstname = :firstname"),
    @NamedQuery(name = "Vphone.findByMiddleinitial", query = "SELECT v FROM Vphone v WHERE v.middleinitial = :middleinitial"),
    @NamedQuery(name = "Vphone.findByPhonenumber", query = "SELECT v FROM Vphone v WHERE v.phonenumber = :phonenumber"),
    @NamedQuery(name = "Vphone.findByEmployeenumber", query = "SELECT v FROM Vphone v WHERE v.employeenumber = :employeenumber"),
    @NamedQuery(name = "Vphone.findByDeptnumber", query = "SELECT v FROM Vphone v WHERE v.deptnumber = :deptnumber"),
    @NamedQuery(name = "Vphone.findByDeptname", query = "SELECT v FROM Vphone v WHERE v.deptname = :deptname")})
public class Vphone implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(nullable = false, length = 15)
    private String lastname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(nullable = false, length = 12)
    private String firstname;
    private Character middleinitial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4)
    @Column(nullable = false, length = 4)
    private String phonenumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String employeenumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String deptnumber;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(nullable = false, length = 36)
    private String deptname;

    public Vphone() {
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public Character getMiddleinitial() {
        return middleinitial;
    }

    public void setMiddleinitial(Character middleinitial) {
        this.middleinitial = middleinitial;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getEmployeenumber() {
        return employeenumber;
    }

    public void setEmployeenumber(String employeenumber) {
        this.employeenumber = employeenumber;
    }

    public String getDeptnumber() {
        return deptnumber;
    }

    public void setDeptnumber(String deptnumber) {
        this.deptnumber = deptnumber;
    }

    public String getDeptname() {
        return deptname;
    }

    public void setDeptname(String deptname) {
        this.deptname = deptname;
    }
    
}
