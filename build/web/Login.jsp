
<%@include file="Template/Header.jsp" %>
<div class="container">
    <div class="col-sm-3">
        <form class="form-signin" method="POST" action="Login">
            <h2 class="form-signin-heading">Log in aub</h2>
            <% if(request.getAttribute("error")!= null){%>
            <p style="color: red;"><%= request.getAttribute("error") %></p>
            <%}%>
            <label for="inputEmail" class="sr-only">E-mailadres</label>
            <input type="email" name="email" class="form-control" placeholder="Email address" required>
            <label for="inputPassword" class="sr-only">wachtwoord</label>
            <input type="password" name="wachtwoord" class="form-control" placeholder="wachtwoord" required>

            <button class="btn btn-lg btn-primary btn-block" type="submit">inloggen</button>
        </form>
    </div>

</div> <!-- /container -->
<%@include file="Template/Footer.jsp" %>
