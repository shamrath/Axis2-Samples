
package org.apache.axis2.sample.jaxws;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.1.6 in JDK 6
 * Generated source version: 2.1
 * 
 */
@WebServiceClient(name = "JAXWSServiceService", targetNamespace = "http//axis2.apache.org/sample/jaxws", wsdlLocation = "http://localhost:8080/axis2/services/JAXWSServiceService?wsdl")
public class JAXWSServiceService
    extends Service
{

    private final static URL JAXWSSERVICESERVICE_WSDL_LOCATION;
    private final static Logger logger = Logger.getLogger(JAXWSServiceService.class.getName());

    static {
        URL url = null;
        try {
            URL baseUrl;
            baseUrl = JAXWSServiceService.class.getResource(".");
            url = new URL(baseUrl, "http://localhost:8080/axis2/services/JAXWSServiceService?wsdl");
        } catch (MalformedURLException e) {
            logger.warning("Failed to create URL for the wsdl Location: 'http://localhost:8080/axis2/services/JAXWSServiceService?wsdl', retrying as a local file");
            logger.warning(e.getMessage());
        }
        JAXWSSERVICESERVICE_WSDL_LOCATION = url;
    }

    public JAXWSServiceService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public JAXWSServiceService() {
        super(JAXWSSERVICESERVICE_WSDL_LOCATION, new QName("http//axis2.apache.org/sample/jaxws", "JAXWSServiceService"));
    }

    /**
     * 
     * @return
     *     returns JAXWSService
     */
    @WebEndpoint(name = "JAXWSServicePort")
    public JAXWSService getJAXWSServicePort() {
        return super.getPort(new QName("http//axis2.apache.org/sample/jaxws", "JAXWSServicePort"), JAXWSService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns JAXWSService
     */
    @WebEndpoint(name = "JAXWSServicePort")
    public JAXWSService getJAXWSServicePort(WebServiceFeature... features) {
        return super.getPort(new QName("http//axis2.apache.org/sample/jaxws", "JAXWSServicePort"), JAXWSService.class, features);
    }

}