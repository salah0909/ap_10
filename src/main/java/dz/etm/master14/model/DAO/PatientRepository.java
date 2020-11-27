package dz.etm.master14.model.DAO;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

import dz.etm.master14.model.Patient;

public interface PatientRepository extends MongoRepository<Patient, ObjectId> {
	public Patient findByNom(String nom);
	public List<Patient> findByPrenom(String prenom);
	public List<Patient> findAll();

}
