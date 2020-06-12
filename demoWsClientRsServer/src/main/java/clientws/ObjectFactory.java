
package clientws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clientws package. 
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

    private final static QName _GetIpAddress_QNAME = new QName("http://ws.objis.com/", "getIpAddress");
    private final static QName _GetIpAddressResponse_QNAME = new QName("http://ws.objis.com/", "getIpAddressResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clientws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetIpAddressResponse }
     * 
     */
    public GetIpAddressResponse createGetIpAddressResponse() {
        return new GetIpAddressResponse();
    }

    /**
     * Create an instance of {@link GetIpAddress }
     * 
     */
    public GetIpAddress createGetIpAddress() {
        return new GetIpAddress();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpAddress }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.objis.com/", name = "getIpAddress")
    public JAXBElement<GetIpAddress> createGetIpAddress(GetIpAddress value) {
        return new JAXBElement<GetIpAddress>(_GetIpAddress_QNAME, GetIpAddress.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetIpAddressResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.objis.com/", name = "getIpAddressResponse")
    public JAXBElement<GetIpAddressResponse> createGetIpAddressResponse(GetIpAddressResponse value) {
        return new JAXBElement<GetIpAddressResponse>(_GetIpAddressResponse_QNAME, GetIpAddressResponse.class, null, value);
    }

}
