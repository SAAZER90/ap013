package dz.ibnrochd.master14.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.mappers.TraitementMapper;
import dz.ibnrochd.master14.model.Traitement;
@Service
public class TraitementService implements ITraitementService{
	@Autowired
	TraitementMapper traitementMapper;

	public Traitement trouverParId(int id) {
	    return traitementMapper.trouverParId(id);
	}

	public List<Traitement> trouverTous() {
	    return traitementMapper.trouverTous();
	}

	public void creerTraitement(Traitement traitement) {
	    traitementMapper.creerTraitement(traitement);
	}

	public void supprimerTraitement(int id) {
	    traitementMapper.supprimerTraitement(id);
	}

	public void modifierTraitement(Traitement traitement) {
	    traitementMapper.modifierTraitement(traitement);
	}


}
