package com.mycompany.cxf.soap.skeleton;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.5.0
 * 2015-08-15T22:44:37.017+05:30
 * Generated source version: 2.5.0
 * 
 */
@WebService(targetNamespace = "http://model.soap.cxf.mycompany.com/", name = "PersonService")
@XmlSeeAlso({ObjectFactory.class})
public interface PersonService {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "getPerson", targetNamespace = "http://model.soap.cxf.mycompany.com/", className = "com.mycompany.cxf.soap.skeleton.GetPerson")
    @WebMethod
    @ResponseWrapper(localName = "getPersonResponse", targetNamespace = "http://model.soap.cxf.mycompany.com/", className = "com.mycompany.cxf.soap.skeleton.GetPersonResponse")
    public com.mycompany.cxf.soap.skeleton.Person getPerson(
        @WebParam(name = "id", targetNamespace = "")
        int id
    ) throws PersonException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "deletePerson", targetNamespace = "http://model.soap.cxf.mycompany.com/", className = "com.mycompany.cxf.soap.skeleton.DeletePerson")
    @WebMethod
    @ResponseWrapper(localName = "deletePersonResponse", targetNamespace = "http://model.soap.cxf.mycompany.com/", className = "com.mycompany.cxf.soap.skeleton.DeletePersonResponse")
    public com.mycompany.cxf.soap.skeleton.Person deletePerson(
        @WebParam(name = "id", targetNamespace = "")
        int id
    ) throws PersonException_Exception;

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "putPerson", targetNamespace = "http://model.soap.cxf.mycompany.com/", className = "com.mycompany.cxf.soap.skeleton.PutPerson")
    @WebMethod
    @ResponseWrapper(localName = "putPersonResponse", targetNamespace = "http://model.soap.cxf.mycompany.com/", className = "com.mycompany.cxf.soap.skeleton.PutPersonResponse")
    public com.mycompany.cxf.soap.skeleton.Person putPerson(
        @WebParam(name = "arg0", targetNamespace = "")
        com.mycompany.cxf.soap.skeleton.Person arg0
    );
}
