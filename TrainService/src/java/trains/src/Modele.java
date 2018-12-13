/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains.src;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    
    public String createSQLSelect(List<String> select, String from, List<String> where){
        String ret="";
        ret = "select ";
        int i = 0;
        while(i<select.size()){
            ret = ret + select.get(i);
            i++;
            if(i<select.size())ret = ret + ", ";
        }
        ret = ret + " from "+from;
        i = 0;
        if (where.size()>0)ret = ret + " where ";
        while(i<where.size()){
            ret = ret + where.get(i)+ " = " +where.get(i);
            i++;
            if(i<where.size())ret = ret + " and ";
        }
        return ret;
    }
    
    public String createSQLUpdate(List<String> set, String from, List<String> where){
        String ret="";
        ret = "update " + from;
        int i = 0;
        if(set.size()>0)ret = ret + " set ";
        while(i<set.size()){
            ret = ret + set.get(i) + " = " + set.get(i);
            i++;
            if(i<set.size())ret = ret + ", ";
        }
        i = 0;
        if (where.size()>0)ret = ret + " where ";
        while(i<where.size()){
            ret = ret + where.get(i)+ " = " +where.get(i);
            i++;
            if(i<where.size())ret = ret + " and ";
        }
        return ret;
    }
    
        public String createSQLDelete(String from, List<String> where){
        String ret="";
        ret = "delete from "+ from+" ";
        int i = 0;
        if (where.size()>0)ret = ret + " where ";
        while(i<where.size()){
            ret = ret + where.get(i)+ " = " +where.get(i);
            i++;
            if(i<where.size())ret = ret + " and ";
        }
        return ret;
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
    
    public ArrayList<Train> searchTrainVilleDepart(String villeDepart){
        ArrayList<Train> trains = new ArrayList<>();
        for(Train t: myTrains){
            if(t.getVilleDepart().equals(villeDepart)){
                trains.add(t);            
            }
        }
        return trains;
    }
    
    public ArrayList<Train> searchTrainVilleArrivee(String villeArrivee){
        ArrayList<Train> trains = new ArrayList<>();
        for(Train t: myTrains){
            if(t.getVilleArrivee().equals(villeArrivee)){
                trains.add(t);           
            }
        }
        return trains;
    }

}
