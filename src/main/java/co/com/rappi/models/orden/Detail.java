
package co.com.rappi.models.orden;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "offertable_id",
    "product_id",
    "value",
    "type",
    "offertable_type",
    "description",
    "title",
    "url",
    "type_description"
})
public class Detail {

    @JsonProperty("offertable_id")
    private Integer offertableId;
    @JsonProperty("product_id")
    private Object productId;
    @JsonProperty("value")
    private String value;
    @JsonProperty("type")
    private String type;
    @JsonProperty("offertable_type")
    private String offertableType;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("title")
    private Object title;
    @JsonProperty("url")
    private Object url;
    @JsonProperty("type_description")
    private String typeDescription;

    @JsonProperty("offertable_id")
    public Integer getOffertableId() {
        return offertableId;
    }

    @JsonProperty("offertable_id")
    public void setOffertableId(Integer offertableId) {
        this.offertableId = offertableId;
    }

    @JsonProperty("product_id")
    public Object getProductId() {
        return productId;
    }

    @JsonProperty("product_id")
    public void setProductId(Object productId) {
        this.productId = productId;
    }

    @JsonProperty("value")
    public String getValue() {
        return value;
    }

    @JsonProperty("value")
    public void setValue(String value) {
        this.value = value;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("offertable_type")
    public String getOffertableType() {
        return offertableType;
    }

    @JsonProperty("offertable_type")
    public void setOffertableType(String offertableType) {
        this.offertableType = offertableType;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("title")
    public Object getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Object title) {
        this.title = title;
    }

    @JsonProperty("url")
    public Object getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(Object url) {
        this.url = url;
    }

    @JsonProperty("type_description")
    public String getTypeDescription() {
        return typeDescription;
    }

    @JsonProperty("type_description")
    public void setTypeDescription(String typeDescription) {
        this.typeDescription = typeDescription;
    }

}
