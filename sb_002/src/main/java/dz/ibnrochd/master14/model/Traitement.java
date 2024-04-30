package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class Traitement implements Serializable {

	private static final long serialVersionUID = 8248365590951840055L;
    private int id ;
    private String nom;
    private List<LigneConsultation> ligneConsultations =new ArrayList<>();
   
}
