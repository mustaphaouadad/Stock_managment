package Model;

import java.math.BigDecimal;

public class ProduitModel {
	
private int idProduit;
private String nameProduit;
private String descriptionProduit;
private BigDecimal prix;
private int quantite;
private String categorie;
public int getIdProduit() {
	return idProduit;
}
public void setIdProduit(int idProduit) {
	this.idProduit = idProduit;
}
public String getNameProduit() {
	return nameProduit;
}
public void setNameProduit(String nameProduit) {
	this.nameProduit = nameProduit;
}
public String getDescriptionProduit() {
	return descriptionProduit;
}
public void setDescriptionProduit(String descriptionProduit) {
	this.descriptionProduit = descriptionProduit;
}
public BigDecimal getPrix() {
	return prix;
}
public void setPrix(BigDecimal prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public String getCategorie() {
	return categorie;
}
public void setCategorie(String categorie) {
	this.categorie = categorie;
}
public ProduitModel(int idProduit, String nameProduit, String descriptionProduit, BigDecimal prix, int quantite,
		String categorie) {
	super();
	this.idProduit = idProduit;
	this.nameProduit = nameProduit;
	this.descriptionProduit = descriptionProduit;
	this.prix = prix;
	this.quantite = quantite;
	this.categorie = categorie;
}
public ProduitModel(String nameProduit, String descriptionProduit, BigDecimal prix, int quantite, String categorie) {
	super();
	this.nameProduit = nameProduit;
	this.descriptionProduit = descriptionProduit;
	this.prix = prix;
	this.quantite = quantite;
	this.categorie = categorie;
}
public ProduitModel() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "ProduitModel [idProduit=" + idProduit + ", nameProduit=" + nameProduit + ", descriptionProduit="
			+ descriptionProduit + ", prix=" + prix + ", quantite=" + quantite + ", categorie=" + categorie + "]";
}







}
