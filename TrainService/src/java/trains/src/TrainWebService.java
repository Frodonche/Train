/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trains.src;

import java.util.Date;
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

    /**
     * Web service operation
     */
    @WebMethod(operationName = "addTrain")
    public String addTrain(@WebParam(name = "identifiant") int identifiant, @WebParam(name = "villeDepart") String villeDepart, @WebParam(name = "villeArrivee") String villeArrivee, @WebParam(name = "dateDepart") Date dateDepart, @WebParam(name = "heureDepart") int heureDepart, @WebParam(name = "prixBillet") int prixBillet, @WebParam(name = "places") int places) {
        Modele m = Modele.getInstance();
        if(dateDepart.before(new Date())){
            return "dateDepart must be later than current Date";
        } else {
            m.addTrain(identifiant, villeDepart, villeArrivee, dateDepart, heureDepart, prixBillet, places);
            return "Ok";
        }
    }
}
