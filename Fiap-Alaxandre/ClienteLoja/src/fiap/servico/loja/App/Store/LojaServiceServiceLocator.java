/**
 * LojaServiceServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package fiap.servico.loja.App.Store;

public class LojaServiceServiceLocator extends org.apache.axis.client.Service implements fiap.servico.loja.App.Store.LojaServiceService {

    public LojaServiceServiceLocator() {
    }


    public LojaServiceServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LojaServiceServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for lojaService
    private java.lang.String lojaService_address = "http://tempuri.org/loja.App.Store/services/lojaService";

    public java.lang.String getlojaServiceAddress() {
        return lojaService_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String lojaServiceWSDDServiceName = "lojaService";

    public java.lang.String getlojaServiceWSDDServiceName() {
        return lojaServiceWSDDServiceName;
    }

    public void setlojaServiceWSDDServiceName(java.lang.String name) {
        lojaServiceWSDDServiceName = name;
    }

    public fiap.servico.loja.App.Store.LojaService getlojaService() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(lojaService_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getlojaService(endpoint);
    }

    public fiap.servico.loja.App.Store.LojaService getlojaService(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            fiap.servico.loja.App.Store.LojaServiceSoapBindingStub _stub = new fiap.servico.loja.App.Store.LojaServiceSoapBindingStub(portAddress, this);
            _stub.setPortName(getlojaServiceWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setlojaServiceEndpointAddress(java.lang.String address) {
        lojaService_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (fiap.servico.loja.App.Store.LojaService.class.isAssignableFrom(serviceEndpointInterface)) {
                fiap.servico.loja.App.Store.LojaServiceSoapBindingStub _stub = new fiap.servico.loja.App.Store.LojaServiceSoapBindingStub(new java.net.URL(lojaService_address), this);
                _stub.setPortName(getlojaServiceWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("lojaService".equals(inputPortName)) {
            return getlojaService();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://Store.App.loja.servico.fiap", "lojaServiceService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://Store.App.loja.servico.fiap", "lojaService"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("lojaService".equals(portName)) {
            setlojaServiceEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
