
package co.com.rappi.models.orden;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "description",
    "unit_type",
    "ean",
    "sale_type",
    "quantity",
    "requires_medical_prescription",
    "rawImage",
    "imageHigh",
    "id",
    "product_id",
    "order_product_id",
    "units",
    "unit_price",
    "total_price",
    "presentation",
    "total_quantity",
    "toppings",
    "price_difference",
    "price_difference_state",
    "price_difference_photo",
    "comments"
})
public class Product {

    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("unit_type")
    private String unitType;
    @JsonProperty("ean")
    private String ean;
    @JsonProperty("sale_type")
    private String saleType;
    @JsonProperty("quantity")
    private String quantity;
    @JsonProperty("requires_medical_prescription")
    private Boolean requiresMedicalPrescription;
    @JsonProperty("rawImage")
    private String rawImage;
    @JsonProperty("imageHigh")
    private String imageHigh;
    @JsonProperty("id")
    private Integer id;
    @JsonProperty("product_id")
    private Integer productId;
    @JsonProperty("order_product_id")
    private Integer orderProductId;
    @JsonProperty("units")
    private Integer units;
    @JsonProperty("unit_price")
    private String unitPrice;
    @JsonProperty("total_price")
    private String totalPrice;
    @JsonProperty("presentation")
    private String presentation;
    @JsonProperty("total_quantity")
    private Integer totalQuantity;
    @JsonProperty("toppings")
    private List<Object> toppings = null;
    @JsonProperty("price_difference")
    private Integer priceDifference;
    @JsonProperty("price_difference_state")
    private String priceDifferenceState;
    @JsonProperty("price_difference_photo")
    private String priceDifferencePhoto;
    @JsonProperty("comments")
    private String comments;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    @JsonProperty("unit_type")
    public String getUnitType() {
        return unitType;
    }

    @JsonProperty("unit_type")
    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @JsonProperty("ean")
    public String getEan() {
        return ean;
    }

    @JsonProperty("ean")
    public void setEan(String ean) {
        this.ean = ean;
    }

    @JsonProperty("sale_type")
    public String getSaleType() {
        return saleType;
    }

    @JsonProperty("sale_type")
    public void setSaleType(String saleType) {
        this.saleType = saleType;
    }

    @JsonProperty("quantity")
    public String getQuantity() {
        return quantity;
    }

    @JsonProperty("quantity")
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    @JsonProperty("requires_medical_prescription")
    public Boolean getRequiresMedicalPrescription() {
        return requiresMedicalPrescription;
    }

    @JsonProperty("requires_medical_prescription")
    public void setRequiresMedicalPrescription(Boolean requiresMedicalPrescription) {
        this.requiresMedicalPrescription = requiresMedicalPrescription;
    }

    @JsonProperty("rawImage")
    public String getRawImage() {
        return rawImage;
    }

    @JsonProperty("rawImage")
    public void setRawImage(String rawImage) {
        this.rawImage = rawImage;
    }

    @JsonProperty("imageHigh")
    public String getImageHigh() {
        return imageHigh;
    }

    @JsonProperty("imageHigh")
    public void setImageHigh(String imageHigh) {
        this.imageHigh = imageHigh;
    }

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("product_id")
    public Integer getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @JsonProperty("order_product_id")
    public Integer getOrderProductId() {
        return orderProductId;
    }

    @JsonProperty("order_product_id")
    public void setOrderProductId(Integer orderProductId) {
        this.orderProductId = orderProductId;
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

    @JsonProperty("presentation")
    public String getPresentation() {
        return presentation;
    }

    @JsonProperty("presentation")
    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }

    @JsonProperty("total_quantity")
    public Integer getTotalQuantity() {
        return totalQuantity;
    }

    @JsonProperty("total_quantity")
    public void setTotalQuantity(Integer totalQuantity) {
        this.totalQuantity = totalQuantity;
    }

    @JsonProperty("toppings")
    public List<Object> getToppings() {
        return toppings;
    }

    @JsonProperty("toppings")
    public void setToppings(List<Object> toppings) {
        this.toppings = toppings;
    }

    @JsonProperty("price_difference")
    public Integer getPriceDifference() {
        return priceDifference;
    }

    @JsonProperty("price_difference")
    public void setPriceDifference(Integer priceDifference) {
        this.priceDifference = priceDifference;
    }

    @JsonProperty("price_difference_state")
    public String getPriceDifferenceState() {
        return priceDifferenceState;
    }

    @JsonProperty("price_difference_state")
    public void setPriceDifferenceState(String priceDifferenceState) {
        this.priceDifferenceState = priceDifferenceState;
    }

    @JsonProperty("price_difference_photo")
    public String getPriceDifferencePhoto() {
        return priceDifferencePhoto;
    }

    @JsonProperty("price_difference_photo")
    public void setPriceDifferencePhoto(String priceDifferencePhoto) {
        this.priceDifferencePhoto = priceDifferencePhoto;
    }

    @JsonProperty("comments")
    public String getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(String comments) {
        this.comments = comments;
    }

}
