package dz.ibnrochd.master14.model;

import java.io.Serializable;
import java.util.Date;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class RendezVous implements Serializable {

	private static final long serialVersionUID = -7275578697948165342L;

	
    private int id;   
    private Date dateRdv;   
    private Patient patient;
    
    
    
}
