
package co.com.rappi.models.orden;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "normalization",
    "planometry",
    "advertising",
    "media_administrator",
    "analytics",
    "customer_service",
    "scheduled_orders",
    "expediter_map",
    "payments_failed_management",
    "cms_all_orders",
    "coupons_management",
    "rappicodes_management",
    "copies",
    "fraud_management",
    "manual_dispersion",
    "enable_storekeeper",
    "refund"
})
public class Permissions {

    @JsonProperty("normalization")
    private Integer normalization;
    @JsonProperty("planometry")
    private Integer planometry;
    @JsonProperty("advertising")
    private Integer advertising;
    @JsonProperty("media_administrator")
    private Integer mediaAdministrator;
    @JsonProperty("analytics")
    private Integer analytics;
    @JsonProperty("customer_service")
    private Integer customerService;
    @JsonProperty("scheduled_orders")
    private Integer scheduledOrders;
    @JsonProperty("expediter_map")
    private Integer expediterMap;
    @JsonProperty("payments_failed_management")
    private Integer paymentsFailedManagement;
    @JsonProperty("cms_all_orders")
    private Integer cmsAllOrders;
    @JsonProperty("coupons_management")
    private Integer couponsManagement;
    @JsonProperty("rappicodes_management")
    private Integer rappicodesManagement;
    @JsonProperty("copies")
    private Integer copies;
    @JsonProperty("fraud_management")
    private Integer fraudManagement;
    @JsonProperty("manual_dispersion")
    private Integer manualDispersion;
    @JsonProperty("enable_storekeeper")
    private Integer enableStorekeeper;
    @JsonProperty("refund")
    private Integer refund;

    @JsonProperty("normalization")
    public Integer getNormalization() {
        return normalization;
    }

    @JsonProperty("normalization")
    public void setNormalization(Integer normalization) {
        this.normalization = normalization;
    }

    @JsonProperty("planometry")
    public Integer getPlanometry() {
        return planometry;
    }

    @JsonProperty("planometry")
    public void setPlanometry(Integer planometry) {
        this.planometry = planometry;
    }

    @JsonProperty("advertising")
    public Integer getAdvertising() {
        return advertising;
    }

    @JsonProperty("advertising")
    public void setAdvertising(Integer advertising) {
        this.advertising = advertising;
    }

    @JsonProperty("media_administrator")
    public Integer getMediaAdministrator() {
        return mediaAdministrator;
    }

    @JsonProperty("media_administrator")
    public void setMediaAdministrator(Integer mediaAdministrator) {
        this.mediaAdministrator = mediaAdministrator;
    }

    @JsonProperty("analytics")
    public Integer getAnalytics() {
        return analytics;
    }

    @JsonProperty("analytics")
    public void setAnalytics(Integer analytics) {
        this.analytics = analytics;
    }

    @JsonProperty("customer_service")
    public Integer getCustomerService() {
        return customerService;
    }

    @JsonProperty("customer_service")
    public void setCustomerService(Integer customerService) {
        this.customerService = customerService;
    }

    @JsonProperty("scheduled_orders")
    public Integer getScheduledOrders() {
        return scheduledOrders;
    }

    @JsonProperty("scheduled_orders")
    public void setScheduledOrders(Integer scheduledOrders) {
        this.scheduledOrders = scheduledOrders;
    }

    @JsonProperty("expediter_map")
    public Integer getExpediterMap() {
        return expediterMap;
    }

    @JsonProperty("expediter_map")
    public void setExpediterMap(Integer expediterMap) {
        this.expediterMap = expediterMap;
    }

    @JsonProperty("payments_failed_management")
    public Integer getPaymentsFailedManagement() {
        return paymentsFailedManagement;
    }

    @JsonProperty("payments_failed_management")
    public void setPaymentsFailedManagement(Integer paymentsFailedManagement) {
        this.paymentsFailedManagement = paymentsFailedManagement;
    }

    @JsonProperty("cms_all_orders")
    public Integer getCmsAllOrders() {
        return cmsAllOrders;
    }

    @JsonProperty("cms_all_orders")
    public void setCmsAllOrders(Integer cmsAllOrders) {
        this.cmsAllOrders = cmsAllOrders;
    }

    @JsonProperty("coupons_management")
    public Integer getCouponsManagement() {
        return couponsManagement;
    }

    @JsonProperty("coupons_management")
    public void setCouponsManagement(Integer couponsManagement) {
        this.couponsManagement = couponsManagement;
    }

    @JsonProperty("rappicodes_management")
    public Integer getRappicodesManagement() {
        return rappicodesManagement;
    }

    @JsonProperty("rappicodes_management")
    public void setRappicodesManagement(Integer rappicodesManagement) {
        this.rappicodesManagement = rappicodesManagement;
    }

    @JsonProperty("copies")
    public Integer getCopies() {
        return copies;
    }

    @JsonProperty("copies")
    public void setCopies(Integer copies) {
        this.copies = copies;
    }

    @JsonProperty("fraud_management")
    public Integer getFraudManagement() {
        return fraudManagement;
    }

    @JsonProperty("fraud_management")
    public void setFraudManagement(Integer fraudManagement) {
        this.fraudManagement = fraudManagement;
    }

    @JsonProperty("manual_dispersion")
    public Integer getManualDispersion() {
        return manualDispersion;
    }

    @JsonProperty("manual_dispersion")
    public void setManualDispersion(Integer manualDispersion) {
        this.manualDispersion = manualDispersion;
    }

    @JsonProperty("enable_storekeeper")
    public Integer getEnableStorekeeper() {
        return enableStorekeeper;
    }

    @JsonProperty("enable_storekeeper")
    public void setEnableStorekeeper(Integer enableStorekeeper) {
        this.enableStorekeeper = enableStorekeeper;
    }

    @JsonProperty("refund")
    public Integer getRefund() {
        return refund;
    }

    @JsonProperty("refund")
    public void setRefund(Integer refund) {
        this.refund = refund;
    }

}
