
package clientws;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "ServerInfo", targetNamespace = "http://ws.objis.com/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface ServerInfo {


    /**
     * 
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "getIpAddress", targetNamespace = "http://ws.objis.com/", className = "clientws.GetIpAddress")
    @ResponseWrapper(localName = "getIpAddressResponse", targetNamespace = "http://ws.objis.com/", className = "clientws.GetIpAddressResponse")
    @Action(input = "http://ws.objis.com/ServerInfo/getIpAddressRequest", output = "http://ws.objis.com/ServerInfo/getIpAddressResponse")
    public String getIpAddress();

}
