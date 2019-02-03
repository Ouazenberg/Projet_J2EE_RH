<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
   <head>
	    <title>IsyRH</title>           
	    <!--Import Google Icon Font-->
	    <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
	    <!--Import materialize.css & my css-->
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/0.98.1/css/materialize.min.css">
	    <link rel="stylesheet" href="resources/css/main.css">
	    <!--Let browser know website is encoded with utf-8 & is optimized for mobile-->
	    <meta charset="UTF-8" name="viewport" content="width=device-width, initial-scale=1.0"/>
	      
		<!--Import jQuery & materialize.js-->
		<script type="text/javascript" src="https://code.jquery.com/jquery-2.1.1.min.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/materialize.js"></script>
		<script src="${pageContext.request.contextPath}/resources/js/myScript.js"></script>  
		<script src = "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/js/materialize.min.js"></script> 
		<script>  $(document).ready(function(){$('select').formSelect(); });</script>        
		<script>
		$(document).ready(function() {
			  $('.collapsible').collapsible({
			    accordion: false
			  });
			});
		</script>
		<script>
		$(document).ready(function(){
		    $('select').formSelect();
		  });
		</script>
	
   </head>
   
	<body class="white">


		<div class="navbar-fixed">
			<nav class="black">
				<div class="nav-wrapper">
					<ul id="nav-mobile" class="left hide-on-med-and-down">
						<li><a href="#" class="orange darken-4"><i style="font-size: 40px;" class="large material-icons">home</i></a></li>
						<li><a href="#" class="myBtn">Ajouter un utilisateur</a></li>
						<li><a href="<c:url value='/Cv/ajouterCV/' />" class="myBtn">Créer une Candidature </a></li>
					</ul>
					
					<ul id="nav-mobile" class="hide-on-med-and-down" style="margin-left: 50%;">
						<!-- Rescherche -->
						<form method="get" action="/Annonce/rechrecheAnnonce" >
							<li>
								<div class="row">
									<div class="col s12">
										<div class="row">
											<div class="input-field col s12">
												<input type="text" id="autocomplete-input" class="validate autocomplete">
												<label for="autocomplete-input"><i class="material-icons left"> search </i>Tapez un mot</label>
											</div>
										</div>
									</div>
								</div>
							</li>
							<li>
								<button class="btn waves-effect waves-light grey darken-3" type="submit" name="action">
								   <small>Recherche</small>
								</button>
							</li>
						</form>              
					</ul>

					<ul class="right hide-on-med-and-down">
						<li> NOM ICI </li>
						<!-- Dropdown Trigger (profile icon) -->
						<li>
							<a class="dropdown-trigger" href="#" data-target="data">
								<i class="material-icons">account_circle</i> 
							</a>
						</li>
						<!-- Dropdown Structure (Profile card)-->
						<ul class="dropdown-content" id="data" >
							<div class="myAccountDiv">
									<center><i class="material-icons myAccountIcon">account_box</i></center>
									<center> <text> NOM ICI </text>  </center>
							</div>
							<li class="divider" tabindex="-1"></li>
							<li><a href="#!" class="MyDisconnectBtn"><i class="material-icons">power_settings_new</i>Se déconnecter</a></li>
						</ul>
					</ul>
				</div>
			</nav>

		</div>
  <br><br>
<div class="margined">      
      
      <c:url var="addAction" value="/CV/filter" ></c:url>
<form:form action="${addAction}" commandName="filt" class="table table-sm table-dark">
  <div class = "row">
         <div class = "col s2">
         <img width="300px" src="${pageContext.request.contextPath}/resources/images/dd.png">
         </div>
         
         <div class = "col s1">
         <b>Filtrer Par:</b>
         </div>
      <div class="input-field col s1.5">
         <form:label path="niveauFormation"></form:label>
         <select id="niveauFormation" name="niveauFormation" class="form-control">
            <option value="" >Selectionner</option>
            <option value="BAC+3">Bac+3</option>
            <option value="BAC+4">Bac+4</option>
            <option value="BAC+5">Bac+5</option>
         </select>
         <label>Niveau Formation</label>
      </div>
      <div class="input-field col s1.2">
         <form:label path="disponibilite"></form:label>
         <select id="disponibilite" name="disponibilite" class="form-control">
            <option value= "" >Selectionner</option>
            <option value="immediat">Tout de suite</option>
            <option value="dans 3 mois">Dans 3 mois</option>
            <option value="dans 6 mois">Dans 6 mois</option>                        
            <option value="Plus de 6 mois">Plus de 6 mois</option>
         </select>
         <label>Disponibilité</label>
      </div>
      <div class="input-field col s1.2">
         <form:label path="mobilite"></form:label>
         <select id="mobilite" name="mobilite" class="form-control">
            <option value= "" >Selectionner</option>
            <option value="Ile de France">Ile de France</option>
            <option value="toute la france">Toute la France</option>
            <option value="international">Internationale</option>
         </select>
         <label>Mobilité</label>
      </div>
      <div class="input-field col s1.2">
         <form:label path="siteSource"></form:label>
         <select id="siteSource" name="siteSource" class="form-control">
            <option value= "" >Selectionner</option>
            <option value="linkedin">Linkd'in</option>
            <option value="Lesjeudis">Lesjeudis</option>
            <option value="indeed">Indeed</option>
            <option value="monster">Monster</option>
         </select>
         <label>Site Source</label>
      </div>
      <div class="input-field col s1">
      <input type="submit" style="font-size: 15px" class="btn-large grey darken-4" 
      		 value="<spring:message text="Filtrer"/>" />
      </div>
   </div>
</form:form>
      
      
      
      
      <hr>
      <div class = "row">
      <div class = "col s12">
         <ul class = "tabs ">
            <li class = "tab col s4 grey lighten-5"><a  href = "#home">HOME</a></li>
            <li class = "tab col s4 grey lighten-5"><a href = "#favorite">FAVORIS</a></li>
            <li class = "tab col s4 grey lighten-5"><a href = "#archives"> ARCHIVES</a></li>
         </ul>
         
         
    
      </div>
      
      
      
      
      <div id = "home" class = "col s12">
         <table class="highlight">
            <thead>
               <tr>
                     <th>Matricule</th>
                     <th>Nom</th>
                     <th>Prénom</th>
                     <th>CV Isydata</th>                   
                     <th>CV Candidat</th>
                     <th>Formation</th>
                     <th>Disponibilité</th>
                     <th>Mobilité</th>
                      <th>Etat</th>
                     <th></th>
               </tr>
            </thead>
            <tbody>
            
            <c:forEach items="${listcv}" var="cv">
            <tr class='clickable-row' data-href='${pageContext.request.contextPath}/Cv/details/${cv.idCv}'>
            <td>${cv.idCv}</td>
            <td>${cv.candidat.nom}</td>
            <td>${cv.candidat.prenom}</td>
            <td>${cv.titreIsyData}</td>
            <td>${cv.titreCandidat}</td>
            <td>${cv.candidat.niveauFormation}</td>
            <td>${cv.candidat.disponibilite}</td>
            <td>${cv.candidat.mobilite}</td>
            <td>${cv.etat}</td>
            <td>   
            <a href="<c:url value='/CV/favoris/${cv.idCv}' />"><i class="material-icons ">favorite</i></a>   
                <a href="<c:url value='/CV/archive/${cv.idCv}' />"><i class="material-icons ">archive</i></a>   
            <a href="<c:url value='/CV/removeCv/${cv.idCv}' />"><i class="material-icons ">mode_delete</i></a>  
            </td>
            </tr>
   			</c:forEach>
            </tbody>
         </table>
         </div>
         
         
         
         
         
         
         <div id = "favorite" class = "col s12">
         
             <table class="highlight">
            <thead>
               <tr>
                     <th> </th>
                     <th>Matricule</th>
                     <th>Nom</th>
                     <th>Prénom</th>
                     <th>CV Isydata</th>                   
                     <th>CV Candidat</th>
                     <th>Formation</th>
                     <th>Disponibilité</th>
                     <th>Mobilité</th>
                     <th></th>
               </tr>
            </thead>
            <tbody>
<c:forEach items="${listcvfavoris}" var="cv">
            <tr class='clickable-row' data-href='url://'>
           	<td>${cv.idCv}</td>
            <td>${cv.candidat.nom}</td>
            <td>${cv.candidat.prenom}</td>
            <td>${cv.titreIsyData}</td>
            <td>${cv.titreCandidat}</td>
            <td>${cv.candidat.niveauFormation}</td>
            <td>${cv.candidat.disponibilite}</td>
            <td>${cv.candidat.mobilite}</td>
            <td>   
            <a href="<c:url value='/CV/cvHome/${cv.idCv}' />"><i class="material-icons ">favorite_border</i></a>   
            <a href="<c:url value='/CV/removeCv/${cv.idCv}' />"><i class="material-icons ">mode_delete</i></a>  
            </td>
            </tr>
   			</c:forEach>
            </tbody>
         </table>
         </div>

         <div id = "archives" class = "col s12">
             <table class="highlight">
            <thead>
               <tr>
                     <th> </th>
                     <th>Matricule</th>
                     <th>Nom</th>
                     <th>Prénom</th>
                     <th>CV Isydata</th>                   
                     <th>CV Candidat</th>
                     <th>Formation</th>
                     <th>Disponibilité</th>
                     <th>Mobilité</th>
                     <th></th>
               </tr>
            </thead>
            <tbody>
<c:forEach items="${listcvarchives}" var="cv">
            <tr class='clickable-row' data-href='url://'>
           	<td>${cv.idCv}</td>
            <td>${cv.candidat.nom}</td>
            <td>${cv.candidat.prenom}</td>
            <td>${cv.titreIsyData}</td>
            <td>${cv.titreCandidat}</td>
            <td>${cv.candidat.niveauFormation}</td>
            <td>${cv.candidat.disponibilite}</td>
            <td>${cv.candidat.mobilite}</td>
            <td>   
            <a href="<c:url value='/CV/cvHome/${cv.idCv}' />"><i class="material-icons ">border_outer</i></a>          
            <a href="<c:url value='/CV/removeCv/${cv.idCv}' />"><i class="material-icons ">mode_delete</i></a>  
            </td>
            </tr>
   			</c:forEach>            </tbody>
         </table>
         </div>
      </div>
     
     
     
      <footer style="bottom:0;left:0;width:100%;background-color:tomato;" class="page-footer grey darken-3">
         <div class="container grey darken-3">
            <div class="row">
               <div class="col l6 s12">
                  <h5 class="white-text">ISYdata Content</h5>
               </div>
               <div class="col l4 offset-l2 s12">
                  <h5 class="white-text">Link ISYdata</h5>
               </div>
            </div>
         </div>
         <div class="footer-copyright">
            <div class="container">
               © 2018 Copyright ISYdata
               <a class="grey-text text-lighten-4 right" href="#!">More ISYdata</a>
            </div>
         </div>
      </footer>
	        	  
   </body>
</html>

