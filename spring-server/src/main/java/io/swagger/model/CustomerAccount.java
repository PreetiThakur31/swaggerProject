package io.swagger.model;

import io.swagger.annotations.ApiModelProperty;

import java.util.Objects;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * CustomerAccountDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-02T12:34:28.497Z")

public class CustomerAccount   {
  /*@JsonProperty("customerId")
  private String customerId = null;*/

  @JsonProperty("accountNo")
  private Long accountNo = null;
  
  @JsonProperty("accountType")
  private String accountType = null;

  @JsonProperty("availableBalance")
  private Long availableBalance = null;

  @JsonProperty("credit")
  private Long credit = null;

  @JsonProperty("debit")
  private Long debit = null;

 /* public CustomerAccount customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }*/

  /**
   * Get customerId
   * @return customerId
  **/
  @ApiModelProperty(value = "")


  /*public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }*/

  public CustomerAccount accountNo(Long accountNo) {
    this.accountNo = accountNo;
    return this;
  }

  /**
   * Get accountNo
   * @return accountNo
  **/
  @ApiModelProperty(value = "")


  public Long getAccountNo() {
    return accountNo;
  }

  public void setAccountNo(Long accountNo) {
    this.accountNo = accountNo;
  }

  public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public CustomerAccount availableBalance(Long availableBalance) {
    this.availableBalance = availableBalance;
    return this;
  }

  /**
   * Get availableBalance
   * @return availableBalance
  **/
  @ApiModelProperty(value = "")


  public Long getAvailableBalance() {
    return availableBalance;
  }

  public void setAvailableBalance(Long availableBalance) {
    this.availableBalance = availableBalance;
  }

  

  public CustomerAccount credit(Long credit) {
    this.credit = credit;
    return this;
  }

  /**
   * Get credit
   * @return credit
  **/
  @ApiModelProperty(value = "")


  public Long getCredit() {
    return credit;
  }

  public void setCredit(Long credit) {
    this.credit = credit;
  }

  public CustomerAccount debit(Long debit) {
    this.debit = debit;
    return this;
  }

  /**
   * Get debit
   * @return debit
  **/
  @ApiModelProperty(value = "")


  public Long getDebit() {
    return debit;
  }

  public void setDebit(Long debit) {
    this.debit = debit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerAccount customerAccountDetails = (CustomerAccount) o;
    return Objects.equals(this.accountNo, customerAccountDetails.accountNo) &&
        Objects.equals(this.availableBalance, customerAccountDetails.availableBalance) &&
        Objects.equals(this.credit, customerAccountDetails.credit) &&
        Objects.equals(this.debit, customerAccountDetails.debit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountNo, availableBalance, credit, debit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerAccountDetails {\n");
    
    sb.append("    accountNo: ").append(toIndentedString(accountNo)).append("\n");
    sb.append("    availableBalance: ").append(toIndentedString(availableBalance)).append("\n");
    sb.append("    credit: ").append(toIndentedString(credit)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
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

