package io.swagger.model.db;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "customer_accounts")
public class CustomerAccountsData {
	
	  @Id
	  @Column(name = "account_no")
	  @Size(max = 50)
	  private Long accountNo = null;

	  @Column(name = "balance")
	  @Size(max = 50)
	  private Long balance = null;

	  @Column(name = "account_type")
	  @Size(max = 50)
	  private String accountType = null;
	  
	  @Column(name = "credit")
	  @Size(max = 50)
	  private Long credit = null;

	  @Column(name = "debit")
	  @Size(max = 50)
	  private Long debit = null;
	  
	  @ManyToOne
	  @JoinColumn(name="customer_id")
	  private CustomerData customerData;
	  
	  
	  public CustomerAccountsData(){}
		
	  /*public CustomerAccountsData(CustomerData customerData){
		  System.out.println("constructor called.");
			this.customerData=customerData;
		
		}*/
	  
	    
	public Long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(Long accountNo) {
		this.accountNo = accountNo;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long Balance) {
		this.balance = Balance;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	

	public Long getCredit() {
		return credit;
	}

	public void setCredit(Long credit) {
		this.credit = credit;
	}

	public Long getDebit() {
		return debit;
	}

	public void setDebit(Long debit) {
		this.debit = debit;
	}

	public CustomerData getCustomerData() {
		return customerData;
	}

	public void setCustomerData(CustomerData customerData) {
		System.out.println("setter");
		this.customerData = customerData;
	}

	public CustomerAccountsData customerData(CustomerData customerData) {
        this.customerData = customerData;
        return this;
    }


}
