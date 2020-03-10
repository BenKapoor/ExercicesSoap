
package client;

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
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "HelloObjisService", targetNamespace = "http://service.webservicesoapserveur.ensup.eu/", wsdlLocation = "http://192.168.43.58:8888/hello?wsdl")
public class HelloObjisService
    extends Service
{

    private final static URL HELLOOBJISSERVICE_WSDL_LOCATION;
    private final static WebServiceException HELLOOBJISSERVICE_EXCEPTION;
    private final static QName HELLOOBJISSERVICE_QNAME = new QName("http://service.webservicesoapserveur.ensup.eu/", "HelloObjisService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://192.168.43.58:8888/hello?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        HELLOOBJISSERVICE_WSDL_LOCATION = url;
        HELLOOBJISSERVICE_EXCEPTION = e;
    }

    public HelloObjisService() {
        super(__getWsdlLocation(), HELLOOBJISSERVICE_QNAME);
    }

    public HelloObjisService(WebServiceFeature... features) {
        super(__getWsdlLocation(), HELLOOBJISSERVICE_QNAME, features);
    }

    public HelloObjisService(URL wsdlLocation) {
        super(wsdlLocation, HELLOOBJISSERVICE_QNAME);
    }

    public HelloObjisService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, HELLOOBJISSERVICE_QNAME, features);
    }

    public HelloObjisService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HelloObjisService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns IHelloObjis
     */
    @WebEndpoint(name = "HelloObjisPort")
    public IHelloObjis getHelloObjisPort() {
        return super.getPort(new QName("http://service.webservicesoapserveur.ensup.eu/", "HelloObjisPort"), IHelloObjis.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns IHelloObjis
     */
    @WebEndpoint(name = "HelloObjisPort")
    public IHelloObjis getHelloObjisPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.webservicesoapserveur.ensup.eu/", "HelloObjisPort"), IHelloObjis.class, features);
    }

    private static URL __getWsdlLocation() {
        if (HELLOOBJISSERVICE_EXCEPTION!= null) {
            throw HELLOOBJISSERVICE_EXCEPTION;
        }
        return HELLOOBJISSERVICE_WSDL_LOCATION;
    }

}
