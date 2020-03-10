package eu.ensup.DemoProviderSOAP.service;
import javax.jws.*;
import javax.jws.soap.*;

@WebService
@SOAPBinding(style = SOAPBinding.Style.DOCUMENT)
public interface IHelloObjis {
	@WebResult(partName="response")
	String ditBonjour(@WebParam(partName="nomParametre")String nom);

}
