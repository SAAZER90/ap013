package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.mappers.PatientMapper;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;
@Service
public class PatientService implements IPatientService {
	@Autowired
	PatientMapper patientMapper;
	public Patient trouverParNom(String nom) {
		
		return patientMapper.trouverParNom(nom);
		};
	public Patient trouverParId(int id){
		
		return patientMapper.trouverParId(id);}
	
	public List<Patient> trouverTous(){
		
		return patientMapper.trouverTous();
		
	}
	
	public void creePatient(Patient pat ) {
		
		patientMapper.creePatient(pat);
	}
	public void supprimerPatient(int id ) {
		patientMapper.supprimerPatient(id);
	}
	public void modiferPatient(Patient pat ) {
		patientMapper.modiferPatient(pat);
	}
	public List<Consultation> selectConsultationsDuPatient (int nama){
		return patientMapper.selectConsultationsDuPatient(nama);
	}

}
