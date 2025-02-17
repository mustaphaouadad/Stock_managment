package Controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import DAO.ProduitDao;

@WebServlet("/DeleteProduit")
public class DeleteProduit extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      int idProduit =Integer.parseInt(request.getParameter("idProduit"));
	       System.out.println(idProduit);
	       int result =ProduitDao.deleteProduitById(idProduit);
	       if (result>0) {
	    	   response.sendRedirect("desplayProduit");
		} else {
			PrintWriter out=response.getWriter();
			out.println("Project id not avilibal");

		}
	      
	}

	

}
