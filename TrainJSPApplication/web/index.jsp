<%-- 
    Document   : index
    Created on : 20 déc. 2018, 15:57:34
    Author     : tarek
--%>

<%@page import="org.w3c.dom.Element"%>
<%@page import="org.w3c.dom.Node"%>
<%@page import="org.w3c.dom.NodeList"%>
<%@page import="java.io.StringReader"%>
<%@page import="org.xml.sax.InputSource"%>
<%@page import="org.w3c.dom.Document"%>
<%@page import="javax.xml.parsers.DocumentBuilder"%>
<%@page import="javax.xml.parsers.DocumentBuilderFactory"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Liste des trains disponibles : </h1>
           <form method="post" action="ReservationServlet"> <!-- Formulaire permettant l'affichage des radio button et de la confirmation de la reservation -->
            <table>
            <tr>
              <th>Identifiant</th>
              <th>ville de départ</th>
              <th>Ville d'arrivée</th>
              <th>Heure du départ</th>
              <th>Prix du billet</th>
              <th>Places restantes</th>
            </tr>
               
<%
            try {
                trains.src.TrainWebService_Service service = new trains.src.TrainWebService_Service();
                trains.src.TrainWebService port = service.getTrainWebServicePort();
                 // TODO initialize WS operation arguments here
                java.lang.String result = port.listTrains(); //port.rechercheTrain(villeDepart, villeArrivee, heureDepart);
    
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        	DocumentBuilder builder;
                builder = factory.newDocumentBuilder();
                Document doc = builder.parse(new InputSource(new StringReader(result)));		
                doc.getDocumentElement().normalize();
                
                NodeList nList = doc.getElementsByTagName("trains");
                
//                out.println(result);

                String tr = "";
                for (int index = 0; index< nList.getLength(); index++) {
                    Node nNode = nList.item(index);
                    String nodeName = nNode.getNodeName();
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element e = (Element) nNode;
                        String identifiant = e.getElementsByTagName("identifiant").item(0).getTextContent();
                        String villeDepart = e.getElementsByTagName("villeDepart").item(0).getTextContent();
                        String villeArrivee = e.getElementsByTagName("villeArrivee").item(0).getTextContent();
                        String heureDepart = e.getElementsByTagName("heureDepart").item(0).getTextContent();
                        String prixBillet = e.getElementsByTagName("prixBillet").item(0).getTextContent();
                        String places = e.getElementsByTagName("places").item(0).getTextContent();
                        
                        
                        tr += "<tr><td>" +
                                
                                 "<input type=\"radio\" name=\"identifiant_train\" value=\""+identifiant+"\">" + "</td><td>"+ // Radio button pour choisir un train par son id
                                
                                identifiant + "</td><td>"+
                                villeDepart + "</td><td>"+
                                villeArrivee + "</td><td>"+
                                heureDepart + "</td><td>"+
                                prixBillet + "</td><td>"+
                                places + "</td></tr>";

                    }
                }
                
                out.println(tr);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            } 

            %>
            
            </table>
            <input type="submit" value="Reserver">
           </form>
    </body>
</html>
