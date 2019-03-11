package io.swagger.model.db;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer")
public class CustomerData implements Serializable{
	
	  /**
	 * 
	 */
	private static final long serialVersionUID = 3707623676453949545L;

	  @Id
	  @Column(name = "customer_id")
	  @Size(max =50)
	  private String customerId = null;

	  @Column(name = "customer_first_name")
	  @Size(max =50)
	  private String customerFirstName = null;

	  @Column(name = "customer_last_name")
	  @Size(max =50)
	  private String customerLastName = null;

	  @Column(name = "mobile_no")
	  @Size(max =10)
	  private String mobileNo = null;

	  @Column(name = "email_id")
	  @Size(max =50)
	  private String emailId = null;

	  @OneToMany(fetch=FetchType.LAZY,mappedBy = "customerData", cascade = CascadeType.ALL)
	  private List<CustomerAccountsData> customerAccounts = new ArrayList<>();
	  
	  @OneToOne(mappedBy = "customerData", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	  private CustomerAddressData customerAddressData = null;

	  public CustomerData customerId(String customerId) {
	    this.customerId = customerId;
	    return this;
	  }

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerFirstName() {
		return customerFirstName;
	}

	public void setCustomerFirstName(String customerFirstName) {
		this.customerFirstName = customerFirstName;
	}

	public String getCustomerLastName() {
		return customerLastName;
	}

	public void setCustomerLastName(String customerLastName) {
		this.customerLastName = customerLastName;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	

	public CustomerAddressData getCustomerAddressData() {
		return customerAddressData;
	}

	public void setCustomerAddressData(CustomerAddressData customerAddressData) {
		this.customerAddressData = customerAddressData;
	}

	public List<CustomerAccountsData> getCustomerAccounts() {
		return customerAccounts;
	}

	public void setCustomerAccounts(List<CustomerAccountsData> customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	
}
