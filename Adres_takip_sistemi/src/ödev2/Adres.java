/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ödev2;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author sunay
 */
@Entity
@Table(name = "ADRES")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Adres.findAll", query = "SELECT a FROM Adres a"),
    @NamedQuery(name = "Adres.findByAdresId", query = "SELECT a FROM Adres a WHERE a.adresId = :adresId"),
    @NamedQuery(name = "Adres.findByIl", query = "SELECT a FROM Adres a WHERE a.il = :il"),
    @NamedQuery(name = "Adres.findByIlce", query = "SELECT a FROM Adres a WHERE a.ilce = :ilce"),
    @NamedQuery(name = "Adres.findByMahalle", query = "SELECT a FROM Adres a WHERE a.mahalle = :mahalle"),
    @NamedQuery(name = "Adres.findBySokak", query = "SELECT a FROM Adres a WHERE a.sokak = :sokak"),
    @NamedQuery(name = "Adres.findByAprNo", query = "SELECT a FROM Adres a WHERE a.aprNo = :aprNo"),
    @NamedQuery(name = "Adres.findByKisiId", query = "SELECT a FROM Adres a WHERE a.kisiId = :kisiId")})
public class Adres implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ADRES_ID")
    private Integer adresId;
    @Column(name = "IL")
    private String il;
    @Column(name = "ILCE")
    private String ilce;
    @Column(name = "MAHALLE")
    private String mahalle;
    @Column(name = "SOKAK")
    private String sokak;
    @Column(name = "APR_NO")
    private Integer aprNo;
    @Column(name = "KISI_ID")
    private Integer kisiId;

    public Adres() {
    }

    public Adres(Integer adresId) {
        this.adresId = adresId;
    }

    public Integer getAdresId() {
        return adresId;
    }

    public void setAdresId(Integer adresId) {
        this.adresId = adresId;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getSokak() {
        return sokak;
    }

    public void setSokak(String sokak) {
        this.sokak = sokak;
    }

    public Integer getAprNo() {
        return aprNo;
    }

    public void setAprNo(Integer aprNo) {
        this.aprNo = aprNo;
    }

    public Integer getKisiId() {
        return kisiId;
    }

    public void setKisiId(Integer kisiId) {
        this.kisiId = kisiId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (adresId != null ? adresId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Adres)) {
            return false;
        }
        Adres other = (Adres) object;
        if ((this.adresId == null && other.adresId != null) || (this.adresId != null && !this.adresId.equals(other.adresId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "\u00f6dev2.Adres[ adresId=" + adresId + " ]";
    }
    
}
