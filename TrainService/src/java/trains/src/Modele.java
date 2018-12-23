/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains.src;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author guillaume
 */
public class Modele {
    private static Modele INSTANCE = new Modele();
    private ArrayList<Train> myTrains;
    private ArrayList<Reservation> myReservations;
    private String URL = "jdbc:derby://localhost:1527/train";
    private String login = "root";
    private String mdp = "root";
    private Connection con ;
    private Statement stmt ;

    public Modele(){
        this.myTrains = new ArrayList<Train>();
        this.myReservations = new ArrayList<Reservation>();
        try {
            con = DriverManager.getConnection(URL, login,mdp);
            stmt = con.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(Modele.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.updateTrainList();
        this.updateReservationList();
    }
    
    public static Modele getInstance(){
        return INSTANCE;
    }
    
    public void updateRequest (String SQL){
        try { 
            stmt = con.createStatement();
            stmt.executeUpdate(SQL);
        } catch (SQLException ex) {
            Logger.getLogger(Modele.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void addTrain(int identifiant, String villeDepart, String villeArrivee, Date dateDepart, int heureDepart, int prixBillet, int places){
        addTrainSQL(identifiant,villeDepart,villeArrivee,dateDepart,heureDepart,prixBillet,places);
        this.updateTrainList();
    }

    private void addTrainSQL(int identifiant, String villeDepart, String villeArrivee, Date dateDepart, int heureDepart, int prixBillet, int places){
        PreparedStatement pstmt = null;
        try
        {
            pstmt = con.prepareStatement("insert into train (ville_depart, ville_arrivee, date, heure_depart, prix_billet, nb_places_dispo) values ( ? , ? , ? , ? , ?, ? )");
            pstmt.setString(1, villeDepart);
            pstmt.setString(2, villeArrivee);
            pstmt.setDate(3, dateDepart);
            pstmt.setInt(4, (heureDepart));
            pstmt.setInt(5, (prixBillet));
            pstmt.setInt(6, (places));
            pstmt.executeUpdate();
            this.updateTrainList();
        }
        catch (Exception e)
        {}
    }    
    
    private void updateTrainList(){
        String SQL = "select * from train";
        myTrains = new ArrayList<>();
        Train tmp;
        String ville_dep,ville_arr;
        int id, prix, nb_places, heure_dep;
        Date date;
        try { 
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( SQL ); 
            while ( rs.next( ) ) {
            
                    id = rs.getInt("id");
                    prix = rs.getInt("prix_billet");
                    nb_places = rs.getInt("nb_places_dispo");
                    ville_dep = rs.getString("ville_depart");
                    ville_arr = rs.getString("ville_arrivee");
                    heure_dep = rs.getInt("heure_depart");
                    date = new Date(Date.parse(rs.getString("date")));
                    tmp = new Train(id, ville_dep, ville_arr, date, heure_dep, prix, nb_places);
                    myTrains.add(tmp);
                } 
        } catch (SQLException ex) {
            Logger.getLogger(Modele.class.getName()).log(Level.SEVERE, null, ex);
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

    public ArrayList<Train> listTrains(){
        ArrayList<Train> trains = new ArrayList<>();
        for(Train t: myTrains){
                trains.add(t);           
        }
        return trains;
    }

    ArrayList<Train> rechercheTrain(String villeArrivee, String villeDepart, int heureDepart) {
        ArrayList<Train> trains = new ArrayList<>();
        for(Train t: myTrains){
            if(t.getVilleArrivee().equals(villeArrivee)
                    && t.getVilleDepart().equals(villeDepart)
                    && t.getHeureDepart() == heureDepart){
                trains.add(t);           
            }
        }
        return trains;
    }
    public Train existTrain(int id){
        Train tmp=null;
        for(Train t: myTrains){
            if(t.getIdentifiant()==id)tmp=t;
        }
        if(tmp!=null)return tmp;
        return null;
    }
    
    private void updateReservationList(){
        String SQL = "select * from reservation";
        myReservations = new ArrayList<>();
        Reservation tmp;
        int id_res,id_train, num_place;
        try { 
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery( SQL ); 
            while ( rs.next( ) ) {
                    id_res = rs.getInt("id_reservation");
                    id_train = rs.getInt("id_train");
                    num_place = rs.getInt("numero_place");
                    tmp = new Reservation(id_res, id_train, num_place);
                    myReservations.add(tmp);
                } 
        } catch (SQLException ex) {
            Logger.getLogger(Modele.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public Reservation rechercheReservation(int id_res){
        Reservation tmp;
        tmp = null;
        for(Reservation r : myReservations){
            if( r.getIdReservation() == id_res){
                tmp = r;
            }
        }
        if (tmp != null)return tmp;
        return null;
    }
    
    public ArrayList<Reservation> listReservations(){
        return this.myReservations;
    }
    
    public void addReservation(int id_res, int id_train, int num_place){
        addReservationSQL(id_res,id_train,num_place);
    }
    
    private void addReservationSQL(int id_res, int id_train, int num_place){
        PreparedStatement pstmt = null;
        Train tmp = this.existTrain(id_train);
        if(tmp!=null)
        try
        {
            int nb_places = tmp.getPlaces()-1;
            pstmt = con.prepareStatement("insert into reservation values ( ? , ? , ?)");
            pstmt.setInt(1, id_res);
            pstmt.setInt(2, id_train);
            pstmt.setInt(3, num_place);
            pstmt.executeUpdate();
            this.updateReservationList();
            pstmt = con.prepareStatement("update train set nb_places_dispo=? where id=?");
            pstmt.setInt(1, nb_places);
            pstmt.setInt(2, id_train);
            pstmt.executeUpdate();
            this.updateTrainList();
        }
        catch (Exception e)
        {}
    }

}
