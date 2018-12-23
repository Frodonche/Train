
package ClientServlet;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ClientServlet package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ParseException_QNAME = new QName("http://src.trains/", "ParseException");
    private final static QName _AddReservation_QNAME = new QName("http://src.trains/", "addReservation");
    private final static QName _AddReservationResponse_QNAME = new QName("http://src.trains/", "addReservationResponse");
    private final static QName _Hello_QNAME = new QName("http://src.trains/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://src.trains/", "helloResponse");
    private final static QName _ListReservations_QNAME = new QName("http://src.trains/", "listReservations");
    private final static QName _ListReservationsResponse_QNAME = new QName("http://src.trains/", "listReservationsResponse");
    private final static QName _RechercheReservation_QNAME = new QName("http://src.trains/", "rechercheReservation");
    private final static QName _RechercheReservationResponse_QNAME = new QName("http://src.trains/", "rechercheReservationResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ClientServlet
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ParseException }
     * 
     */
    public ParseException createParseException() {
        return new ParseException();
    }

    /**
     * Create an instance of {@link AddReservation }
     * 
     */
    public AddReservation createAddReservation() {
        return new AddReservation();
    }

    /**
     * Create an instance of {@link AddReservationResponse }
     * 
     */
    public AddReservationResponse createAddReservationResponse() {
        return new AddReservationResponse();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link ListReservations }
     * 
     */
    public ListReservations createListReservations() {
        return new ListReservations();
    }

    /**
     * Create an instance of {@link ListReservationsResponse }
     * 
     */
    public ListReservationsResponse createListReservationsResponse() {
        return new ListReservationsResponse();
    }

    /**
     * Create an instance of {@link RechercheReservation }
     * 
     */
    public RechercheReservation createRechercheReservation() {
        return new RechercheReservation();
    }

    /**
     * Create an instance of {@link RechercheReservationResponse }
     * 
     */
    public RechercheReservationResponse createRechercheReservationResponse() {
        return new RechercheReservationResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ParseException }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "ParseException")
    public JAXBElement<ParseException> createParseException(ParseException value) {
        return new JAXBElement<ParseException>(_ParseException_QNAME, ParseException.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "addReservation")
    public JAXBElement<AddReservation> createAddReservation(AddReservation value) {
        return new JAXBElement<AddReservation>(_AddReservation_QNAME, AddReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "addReservationResponse")
    public JAXBElement<AddReservationResponse> createAddReservationResponse(AddReservationResponse value) {
        return new JAXBElement<AddReservationResponse>(_AddReservationResponse_QNAME, AddReservationResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservations }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListReservations }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "listReservations")
    public JAXBElement<ListReservations> createListReservations(ListReservations value) {
        return new JAXBElement<ListReservations>(_ListReservations_QNAME, ListReservations.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListReservationsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListReservationsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "listReservationsResponse")
    public JAXBElement<ListReservationsResponse> createListReservationsResponse(ListReservationsResponse value) {
        return new JAXBElement<ListReservationsResponse>(_ListReservationsResponse_QNAME, ListReservationsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheReservation }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RechercheReservation }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "rechercheReservation")
    public JAXBElement<RechercheReservation> createRechercheReservation(RechercheReservation value) {
        return new JAXBElement<RechercheReservation>(_RechercheReservation_QNAME, RechercheReservation.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheReservationResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RechercheReservationResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "rechercheReservationResponse")
    public JAXBElement<RechercheReservationResponse> createRechercheReservationResponse(RechercheReservationResponse value) {
        return new JAXBElement<RechercheReservationResponse>(_RechercheReservationResponse_QNAME, RechercheReservationResponse.class, null, value);
    }

}
