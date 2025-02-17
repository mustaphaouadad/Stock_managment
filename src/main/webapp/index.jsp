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
<div class="baner-image">
<img alt="" src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQvfh9p1KRbRgSl6qmU7s8gy54xLYv4VVZ0Dg&s">
</div>
<div class="row serves">
<div class="col-md-3">
<p>produit detail</p>
</div>

<div class="col-md-3">
<p>Vie all record</p>
</div>

<div class="col-md-3">
<p> update  and search</p>
</div>

<div class="col-md-3">
<p>one stop solution</p>
</div>
</div>
</div>
<footer>
<div class="row">
<div class="col-md-6">
<li><a href="#">Home</a> </a></li>
<li><a href="#">Home</a> </a></li>
<li><a href="#">Home</a> </a></li>
<li><a href="#">Home</a> </a></li>
</div>

<div class="col-md-6">
<p>Contact</p>
<p>Phone : </p>
<p>Email : </p>
</div>
</div>


</footer>

</body>
<style>
.baner-image img{
width: 100%;
}
body {
	background-color: grey;
}
.serves{
background-color: white;
padding: 10px;
text-align: center;
font-weight: bold;
}
footer{
background-color: black;
color: white;
}
footer .row{
text-align: center;
}

</style>
</html>