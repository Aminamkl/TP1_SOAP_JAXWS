
package mypackage;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the mypackage package. 
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

    private final static QName _GetCompteResponse_QNAME = new QName("http://ws.example.org/", "getCompteResponse");
    private final static QName _GetCompte_QNAME = new QName("http://ws.example.org/", "getCompte");
    private final static QName _ConversionEuroToDHResponse_QNAME = new QName("http://ws.example.org/", "ConversionEuroToDHResponse");
    private final static QName _ConversionEuroToDH_QNAME = new QName("http://ws.example.org/", "ConversionEuroToDH");
    private final static QName _Compte_QNAME = new QName("http://ws.example.org/", "Compte");
    private final static QName _ListeComptesResponse_QNAME = new QName("http://ws.example.org/", "listeComptesResponse");
    private final static QName _ListeComptes_QNAME = new QName("http://ws.example.org/", "listeComptes");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: mypackage
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetCompte }
     * 
     */
    public GetCompte createGetCompte() {
        return new GetCompte();
    }

    /**
     * Create an instance of {@link GetCompteResponse }
     * 
     */
    public GetCompteResponse createGetCompteResponse() {
        return new GetCompteResponse();
    }

    /**
     * Create an instance of {@link ConversionEuroToDH }
     * 
     */
    public ConversionEuroToDH createConversionEuroToDH() {
        return new ConversionEuroToDH();
    }

    /**
     * Create an instance of {@link ConversionEuroToDHResponse }
     * 
     */
    public ConversionEuroToDHResponse createConversionEuroToDHResponse() {
        return new ConversionEuroToDHResponse();
    }

    /**
     * Create an instance of {@link Compte }
     * 
     */
    public Compte createCompte() {
        return new Compte();
    }

    /**
     * Create an instance of {@link ListeComptesResponse }
     * 
     */
    public ListeComptesResponse createListeComptesResponse() {
        return new ListeComptesResponse();
    }

    /**
     * Create an instance of {@link ListeComptes }
     * 
     */
    public ListeComptes createListeComptes() {
        return new ListeComptes();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "getCompteResponse")
    public JAXBElement<GetCompteResponse> createGetCompteResponse(GetCompteResponse value) {
        return new JAXBElement<GetCompteResponse>(_GetCompteResponse_QNAME, GetCompteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCompte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "getCompte")
    public JAXBElement<GetCompte> createGetCompte(GetCompte value) {
        return new JAXBElement<GetCompte>(_GetCompte_QNAME, GetCompte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDHResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "ConversionEuroToDHResponse")
    public JAXBElement<ConversionEuroToDHResponse> createConversionEuroToDHResponse(ConversionEuroToDHResponse value) {
        return new JAXBElement<ConversionEuroToDHResponse>(_ConversionEuroToDHResponse_QNAME, ConversionEuroToDHResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConversionEuroToDH }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "ConversionEuroToDH")
    public JAXBElement<ConversionEuroToDH> createConversionEuroToDH(ConversionEuroToDH value) {
        return new JAXBElement<ConversionEuroToDH>(_ConversionEuroToDH_QNAME, ConversionEuroToDH.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Compte }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "Compte")
    public JAXBElement<Compte> createCompte(Compte value) {
        return new JAXBElement<Compte>(_Compte_QNAME, Compte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeComptesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "listeComptesResponse")
    public JAXBElement<ListeComptesResponse> createListeComptesResponse(ListeComptesResponse value) {
        return new JAXBElement<ListeComptesResponse>(_ListeComptesResponse_QNAME, ListeComptesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListeComptes }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.example.org/", name = "listeComptes")
    public JAXBElement<ListeComptes> createListeComptes(ListeComptes value) {
        return new JAXBElement<ListeComptes>(_ListeComptes_QNAME, ListeComptes.class, null, value);
    }

}
