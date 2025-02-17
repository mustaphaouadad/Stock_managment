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
<form method="post" action="AddProduit" class="bg-white p-4 rounded shadow-sm mb-4">
            <div class="mb-3">
                <input type="text" i name="nameProduit" placeholder="Nom du produit" class="form-control" required>
            </div>
            <div class="mb-3">
                <input type="text"  name="descriptionProduit" placeholder="Description" class="form-control">
            </div>
            <div class="mb-3">
                <input type="number"  name="prix" placeholder="Quantité" class="form-control" required>
            </div>
            <div class="mb-3">
                <input type="number"  name="quantite"  placeholder="Prix" class="form-control" required>
            </div>
            <div class="mb-3">
                <select id="categorie" name="categorie" class="form-select">
                    <option value="Électronique">Électronique</option>
                    <option value="Vêtements">Beauté</option>
                    <option value="Alimentation">Maison</option>
                    <option  value="Vêtements">Vêtements</option>
                    <option  value="Alimentation">Alimentation</option>
                    
                </select>
            </div>
            <button type="submit" class="btn btn-success w-100">Ajouter un produit</button>
        </form>


</div>

</body>
</html>