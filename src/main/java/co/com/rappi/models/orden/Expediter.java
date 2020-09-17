
package co.com.rappi.models.orden;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "email",
    "permissions",
    "activated",
    "activation_code",
    "activated_at",
    "last_login",
    "persist_code",
    "reset_password_code",
    "first_name",
    "last_name",
    "created_at",
    "updated_at",
    "is_active_in_orders_cms",
    "phone",
    "city_id",
    "receive_new_support_orders",
    "max_orders_for_automatic_expediter_assign",
    "name"
})
public class Expediter {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("email")
    private String email;
    @JsonProperty("permissions")
    private Permissions permissions;
    @JsonProperty("activated")
    private Boolean activated;
    @JsonProperty("activation_code")
    private Object activationCode;
    @JsonProperty("activated_at")
    private Object activatedAt;
    @JsonProperty("last_login")
    private String lastLogin;
    @JsonProperty("persist_code")
    private String persistCode;
    @JsonProperty("reset_password_code")
    private Object resetPasswordCode;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("is_active_in_orders_cms")
    private Boolean isActiveInOrdersCms;
    @JsonProperty("phone")
    private String phone;
    @JsonProperty("city_id")
    private Integer cityId;
    @JsonProperty("receive_new_support_orders")
    private Boolean receiveNewSupportOrders;
    @JsonProperty("max_orders_for_automatic_expediter_assign")
    private Integer maxOrdersForAutomaticExpediterAssign;
    @JsonProperty("name")
    private String name;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("email")
    public String getEmail() {
        return email;
    }

    @JsonProperty("email")
    public void setEmail(String email) {
        this.email = email;
    }

    @JsonProperty("permissions")
    public Permissions getPermissions() {
        return permissions;
    }

    @JsonProperty("permissions")
    public void setPermissions(Permissions permissions) {
        this.permissions = permissions;
    }

    @JsonProperty("activated")
    public Boolean getActivated() {
        return activated;
    }

    @JsonProperty("activated")
    public void setActivated(Boolean activated) {
        this.activated = activated;
    }

    @JsonProperty("activation_code")
    public Object getActivationCode() {
        return activationCode;
    }

    @JsonProperty("activation_code")
    public void setActivationCode(Object activationCode) {
        this.activationCode = activationCode;
    }

    @JsonProperty("activated_at")
    public Object getActivatedAt() {
        return activatedAt;
    }

    @JsonProperty("activated_at")
    public void setActivatedAt(Object activatedAt) {
        this.activatedAt = activatedAt;
    }

    @JsonProperty("last_login")
    public String getLastLogin() {
        return lastLogin;
    }

    @JsonProperty("last_login")
    public void setLastLogin(String lastLogin) {
        this.lastLogin = lastLogin;
    }

    @JsonProperty("persist_code")
    public String getPersistCode() {
        return persistCode;
    }

    @JsonProperty("persist_code")
    public void setPersistCode(String persistCode) {
        this.persistCode = persistCode;
    }

    @JsonProperty("reset_password_code")
    public Object getResetPasswordCode() {
        return resetPasswordCode;
    }

    @JsonProperty("reset_password_code")
    public void setResetPasswordCode(Object resetPasswordCode) {
        this.resetPasswordCode = resetPasswordCode;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("created_at")
    public String getCreatedAt() {
        return createdAt;
    }

    @JsonProperty("created_at")
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    @JsonProperty("updated_at")
    public String getUpdatedAt() {
        return updatedAt;
    }

    @JsonProperty("updated_at")
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @JsonProperty("is_active_in_orders_cms")
    public Boolean getIsActiveInOrdersCms() {
        return isActiveInOrdersCms;
    }

    @JsonProperty("is_active_in_orders_cms")
    public void setIsActiveInOrdersCms(Boolean isActiveInOrdersCms) {
        this.isActiveInOrdersCms = isActiveInOrdersCms;
    }

    @JsonProperty("phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("phone")
    public void setPhone(String phone) {
        this.phone = phone;
    }

    @JsonProperty("city_id")
    public Integer getCityId() {
        return cityId;
    }

    @JsonProperty("city_id")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @JsonProperty("receive_new_support_orders")
    public Boolean getReceiveNewSupportOrders() {
        return receiveNewSupportOrders;
    }

    @JsonProperty("receive_new_support_orders")
    public void setReceiveNewSupportOrders(Boolean receiveNewSupportOrders) {
        this.receiveNewSupportOrders = receiveNewSupportOrders;
    }

    @JsonProperty("max_orders_for_automatic_expediter_assign")
    public Integer getMaxOrdersForAutomaticExpediterAssign() {
        return maxOrdersForAutomaticExpediterAssign;
    }

    @JsonProperty("max_orders_for_automatic_expediter_assign")
    public void setMaxOrdersForAutomaticExpediterAssign(Integer maxOrdersForAutomaticExpediterAssign) {
        this.maxOrdersForAutomaticExpediterAssign = maxOrdersForAutomaticExpediterAssign;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

}
