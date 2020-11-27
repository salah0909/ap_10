package dz.etm.master14.model;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



@Document(collection = "patient")
public class Patient {
	
	@Id
	private ObjectId _id;
	private String nom, prenom;
	public Patient(ObjectId _id, String nom, String prenom) {
		super();
		this._id = _id;
		this.nom = nom;
		this.prenom = prenom;
	}
	
	public ObjectId getId() {
		return _id;
	}

	public void setId( ObjectId _id) {
		this._id = _id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	@Override
	public String toString() {
		return "Patient [nom=" + nom + ", prenom=" + prenom + "]";
	}
	
	

}
