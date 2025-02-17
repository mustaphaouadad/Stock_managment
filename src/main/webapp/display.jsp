<%@page import="Model.ProduitModel"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz" crossorigin="anonymous"></script>
<title>Insert title here</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="#">Stock_Master</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarNav">
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="index.jsp">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="AddProduit.jsp">Add produit</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="DesplayProduit">Display produit</a>
        </li>
       
      </ul>
    </div>
  </div>
</nav>
<div class="container">
<% List<ProduitModel> p=(List<ProduitModel>)request.getAttribute("data"); %>
<center>
 <div class="table-responsive">
            <table id="produitsTable" class="table table-bordered table-striped">
                <thead class="table-dark">
                    <tr>
                        <th>Nom</th>
                        <th>Description</th>
                        <th>Quantité</th>
                        <th>Prix</th>
                        <th>Catégorie</th>
                        
                         <th >Action</th>
                        
                        
                        
                    </tr>
                </thead>
                <tbody>
                <% for(ProduitModel temp:p) {%>
                <tr>
                <td><%= temp.getNameProduit() %></td>
                <td><%= temp.getDescriptionProduit() %></td>
                <td><%= temp.getPrix() %></td>
                <td><%= temp.getQuantite() %></td>
                <td><%= temp.getCategorie() %></td> 
                <td><a type="button" href="EditProduit?idProduit=<%=temp.getIdProduit() %>" class="btn btn-info">Edit</a>
              <a type="button" href="DeleteProduit?idProduit=<%=temp.getIdProduit() %>" class="btn btn-danger">Delete</a></td>
                
                </tr>
                
                <%} %>
              
                </tbody>
            </table>
        </div>

</center>


</div>

</body>
<style>
.container{
margin-top: 20px;
}



</style>

</html>