package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Consultation implements Serializable {

	private static final long serialVersionUID = -3669998604878710274L;
	
	private int id;    
    private String motif;    
    private  Timestamp dateConsultation ;
    private int idPatient;
    private List<LigneConsultation> ligneConsultations =new ArrayList<>();


    
}
