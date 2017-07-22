/*
 * IUNO TDM Payment Service API
 * Create invoices, check payment and forward coins.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * PaymentInformation
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2017-07-18T06:51:44.758Z")
public class PaymentInformation   {
  @JsonProperty("coin")
  private Long coin = null;

  @JsonProperty("bitcoinAddress")
  private String bitcoinAddress = null;

  @JsonProperty("pcPubKey")
  private String pcPubKey = null;

  @JsonProperty("pcInvoiceId")
  private String pcInvoiceId = null;

  public PaymentInformation coin(Long coin) {
    this.coin = coin;
    return this;
  }

  /**
   * value in Satoshis
   * @return coin
   **/
  @JsonProperty("coin")
  @ApiModelProperty(value = "value in Satoshis")
  public Long getCoin() {
    return coin;
  }

  public void setCoin(Long coin) {
    this.coin = coin;
  }

  public PaymentInformation bitcoinAddress(String bitcoinAddress) {
    this.bitcoinAddress = bitcoinAddress;
    return this;
  }

  /**
   * Bitcoin Base58 encoded public key hash address
   * @return bitcoinAddress
   **/
  @JsonProperty("bitcoinAddress")
  @ApiModelProperty(value = "Bitcoin Base58 encoded public key hash address")
  public String getBitcoinAddress() {
    return bitcoinAddress;
  }

  public void setBitcoinAddress(String bitcoinAddress) {
    this.bitcoinAddress = bitcoinAddress;
  }

  public PaymentInformation pcPubKey(String pcPubKey) {
    this.pcPubKey = pcPubKey;
    return this;
  }

  /**
   * the paymentChannelPubkey to pay to alternatively
   * @return pcPubKey
   **/
  @JsonProperty("pcPubKey")
  @ApiModelProperty(value = "the paymentChannelPubkey to pay to alternatively")
  public String getPcPubKey() {
    return pcPubKey;
  }

  public void setPcPubKey(String pcPubKey) {
    this.pcPubKey = pcPubKey;
  }

  public PaymentInformation pcInvoiceId(String pcInvoiceId) {
    this.pcInvoiceId = pcInvoiceId;
    return this;
  }

  /**
   * the given invoice id from the receiver to mention in the micropayment
   * @return pcInvoiceId
   **/
  @JsonProperty("pcInvoiceId")
  @ApiModelProperty(value = "the given invoice id from the receiver to mention in the micropayment")
  public String getPcInvoiceId() {
    return pcInvoiceId;
  }

  public void setPcInvoiceId(String pcInvoiceId) {
    this.pcInvoiceId = pcInvoiceId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInformation paymentInformation = (PaymentInformation) o;
    return Objects.equals(this.coin, paymentInformation.coin) &&
        Objects.equals(this.bitcoinAddress, paymentInformation.bitcoinAddress) &&
        Objects.equals(this.pcPubKey, paymentInformation.pcPubKey) &&
        Objects.equals(this.pcInvoiceId, paymentInformation.pcInvoiceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(coin, bitcoinAddress, pcPubKey, pcInvoiceId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformation {\n");
    
    sb.append("    coin: ").append(toIndentedString(coin)).append("\n");
    sb.append("    bitcoinAddress: ").append(toIndentedString(bitcoinAddress)).append("\n");
    sb.append("    pcPubKey: ").append(toIndentedString(pcPubKey)).append("\n");
    sb.append("    pcInvoiceId: ").append(toIndentedString(pcInvoiceId)).append("\n");
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
