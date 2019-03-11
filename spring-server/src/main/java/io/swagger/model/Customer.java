package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CustomerAccount;
import io.swagger.model.CustomerAddress;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Customer
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-02T14:53:10.971Z")

public class Customer   {
  @JsonProperty("customerId")
  private String customerId = null;

  @JsonProperty("customerFirstName")
  private String customerFirstName = null;

  @JsonProperty("customerLastName")
  private String customerLastName = null;

  @JsonProperty("mobileNo")
  private String mobileNo = null;

  @JsonProperty("email-id")
  private String emailId = null;

  @JsonProperty("CustomerAccount")
  @Valid
  private List<CustomerAccount> customerAccount = null;

  @JsonProperty("customerAddress")
  private CustomerAddress customerAddress = null;

  public Customer customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public Customer customerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
    return this;
  }

  /**
   * Customer First name
   * @return customerFirstName
  **/
  @ApiModelProperty(value = "Customer First name")


  public String getCustomerFirstName() {
    return customerFirstName;
  }

  public void setCustomerFirstName(String customerFirstName) {
    this.customerFirstName = customerFirstName;
  }

  public Customer customerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
    return this;
  }

  /**
   * Customer Last name
   * @return customerLastName
  **/
  @ApiModelProperty(value = "Customer Last name")


  public String getCustomerLastName() {
    return customerLastName;
  }

  public void setCustomerLastName(String customerLastName) {
    this.customerLastName = customerLastName;
  }

  public Customer mobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
    return this;
  }

  /**
   * Customer mobile number
   * @return mobileNo
  **/
  @ApiModelProperty(value = "Customer mobile number")


  public String getMobileNo() {
    return mobileNo;
  }

  public void setMobileNo(String mobileNo) {
    this.mobileNo = mobileNo;
  }

  public Customer emailId(String emailId) {
    this.emailId = emailId;
    return this;
  }

  /**
   * Customer email id
   * @return emailId
  **/
  @ApiModelProperty(value = "Customer email id")


  public String getEmailId() {
    return emailId;
  }

  public void setEmailId(String emailId) {
    this.emailId = emailId;
  }

  public Customer customerAccount(List<CustomerAccount> customerAccount) {
    this.customerAccount = customerAccount;
    return this;
  }

  public Customer addCustomerAccountDetailsItem(CustomerAccount customerAccountDetailsItem) {
    if (this.customerAccount == null) {
      this.customerAccount = new ArrayList<CustomerAccount>();
    }
    this.customerAccount.add(customerAccountDetailsItem);
    return this;
  }

  /**
   * Get customerAccountDetails
   * @return customerAccountDetails
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<CustomerAccount> getCustomerAccount() {
    return customerAccount;
  }

  public void setCustomerAccount(List<CustomerAccount> customerAccount) {
	  if(customerAccount!=null)
	   System.out.println("======================setCustomerAccount==============================");
    this.customerAccount = customerAccount;
  }

  public Customer customerAddress(CustomerAddress customerAddress) {
    this.customerAddress = customerAddress;
    return this;
  }

  /**
   * Get customerAddress
   * @return customerAddress
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CustomerAddress getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(CustomerAddress customerAddress) {
    this.customerAddress = customerAddress;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Customer customer = (Customer) o;
    return Objects.equals(this.customerId, customer.customerId) &&
        Objects.equals(this.customerFirstName, customer.customerFirstName) &&
        Objects.equals(this.customerLastName, customer.customerLastName) &&
        Objects.equals(this.mobileNo, customer.mobileNo) &&
        Objects.equals(this.emailId, customer.emailId) &&
        Objects.equals(this.customerAccount, customer.customerAccount) &&
        Objects.equals(this.customerAddress, customer.customerAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, customerFirstName, customerLastName, mobileNo, emailId, customerAccount, customerAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Customer {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    customerFirstName: ").append(toIndentedString(customerFirstName)).append("\n");
    sb.append("    customerLastName: ").append(toIndentedString(customerLastName)).append("\n");
    sb.append("    mobileNo: ").append(toIndentedString(mobileNo)).append("\n");
    sb.append("    emailId: ").append(toIndentedString(emailId)).append("\n");
    sb.append("    customerAccount: ").append(toIndentedString(customerAccount)).append("\n");
    sb.append("    customerAddress: ").append(toIndentedString(customerAddress)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

