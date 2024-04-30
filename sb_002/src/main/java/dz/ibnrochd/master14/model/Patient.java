package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor

public class Patient implements Serializable {

	private static final long serialVersionUID = -3415388341943341473L;

	
    private int id;    
    private String nom;    
    private String prenom;
    private String sexe;
    private LocalDate dateNaissance;
    private String numeroTelephone;
    private String adresse;
    private List<Consultation> consultations = new ArrayList<>();
    private List<RendezVous> rendezVous = new ArrayList<>();
    }
    
    /////////////////////////////////////////////////////////
    
   