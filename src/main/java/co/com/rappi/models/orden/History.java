
package co.com.rappi.models.orden;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "removals",
    "replaced",
    "price_changed",
    "arrived"
})
public class History {

    @JsonProperty("removals")
    private List<Object> removals = null;
    @JsonProperty("replaced")
    private List<Object> replaced = null;
    @JsonProperty("price_changed")
    private List<Object> priceChanged = null;
    @JsonProperty("arrived")
    private Boolean arrived;

    @JsonProperty("removals")
    public List<Object> getRemovals() {
        return removals;
    }

    @JsonProperty("removals")
    public void setRemovals(List<Object> removals) {
        this.removals = removals;
    }

    @JsonProperty("replaced")
    public List<Object> getReplaced() {
        return replaced;
    }

    @JsonProperty("replaced")
    public void setReplaced(List<Object> replaced) {
        this.replaced = replaced;
    }

    @JsonProperty("price_changed")
    public List<Object> getPriceChanged() {
        return priceChanged;
    }

    @JsonProperty("price_changed")
    public void setPriceChanged(List<Object> priceChanged) {
        this.priceChanged = priceChanged;
    }

    @JsonProperty("arrived")
    public Boolean getArrived() {
        return arrived;
    }

    @JsonProperty("arrived")
    public void setArrived(Boolean arrived) {
        this.arrived = arrived;
    }

}
