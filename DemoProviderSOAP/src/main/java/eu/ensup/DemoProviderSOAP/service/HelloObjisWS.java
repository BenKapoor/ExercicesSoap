package eu.ensup.DemoProviderSOAP.service;
import javax.jws.*;

@WebService(endpointInterface = "eu.ensup.DemoProviderSOAP.service.IHelloObjis")
@HandlerChain(file="LogMessageHandler.xml")
public class HelloObjisWS implements IHelloObjis{

	public String ditBonjour(String nom) {
		// TODO Auto-generated method stub
		return "Hello, " + nom + "!";
	}

}
