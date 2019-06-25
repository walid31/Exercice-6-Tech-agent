import java.io.*;
public class Produit implements Serializable {
	Float prix;
	String designation;
	
	
	public Produit() {
	}
	public Produit(Float prix, String designation) {
		this.prix = prix;
		this.designation = designation;
	}
	public Float getPrix() {
		return prix;
	}
	public void setPrix(Float prix) {
		this.prix = prix;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
}
