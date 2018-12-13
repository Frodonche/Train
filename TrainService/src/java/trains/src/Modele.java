/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains.src;

import java.util.ArrayList;

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
    
}
