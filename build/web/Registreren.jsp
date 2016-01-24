<%@include file="Template/Header.jsp" %>

<div class="container">
    <h1 class="well">Registreer</h1>
    <div class="col-lg-12 well">
        <div class="row">
            <form name="Registreren" action="Registreren" method="POST">
                <div class="col-sm-12">
                    <div class="row">
                        <div class="col-sm-4 form-group">

                            <label>Voornaam</label>
                            <input type="text" placeholder="Voornaam" class="form-control" name="Voornaam" required>
                        </div>

                        <div class="col-sm-4 form-group">
                            <label>Achternaam</label>
                            <input type="text" placeholder="Achternaam" class="form-control" name="Achternaam" required>
                        </div>
                    </div>					
                    <div class="row">
                        <div class="col-sm-12 form-group">
                            <label>Adres</label>
                            <textarea placeholder="Adres" rows="2" class="form-control" name="Adres" required></textarea>
                        </div>
                    </div>	
                    <div class="row">
                        <div class="col-sm-4 form-group">
                            <label>Postcode</label>
                            <input type="number" placeholder="Postcode" class="form-control" name="Postcode" required>
                        </div>
                        <div class="col-sm-4 form-group">
                            <label>Stad</label>
                            <input type="text" placeholder="Stad" class="form-control" name="Stad" required>
                        </div>	
                    </div>
                    <div class="row"> 						
                        <div class="col-sm-4 form-group">
                            <label>Telefoonnummer</label>
                            <input type="text" placeholder="Telefoonnummer" class="form-control" name="Telefoonnummer" required>
                        </div>		
                        <div class="col-sm-4 form-group">
                            <label>E-mailadres</label>
                            <input type="email" placeholder="E-mailadres" class="form-control" name="Emailadres" required>
                        </div>	
                    </div>
                      <div class="row"> 						
                        <div class="col-sm-4 form-group">
                            <label>Wachtwoord</label>
                            <input type="password" placeholder="Wachtwoord" class="form-control" name="Wachtwoord" required>
                        </div>		
                        <div class="col-sm-4 form-group">
                            <label>Wachtwoord opnieuw invoeren</label>
                            <input type="password" placeholder="Wachtwoord opnieuw invoeren" class="form-control" name="HerhaalWachtwoord" required>
                        </div>	
                    </div>
                    <div class="row">
                        <div class="col-sm-12 form-group">
                           <button type="submit" class="btn btn-lg btn-info">Registreren</button> 
                        </div>
                        
                    </div>
                </div>              
                					
        </div>
        </form>
            
            
            
    </div>
</div>
</div>

<%@include file="Template/Footer.jsp" %>