/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains.src;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author guillaume
 */
public class Modele {
    private static Modele INSTANCE = new Modele();
    private ArrayList<Train> myTrains;
    
    public Modele(){
        this.myTrains = new ArrayList<Train>();
    }
    
    public static Modele getInstance(){
        return INSTANCE;
    }
    
    public void addTrain(int identifiant, String villeDepart, String villeArrivee, Date dateDepart, int heureDepart, int prixBillet, int places){
        Train tmp = searchTrain(identifiant);
        if(tmp == null){
            tmp = new Train(identifiant, villeDepart, villeArrivee, dateDepart, heureDepart, prixBillet, places);
            myTrains.add(tmp);
        }
    }

        
    public Train searchTrain(int identifiant){
        for(Train t: myTrains){
            if(t.getIdentifiant() == identifiant){
                return t;
            }
        }
        return null;
    }
    
}
