package DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Model.ProduitModel;

public class ProduitDao {
	public static int SaveProduit(ProduitModel p) {
		
		int result =0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock_master","root","0000");
			PreparedStatement pst =con.prepareStatement("INSERT INTO Stock_master.produits(idProduit,nameProduit,descriptionProduit,prix ,quantite,categorie) values(?,?,?,?,?,?) ");
			pst.setInt(1, p.getIdProduit());
			pst.setString(2,p.getNameProduit());
			pst.setString(3, p.getDescriptionProduit());
			pst.setBigDecimal(4,p.getPrix());
			pst.setInt(5,p.getQuantite());
			pst.setString(6,p.getCategorie());
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return result;
	}
	public static List<ProduitModel> getAllProduit(){
		List<ProduitModel> p=new ArrayList<ProduitModel>();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock_master","root","0000");
			Statement smt =  con.createStatement();
			ResultSet rs=  smt.executeQuery("SELECT * from Stock_master.produits ");
			while (rs.next()) {
				ProduitModel produit = new ProduitModel();
				produit.setIdProduit(rs.getInt("idProduit"));
				produit.setNameProduit(rs.getString("nameProduit"));
				produit.setDescriptionProduit(rs.getString("descriptionProduit"));
				produit.setPrix(rs.getBigDecimal("prix"));
				produit.setQuantite(rs.getInt("quantite"));
				produit.setCategorie(rs.getString("categorie"));
				p.add(produit);
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return p;
	}
	
	public static int deleteProduitById(int idProduit) {
		int result =0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock_master","root","0000");
			PreparedStatement pst = con.prepareStatement("Delete from Stock_master.produits where idProduit=?");
			pst.setInt(1, idProduit);
			result=pst.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	
	public static ProduitModel getProduitById(int idProduit){
		ProduitModel produit=new ProduitModel();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock_master","root","0000");
			Statement smt =  con.createStatement();
			ResultSet rs=  smt.executeQuery("SELECT * from Stock_master.produits where idProduit="+idProduit);
			while (rs.next()) {
				
				produit.setIdProduit(rs.getInt("idProduit"));
				produit.setNameProduit(rs.getString("nameProduit"));
				produit.setDescriptionProduit(rs.getString("descriptionProduit"));
				produit.setPrix(rs.getBigDecimal("prix"));
				produit.setQuantite(rs.getInt("quantite"));
				produit.setCategorie(rs.getString("categorie"));
				
				
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return produit;
	}
	public static int UpdateProduitById(ProduitModel p) {
		int result=0;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Stock_master","root","0000");
			PreparedStatement pst =con.prepareStatement("UPDATE Stock_master.produits set nameProduit=?,descriptionProduit=?,prix =?,quantite=?,categorie=? where idProduit=?");
			pst.setString(1, p.getNameProduit());
			pst.setString(2, p.getDescriptionProduit());
			pst.setBigDecimal(3, p.getPrix());
			pst.setInt(4, p.getQuantite());
			pst.setString(5, p.getCategorie());
			pst.setInt(6, p.getIdProduit());
			result=pst.executeUpdate();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

}
