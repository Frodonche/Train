
package trains.src;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the trains.src package. 
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
    private final static QName _AddTrain_QNAME = new QName("http://src.trains/", "addTrain");
    private final static QName _AddTrainResponse_QNAME = new QName("http://src.trains/", "addTrainResponse");
    private final static QName _Hello_QNAME = new QName("http://src.trains/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://src.trains/", "helloResponse");
    private final static QName _ListTrains_QNAME = new QName("http://src.trains/", "listTrains");
    private final static QName _ListTrainsResponse_QNAME = new QName("http://src.trains/", "listTrainsResponse");
    private final static QName _RechercheTrain_QNAME = new QName("http://src.trains/", "rechercheTrain");
    private final static QName _RechercheTrainResponse_QNAME = new QName("http://src.trains/", "rechercheTrainResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: trains.src
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
     * Create an instance of {@link AddTrain }
     * 
     */
    public AddTrain createAddTrain() {
        return new AddTrain();
    }

    /**
     * Create an instance of {@link AddTrainResponse }
     * 
     */
    public AddTrainResponse createAddTrainResponse() {
        return new AddTrainResponse();
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
     * Create an instance of {@link ListTrains }
     * 
     */
    public ListTrains createListTrains() {
        return new ListTrains();
    }

    /**
     * Create an instance of {@link ListTrainsResponse }
     * 
     */
    public ListTrainsResponse createListTrainsResponse() {
        return new ListTrainsResponse();
    }

    /**
     * Create an instance of {@link RechercheTrain }
     * 
     */
    public RechercheTrain createRechercheTrain() {
        return new RechercheTrain();
    }

    /**
     * Create an instance of {@link RechercheTrainResponse }
     * 
     */
    public RechercheTrainResponse createRechercheTrainResponse() {
        return new RechercheTrainResponse();
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
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTrain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTrain }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "addTrain")
    public JAXBElement<AddTrain> createAddTrain(AddTrain value) {
        return new JAXBElement<AddTrain>(_AddTrain_QNAME, AddTrain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddTrainResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AddTrainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "addTrainResponse")
    public JAXBElement<AddTrainResponse> createAddTrainResponse(AddTrainResponse value) {
        return new JAXBElement<AddTrainResponse>(_AddTrainResponse_QNAME, AddTrainResponse.class, null, value);
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
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTrains }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListTrains }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "listTrains")
    public JAXBElement<ListTrains> createListTrains(ListTrains value) {
        return new JAXBElement<ListTrains>(_ListTrains_QNAME, ListTrains.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListTrainsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ListTrainsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "listTrainsResponse")
    public JAXBElement<ListTrainsResponse> createListTrainsResponse(ListTrainsResponse value) {
        return new JAXBElement<ListTrainsResponse>(_ListTrainsResponse_QNAME, ListTrainsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheTrain }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RechercheTrain }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "rechercheTrain")
    public JAXBElement<RechercheTrain> createRechercheTrain(RechercheTrain value) {
        return new JAXBElement<RechercheTrain>(_RechercheTrain_QNAME, RechercheTrain.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercheTrainResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link RechercheTrainResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://src.trains/", name = "rechercheTrainResponse")
    public JAXBElement<RechercheTrainResponse> createRechercheTrainResponse(RechercheTrainResponse value) {
        return new JAXBElement<RechercheTrainResponse>(_RechercheTrainResponse_QNAME, RechercheTrainResponse.class, null, value);
    }

}
