<%@include file="Template/Header.jsp" %>
<div class="container">
    <h1 class="well">Contacteer ons</h1>
    <div class="col-lg-12 well">
        <div class="row">

            <form class="form-horizontal" role="form" method="post" action="ContactComplete.jsp">
                <div class="form-group">
                    <label for="naam" class="col-sm-2 control-label">Naam</label>
                    <div class="col-sm-10">
                        <input type="text" class="form-control" id="naam" name="naam" placeholder="Naam" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="email" class="col-sm-2 control-label">E-mail</label>
                    <div class="col-sm-10">
                        <input type="email" class="form-control" id="email" name="email" placeholder="example@domain.com" required>
                    </div>
                </div>
                <div class="form-group">
                    <label for="message" class="col-sm-2 control-label">Bericht</label>
                    <div class="col-sm-10">
                        <textarea class="form-control" rows="4" name="message" placeholder="jouw bericht" required></textarea>
                    </div>
                </div>
                
                <div class="form-group">
                    <div class="col-sm-10 col-sm-offset-2">
                        <input id="submit" name="submit" type="submit" value="Verzenden" class="btn btn-primary">
                    </div>
                </div>

            </form>
        </div>
    </div>
</div>
<%@include file="Template/Footer.jsp" %>

