package org.apache.camel.example.reportincident;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.0.4.redhat-621084
 * 2016-09-06T17:59:58.005+01:00
 * Generated source version: 3.0.4.redhat-621084
 * 
 */
@WebServiceClient(name = "ReportIncidentEndpointService", 
                  wsdlLocation = "file:/local/testcase/01690852/jaxws-server-https-spring/src/main/resources/META-INF/wsdl/report_incident.wsdl",
                  targetNamespace = "http://reportincident.example.camel.apache.org") 
public class ReportIncidentEndpointService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentEndpointService");
    public final static QName ReportIncidentService = new QName("http://reportincident.example.camel.apache.org", "ReportIncidentService");
    static {
        URL url = null;
        try {
            url = new URL("file:/local/testcase/01690852/jaxws-server-https-spring/src/main/resources/META-INF/wsdl/report_incident.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(ReportIncidentEndpointService.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/local/testcase/01690852/jaxws-server-https-spring/src/main/resources/META-INF/wsdl/report_incident.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public ReportIncidentEndpointService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public ReportIncidentEndpointService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ReportIncidentEndpointService() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportIncidentEndpointService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportIncidentEndpointService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public ReportIncidentEndpointService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }    

    /**
     *
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentService")
    public ReportIncidentEndpoint getReportIncidentService() {
        return super.getPort(ReportIncidentService, ReportIncidentEndpoint.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ReportIncidentEndpoint
     */
    @WebEndpoint(name = "ReportIncidentService")
    public ReportIncidentEndpoint getReportIncidentService(WebServiceFeature... features) {
        return super.getPort(ReportIncidentService, ReportIncidentEndpoint.class, features);
    }

}
