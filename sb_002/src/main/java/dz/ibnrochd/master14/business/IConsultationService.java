package dz.ibnrochd.master14.business;
import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Consultation;

@Service
public interface IConsultationService {
	    Consultation trouverParId(int id);
	    List<Consultation> trouverTous();
	    void creerConsultation(Consultation consultation);
	    void supprimerConsultation(int id);
	    void modifierConsultation(Consultation consultation);
	

}
