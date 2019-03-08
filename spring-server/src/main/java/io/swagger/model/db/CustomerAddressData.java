package io.swagger.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name ="customer_address")
public class CustomerAddressData {
	
	  @Id
	  @Column(name = "address_id")
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private String addressId = null;

	  @Column(name = "address_line1")
	  private String addressLine1 = null;

	  @Column(name = "address_line2")
	  private String addressLine2 = null;

	  @Column(name = "city")
	  private String city = null;

	  @Column(name = "state")
	  private String state = null;

	  @Column(name = "country")
	  private String country = null;

	  @Column(name = "pincode")
	  private String pincode = null;
	  
	  @OneToOne(fetch = FetchType.LAZY)
	  @JoinColumn(name = "customer_id")
	  private CustomerData customerData;

	public String getAddressId() {
		System.out.println("addressId ===  "+addressId);
		return addressId;
	}

	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public CustomerData getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerData customerData) {
		this.customerData = customerData;
	}

	
}
