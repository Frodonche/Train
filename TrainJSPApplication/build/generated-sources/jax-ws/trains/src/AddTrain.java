
package trains.src;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour addTrain complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="addTrain"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifiant" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="villeDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="villeArrivee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dateDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="heureDepart" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="prixBillet" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="places" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "addTrain", propOrder = {
    "identifiant",
    "villeDepart",
    "villeArrivee",
    "dateDepart",
    "heureDepart",
    "prixBillet",
    "places"
})
public class AddTrain {

    protected int identifiant;
    protected String villeDepart;
    protected String villeArrivee;
    protected String dateDepart;
    protected int heureDepart;
    protected int prixBillet;
    protected int places;

    /**
     * Obtient la valeur de la propriété identifiant.
     * 
     */
    public int getIdentifiant() {
        return identifiant;
    }

    /**
     * Définit la valeur de la propriété identifiant.
     * 
     */
    public void setIdentifiant(int value) {
        this.identifiant = value;
    }

    /**
     * Obtient la valeur de la propriété villeDepart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilleDepart() {
        return villeDepart;
    }

    /**
     * Définit la valeur de la propriété villeDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilleDepart(String value) {
        this.villeDepart = value;
    }

    /**
     * Obtient la valeur de la propriété villeArrivee.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVilleArrivee() {
        return villeArrivee;
    }

    /**
     * Définit la valeur de la propriété villeArrivee.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVilleArrivee(String value) {
        this.villeArrivee = value;
    }

    /**
     * Obtient la valeur de la propriété dateDepart.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDateDepart() {
        return dateDepart;
    }

    /**
     * Définit la valeur de la propriété dateDepart.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDateDepart(String value) {
        this.dateDepart = value;
    }

    /**
     * Obtient la valeur de la propriété heureDepart.
     * 
     */
    public int getHeureDepart() {
        return heureDepart;
    }

    /**
     * Définit la valeur de la propriété heureDepart.
     * 
     */
    public void setHeureDepart(int value) {
        this.heureDepart = value;
    }

    /**
     * Obtient la valeur de la propriété prixBillet.
     * 
     */
    public int getPrixBillet() {
        return prixBillet;
    }

    /**
     * Définit la valeur de la propriété prixBillet.
     * 
     */
    public void setPrixBillet(int value) {
        this.prixBillet = value;
    }

    /**
     * Obtient la valeur de la propriété places.
     * 
     */
    public int getPlaces() {
        return places;
    }

    /**
     * Définit la valeur de la propriété places.
     * 
     */
    public void setPlaces(int value) {
        this.places = value;
    }

}
