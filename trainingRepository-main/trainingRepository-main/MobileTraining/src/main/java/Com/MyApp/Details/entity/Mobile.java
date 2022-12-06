package Com.MyApp.Details.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mobileId;
	
	private String mobileBrandName;
	
	private Double mobilePrice;
	
	
	

}
