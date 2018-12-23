/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains.src;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author steve
 */
@WebService(serviceName = "ReservationWebService")
public class ReservationWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "listReservations")
    public String listReservations() throws ParseException {
        Modele m = Modele.getInstance();
        String ts = "";
        for(Reservation r : m.listReservations()){
            ts += r.toString() + "\n";
            System.out.println(ts);
        }
        return ts;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addReservation")
    public String addReservation(@WebParam(name = "identifiant_reservation") int identifiant_reservation, @WebParam(name = "identifiant_train") int id_train, @WebParam(name = "numero_place") int numero_place) throws ParseException {
        Modele m = Modele.getInstance();
        m.addReservation(identifiant_reservation,id_train,numero_place);
        return "reservation OK !";
    }
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "rechercheReservation")
    public String rechercheReservation(@WebParam(name = "identifiant_reservation") int id_reservation) throws ParseException {        
        Modele m = Modele.getInstance();
        String ts = "";
        ts = m.rechercheReservation(id_reservation).toString();
        return ts;
    }

}
