package Controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import DAO.ProduitDao;
import Model.ProduitModel;


@WebServlet("/EditProduit")
public class EditProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       int idProduit =Integer.parseInt(request.getParameter("idProduit"));
	       System.out.println(idProduit);
	       ProduitModel p= ProduitDao.getProduitById(idProduit);
	      RequestDispatcher dispatcher= request.getRequestDispatcher("EditProduit.jsp");
	      request.setAttribute("data", p);
	      dispatcher.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int idProduit =Integer.parseInt(request.getParameter("idProduit"));
		 String nameProduit = request.getParameter("nameProduit");
	        String descriptionProduit = request.getParameter("descriptionProduit");
	        BigDecimal prix = new BigDecimal(request.getParameter("prix"));
	        int quantite = Integer.parseInt(request.getParameter("quantite"));
	        String categorie= request.getParameter("categorie");
	        
	        ProduitModel p =new ProduitModel();
	       
	        p.setIdProduit(idProduit);
	        p.setNameProduit(nameProduit);
	        p.setDescriptionProduit(descriptionProduit);
	        p.setPrix(prix);
	        p.setQuantite(quantite);
	        p.setCategorie(categorie);
	        int result =ProduitDao.UpdateProduitById(p);
	        if (result>0) {
	        	response.sendRedirect("DesplayProduit");
				
			} else {
				PrintWriter out=response.getWriter();
				out.println("Eroor while updating");

			}
	}

}
