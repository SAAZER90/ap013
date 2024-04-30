package dz.ibnrochd.master14.mappers;

import java.util.List;

import dz.ibnrochd.master14.model.Traitement;

public interface TraitementMapper {
	Traitement trouverParId(int id);
	List<Traitement> trouverTous();
	void creerTraitement(Traitement traitement);
	void supprimerTraitement(int id);
	void modifierTraitement(Traitement traitement);

}
