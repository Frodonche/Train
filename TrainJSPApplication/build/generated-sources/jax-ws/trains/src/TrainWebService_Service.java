
package trains.src;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.11-b150120.1832
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "TrainWebService", targetNamespace = "http://src.trains/", wsdlLocation = "http://localhost:8080/TrainService/TrainWebService?wsdl")
public class TrainWebService_Service
    extends Service
{

    private final static URL TRAINWEBSERVICE_WSDL_LOCATION;
    private final static WebServiceException TRAINWEBSERVICE_EXCEPTION;
    private final static QName TRAINWEBSERVICE_QNAME = new QName("http://src.trains/", "TrainWebService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:8080/TrainService/TrainWebService?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        TRAINWEBSERVICE_WSDL_LOCATION = url;
        TRAINWEBSERVICE_EXCEPTION = e;
    }

    public TrainWebService_Service() {
        super(__getWsdlLocation(), TRAINWEBSERVICE_QNAME);
    }

    public TrainWebService_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), TRAINWEBSERVICE_QNAME, features);
    }

    public TrainWebService_Service(URL wsdlLocation) {
        super(wsdlLocation, TRAINWEBSERVICE_QNAME);
    }

    public TrainWebService_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, TRAINWEBSERVICE_QNAME, features);
    }

    public TrainWebService_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public TrainWebService_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns TrainWebService
     */
    @WebEndpoint(name = "TrainWebServicePort")
    public TrainWebService getTrainWebServicePort() {
        return super.getPort(new QName("http://src.trains/", "TrainWebServicePort"), TrainWebService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns TrainWebService
     */
    @WebEndpoint(name = "TrainWebServicePort")
    public TrainWebService getTrainWebServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http://src.trains/", "TrainWebServicePort"), TrainWebService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (TRAINWEBSERVICE_EXCEPTION!= null) {
            throw TRAINWEBSERVICE_EXCEPTION;
        }
        return TRAINWEBSERVICE_WSDL_LOCATION;
    }

}
