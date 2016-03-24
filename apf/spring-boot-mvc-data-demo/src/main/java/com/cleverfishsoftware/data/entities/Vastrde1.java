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
    @NamedQuery(name = "Vastrde1.findAll", query = "SELECT v FROM Vastrde1 v"),
    @NamedQuery(name = "Vastrde1.findByDept1no", query = "SELECT v FROM Vastrde1 v WHERE v.dept1no = :dept1no"),
    @NamedQuery(name = "Vastrde1.findByDept1nam", query = "SELECT v FROM Vastrde1 v WHERE v.dept1nam = :dept1nam"),
    @NamedQuery(name = "Vastrde1.findByEmp1no", query = "SELECT v FROM Vastrde1 v WHERE v.emp1no = :emp1no"),
    @NamedQuery(name = "Vastrde1.findByEmp1fn", query = "SELECT v FROM Vastrde1 v WHERE v.emp1fn = :emp1fn"),
    @NamedQuery(name = "Vastrde1.findByEmp1mi", query = "SELECT v FROM Vastrde1 v WHERE v.emp1mi = :emp1mi"),
    @NamedQuery(name = "Vastrde1.findByEmp1ln", query = "SELECT v FROM Vastrde1 v WHERE v.emp1ln = :emp1ln"),
    @NamedQuery(name = "Vastrde1.findByType2", query = "SELECT v FROM Vastrde1 v WHERE v.type2 = :type2"),
    @NamedQuery(name = "Vastrde1.findByDept2no", query = "SELECT v FROM Vastrde1 v WHERE v.dept2no = :dept2no"),
    @NamedQuery(name = "Vastrde1.findByDept2nam", query = "SELECT v FROM Vastrde1 v WHERE v.dept2nam = :dept2nam"),
    @NamedQuery(name = "Vastrde1.findByEmp2no", query = "SELECT v FROM Vastrde1 v WHERE v.emp2no = :emp2no"),
    @NamedQuery(name = "Vastrde1.findByEmp2fn", query = "SELECT v FROM Vastrde1 v WHERE v.emp2fn = :emp2fn"),
    @NamedQuery(name = "Vastrde1.findByEmp2mi", query = "SELECT v FROM Vastrde1 v WHERE v.emp2mi = :emp2mi"),
    @NamedQuery(name = "Vastrde1.findByEmp2ln", query = "SELECT v FROM Vastrde1 v WHERE v.emp2ln = :emp2ln")})
public class Vastrde1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String dept1no;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(nullable = false, length = 36)
    private String dept1nam;
    @Size(max = 6)
    @Column(length = 6)
    private String emp1no;
    @Size(max = 12)
    @Column(length = 12)
    private String emp1fn;
    private Character emp1mi;
    @Size(max = 15)
    @Column(length = 15)
    private String emp1ln;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(nullable = false, length = 1)
    private String type2;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(nullable = false, length = 3)
    private String dept2no;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 36)
    @Column(nullable = false, length = 36)
    private String dept2nam;
    @Size(max = 6)
    @Column(length = 6)
    private String emp2no;
    @Size(max = 12)
    @Column(length = 12)
    private String emp2fn;
    private Character emp2mi;
    @Size(max = 15)
    @Column(length = 15)
    private String emp2ln;

    public Vastrde1() {
    }

    public String getDept1no() {
        return dept1no;
    }

    public void setDept1no(String dept1no) {
        this.dept1no = dept1no;
    }

    public String getDept1nam() {
        return dept1nam;
    }

    public void setDept1nam(String dept1nam) {
        this.dept1nam = dept1nam;
    }

    public String getEmp1no() {
        return emp1no;
    }

    public void setEmp1no(String emp1no) {
        this.emp1no = emp1no;
    }

    public String getEmp1fn() {
        return emp1fn;
    }

    public void setEmp1fn(String emp1fn) {
        this.emp1fn = emp1fn;
    }

    public Character getEmp1mi() {
        return emp1mi;
    }

    public void setEmp1mi(Character emp1mi) {
        this.emp1mi = emp1mi;
    }

    public String getEmp1ln() {
        return emp1ln;
    }

    public void setEmp1ln(String emp1ln) {
        this.emp1ln = emp1ln;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

    public String getDept2no() {
        return dept2no;
    }

    public void setDept2no(String dept2no) {
        this.dept2no = dept2no;
    }

    public String getDept2nam() {
        return dept2nam;
    }

    public void setDept2nam(String dept2nam) {
        this.dept2nam = dept2nam;
    }

    public String getEmp2no() {
        return emp2no;
    }

    public void setEmp2no(String emp2no) {
        this.emp2no = emp2no;
    }

    public String getEmp2fn() {
        return emp2fn;
    }

    public void setEmp2fn(String emp2fn) {
        this.emp2fn = emp2fn;
    }

    public Character getEmp2mi() {
        return emp2mi;
    }

    public void setEmp2mi(Character emp2mi) {
        this.emp2mi = emp2mi;
    }

    public String getEmp2ln() {
        return emp2ln;
    }

    public void setEmp2ln(String emp2ln) {
        this.emp2ln = emp2ln;
    }
    
}
