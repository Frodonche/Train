/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains.src;

/**
 *
 * @author steve
 */
public class Reservation {
    private int id_res;
    private int id_train;
    private int num_place;
    
    public Reservation(int id_reservation ,int id_train ,int numero_place){
        this.id_res = id_reservation;
        this.id_train = id_train;
        this.num_place = numero_place;
    }
    
    public int getIdReservation(){
        return this.id_res;
    }
    public int getIdTrain(){
        return this.id_train;
    }
    public int getNumeroPlace(){
        return this.num_place;
    }    
    
    public String toString(){
        return "Reservation : "+this.id_res+" | Train : "+
                this.id_train+" | numero de place :"+
                this.num_place+"";
    }
}
