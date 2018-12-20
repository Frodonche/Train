<%-- 
    Document   : index
    Created on : 20 déc. 2018, 15:57:34
    Author     : tarek
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        
            <%-- start web service invocation --%><hr/>
            <%
            try {
                trains.src.TrainWebService_Service service = new trains.src.TrainWebService_Service();
                trains.src.TrainWebService port = service.getTrainWebServicePort();
                 // TODO initialize WS operation arguments here
                java.lang.String villeDepart = "";
                java.lang.String villeArrivee = "";
                int heureDepart = 0;
                // TODO process result here
                java.lang.String result = port.rechercheTrain(villeDepart, villeArrivee, heureDepart);
                out.println("Result = "+result);
            } catch (Exception ex) {
                // TODO handle custom exceptions here
            }
            %>
            <%-- end web service invocation --%><hr/>

    </body>
</html>
