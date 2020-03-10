package eu.ensup.DemoProviderSOAP.presentation;

import javax.xml.ws.*;

import eu.ensup.DemoProviderSOAP.service.HelloObjisWS;
import eu.ensup.DemoProviderSOAP.service.IHelloObjis;

public class HelloObjisPublisher {

	public static final String URI = "http://localhost:8888/hello";
	
	public static void main(String[] args) {
		// Créer un instance de l'implementation
		HelloObjisWS implementation = new HelloObjisWS();
		
		// Rend d'isponible l'instance
		Endpoint endpoint = Endpoint.publish(URI, implementation);
		
		// Tester la disponibilité du endpoint
		boolean status = endpoint.isPublished();
		System.out.println("Web service disponible ?" + status);
	}

}
