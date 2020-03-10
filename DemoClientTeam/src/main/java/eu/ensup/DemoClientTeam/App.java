package eu.ensup.DemoClientTeam;

import java.util.List;

import javax.xml.ws.Endpoint;

import teamsClient.GetTeam;
import teamsClient.Team;
import teamsClient.Teams;
import teamsClient.TeamsService;

/**
 * Hello world!
 *
 */
public class App 
{	
    public static void main( String[] args )
    {
    	// 1 instanciation du service (généré par wsimport)
		TeamsService monService = new TeamsService();
		
		// 2 récupération de la liste de joueurs (généré par wsimport)
		Teams port = monService.getTeamsPort();
		
		// 3 appel d'une opération service
		List<Team> resultat = port.getTeams();
		
		for(int i = 0; i < resultat.size(); i++) {
			System.out.println("\t \n Nombre de joueurs : " + resultat.get(i).getRosterCount());
			System.out.println("\n Equipe : " + resultat.get(i).getName());
			for(int y = 0; y < resultat.get(i).getPlayers().size(); y++) {
				System.out.println("_____                             _____");
				System.out.println("\t Nom : " + resultat.get(i).getPlayers().get(y).getName());
				System.out.println("\t Surnom : " + resultat.get(i).getPlayers().get(y).getNickname());
				System.out.println("_____                             _____");
			}
			
			System.out.println("--------------------------------------------");

		}	
    }
}
