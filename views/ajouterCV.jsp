<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	    <title>Ajouter CV</title>           
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
		
		  <script>
		  $(document).ready(function(){
			    $('select').formSelect();
			  });
		  </script> 
		  
		<script>
		$(document).ready(function(){
		    $('.collapsible').collapsible();
		  });</script>
		 
		 <link rel = "stylesheet"
         href = "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/css/materialize.min.css">
      <script type = "text/javascript"
         src = "https://code.jquery.com/jquery-2.1.1.min.js"></script>           
      <script src = "https://cdnjs.cloudflare.com/ajax/libs/materialize/0.97.3/js/materialize.min.js">
      </script> 
   </head>




<body >

<div class="navbar-fixed">
			<nav class="black">
				<div class="nav-wrapper">
					<ul id="nav-mobile" class="left hide-on-med-and-down">
						<li><a href="#" class="orange darken-4"><i style="font-size: 40px;" class="large material-icons">home</i></a></li>
						<li><a href="#" class="myBtn">Ajouter un utilisateur</a></li>
						<li><a class="orange-text">Créer une Candidature</a></li>
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

<div class="grey lighten-3">	
<div class="container grey lighten-3">
	<br>
    <form class="container">
    
     <div class="card blue-grey darken-4">
      <div class="card-content white-text">
      <div class="input-field col s6 centered">
          <i class="material-icons prefix">content_paste</i>
          <input id="titreCV" type="text" class="validate">
          <label for="titreCV">Titre du CV</label>
        </div>
      </div>
     </div>

     <div class="card blue-grey darken-4">
      <div class="card-content white-text">
       <span class="card-title "><i class="material-icons prefix">assignment</i>  Informations Personnelles</span>
		<br>
   	   <div class="row " col s12>
        <div class="input-field col s6">
          <i class="material-icons prefix">person_outline</i>
          <input id="nom" type="text" class="validate">
          <label for="nom">Nom</label>
        </div>
        <div class="input-field col s6">
          <i class="material-icons prefix">person</i>
          <input id="prenom" type="text" class="validate">
          <label for="prenom">Prénom</label>
        </div>
      </div>
 
      <div class="row col s12">
          <div class="input-field col s6">
            <i class="material-icons prefix">contact_phone</i>
            <input id="icon_telephone" type="tel" class="validate">
            <label for="icon_telephone">Telephone</label>
          </div>
      
          <div class="input-field inline col s6">
            <i class="material-icons prefix">contact_mail</i>
            <input id="email_inline" type="email" class="validate">
            <label for="email_inline">Email</label>
            <span class="helper-text" data-error="wrong" data-success="right"></span>
          </div>
      </div>
      
      <div class="row col s12">
      <div class="input-field col s4">
         <form:label path="niveauFormation"></form:label>
         <i class="material-icons prefix">business_center</i>
         <select id="niveauFormation" name="niveauFormation" class="form-control">
            <option value="" >Selectionner</option>
            <option value="BAC+3">Bac+3</option>
            <option value="BAC+4">Bac+4</option>
            <option value="BAC+5">Bac+5</option>
         </select>
         <label>Niveau Formation</label>
      </div>
      <div class="input-field col s4">
         <form:label path="disponibilite"></form:label>
         <i class="material-icons prefix">accessibility</i>
         <select id="disponibilite" name="disponibilite" class="form-control">
            <option value= "" >Selectionner</option>
            <option value="immediat">Tout de suite</option>
            <option value="dans 3 mois">Dans 3 mois</option>
            <option value="dans 6 mois">Dans 6 mois</option>                        
            <option value="Plus de 6 mois">Plus de 6 mois</option>
         </select>
         <label>Disponibilité</label>
      </div>
      <div class="input-field col s4">
         <form:label path="mobilite"></form:label>
         <i class="material-icons prefix">airplanemode_active</i>
         <select id="mobilite" name="mobilite" class="form-control">
            <option value= "" >Selectionner</option>
            <option value="Ile de France">Ile de France</option>
            <option value="toute la france">Toute la France</option>
            <option value="international">Internationale</option>
         </select>
         <label>Mobilité</label>
      </div>
     </div>
     
      <div class="row col s12">
        <div class="input-field col s6">
          <i class="material-icons prefix">monetization_on</i>
          <input id="salaire" type="text" class="validate">
          <label for="salaire">Salaire Souhaité</label>
        </div>
        <div class="input-field col s6">
          <i class="material-icons prefix">directions_car</i>
          <input id="permis" type="text" class="validate">
          <label for="permis">Pérmis de Conduire</label>
        </div>
      </div> 
      </div>
      </div>
 <br>     
      <div class="card blue-grey darken-4">
      <div class="card-content white-text">
       <span class="card-title"><i class="material-icons prefix">person_pin_circle</i>  Adresse</span>
      <br>
      <div class="row col s12">
        <div class="input-field col s3">
          <input id="numRue" type="text" class="validate">
          <label for="numRue">N° Rue</label>
        </div>
        <div class="input-field col s9">
          <input id="nomRue" type="text" class="validate">
          <label for="nomRue">Nom de Rue</label>
        </div>
      </div> 
      
      <div class="row col s12">
        <div class="input-field col s4">
          <input id="codePostal" type="text" class="validate">
          <label for="codePostal">Code Postal</label>
        </div>
        <div class="input-field col s8">
          <input id="ville" type="text" class="validate">
          <label for="ville">ville</label>
        </div>
      </div> 
      </div>
      </div>
     
       <div class="card blue-grey darken-4">
      <div class="card-content white-text">
       <span class="card-title"><i class="material-icons prefix">school</i>  Formations</span>
       <a class="btn-floating halfway-fab orange darken-4 "><i class="material-icons">add</i></a>
       <br>
      <div class="row col s12">
       	<div class="input-field col s4">
       	<i class="material-icons prefix">business_center</i>
         <select id="typeFormation" name="typeFormation" class="form-control">
            <option value="" ><label>Type de Formation</label></option>
            <option value="BAC+3">Bac+3</option>
            <option value="BAC+4">Bac+4</option>
            <option value="BAC+5">Bac+5</option>
         </select>
        </div>
        <div class="input-field col s8">
          <input id="intituleFormation" type="text" class="validate">
          <label for="intituleFormation">Intitulé de la Formation</label>
        </div>
      </div>   
      
      <div class="row col s12">
        <div class="input-field col s2.5">
        	<i class="material-icons prefix">date_range</i>
	        <input type="date" id="dateDebut" name="formD" value="2018-07-22" min="2018-01-01" max="2018-12-31" />
    	    <label for="dateDebut">Date de Début</label>
        </div>
        <div class="input-field col s2.5">
	        <input type="date" id="dateFin" name="formF" value="2018-07-22" min="2018-01-01" max="2018-12-31" />
    	    <label for="dateFin">Date de Fin</label>
        </div>
        <div class="input-field col s6">
        	<i class="material-icons prefix">location_city</i>
          	<input id="etablissement" type="text" class="validate">
          	<label for="etablissement">Nom de l'établissement</label>
        </div>
       </div>
      </div>
     </div>

<br>     
      <div class="card blue-grey darken-4">
      <div class="card-content white-text">
       <span class="card-title"><i class="material-icons prefix">assessment</i>  Compétences Techniques</span>
       <a class="btn-floating halfway-fab orange darken-4 "><i class="material-icons">add</i></a>
      <br>
     <div class="row col s12">
        <div class="input-field col s4">
          <input id="competence" type="text" class="validate">
          <label for="competence">Compétence</label>
        </div>
 		<div class="input-field col s8">
 		<i class="material-icons prefix">description</i>
          <textarea id="textarea1" class="materialize-textarea"></textarea>
          <label for="description">Déscription</label>
        </div>       
     </div>   
    </div>
     </div>
     
     <br>
     <div class="card blue-grey darken-4">
      <div class="card-content white-text">
       <span class="card-title"><i class="material-icons prefix">language</i>  Langues Parlées</span>
       <a class="btn-floating halfway-fab orange darken-4 "><i class="material-icons">add</i></a>      
      <br>
     <div class="row col s12">
        <div class="input-field col s4">
          <input id="langue" type="text" class="validate">
          <label for="langue">Langue</label>
        </div>
        <div class="input-field col s4">
          <input id="niveau" type="text" class="validate">
          <label for="niveau">Niveau</label>
        </div>      
     </div>
     
       </div>
     </div>
     
     <br>
     <div class="card blue-grey darken-4" name="myForm">
      <div class="card-content white-text">
       <span class="card-title"><i class="material-icons prefix">work</i>  Expériences</span>
       <a class="btn-floating halfway-fab orange darken-4"><i class="material-icons">add</i></a>    
       <br>  
      <br>
     	<div class="row col s12">
        <div class="input-field col s2.5">
        	<i class="material-icons prefix">date_range</i>
	        <input type="date" id="dateDebutExperience" name="formD" value="2018-07-22" min="2018-01-01" max="2018-12-31" />
    	    <label for="dateDebutExperience">Date de Début</label>
        </div>
        <div class="input-field col s2.5">
	        <input type="date" id="dateFinExperience" name="formF" value="2018-07-22" min="2018-01-01" max="2018-12-31" />
    	    <label for="dateFinExperience">Date de Fin</label>
        </div>
        
        <div class="input-field col s6">
          <i class="material-icons prefix">business</i>
          <input id="intituleFormation" type="text" class="validate">
          <label for="intituleFormation">Organisme d'acceuil</label>
        </div>
      </div>   
      
     <div class="row col s12">
        <div class="input-field">
         <i class="material-icons prefix">local_library</i>
          <input id="projet" type="text" class="validate">
          <label for="projet">Intitulé du Projet</label>
        </div>
     </div>
      <div class="row col s12">
 		<div class="input-field">
 		<i class="material-icons prefix">description</i>
          <textarea id="textarea1" class="materialize-textarea"></textarea>
          <label for="description">Déscription</label>
        </div> 
      </div>   
      <div class="row col s12">
 		<div class="input-field">
 		<i class="material-icons prefix">recent_actors</i>
          <textarea id="textarea1" class="materialize-textarea"></textarea>
          <label for="missions">Missions</label>
        </div> 
      </div>   
      <div class="row col s12">
 		<div class="input-field">
 		<i class="material-icons prefix">remove_from_queue</i>
          <textarea id="textarea1" class="materialize-textarea"></textarea>
          <label for="environnement">Environnement</label>
        </div> 
      </div>      
     </div>   
          
      </div>
    </form>
  </div>
</div>
</body>
</html>