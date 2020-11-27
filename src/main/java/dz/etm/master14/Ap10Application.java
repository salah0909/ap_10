package dz.etm.master14;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.etm.master14.model.Patient;
import dz.etm.master14.model.DAO.PatientRepository;

@SpringBootApplication
public class Ap10Application implements CommandLineRunner {

	@Autowired
	PatientRepository patientRepository;
	public static void main(String[] args) {
		SpringApplication.run(Ap10Application.class, args);
		
	}
	public void run(String... args) throws Exception {
		
		
		
			List <Patient> Pat=patientRepository.findAll();
			System.out.println(Pat);
			
			
			
		
	}
}
