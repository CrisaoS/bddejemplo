
package co.com.rappi.models.orden;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "store_id",
    "name",
    "address",
    "phone",
    "lat",
    "lng",
    "contact_full_name",
    "contact_email",
    "retail_provider_id",
    "image",
    "background",
    "logo",
    "type",
    "store_type_group",
    "purchase_type",
    "is_main",
    "is_marketplace",
    "require_plu",
    "image_plu",
    "store_type_parent_id",
    "shopping_center",
    "delivery_conditions",
    "shopper_conditions"
})
public class Store {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("store_id")
    private Integer storeId;
    @JsonProperty("name")
    private String name;
    @JsonProperty("address")
    private String address;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("lng")
    private String lng;
    @JsonProperty("contact_full_name")
    private String contactFullName;
    @JsonProperty("contact_email")
    private String contactEmail;
    @JsonProperty("retail_provider_id")
    private String retailProviderId;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("background")
    private String background;
    @JsonProperty("logo")
    private String logo;
    @JsonProperty("type")
    private String type;
    @JsonProperty("store_type_group")
    private String storeTypeGroup;
    @JsonProperty("purchase_type")
    private String purchaseType;
    @JsonProperty("is_main")
    private Integer isMain;
    @JsonProperty("is_marketplace")
    private Boolean isMarketplace;
    @JsonProperty("require_plu")
    private Boolean requirePlu;
    @JsonProperty("image_plu")
    private String imagePlu;
    @JsonProperty("store_type_parent_id")
    private Object storeTypeParentId;
    @JsonProperty("shopping_center")
    private Boolean shoppingCenter;
    @JsonProperty("delivery_conditions")
    private List<Object> deliveryConditions = null;
    @JsonProperty("shopper_conditions")
    private Object shopperConditions;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("store_id")
    public Integer getStoreId() {
        return storeId;
    }

    @JsonProperty("store_id")
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("address")
    public String getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(String address) {
        this.address = address;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("lat")
    public String getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(String lat) {
        this.lat = lat;
    }

    @JsonProperty("lng")
    public String getLng() {
        return lng;
    }

    @JsonProperty("lng")
    public void setLng(String lng) {
        this.lng = lng;
    }

    @JsonProperty("contact_full_name")
    public String getContactFullName() {
        return contactFullName;
    }

    @JsonProperty("contact_full_name")
    public void setContactFullName(String contactFullName) {
        this.contactFullName = contactFullName;
    }

    @JsonProperty("contact_email")
    public String getContactEmail() {
        return contactEmail;
    }

    @JsonProperty("contact_email")
    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }

    @JsonProperty("retail_provider_id")
    public String getRetailProviderId() {
        return retailProviderId;
    }

    @JsonProperty("retail_provider_id")
    public void setRetailProviderId(String retailProviderId) {
        this.retailProviderId = retailProviderId;
    }

    @JsonProperty("image")
    public Object getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    @JsonProperty("background")
    public String getBackground() {
        return background;
    }

    @JsonProperty("background")
    public void setBackground(String background) {
        this.background = background;
    }

    @JsonProperty("logo")
    public String getLogo() {
        return logo;
    }

    @JsonProperty("logo")
    public void setLogo(String logo) {
        this.logo = logo;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    @JsonProperty("store_type_group")
    public String getStoreTypeGroup() {
        return storeTypeGroup;
    }

    @JsonProperty("store_type_group")
    public void setStoreTypeGroup(String storeTypeGroup) {
        this.storeTypeGroup = storeTypeGroup;
    }

    @JsonProperty("purchase_type")
    public String getPurchaseType() {
        return purchaseType;
    }

    @JsonProperty("purchase_type")
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    @JsonProperty("is_main")
    public Integer getIsMain() {
        return isMain;
    }

    @JsonProperty("is_main")
    public void setIsMain(Integer isMain) {
        this.isMain = isMain;
    }

    @JsonProperty("is_marketplace")
    public Boolean getIsMarketplace() {
        return isMarketplace;
    }

    @JsonProperty("is_marketplace")
    public void setIsMarketplace(Boolean isMarketplace) {
        this.isMarketplace = isMarketplace;
    }

    @JsonProperty("require_plu")
    public Boolean getRequirePlu() {
        return requirePlu;
    }

    @JsonProperty("require_plu")
    public void setRequirePlu(Boolean requirePlu) {
        this.requirePlu = requirePlu;
    }

    @JsonProperty("image_plu")
    public String getImagePlu() {
        return imagePlu;
    }

    @JsonProperty("image_plu")
    public void setImagePlu(String imagePlu) {
        this.imagePlu = imagePlu;
    }

    @JsonProperty("store_type_parent_id")
    public Object getStoreTypeParentId() {
        return storeTypeParentId;
    }

    @JsonProperty("store_type_parent_id")
    public void setStoreTypeParentId(Object storeTypeParentId) {
        this.storeTypeParentId = storeTypeParentId;
    }

    @JsonProperty("shopping_center")
    public Boolean getShoppingCenter() {
        return shoppingCenter;
    }

    @JsonProperty("shopping_center")
    public void setShoppingCenter(Boolean shoppingCenter) {
        this.shoppingCenter = shoppingCenter;
    }

    @JsonProperty("delivery_conditions")
    public List<Object> getDeliveryConditions() {
        return deliveryConditions;
    }

    @JsonProperty("delivery_conditions")
    public void setDeliveryConditions(List<Object> deliveryConditions) {
        this.deliveryConditions = deliveryConditions;
    }

    @JsonProperty("shopper_conditions")
    public Object getShopperConditions() {
        return shopperConditions;
    }

    @JsonProperty("shopper_conditions")
    public void setShopperConditions(Object shopperConditions) {
        this.shopperConditions = shopperConditions;
    }

}
