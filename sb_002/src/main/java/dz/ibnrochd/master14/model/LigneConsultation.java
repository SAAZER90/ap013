package dz.ibnrochd.master14.model;

import java.io.Serializable;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor


public class LigneConsultation implements Serializable {

	private static final long serialVersionUID = -1882485395538957648L;
	private int id;
	private int idConsultation;
	private int idTraitement;
	private String posologie;
	private String uniteTemps;
	private String quantite;

    
}
