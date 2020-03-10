package eu.ensup.DemoProviderSOAP.intercepteurs;

import java.io.IOException;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.namespace.QName;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;
import javax.xml.ws.handler.soap.SOAPHandler;
import javax.xml.ws.handler.soap.SOAPMessageContext;
import javax.xml.ws.handler.MessageContext;


public class SoapMessageHandler implements SOAPHandler<SOAPMessageContext>{

	public boolean handleMessage(SOAPMessageContext context) {
		SOAPMessage msg = context.getMessage();
		
		try {
			msg.writeTo(System.out);
			
		} catch (SOAPException | IOException e) {
			Logger.getLogger(SoapMessageHandler.class.getName()).log(Level.SEVERE, null, e);
		}
		return true;
	}

	public boolean handleFault(SOAPMessageContext context) {
		// TODO Auto-generated method stub
		return false;
	}

	public void close(MessageContext context) {
		// TODO Auto-generated method stub
		
	}

	public Set<QName> getHeaders() {
		// TODO Auto-generated method stub
		return null;
	}

}
