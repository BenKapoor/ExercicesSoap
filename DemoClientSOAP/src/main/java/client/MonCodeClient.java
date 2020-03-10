package client;

public class MonCodeClient {

	public static void main(String[] args) {
		// 1 instanciation du service (généré par wsimport)
		HelloObjisWSService monService = new HelloObjisWSService();
		
		// 2 récupération du client (généré par wsimport)
		IHelloObjis port = monService.getHelloObjisWSPort();
		
		// 3 appel d'une opération service
		String resultat = port.ditBonjour("Objis");
		
		System.out.println(resultat);
	}

}
