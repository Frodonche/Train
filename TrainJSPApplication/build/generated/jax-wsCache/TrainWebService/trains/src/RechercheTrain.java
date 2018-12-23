
package trains.src;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rechercheTrain complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rechercheTrain">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="villeDepart" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="villeArrivee" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="heureDepart" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercheTrain", propOrder = {
    "villeDepart",
    "villeArrivee",
    "heureDepart"
})
public class RechercheTrain {

    protected String villeDepart;
    protected String villeArrivee;
    protected int heureDepart;

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

}
