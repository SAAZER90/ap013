package dz.ibnrochd.master14.business;
import java.util.List;

import org.springframework.stereotype.Service;

import dz.ibnrochd.master14.model.Traitement;


public interface ITraitementService {
	Traitement trouverParId(int id);
	List<Traitement> trouverTous();
	void creerTraitement(Traitement traitement);
	void supprimerTraitement(int id);
	void modifierTraitement(Traitement traitement);

}
