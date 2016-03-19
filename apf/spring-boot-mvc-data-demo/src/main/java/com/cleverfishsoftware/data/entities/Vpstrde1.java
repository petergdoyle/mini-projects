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
    @NamedQuery(name = "Vpstrde1.findAll", query = "SELECT v FROM Vpstrde1 v"),
    @NamedQuery(name = "Vpstrde1.findByProj1no", query = "SELECT v FROM Vpstrde1 v WHERE v.proj1no = :proj1no"),
    @NamedQuery(name = "Vpstrde1.findByProj1name", query = "SELECT v FROM Vpstrde1 v WHERE v.proj1name = :proj1name"),
    @NamedQuery(name = "Vpstrde1.findByResp1no", query = "SELECT v FROM Vpstrde1 v WHERE v.resp1no = :resp1no"),
    @NamedQuery(name = "Vpstrde1.findByResp1fn", query = "SELECT v FROM Vpstrde1 v WHERE v.resp1fn = :resp1fn"),
    @NamedQuery(name = "Vpstrde1.findByResp1mi", query = "SELECT v FROM Vpstrde1 v WHERE v.resp1mi = :resp1mi"),
    @NamedQuery(name = "Vpstrde1.findByResp1ln", query = "SELECT v FROM Vpstrde1 v WHERE v.resp1ln = :resp1ln"),
    @NamedQuery(name = "Vpstrde1.findByProj2no", query = "SELECT v FROM Vpstrde1 v WHERE v.proj2no = :proj2no"),
    @NamedQuery(name = "Vpstrde1.findByProj2name", query = "SELECT v FROM Vpstrde1 v WHERE v.proj2name = :proj2name"),
    @NamedQuery(name = "Vpstrde1.findByResp2no", query = "SELECT v FROM Vpstrde1 v WHERE v.resp2no = :resp2no"),
    @NamedQuery(name = "Vpstrde1.findByResp2fn", query = "SELECT v FROM Vpstrde1 v WHERE v.resp2fn = :resp2fn"),
    @NamedQuery(name = "Vpstrde1.findByResp2mi", query = "SELECT v FROM Vpstrde1 v WHERE v.resp2mi = :resp2mi"),
    @NamedQuery(name = "Vpstrde1.findByResp2ln", query = "SELECT v FROM Vpstrde1 v WHERE v.resp2ln = :resp2ln")})
public class Vpstrde1 implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String proj1no;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(nullable = false, length = 24)
    private String proj1name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String resp1no;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(nullable = false, length = 12)
    private String resp1fn;
    private Character resp1mi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(nullable = false, length = 15)
    private String resp1ln;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String proj2no;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 24)
    @Column(nullable = false, length = 24)
    private String proj2name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 6)
    @Column(nullable = false, length = 6)
    private String resp2no;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 12)
    @Column(nullable = false, length = 12)
    private String resp2fn;
    private Character resp2mi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(nullable = false, length = 15)
    private String resp2ln;

    public Vpstrde1() {
    }

    public String getProj1no() {
        return proj1no;
    }

    public void setProj1no(String proj1no) {
        this.proj1no = proj1no;
    }

    public String getProj1name() {
        return proj1name;
    }

    public void setProj1name(String proj1name) {
        this.proj1name = proj1name;
    }

    public String getResp1no() {
        return resp1no;
    }

    public void setResp1no(String resp1no) {
        this.resp1no = resp1no;
    }

    public String getResp1fn() {
        return resp1fn;
    }

    public void setResp1fn(String resp1fn) {
        this.resp1fn = resp1fn;
    }

    public Character getResp1mi() {
        return resp1mi;
    }

    public void setResp1mi(Character resp1mi) {
        this.resp1mi = resp1mi;
    }

    public String getResp1ln() {
        return resp1ln;
    }

    public void setResp1ln(String resp1ln) {
        this.resp1ln = resp1ln;
    }

    public String getProj2no() {
        return proj2no;
    }

    public void setProj2no(String proj2no) {
        this.proj2no = proj2no;
    }

    public String getProj2name() {
        return proj2name;
    }

    public void setProj2name(String proj2name) {
        this.proj2name = proj2name;
    }

    public String getResp2no() {
        return resp2no;
    }

    public void setResp2no(String resp2no) {
        this.resp2no = resp2no;
    }

    public String getResp2fn() {
        return resp2fn;
    }

    public void setResp2fn(String resp2fn) {
        this.resp2fn = resp2fn;
    }

    public Character getResp2mi() {
        return resp2mi;
    }

    public void setResp2mi(Character resp2mi) {
        this.resp2mi = resp2mi;
    }

    public String getResp2ln() {
        return resp2ln;
    }

    public void setResp2ln(String resp2ln) {
        this.resp2ln = resp2ln;
    }
    
}
