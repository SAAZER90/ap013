package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.mappers.ConsultationMapper;
import dz.ibnrochd.master14.model.Consultation;
@Service
public class ConsultationService implements IConsultationService{
	@Autowired
	ConsultationMapper consultationMapper;
	public Consultation trouverParId(int id) {
	    return consultationMapper.trouverParId(id);
	}

	public List<Consultation> trouverTous() {
	    return consultationMapper.trouverTous();
	}

	public void creerConsultation(Consultation consultation) {
	    consultationMapper.creerConsultation(consultation);
	}

	public void supprimerConsultation(int id) {
	    consultationMapper.supprimerConsultation(id);
	}

	public void modifierConsultation(Consultation consultation) {
	    consultationMapper.modifierConsultation(consultation);
	}


}
