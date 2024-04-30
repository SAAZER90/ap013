package dz.ibnrochd.master14;



import java.util.ArrayList;
import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import dz.ibnrochd.master14.mappers.ConsultationMapper;
import dz.ibnrochd.master14.mappers.PatientMapper;
import dz.ibnrochd.master14.mappers.TraitementMapper;
import dz.ibnrochd.master14.model.Consultation;
import dz.ibnrochd.master14.model.Patient;
import dz.ibnrochd.master14.model.RendezVous;

@SpringBootApplication
@MapperScan("dz.ibnrochd.master14")
public class Sb002Application implements CommandLineRunner {
	
	@Autowired
	PatientMapper patientMapper;
	@Autowired 
	ConsultationMapper consultationMapper;
	@Autowired
	TraitementMapper traitementMapper;
	
	
	
	// TODO : déclarer les autres repository de la même façon que PatientRepository
	

	public static void main(String[] args) {
		SpringApplication.run(Sb002Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		/*// TODO : récupérer la liste de tous les patients puis afficher leurs noms
		// patientRepository.findAll().forEach(pat -> System.out.println(pat.getNom()));
		//List<Patient> patients = 
				patientMapper.findAll().forEach(x->System.out.println(x));		
		
		// TODO : rechercher les patients ayant le nom "Yahi" puis leurs prénoms
		System.out.println(patientMapper.findByNom("Yahi").getPrenom());
		
		
		// TODO : créer un nouveau patient (valeurs au choix)  PUIS enregistrer-le
		List<Consultation> consultations = new ArrayList<>();
		List<RendezVous> rendezVous = new ArrayList<>();
		LocalDate daten = LocalDate.of(1999, 2, 2);
				
		Patient pat = new Patient(141,"wald hmad","hmad","M",daten,"0123456","02 RUE",consultations,rendezVous);
			patientMapper.insertPatient(pat);
						
		// TODO : rechercher la consultation ayant id=3 
		System.out.println(consultationMapper.findById(3));
		
		// TODO : parcourir les lignes de la consultation trouvée et afficher les noms des médicaments
			
		consultationMapper.findById(3).getLigneConsultations().forEach(l->System.out.println(traitementMapper.findById(l.getIdTraitement())));
	*/}

}
