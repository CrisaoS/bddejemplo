
package co.com.rappi.models.orden;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "order_id",
    "sender_last_chat_message",
    "date_last_chat_message",
    "total_chat_messages",
    "store_type",
    "dispatch_attend",
    "is_active",
    "storekeeper_type",
    "expediter_type",
    "last_update_state",
    "fraud_state",
    "user_fraud_id",
    "need_delivery_kit",
    "delayed",
    "storekeeper_scheduled_for",
    "preferred_transport_type",
    "is_free",
    "delayed_at",
    "can_be_canceled",
    "zone_id",
    "manual_dynamic_rate",
    "init_store_type",
    "promised_shipping_price",
    "partner_order_state",
    "store_type_store",
    "delivery_kit_size",
    "reference_point_id",
    "reference_point_lat",
    "reference_point_lng",
    "reference_point_class",
    "reference_point_name",
    "reference_point_address",
    "visible_at",
    "hide_by_shopper_inactivity",
    "shipping",
    "store_id",
    "hash",
    "city_address_id",
    "need_be_analyzed",
    "store_to_user_distance",
    "zone_earning_id",
    "is_placed_now",
    "courier_distance"
})
public class CalculatedInformation {

    @JsonProperty("order_id")
    private Integer orderId;
    @JsonProperty("sender_last_chat_message")
    private Object senderLastChatMessage;
    @JsonProperty("date_last_chat_message")
    private Object dateLastChatMessage;
    @JsonProperty("total_chat_messages")
    private Integer totalChatMessages;
    @JsonProperty("store_type")
    private String storeType;
    @JsonProperty("dispatch_attend")
    private Boolean dispatchAttend;
    @JsonProperty("is_active")
    private Boolean isActive;
    @JsonProperty("storekeeper_type")
    private String storekeeperType;
    @JsonProperty("expediter_type")
    private String expediterType;
    @JsonProperty("last_update_state")
    private String lastUpdateState;
    @JsonProperty("fraud_state")
    private String fraudState;
    @JsonProperty("user_fraud_id")
    private Object userFraudId;
    @JsonProperty("need_delivery_kit")
    private Boolean needDeliveryKit;
    @JsonProperty("delayed")
    private Boolean delayed;
    @JsonProperty("storekeeper_scheduled_for")
    private Object storekeeperScheduledFor;
    @JsonProperty("preferred_transport_type")
    private Object preferredTransportType;
    @JsonProperty("is_free")
    private Boolean isFree;
    @JsonProperty("delayed_at")
    private Object delayedAt;
    @JsonProperty("can_be_canceled")
    private Boolean canBeCanceled;
    @JsonProperty("zone_id")
    private Object zoneId;
    @JsonProperty("manual_dynamic_rate")
    private Object manualDynamicRate;
    @JsonProperty("init_store_type")
    private String initStoreType;
    @JsonProperty("promised_shipping_price")
    private String promisedShippingPrice;
    @JsonProperty("partner_order_state")
    private Object partnerOrderState;
    @JsonProperty("store_type_store")
    private String storeTypeStore;
    @JsonProperty("delivery_kit_size")
    private Object deliveryKitSize;
    @JsonProperty("reference_point_id")
    private Object referencePointId;
    @JsonProperty("reference_point_lat")
    private Object referencePointLat;
    @JsonProperty("reference_point_lng")
    private Object referencePointLng;
    @JsonProperty("reference_point_class")
    private Object referencePointClass;
    @JsonProperty("reference_point_name")
    private Object referencePointName;
    @JsonProperty("reference_point_address")
    private Object referencePointAddress;
    @JsonProperty("visible_at")
    private Object visibleAt;
    @JsonProperty("hide_by_shopper_inactivity")
    private Boolean hideByShopperInactivity;
    @JsonProperty("shipping")
    private String shipping;
    @JsonProperty("store_id")
    private Integer storeId;
    @JsonProperty("hash")
    private Object hash;
    @JsonProperty("city_address_id")
    private Object cityAddressId;
    @JsonProperty("need_be_analyzed")
    private Boolean needBeAnalyzed;
    @JsonProperty("store_to_user_distance")
    private Object storeToUserDistance;
    @JsonProperty("zone_earning_id")
    private Object zoneEarningId;
    @JsonProperty("is_placed_now")
    private Boolean isPlacedNow;
    @JsonProperty("courier_distance")
    private Object courierDistance;

    @JsonProperty("order_id")
    public Integer getOrderId() {
        return orderId;
    }

    @JsonProperty("order_id")
    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @JsonProperty("sender_last_chat_message")
    public Object getSenderLastChatMessage() {
        return senderLastChatMessage;
    }

    @JsonProperty("sender_last_chat_message")
    public void setSenderLastChatMessage(Object senderLastChatMessage) {
        this.senderLastChatMessage = senderLastChatMessage;
    }

    @JsonProperty("date_last_chat_message")
    public Object getDateLastChatMessage() {
        return dateLastChatMessage;
    }

    @JsonProperty("date_last_chat_message")
    public void setDateLastChatMessage(Object dateLastChatMessage) {
        this.dateLastChatMessage = dateLastChatMessage;
    }

    @JsonProperty("total_chat_messages")
    public Integer getTotalChatMessages() {
        return totalChatMessages;
    }

    @JsonProperty("total_chat_messages")
    public void setTotalChatMessages(Integer totalChatMessages) {
        this.totalChatMessages = totalChatMessages;
    }

    @JsonProperty("store_type")
    public String getStoreType() {
        return storeType;
    }

    @JsonProperty("store_type")
    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    @JsonProperty("dispatch_attend")
    public Boolean getDispatchAttend() {
        return dispatchAttend;
    }

    @JsonProperty("dispatch_attend")
    public void setDispatchAttend(Boolean dispatchAttend) {
        this.dispatchAttend = dispatchAttend;
    }

    @JsonProperty("is_active")
    public Boolean getIsActive() {
        return isActive;
    }

    @JsonProperty("is_active")
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    @JsonProperty("storekeeper_type")
    public String getStorekeeperType() {
        return storekeeperType;
    }

    @JsonProperty("storekeeper_type")
    public void setStorekeeperType(String storekeeperType) {
        this.storekeeperType = storekeeperType;
    }

    @JsonProperty("expediter_type")
    public String getExpediterType() {
        return expediterType;
    }

    @JsonProperty("expediter_type")
    public void setExpediterType(String expediterType) {
        this.expediterType = expediterType;
    }

    @JsonProperty("last_update_state")
    public String getLastUpdateState() {
        return lastUpdateState;
    }

    @JsonProperty("last_update_state")
    public void setLastUpdateState(String lastUpdateState) {
        this.lastUpdateState = lastUpdateState;
    }

    @JsonProperty("fraud_state")
    public String getFraudState() {
        return fraudState;
    }

    @JsonProperty("fraud_state")
    public void setFraudState(String fraudState) {
        this.fraudState = fraudState;
    }

    @JsonProperty("user_fraud_id")
    public Object getUserFraudId() {
        return userFraudId;
    }

    @JsonProperty("user_fraud_id")
    public void setUserFraudId(Object userFraudId) {
        this.userFraudId = userFraudId;
    }

    @JsonProperty("need_delivery_kit")
    public Boolean getNeedDeliveryKit() {
        return needDeliveryKit;
    }

    @JsonProperty("need_delivery_kit")
    public void setNeedDeliveryKit(Boolean needDeliveryKit) {
        this.needDeliveryKit = needDeliveryKit;
    }

    @JsonProperty("delayed")
    public Boolean getDelayed() {
        return delayed;
    }

    @JsonProperty("delayed")
    public void setDelayed(Boolean delayed) {
        this.delayed = delayed;
    }

    @JsonProperty("storekeeper_scheduled_for")
    public Object getStorekeeperScheduledFor() {
        return storekeeperScheduledFor;
    }

    @JsonProperty("storekeeper_scheduled_for")
    public void setStorekeeperScheduledFor(Object storekeeperScheduledFor) {
        this.storekeeperScheduledFor = storekeeperScheduledFor;
    }

    @JsonProperty("preferred_transport_type")
    public Object getPreferredTransportType() {
        return preferredTransportType;
    }

    @JsonProperty("preferred_transport_type")
    public void setPreferredTransportType(Object preferredTransportType) {
        this.preferredTransportType = preferredTransportType;
    }

    @JsonProperty("is_free")
    public Boolean getIsFree() {
        return isFree;
    }

    @JsonProperty("is_free")
    public void setIsFree(Boolean isFree) {
        this.isFree = isFree;
    }

    @JsonProperty("delayed_at")
    public Object getDelayedAt() {
        return delayedAt;
    }

    @JsonProperty("delayed_at")
    public void setDelayedAt(Object delayedAt) {
        this.delayedAt = delayedAt;
    }

    @JsonProperty("can_be_canceled")
    public Boolean getCanBeCanceled() {
        return canBeCanceled;
    }

    @JsonProperty("can_be_canceled")
    public void setCanBeCanceled(Boolean canBeCanceled) {
        this.canBeCanceled = canBeCanceled;
    }

    @JsonProperty("zone_id")
    public Object getZoneId() {
        return zoneId;
    }

    @JsonProperty("zone_id")
    public void setZoneId(Object zoneId) {
        this.zoneId = zoneId;
    }

    @JsonProperty("manual_dynamic_rate")
    public Object getManualDynamicRate() {
        return manualDynamicRate;
    }

    @JsonProperty("manual_dynamic_rate")
    public void setManualDynamicRate(Object manualDynamicRate) {
        this.manualDynamicRate = manualDynamicRate;
    }

    @JsonProperty("init_store_type")
    public String getInitStoreType() {
        return initStoreType;
    }

    @JsonProperty("init_store_type")
    public void setInitStoreType(String initStoreType) {
        this.initStoreType = initStoreType;
    }

    @JsonProperty("promised_shipping_price")
    public String getPromisedShippingPrice() {
        return promisedShippingPrice;
    }

    @JsonProperty("promised_shipping_price")
    public void setPromisedShippingPrice(String promisedShippingPrice) {
        this.promisedShippingPrice = promisedShippingPrice;
    }

    @JsonProperty("partner_order_state")
    public Object getPartnerOrderState() {
        return partnerOrderState;
    }

    @JsonProperty("partner_order_state")
    public void setPartnerOrderState(Object partnerOrderState) {
        this.partnerOrderState = partnerOrderState;
    }

    @JsonProperty("store_type_store")
    public String getStoreTypeStore() {
        return storeTypeStore;
    }

    @JsonProperty("store_type_store")
    public void setStoreTypeStore(String storeTypeStore) {
        this.storeTypeStore = storeTypeStore;
    }

    @JsonProperty("delivery_kit_size")
    public Object getDeliveryKitSize() {
        return deliveryKitSize;
    }

    @JsonProperty("delivery_kit_size")
    public void setDeliveryKitSize(Object deliveryKitSize) {
        this.deliveryKitSize = deliveryKitSize;
    }

    @JsonProperty("reference_point_id")
    public Object getReferencePointId() {
        return referencePointId;
    }

    @JsonProperty("reference_point_id")
    public void setReferencePointId(Object referencePointId) {
        this.referencePointId = referencePointId;
    }

    @JsonProperty("reference_point_lat")
    public Object getReferencePointLat() {
        return referencePointLat;
    }

    @JsonProperty("reference_point_lat")
    public void setReferencePointLat(Object referencePointLat) {
        this.referencePointLat = referencePointLat;
    }

    @JsonProperty("reference_point_lng")
    public Object getReferencePointLng() {
        return referencePointLng;
    }

    @JsonProperty("reference_point_lng")
    public void setReferencePointLng(Object referencePointLng) {
        this.referencePointLng = referencePointLng;
    }

    @JsonProperty("reference_point_class")
    public Object getReferencePointClass() {
        return referencePointClass;
    }

    @JsonProperty("reference_point_class")
    public void setReferencePointClass(Object referencePointClass) {
        this.referencePointClass = referencePointClass;
    }

    @JsonProperty("reference_point_name")
    public Object getReferencePointName() {
        return referencePointName;
    }

    @JsonProperty("reference_point_name")
    public void setReferencePointName(Object referencePointName) {
        this.referencePointName = referencePointName;
    }

    @JsonProperty("reference_point_address")
    public Object getReferencePointAddress() {
        return referencePointAddress;
    }

    @JsonProperty("reference_point_address")
    public void setReferencePointAddress(Object referencePointAddress) {
        this.referencePointAddress = referencePointAddress;
    }

    @JsonProperty("visible_at")
    public Object getVisibleAt() {
        return visibleAt;
    }

    @JsonProperty("visible_at")
    public void setVisibleAt(Object visibleAt) {
        this.visibleAt = visibleAt;
    }

    @JsonProperty("hide_by_shopper_inactivity")
    public Boolean getHideByShopperInactivity() {
        return hideByShopperInactivity;
    }

    @JsonProperty("hide_by_shopper_inactivity")
    public void setHideByShopperInactivity(Boolean hideByShopperInactivity) {
        this.hideByShopperInactivity = hideByShopperInactivity;
    }

    @JsonProperty("shipping")
    public String getShipping() {
        return shipping;
    }

    @JsonProperty("shipping")
    public void setShipping(String shipping) {
        this.shipping = shipping;
    }

    @JsonProperty("store_id")
    public Integer getStoreId() {
        return storeId;
    }

    @JsonProperty("store_id")
    public void setStoreId(Integer storeId) {
        this.storeId = storeId;
    }

    @JsonProperty("hash")
    public Object getHash() {
        return hash;
    }

    @JsonProperty("hash")
    public void setHash(Object hash) {
        this.hash = hash;
    }

    @JsonProperty("city_address_id")
    public Object getCityAddressId() {
        return cityAddressId;
    }

    @JsonProperty("city_address_id")
    public void setCityAddressId(Object cityAddressId) {
        this.cityAddressId = cityAddressId;
    }

    @JsonProperty("need_be_analyzed")
    public Boolean getNeedBeAnalyzed() {
        return needBeAnalyzed;
    }

    @JsonProperty("need_be_analyzed")
    public void setNeedBeAnalyzed(Boolean needBeAnalyzed) {
        this.needBeAnalyzed = needBeAnalyzed;
    }

    @JsonProperty("store_to_user_distance")
    public Object getStoreToUserDistance() {
        return storeToUserDistance;
    }

    @JsonProperty("store_to_user_distance")
    public void setStoreToUserDistance(Object storeToUserDistance) {
        this.storeToUserDistance = storeToUserDistance;
    }

    @JsonProperty("zone_earning_id")
    public Object getZoneEarningId() {
        return zoneEarningId;
    }

    @JsonProperty("zone_earning_id")
    public void setZoneEarningId(Object zoneEarningId) {
        this.zoneEarningId = zoneEarningId;
    }

    @JsonProperty("is_placed_now")
    public Boolean getIsPlacedNow() {
        return isPlacedNow;
    }

    @JsonProperty("is_placed_now")
    public void setIsPlacedNow(Boolean isPlacedNow) {
        this.isPlacedNow = isPlacedNow;
    }

    @JsonProperty("courier_distance")
    public Object getCourierDistance() {
        return courierDistance;
    }

    @JsonProperty("courier_distance")
    public void setCourierDistance(Object courierDistance) {
        this.courierDistance = courierDistance;
    }

}
