
package co.com.rappi.models.orden;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "photo_taken",
    "url_image"
})
public class ReceivedProductPhoto {

    @JsonProperty("photo_taken")
    private Boolean photoTaken;
    @JsonProperty("url_image")
    private String urlImage;

    @JsonProperty("photo_taken")
    public Boolean getPhotoTaken() {
        return photoTaken;
    }

    @JsonProperty("photo_taken")
    public void setPhotoTaken(Boolean photoTaken) {
        this.photoTaken = photoTaken;
    }

    @JsonProperty("url_image")
    public String getUrlImage() {
        return urlImage;
    }

    @JsonProperty("url_image")
    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

}
