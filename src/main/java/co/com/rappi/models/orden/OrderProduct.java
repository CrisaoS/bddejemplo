
package co.com.rappi.models.orden;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order_id",
    "product_id",
    "units",
    "unit_price",
    "total_price",
    "comments",
    "store_id",
    "sale_type",
    "toppings",
    "id"
})
public class OrderProduct {

    @JsonProperty("order_id")
    private Integer orderId;
    @JsonProperty("product_id")
    private Integer productId;
    @JsonProperty("units")
    private Integer units;
    @JsonProperty("unit_price")
    private String unitPrice;
    @JsonProperty("total_price")
    private String totalPrice;
    @JsonProperty("comments")
    private String comments;
    @JsonProperty("store_id")
    private Integer storeId;
    @JsonProperty("sale_type")
    private String saleType;
    @JsonProperty("toppings")
    private Object toppings;
    @JsonProperty("id")
    private Integer id;

    @JsonProperty("order_id")
    public Integer getOrderId() {
        return orderId;
    }

    @JsonProperty("order_id")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("product_id")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("units")
    public Integer getUnits() {
        return units;
    }

    @JsonProperty("units")
    public void setUnits(Integer units) {
        this.units = units;
    }

    @JsonProperty("unit_price")
    public String getUnitPrice() {
        return unitPrice;
    }

    @JsonProperty("unit_price")
    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    @JsonProperty("total_price")
    public String getTotalPrice() {
        return totalPrice;
    }

    @JsonProperty("total_price")
    public void setTotalPrice(String totalPrice) {
        this.totalPrice = totalPrice;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

    @JsonProperty("store_id")
    public Integer getStoreId() {
        return storeId;
    }

    @JsonProperty("store_id")
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @JsonProperty("sale_type")
    public String getSaleType() {
        return saleType;
    }

    @JsonProperty("sale_type")
    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    @JsonProperty("toppings")
    public Object getToppings() {
        return toppings;
    }

    @JsonProperty("toppings")
    public void setToppings(Object toppings) {
        this.toppings = toppings;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

}
