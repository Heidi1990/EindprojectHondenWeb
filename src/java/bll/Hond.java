/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bll;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Heidi
 */
@Entity
@Table(name = "hond")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hond.findAll", query = "SELECT h FROM Hond h"),
    @NamedQuery(name = "Hond.findById", query = "SELECT h FROM Hond h WHERE h.id = :id"),
    @NamedQuery(name = "Hond.findByNaam", query = "SELECT h FROM Hond h WHERE h.naam = :naam"),
    @NamedQuery(name = "Hond.findByRas", query = "SELECT h FROM Hond h WHERE h.ras = :ras"),
    @NamedQuery(name = "Hond.findByGeslacht", query = "SELECT h FROM Hond h WHERE h.geslacht = :geslacht"),
    @NamedQuery(name = "Hond.findByLeeftijd", query = "SELECT h FROM Hond h WHERE h.leeftijd = :leeftijd"),
    @NamedQuery(name = "Hond.findByBeschrijving", query = "SELECT h FROM Hond h WHERE h.beschrijving = :beschrijving"),
    @NamedQuery(name = "Hond.findByFoto", query = "SELECT h FROM Hond h WHERE h.foto = :foto"),
    @NamedQuery(name = "Hond.findByAdopteren", query = "SELECT h FROM Hond h WHERE h.adopteren = :adopteren"),
    @NamedQuery(name = "Hond.findByAdopterenFalse", query = "SELECT h FROM Hond h WHERE h.adopteren = 'false'"),
    @NamedQuery(name = "Hond.findByAdopterenTrue", query = "SELECT h FROM Hond h WHERE h.adopteren = 'true'")})
public class Hond implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Naam")
    private String naam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Ras")
    private String ras;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Geslacht")
    private String geslacht;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Leeftijd")
    private int leeftijd;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1000)
    @Column(name = "Beschrijving")
    private String beschrijving;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 2000)
    @Column(name = "Foto")
    private String foto;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Adopteren")
    private boolean adopteren;

    public Hond() {
    }

    public Hond(Integer id) {
        this.id = id;
    }

    public Hond(Integer id, String naam, String ras, String geslacht, int leeftijd, String beschrijving, String foto, boolean adopteren) {
        this.id = id;
        this.naam = naam;
        this.ras = ras;
        this.geslacht = geslacht;
        this.leeftijd = leeftijd;
        this.beschrijving = beschrijving;
        this.foto = foto;
        this.adopteren = adopteren;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getRas() {
        return ras;
    }

    public void setRas(String ras) {
        this.ras = ras;
    }

    public String getGeslacht() {
        return geslacht;
    }

    public void setGeslacht(String geslacht) {
        this.geslacht = geslacht;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getBeschrijving() {
        return beschrijving;
    }

    public void setBeschrijving(String beschrijving) {
        this.beschrijving = beschrijving;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public boolean getAdopteren() {
        return adopteren;
    }

    public void setAdopteren(boolean adopteren) {
        this.adopteren = adopteren;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Hond)) {
            return false;
        }
        Hond other = (Hond) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bll.Hond[ id=" + id + " ]";
    }

}
