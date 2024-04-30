package dz.ibnrochd.master14.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;


import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;


@Mapper
public interface PatientMapper  {
	
	public Patient trouverParNom(String nom);
	public Patient trouverParId(int id);
	public List<Patient> trouverTous();
	public void creePatient(Patient pat );
	public void supprimerPatient(int id );
	public void modiferPatient(Patient pat );
	public List<Consultation> selectConsultationsDuPatient (int nama);
	
}
