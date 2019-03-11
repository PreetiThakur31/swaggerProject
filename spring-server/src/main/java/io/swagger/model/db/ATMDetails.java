package io.swagger.model.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;



@Embeddable
public class ATMDetails implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@NotNull
	@Column(name = "atm_number")
	private Long ATMNumber;
	
	@NotNull
	@Column(name = "name_on_the_card")
	private String nameOnTheCard;
	
	@NotNull
	@Column(name = "max_withdraw_limit")
	private Long maxWithdrawLimit;

	/*public ATMDetails( Long aTMNumber, String nameOnTheCard,
			Long maxWithdrawLimit) {
		super();
		
		ATMNumber = aTMNumber;
		this.nameOnTheCard = nameOnTheCard;
		this.maxWithdrawLimit = maxWithdrawLimit;
	}*/

	public Long getATMNumber() {
		return ATMNumber;
	}

	public void setATMNumber(Long aTMNumber) {
		ATMNumber = aTMNumber;
	}

	public String getNameOnTheCard() {
		return nameOnTheCard;
	}

	public void setNameOnTheCard(String nameOnTheCard) {
		this.nameOnTheCard = nameOnTheCard;
	}

	public Long getMaxWithdrawLimit() {
		return maxWithdrawLimit;
	}

	public void setMaxWithdrawLimit(Long maxWithdrawLimit) {
		this.maxWithdrawLimit = maxWithdrawLimit;
	}

	
	
	
	

}
