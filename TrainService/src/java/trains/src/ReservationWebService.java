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
        String ts = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><reservations>";
        for(Reservation r : m.listReservations()){
            ts += r.toXML();
        }
        return ts+"</reservations>";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addReservation")
    public String addReservation(@WebParam(name = "identifiant_train") Integer id_train) throws ParseException {        
            Modele m = Modele.getInstance();
            if(id_train == null)return "pas ok!";
            m.addReservation(id_train);
            return "reservation OK !";
    }
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "rechercheReservation")
    public String rechercheReservation(@WebParam(name = "identifiant_reservation") int id_reservation) throws ParseException {        
        Modele m = Modele.getInstance();
        String ts = "<?xml version=\"1.0\" encoding=\"UTF-8\"?><trains>";
        if(m.rechercheReservation(id_reservation)!=null)ts = m.rechercheReservation(id_reservation).toXML();
        return ts+"</trains>";
    }

}
