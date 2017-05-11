<%-- 
    Document   : index
    Created on : 14 Apr, 2014, 7:23:12 PM
    Author     : TG
<link rel="stylesheet" href="bg.css" />

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to KotiSoft Development center</title>
      <script src="jquery-1.9.1.js"></script>
  <script src="jquery-ui-1.10.3.custom.js"></script>
  <link rel="stylesheet" href="jquery-ui.css" />
  
    </head>
    <body>
    
<center><img src="kotisoft.jpg" height="250"></center>
<marquee>Welcome Customer,Choose Report to report a problem. Choose Check Status to check status of problem.</marquee>
<br>
<form name="issue" method="post" action="reportthis">
    <fieldset name="report" >
        <legend>Report an Issue</legend>
    <table border="0" align="center">
        <tr><td><br>Name:</td><td><input type="text" name="Name" value="" required placeholder="eg:Ishant Sharma" size="50"/></td></tr>
        <tr><td><br>Email Address:</td><td><input type="email" name="Emailid" value="" required size="50" placeholder="eg: rahulpappu@gmail.com"/></td></tr>
        <tr><td><br>Model:</td><td><input type="text" name="Model" value="" placeholder="eg:K110" required size="50"/></td></tr>
<tr><td><br>Problem:</td><td><input type="text" name="Problem" value="" size="100" required placeholder="eg:Display Not Working"/></td></tr>
<tr><td><br><input type="Submit" name="Submit" value="Report"></td></tr>
    </table>
    </fieldset>
</form><br>
<center>
<form name="check" action="checkstatus" method="post">
    <legend>Check Status of Reported Issue</legend><br> 
    <br>Email Address:</td><td><input type="email" name="emailid1234" value="" size="50" required placeholder="eg: rahulpappu@gmail.com"/>
    <input type="Submit" name="submit" value="Check">
</form>
       
        </center>

<br>
<br>
<a href="http://localhost/phpmyadmin/index.php?db=kotisoft&token=3f9717db057473b09dac0302ef9664d2">Admin View</a>
<center>Copyrights Reserved.</center>
    </body>
</html>
