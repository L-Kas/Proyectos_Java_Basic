
<%@page import="Servicio.Conversiones , java.util.*" %>

<%@page contentType="application-/vnd.ms-excel"  %>

<% String nombreArchivo="Reporte.xls"; 
   response.setHeader("Content-Disposition","attachment;filename="+nombreArchivo);

%>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Logica Reportes</title>
    </head>
    <body>
    <center>
        <h1>Reportes desde Jsp </h1>
        
        <table border="1">
            <tr>
                <th>ID Empleados </th>.
                <th>Nombre y Apellido </th>   
                <th>Correo </th> 
                <th>Edad </th>   
                <th>Fecha de Ingreso</th>   
            </tr>  
            <tr>
            <td>1</td>
            <td>Lucas Moyano</td>
            <td>moyano@gmail.com</td>
            <td>32</td>
            <td><%= Conversiones.formatearFecha(new Date()) %></td>
            </tr>
             <tr>
            <td>2</td>
            <td>Cristian Cardoso</td>
            <td>moyano@gmail.com</td>
            <td>56</td>
            <td><%= Conversiones.formatearFecha(new Date()) %></td>
            </tr>
                         <tr>
            <td>3</td>
            <td>Alfonzo rodriguez</td>
            <td>asano@gmail.com</td>
            <td>21</td>
            <td><%= Conversiones.formatearFecha(new Date()) %></td>
            </tr>

        </table>
            </center>
    </body>
</html>
