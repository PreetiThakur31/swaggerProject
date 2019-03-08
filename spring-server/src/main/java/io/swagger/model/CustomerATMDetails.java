package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CustomerATMDetails
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-03-08T08:55:28.328Z")

public class CustomerATMDetails   {
  @JsonProperty("ATMNumber")
  private Long atMNumber = null;

  @JsonProperty("nameOnTheCard")
  private String nameOnTheCard = null;

  @JsonProperty("maxWithdrawLimit")
  private Long maxWithdrawLimit = null;

  public CustomerATMDetails atMNumber(Long atMNumber) {
    this.atMNumber = atMNumber;
    return this;
  }

  /**
   * Get atMNumber
   * @return atMNumber
  **/
  @ApiModelProperty(value = "")


  public Long getAtMNumber() {
    return atMNumber;
  }

  public void setAtMNumber(Long atMNumber) {
    this.atMNumber = atMNumber;
  }

  public CustomerATMDetails nameOnTheCard(String nameOnTheCard) {
    this.nameOnTheCard = nameOnTheCard;
    return this;
  }

  /**
   * nameOnTheCard
   * @return nameOnTheCard
  **/
  @ApiModelProperty(value = "nameOnTheCard")


  public String getNameOnTheCard() {
    return nameOnTheCard;
  }

  public void setNameOnTheCard(String nameOnTheCard) {
    this.nameOnTheCard = nameOnTheCard;
  }

  public CustomerATMDetails maxWithdrawLimit(Long maxWithdrawLimit) {
    this.maxWithdrawLimit = maxWithdrawLimit;
    return this;
  }

  /**
   * maxWithdrawLimit
   * @return maxWithdrawLimit
  **/
  @ApiModelProperty(value = "maxWithdrawLimit")


  public Long getMaxWithdrawLimit() {
    return maxWithdrawLimit;
  }

  public void setMaxWithdrawLimit(Long maxWithdrawLimit) {
    this.maxWithdrawLimit = maxWithdrawLimit;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CustomerATMDetails customerATMDetails = (CustomerATMDetails) o;
    return Objects.equals(this.atMNumber, customerATMDetails.atMNumber) &&
        Objects.equals(this.nameOnTheCard, customerATMDetails.nameOnTheCard) &&
        Objects.equals(this.maxWithdrawLimit, customerATMDetails.maxWithdrawLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(atMNumber, nameOnTheCard, maxWithdrawLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CustomerATMDetails {\n");
    
    sb.append("    atMNumber: ").append(toIndentedString(atMNumber)).append("\n");
    sb.append("    nameOnTheCard: ").append(toIndentedString(nameOnTheCard)).append("\n");
    sb.append("    maxWithdrawLimit: ").append(toIndentedString(maxWithdrawLimit)).append("\n");
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

