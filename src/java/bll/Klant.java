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
 * @author Helix
 */
@Entity
@Table(name = "klant")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Klant.findAll", query = "SELECT k FROM Klant k"),
    @NamedQuery(name = "Klant.findById", query = "SELECT k FROM Klant k WHERE k.id = :id"),
    @NamedQuery(name = "Klant.findByVoornaam", query = "SELECT k FROM Klant k WHERE k.voornaam = :voornaam"),
    @NamedQuery(name = "Klant.findByAchternaam", query = "SELECT k FROM Klant k WHERE k.achternaam = :achternaam"),
    @NamedQuery(name = "Klant.findByAdres", query = "SELECT k FROM Klant k WHERE k.adres = :adres"),
    @NamedQuery(name = "Klant.findByPostcode", query = "SELECT k FROM Klant k WHERE k.postcode = :postcode"),
    @NamedQuery(name = "Klant.findByStad", query = "SELECT k FROM Klant k WHERE k.stad = :stad"),
    @NamedQuery(name = "Klant.findByTelefoonnummer", query = "SELECT k FROM Klant k WHERE k.telefoonnummer = :telefoonnummer"),
    @NamedQuery(name = "Klant.findByWachtwoord", query = "SELECT k FROM Klant k WHERE k.wachtwoord = :wachtwoord"),
    @NamedQuery(name = "Klant.findByEmail", query = "SELECT k FROM Klant k WHERE k.email = :email")})
public class Klant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Voornaam")
    private String voornaam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Achternaam")
    private String achternaam;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Adres")
    private String adres;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Postcode")
    private int postcode;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Stad")
    private String stad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Telefoonnummer")
    private int telefoonnummer;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Wachtwoord")
    private String wachtwoord;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Email")
    private String email;

    public Klant() {
    }

    public Klant(Integer id) {
        this.id = id;
    }

    public Klant(Integer id, String voornaam, String achternaam, String adres, int postcode, String stad, int telefoonnummer, String wachtwoord, String email) {
        this.id = id;
        this.voornaam = voornaam;
        this.achternaam = achternaam;
        this.adres = adres;
        this.postcode = postcode;
        this.stad = stad;
        this.telefoonnummer = telefoonnummer;
        this.wachtwoord = wachtwoord;
        this.email = email;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getStad() {
        return stad;
    }

    public void setStad(String stad) {
        this.stad = stad;
    }

    public int getTelefoonnummer() {
        return telefoonnummer;
    }

    public void setTelefoonnummer(int telefoonnummer) {
        this.telefoonnummer = telefoonnummer;
    }

    public String getWachtwoord() {
        return wachtwoord;
    }

    public void setWachtwoord(String wachtwoord) {
        this.wachtwoord = wachtwoord;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Klant)) {
            return false;
        }
        Klant other = (Klant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bll.Klant[ id=" + id + " ]";
    }
    
}
