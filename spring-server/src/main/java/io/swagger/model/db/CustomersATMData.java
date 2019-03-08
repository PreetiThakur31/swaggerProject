package io.swagger.model.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.Size;




@Entity
@Table(name = "customer_atm_details")
public class CustomersATMData implements Serializable{

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private ATMDetails ATMDetails;
	
	@Column(name ="customer_id")
	@Size(max = 50)
	private String customerId;

	public ATMDetails getATMDetails() {
		return ATMDetails;
	}

	public void setATMDetails(ATMDetails aTMDetails) {
		ATMDetails = aTMDetails;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
	
	
	
	
}
