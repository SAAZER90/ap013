package dz.ibnrochd.master14.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dz.ibnrochd.master14.business.ConsultationService;
import dz.ibnrochd.master14.business.PatientService;
import dz.ibnrochd.master14.business.TraitementService;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.Traitement;

@RestController
@RequestMapping("/api" )
public class REST {
	 @Autowired
	    private PatientService patientService;
	 @Autowired
	    private TraitementService traitementService;
	 @Autowired
	  private ConsultationService consultationService;

	    @GetMapping("/nom/{nom}")
	    public Patient trouverParNom(@PathVariable String nom) {
	        return patientService.trouverParNom(nom);
	    }

	    @GetMapping("/{id}")
	    public Patient trouverParId(@PathVariable int id) {
	        return patientService.trouverParId(id);
	    }

	    @GetMapping
	    public List<Patient> trouverTous() {
	        return patientService.trouverTous();
	    }

	    @PostMapping
	    public void creePatient(@RequestBody Patient patient) {
	        patientService.creePatient(patient);
	    }

	    @DeleteMapping("/{id}")
	    public void supprimerPatient(@PathVariable int id) {
	        patientService.supprimerPatient(id);
	    }

	    @PutMapping
	    public void modiferPatient(@RequestBody Patient patient) {
	        patientService.modiferPatient(patient);
	        
	        
	      
	    }
	    
	    
	    
	    
	    @GetMapping("/tr/{id}")
	    public Traitement traitementTrouverParId(int id) {
		    return traitementService.trouverParId(id);
		}
	    @GetMapping("/tr")  
		public List<Traitement> traitementTrouverTous() {
		    return traitementService.trouverTous();
		}
	    @PostMapping("/tr")
		public void creerTraitement(Traitement traitement) {
		    traitementService.creerTraitement(traitement);
		}
		@DeleteMapping("/tr/{id}")
		public void supprimerTraitement(int id) {
		    traitementService.supprimerTraitement(id);
		}
		@PutMapping("/tr")
		public void modifierTraitement(Traitement traitement) {
		    traitementService.modifierTraitement(traitement);
		}
		@GetMapping("/cn/{id}")
		public Consultation consultationTrouverParId(int id) {
		    return consultationService.trouverParId(id);
		}
		@GetMapping("/cn")
		public List<Consultation> consultationTrouverTous() {
		    return consultationService.trouverTous();
		}
		@PostMapping("/cn")
		public void creerConsultation(Consultation consultation) {
		    consultationService.creerConsultation(consultation);
		}
		@DeleteMapping("/cn/{id}")
		public void supprimerConsultation(int id) {
		    consultationService.supprimerConsultation(id);
		}
		
		@PutMapping("/cn")
		public void modifierConsultation(Consultation consultation) {
		    consultationService.modifierConsultation(consultation);
		}



}
