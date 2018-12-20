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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author frlallemand
 */
@WebService(serviceName = "TrainWebService")
public class TrainWebService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    @WebMethod(operationName = "listTrains")
    public String listTrains() throws ParseException {
        Modele m = Modele.getInstance();
        String ts = "";
        for(Train t : m.listTrains()){
            ts += t.toString() + "\n";
            System.out.println(t);
        }
        return ts;
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addTrain")
    public String addTrain(@WebParam(name = "identifiant") int identifiant, @WebParam(name = "villeDepart") String villeDepart, @WebParam(name = "villeArrivee") String villeArrivee, @WebParam(name = "dateDepart") String dateDepart, @WebParam(name = "heureDepart") int heureDepart, @WebParam(name = "prixBillet") int prixBillet, @WebParam(name = "places") int places) throws ParseException {
        
        Modele m = Modele.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = dateFormat.parse(dateDepart);
        if(parse.before(new Date())){
            return "dateDepart must be later than current Date";
        } else {
            m.addTrain(identifiant, villeDepart, villeArrivee, parse, heureDepart, prixBillet, places);
            return "Ok";
        }
    }
    
        /**
     * Web service operation
     */
    @WebMethod(operationName = "rechercheTrain")
    public String rechercheTrain(@WebParam(name = "villeDepart") String villeDepart, @WebParam(name = "villeArrivee") String villeArrivee, @WebParam(name = "heureDepart") int heureDepart) throws ParseException {        
        Modele m = Modele.getInstance();
        String ts = "";
        for(Train t : m.rechercheTrain(villeArrivee, villeDepart, heureDepart)){
            ts += t.toString() + "\n";
        }
        return ts;
    }

}
