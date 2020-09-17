
package co.com.rappi.models.orden;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "price_with_topping",
    "order_id"
})
public class TotalProductsPriceWithTopping {

    @JsonProperty("price_with_topping")
    private String priceWithTopping;
    @JsonProperty("order_id")
    private Integer orderId;

    @JsonProperty("price_with_topping")
    public String getPriceWithTopping() {
        return priceWithTopping;
    }

    @JsonProperty("price_with_topping")
    public void setPriceWithTopping(String priceWithTopping) {
        this.priceWithTopping = priceWithTopping;
    }

    @JsonProperty("order_id")
    public Integer getOrderId() {
        return orderId;
    }

    @JsonProperty("order_id")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

}
