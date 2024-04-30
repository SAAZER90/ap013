package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;


public interface IPatientService {
	public Patient trouverParNom(String nom);
	public Patient trouverParId(int id);
	public List<Patient> trouverTous();
	public void creePatient(Patient pat );
	public void supprimerPatient(int id );
	public void modiferPatient(Patient pat );
	public List<Consultation> selectConsultationsDuPatient (int nama);

}
