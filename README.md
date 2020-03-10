# ExercicesSoap

<b>DemoProviderSOAP :</b>

Contient le web service exposé. Il faut le run sur un port libre, ici configurer sur (localhost:8888/hello) au niveau du main

Pour accéder au fichier wsdl généré : http://localhost:8888/hello?wsdl

<b>DemoWebSOAP :</b>

Lancer le provider avant.

Lancer la classe main, ouvrant une servlet et récupérant les informations envoyées par le provider

<b>DemoClientSOAP:</b>

Lancer le provider avant.

Lancer la classe main en console.

<b>DemoClientDavidSOAP:</b>

Se mettre sur le même réseau que la personne.

Lancer le provider de la personne.

Dans le projet client:

`wsimport -p teamsClient -keep http://"adresse ip du provider":"port du provider"/teams?wsdl`

Run le client.

<b>DemoClientTeam:</b>

Récupérer le provider : http://objis.com/tutoriel-web-service-soap-types-complexes/

Etape 1 : codage & compilation 'classique'

--> javac -d . *.java

Etape 2 : génération des Artifacts (Messages de Requete / Reponse) 

--> wsgen -cp . com.objis.demowebservice.team.Teams

Etape 3 : publication 

--> java com.objis.demowebservice.team.TeamsPublisher

Créer un projet et faire les étapes suivantes: 

Etape 4 : génération code client

--> wsimport -p teamsClient -keep http://localhost:8888/teams?wsdl

Etape 5 : codage du Client (main)

A vous de jouer : listez les joueur de chaque équipe !
