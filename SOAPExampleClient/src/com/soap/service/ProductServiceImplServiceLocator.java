/**
 * ProductServiceImplServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.soap.service;

public class ProductServiceImplServiceLocator extends org.apache.axis.client.Service implements com.soap.service.ProductServiceImplService {

    public ProductServiceImplServiceLocator() {
    }


    public ProductServiceImplServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public ProductServiceImplServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for ProductServiceImpl
    private java.lang.String ProductServiceImpl_address = "http://localhost:8081/SOAPExample/services/ProductServiceImpl";

    public java.lang.String getProductServiceImplAddress() {
        return ProductServiceImpl_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String ProductServiceImplWSDDServiceName = "ProductServiceImpl";

    public java.lang.String getProductServiceImplWSDDServiceName() {
        return ProductServiceImplWSDDServiceName;
    }

    public void setProductServiceImplWSDDServiceName(java.lang.String name) {
        ProductServiceImplWSDDServiceName = name;
    }

    public com.soap.service.ProductServiceImpl getProductServiceImpl() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(ProductServiceImpl_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getProductServiceImpl(endpoint);
    }

    public com.soap.service.ProductServiceImpl getProductServiceImpl(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.soap.service.ProductServiceImplSoapBindingStub _stub = new com.soap.service.ProductServiceImplSoapBindingStub(portAddress, this);
            _stub.setPortName(getProductServiceImplWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setProductServiceImplEndpointAddress(java.lang.String address) {
        ProductServiceImpl_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.soap.service.ProductServiceImpl.class.isAssignableFrom(serviceEndpointInterface)) {
                com.soap.service.ProductServiceImplSoapBindingStub _stub = new com.soap.service.ProductServiceImplSoapBindingStub(new java.net.URL(ProductServiceImpl_address), this);
                _stub.setPortName(getProductServiceImplWSDDServiceName());
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
        if ("ProductServiceImpl".equals(inputPortName)) {
            return getProductServiceImpl();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://service.soap.com", "ProductServiceImplService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://service.soap.com", "ProductServiceImpl"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("ProductServiceImpl".equals(portName)) {
            setProductServiceImplEndpointAddress(address);
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
