<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Email</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<link rel="stylesheet" href="../css/FormEmail.css">
</head>
<body>

	<div id="menu">
		<%@include file="../html/menu.html" %> 
	</div>

	<div class="col-xl-8 offset-xl-2 py-5">
         <form id="contact-form" method="post" action="../EmailSendingServlet" role="form">

                    <div class="messages"></div>

                    <div class="controls">

                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="form_name">Nome *</label>
                                    <input id="form_name" type="text" name="name" class="form-control" placeholder="Please enter your firstname *" required="required" data-error="Firstname is required.">
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="form_lastname">Cognome *</label>
                                    <input id="form_lastname" type="text" name="surname" class="form-control" placeholder="Please enter your lastname *" required="required" data-error="Lastname is required.">
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="form_email">From *</label>
                                    <input id="form_email" type="email" name="emailMittente" class="form-control" placeholder="Please enter your email *" required="required" data-error="Valid email is required.">
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                 
                        
                            <div class="col-md-6">
                                <div class="form-group">
                                    <label for="form_email">To *</label>
                                    <input id="form_email" type="email" name="emailDestinatario" class="form-control" placeholder="Please enter your email *" required="required" data-error="Valid email is required.">
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                 
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="form_email">Oggetto *</label>
                                    <input id="form_email" type="text" name="subject" class="form-control" placeholder="Please enter your subject *" required="required" data-error="Valid email is required.">
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                 
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <div class="form-group">
                                    <label for="form_message">Messaggio *</label>
                                    <textarea id="form_message" name="message" class="form-control" placeholder="Message for me *" rows="4" required="required" data-error="Please, leave us a message."></textarea>
                                    <div class="help-block with-errors"></div>
                                </div>
                            </div>
                            <div class="col-md-12">
                                <input type="submit" id="buttonInvia" class="btn btn-success btn-send" value="Invia ">
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-md-12">
                                <p class="text-muted">
                            </div>
                        </div>
                    </div>

           </form>
	</div>


	<div id="footer">
		<%@include file="../html/footer.html"%>
	</div>

  <!--
  
  <form action="../EmailSendingServletContattaci" method="post" style="color:black; margin-top: 50px" >
		<table border="0" width="50%" align="center">
			<caption><h2>Invia E-Mail</h2></caption>
			
			<tr>
				<td width="50%">E-Mail mittente</td>
				<td><input type="text" name="email-mittente" size="50"/></td>
			</tr>
			<tr>
				<td width="50%">Nome </td>
				<td><input type="text" name="nome" size="50"/></td>
			</tr>
			<tr>
				<td>Oggetto </td>
				<td><input type="text" name="subject" size="50"/></td>
			</tr>
			<tr>
				<td>Messaggio </td>
				<td><textarea rows="10" cols="51" name="content"></textarea> </td>
			</tr>
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Invia"/></td>
			</tr>
		</table>
	</form>

-->

</body>
</html>