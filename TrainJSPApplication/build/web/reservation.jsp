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
        <title>Reservation Page</title>
    </head>
    <body>
        <form action='./'><input type="submit" value="Retour"></form>
            <% if (request.getParameter("identifiant_train")!= null)
                    out.println("<p> Reservation effectuee sur le train avec l'identifiant "+request.getParameter("identifiant_train")+" ! </p>");
                    // n'affiche la phrase de confirmation que si un identifiant est passé en parametres
            %>
        
         <h1>Liste des réservations effectuées : </h1>
        
         <table>
            <tr>
              <th>ID Reservation</th>
              <th>ID Train</th>
              <th>Numero Place</th>
            </tr>
            
         <%   try {
                trains.src.ReservationWebService_Service service = new trains.src.ReservationWebService_Service();
                trains.src.ReservationWebService port = service.getReservationWebServicePort();
                 // TODO initialize WS operation arguments here
                java.lang.String result = port.listReservations(); 
                
                DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        	DocumentBuilder builder;
                builder = factory.newDocumentBuilder();
                Document doc = builder.parse(new InputSource(new StringReader(result)));		
                doc.getDocumentElement().normalize();
                
                NodeList nList = doc.getElementsByTagName("reservation");
                
//                out.println(result);

                String tr = "";
                for (int index = 0; index< nList.getLength(); index++) {
                    Node nNode = nList.item(index);
                    String nodeName = nNode.getNodeName();
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element e = (Element) nNode;
                        String idReservation = e.getElementsByTagName("identifiant").item(0).getTextContent();
                        String idTrain = e.getElementsByTagName("train").item(0).getTextContent();
                        String numeroPlace = e.getElementsByTagName("siege").item(0).getTextContent();
                        
                        
                        tr += "<tr><td>" +
                                
                                idReservation + "</td><td>"+
                                idTrain + "</td><td>"+
                                numeroPlace + "</td></tr>";

                    }
                }
                
                out.println(tr);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            } 
            %>
         </table>
        
    </body>
</html>
