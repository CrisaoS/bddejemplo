
package co.com.rappi.models.orden;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "total_order_discount",
    "total_charge_discount",
    "details"
})
public class DiscountOld {

    @JsonProperty("total_order_discount")
    private String totalOrderDiscount;
    @JsonProperty("total_charge_discount")
    private String totalChargeDiscount;
    @JsonProperty("details")
    private List<Detail> details = null;

    @JsonProperty("total_order_discount")
    public String getTotalOrderDiscount() {
        return totalOrderDiscount;
    }

    @JsonProperty("total_order_discount")
    public void setTotalOrderDiscount(String totalOrderDiscount) {
        this.totalOrderDiscount = totalOrderDiscount;
    }

    @JsonProperty("total_charge_discount")
    public String getTotalChargeDiscount() {
        return totalChargeDiscount;
    }

    @JsonProperty("total_charge_discount")
    public void setTotalChargeDiscount(String totalChargeDiscount) {
        this.totalChargeDiscount = totalChargeDiscount;
    }

    @JsonProperty("details")
    public List<Detail> getDetails() {
        return details;
    }

    @JsonProperty("details")
    public void setDetails(List<Detail> details) {
        this.details = details;
    }

}
