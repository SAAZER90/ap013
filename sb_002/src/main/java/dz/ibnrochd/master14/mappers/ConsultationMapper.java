package dz.ibnrochd.master14.mappers;

import java.util.List;

import dz.ibnrochd.master14.model.Consultation;

public interface ConsultationMapper {
	   Consultation trouverParId(int id);
	    List<Consultation> trouverTous();
	    void creerConsultation(Consultation consultation);
	    void supprimerConsultation(int id);
	    void modifierConsultation(Consultation consultation);

}
