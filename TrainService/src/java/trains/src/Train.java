/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains.src;

import java.util.Date;

/**
 *
 * @author guillaume
 */
public class Train {

    
    private int identifiant;
    private String villeDepart;
    private String villeArrivee;
    private Date dateDepart;
    private int heureDepart;
    private int prixBillet;
    private int places;
    
    public Train(int identifiant, String villeDepart, String villeArrivee, Date dateDepart, int heureDepart, int prixBillet, int places) {
        this.identifiant = identifiant;
        this.villeDepart = villeDepart;
        this.villeArrivee = villeArrivee;
        this.dateDepart = dateDepart;
        this.heureDepart = heureDepart;
        this.prixBillet = prixBillet;
        this.places = places;
    }
    
}
