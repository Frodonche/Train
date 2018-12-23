
package ClientServlet;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rechercheReservation complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rechercheReservation"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="identifiant_reservation" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercheReservation", propOrder = {
    "identifiantReservation"
})
public class RechercheReservation {

    @XmlElement(name = "identifiant_reservation")
    protected int identifiantReservation;

    /**
     * Obtient la valeur de la propriété identifiantReservation.
     * 
     */
    public int getIdentifiantReservation() {
        return identifiantReservation;
    }

    /**
     * Définit la valeur de la propriété identifiantReservation.
     * 
     */
    public void setIdentifiantReservation(int value) {
        this.identifiantReservation = value;
    }

}
