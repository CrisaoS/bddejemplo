
package co.com.rappi.models.orden;


import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "application_user_id",
    "storekeeper_id",
    "state",
    "payment_method",
    "total_value",
    "tip",
    "eta_starts_at",
    "eta",
    "comment",
    "whim",
    "created_at",
    "updated_at",
    "signature_pic",
    "address_id",
    "address_description",
    "assignment_time",
    "taked_at",
    "closed_at",
    "time_in_store",
    "travel_time",
    "purchase_type",
    "deliveryboy_id",
    "place_at",
    "cms_zone_id",
    "expediter_id",
    "store_to_user_eta",
    "cooking_time",
    "split_id",
    "exito_id",
    "whim_store_id",
    "order_released",
    "cooking_time_started_at",
    "fraud_status",
    "min_earning",
    "max_earning",
    "init_eta",
    "picking_time",
    "level_earning",
    "init_time",
    "place_at_utc",
    "time_zone",
    "totalwithtip",
    "arrived_at",
    "modifications",
    "discount_old",
    "discount_details_leave_apply",
    "products",
    "stores",
    "all_whims",
    "headers",
    "calculated_information",
    "storekeeper",
    "sum_applied_credits",
    "sum_charges",
    "total_price_whims",
    "whims",
    "chat_messages",
    "debit_credits",
    "storekeeper_earnings",
    "charges",
    "expediter",
    "order_value_modifications",
    "order_products",
    "total_products_price_with_topping",
    "order_partner_details",
    "order_partner",
    "application_order_state",
    "rappi_pay_debit",
    "offers",
    "offer",
    "debit_rappi_credits",
    "address",
    "history",
    "total_earnings",
    "total_earnings_from_user",
    "total_earnings_from_rappi",
    "earning_with_out_basic_earning",
    "normal_service_cost",
    "storekeeper_type",
    "total_chats_storekeeper",
    "total_chats_user",
    "discount_by_credits",
    "is_order_free",
    "store_brand",
    "total_charges_products",
    "order_courier_comment",
    "total_products_with_toppings",
    "need_to_pay_order_in_store",
    "can_take_bill_photo",
    "must_take_bill_photo",
    "update_firebase_position",
    "order_type",
    "price_difference_reported",
    "shopper_conditions",
    "store_to_user_distance",
    "received_product_photo",
    "total_discount",
    "total_without_discount",
    "total_with_tip_without_discount",
    "total_products",
    "total_charges",
    "store_type",
    "state_message",
    "states_workflow",
    "state_current",
    "state_current_image",
    "state_current_shows_expanded_chat",
    "order_modifications",
    "notifications"
})
public class Orden {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("application_user_id")
    private Integer applicationUserId;
    @JsonProperty("storekeeper_id")
    private Object storekeeperId;
    @JsonProperty("state")
    private String state;
    @JsonProperty("payment_method")
    private String paymentMethod;
    @JsonProperty("total_value")
    private String totalValue;
    @JsonProperty("tip")
    private String tip;
    @JsonProperty("eta_starts_at")
    private Object etaStartsAt;
    @JsonProperty("eta")
    private Object eta;
    @JsonProperty("comment")
    private String comment;
    @JsonProperty("whim")
    private String whim;
    @JsonProperty("created_at")
    private String createdAt;
    @JsonProperty("updated_at")
    private String updatedAt;
    @JsonProperty("signature_pic")
    private Object signaturePic;
    @JsonProperty("address_id")
    private Integer addressId;
    @JsonProperty("address_description")
    private String addressDescription;
    @JsonProperty("assignment_time")
    private Integer assignmentTime;
    @JsonProperty("taked_at")
    private Object takedAt;
    @JsonProperty("closed_at")
    private String closedAt;
    @JsonProperty("time_in_store")
    private Integer timeInStore;
    @JsonProperty("travel_time")
    private Integer travelTime;
    @JsonProperty("purchase_type")
    private String purchaseType;
    @JsonProperty("deliveryboy_id")
    private Object deliveryboyId;
    @JsonProperty("place_at")
    private Object placeAt;
    @JsonProperty("cms_zone_id")
    private Object cmsZoneId;
    @JsonProperty("expediter_id")
    private Integer expediterId;
    @JsonProperty("store_to_user_eta")
    private Object storeToUserEta;
    @JsonProperty("cooking_time")
    private Object cookingTime;
    @JsonProperty("split_id")
    private Object splitId;
    @JsonProperty("exito_id")
    private Object exitoId;
    @JsonProperty("whim_store_id")
    private Object whimStoreId;
    @JsonProperty("order_released")
    private Boolean orderReleased;
    @JsonProperty("cooking_time_started_at")
    private Object cookingTimeStartedAt;
    @JsonProperty("fraud_status")
    private Object fraudStatus;
    @JsonProperty("min_earning")
    private Object minEarning;
    @JsonProperty("max_earning")
    private Object maxEarning;
    @JsonProperty("init_eta")
    private Object initEta;
    @JsonProperty("picking_time")
    private Object pickingTime;
    @JsonProperty("level_earning")
    private String levelEarning;
    @JsonProperty("init_time")
    private Object initTime;
    @JsonProperty("place_at_utc")
    private Object placeAtUtc;
    @JsonProperty("time_zone")
    private Object timeZone;
    @JsonProperty("totalwithtip")
    private Integer totalwithtip;
    @JsonProperty("arrived_at")
    private Object arrivedAt;
    @JsonProperty("modifications")
    private List<Object> modifications = null;
    @JsonProperty("discount_old")
    private DiscountOld discountOld;
    @JsonProperty("discount_details_leave_apply")
    private List<Object> discountDetailsLeaveApply = null;
    @JsonProperty("products")
    private List<Product> products = null;
    @JsonProperty("stores")
    private List<Store> stores = null;
    @JsonProperty("all_whims")
    private List<Object> allWhims = null;
    @JsonProperty("headers")
    private List<Header> headers = null;
    @JsonProperty("calculated_information")
    private CalculatedInformation calculatedInformation;
    @JsonProperty("storekeeper")
    private Object storekeeper;
    @JsonProperty("sum_applied_credits")
    private List<Object> sumAppliedCredits = null;
    @JsonProperty("sum_charges")
    private List<SumCharge> sumCharges = null;
    @JsonProperty("total_price_whims")
    private Object totalPriceWhims;
    @JsonProperty("whims")
    private List<Object> whims = null;
    @JsonProperty("chat_messages")
    private List<Object> chatMessages = null;
    @JsonProperty("debit_credits")
    private List<Object> debitCredits = null;
    @JsonProperty("storekeeper_earnings")
    private List<Object> storekeeperEarnings = null;
    @JsonProperty("charges")
    private List<Charge> charges = null;
    @JsonProperty("expediter")
    private Expediter expediter;
    @JsonProperty("order_value_modifications")
    private List<Object> orderValueModifications = null;
    @JsonProperty("order_products")
    private List<OrderProduct> orderProducts = null;
    @JsonProperty("total_products_price_with_topping")
    private List<TotalProductsPriceWithTopping> totalProductsPriceWithTopping = null;
    @JsonProperty("order_partner_details")
    private List<Object> orderPartnerDetails = null;
    @JsonProperty("order_partner")
    private Object orderPartner;
    @JsonProperty("application_order_state")
    private Object applicationOrderState;
    @JsonProperty("rappi_pay_debit")
    private Object rappiPayDebit;
    @JsonProperty("offers")
    private Object offers;
    @JsonProperty("offer")
    private Object offer;
    @JsonProperty("debit_rappi_credits")
    private Integer debitRappiCredits;
    @JsonProperty("address")
    private Address address;
    @JsonProperty("history")
    private History history;
    @JsonProperty("total_earnings")
    private Integer totalEarnings;
    @JsonProperty("total_earnings_from_user")
    private Integer totalEarningsFromUser;
    @JsonProperty("total_earnings_from_rappi")
    private Integer totalEarningsFromRappi;
    @JsonProperty("earning_with_out_basic_earning")
    private Integer earningWithOutBasicEarning;
    @JsonProperty("normal_service_cost")
    private Integer normalServiceCost;
    @JsonProperty("storekeeper_type")
    private String storekeeperType;
    @JsonProperty("total_chats_storekeeper")
    private Integer totalChatsStorekeeper;
    @JsonProperty("total_chats_user")
    private Integer totalChatsUser;
    @JsonProperty("discount_by_credits")
    private Object discountByCredits;
    @JsonProperty("is_order_free")
    private Boolean isOrderFree;
    @JsonProperty("store_brand")
    private StoreBrand storeBrand;
    @JsonProperty("total_charges_products")
    private Integer totalChargesProducts;
    @JsonProperty("order_courier_comment")
    private Object orderCourierComment;
    @JsonProperty("total_products_with_toppings")
    private Integer totalProductsWithToppings;
    @JsonProperty("need_to_pay_order_in_store")
    private Boolean needToPayOrderInStore;
    @JsonProperty("can_take_bill_photo")
    private Boolean canTakeBillPhoto;
    @JsonProperty("must_take_bill_photo")
    private Boolean mustTakeBillPhoto;
    @JsonProperty("update_firebase_position")
    private Boolean updateFirebasePosition;
    @JsonProperty("order_type")
    private String orderType;
    @JsonProperty("price_difference_reported")
    private Boolean priceDifferenceReported;
    @JsonProperty("shopper_conditions")
    private Object shopperConditions;
    @JsonProperty("store_to_user_distance")
    private Integer storeToUserDistance;
    @JsonProperty("received_product_photo")
    private ReceivedProductPhoto receivedProductPhoto;
    @JsonProperty("total_discount")
    private Integer totalDiscount;
    @JsonProperty("total_without_discount")
    private Integer totalWithoutDiscount;
    @JsonProperty("total_with_tip_without_discount")
    private Integer totalWithTipWithoutDiscount;
    @JsonProperty("total_products")
    private Integer totalProducts;
    @JsonProperty("total_charges")
    private Integer totalCharges;
    @JsonProperty("store_type")
    private String storeType;
    @JsonProperty("state_message")
    private Object stateMessage;
    @JsonProperty("states_workflow")
    private List<Object> statesWorkflow = null;
    @JsonProperty("state_current")
    private String stateCurrent;
    @JsonProperty("state_current_image")
    private String stateCurrentImage;
    @JsonProperty("state_current_shows_expanded_chat")
    private String stateCurrentShowsExpandedChat;
    @JsonProperty("order_modifications")
    private List<Object> orderModifications = null;
    @JsonProperty("notifications")
    private List<Object> notifications = null;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("application_user_id")
    public Integer getApplicationUserId() {
        return applicationUserId;
    }

    @JsonProperty("application_user_id")
    public void setApplicationUserId(Integer applicationUserId) {
        this.applicationUserId = applicationUserId;
    }

    @JsonProperty("storekeeper_id")
    public Object getStorekeeperId() {
        return storekeeperId;
    }

    @JsonProperty("storekeeper_id")
    public void setStorekeeperId(Object storekeeperId) {
        this.storekeeperId = storekeeperId;
    }

    @JsonProperty("state")
    public String getState() {
        return state;
    }

    @JsonProperty("state")
    public void setState(String state) {
        this.state = state;
    }

    @JsonProperty("payment_method")
    public String getPaymentMethod() {
        return paymentMethod;
    }

    @JsonProperty("payment_method")
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @JsonProperty("total_value")
    public String getTotalValue() {
        return totalValue;
    }

    @JsonProperty("total_value")
    public void setTotalValue(String totalValue) {
        this.totalValue = totalValue;
    }

    @JsonProperty("tip")
    public String getTip() {
        return tip;
    }

    @JsonProperty("tip")
    public void setTip(String tip) {
        this.tip = tip;
    }

    @JsonProperty("eta_starts_at")
    public Object getEtaStartsAt() {
        return etaStartsAt;
    }

    @JsonProperty("eta_starts_at")
    public void setEtaStartsAt(Object etaStartsAt) {
        this.etaStartsAt = etaStartsAt;
    }

    @JsonProperty("eta")
    public Object getEta() {
        return eta;
    }

    @JsonProperty("eta")
    public void setEta(Object eta) {
        this.eta = eta;
    }

    @JsonProperty("comment")
    public String getComment() {
        return comment;
    }

    @JsonProperty("comment")
    public void setComment(String comment) {
        this.comment = comment;
    }

    @JsonProperty("whim")
    public String getWhim() {
        return whim;
    }

    @JsonProperty("whim")
    public void setWhim(String whim) {
        this.whim = whim;
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

    @JsonProperty("signature_pic")
    public Object getSignaturePic() {
        return signaturePic;
    }

    @JsonProperty("signature_pic")
    public void setSignaturePic(Object signaturePic) {
        this.signaturePic = signaturePic;
    }

    @JsonProperty("address_id")
    public Integer getAddressId() {
        return addressId;
    }

    @JsonProperty("address_id")
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @JsonProperty("address_description")
    public String getAddressDescription() {
        return addressDescription;
    }

    @JsonProperty("address_description")
    public void setAddressDescription(String addressDescription) {
        this.addressDescription = addressDescription;
    }

    @JsonProperty("assignment_time")
    public Integer getAssignmentTime() {
        return assignmentTime;
    }

    @JsonProperty("assignment_time")
    public void setAssignmentTime(Integer assignmentTime) {
        this.assignmentTime = assignmentTime;
    }

    @JsonProperty("taked_at")
    public Object getTakedAt() {
        return takedAt;
    }

    @JsonProperty("taked_at")
    public void setTakedAt(Object takedAt) {
        this.takedAt = takedAt;
    }

    @JsonProperty("closed_at")
    public String getClosedAt() {
        return closedAt;
    }

    @JsonProperty("closed_at")
    public void setClosedAt(String closedAt) {
        this.closedAt = closedAt;
    }

    @JsonProperty("time_in_store")
    public Integer getTimeInStore() {
        return timeInStore;
    }

    @JsonProperty("time_in_store")
    public void setTimeInStore(Integer timeInStore) {
        this.timeInStore = timeInStore;
    }

    @JsonProperty("travel_time")
    public Integer getTravelTime() {
        return travelTime;
    }

    @JsonProperty("travel_time")
    public void setTravelTime(Integer travelTime) {
        this.travelTime = travelTime;
    }

    @JsonProperty("purchase_type")
    public String getPurchaseType() {
        return purchaseType;
    }

    @JsonProperty("purchase_type")
    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    @JsonProperty("deliveryboy_id")
    public Object getDeliveryboyId() {
        return deliveryboyId;
    }

    @JsonProperty("deliveryboy_id")
    public void setDeliveryboyId(Object deliveryboyId) {
        this.deliveryboyId = deliveryboyId;
    }

    @JsonProperty("place_at")
    public Object getPlaceAt() {
        return placeAt;
    }

    @JsonProperty("place_at")
    public void setPlaceAt(Object placeAt) {
        this.placeAt = placeAt;
    }

    @JsonProperty("cms_zone_id")
    public Object getCmsZoneId() {
        return cmsZoneId;
    }

    @JsonProperty("cms_zone_id")
    public void setCmsZoneId(Object cmsZoneId) {
        this.cmsZoneId = cmsZoneId;
    }

    @JsonProperty("expediter_id")
    public Integer getExpediterId() {
        return expediterId;
    }

    @JsonProperty("expediter_id")
    public void setExpediterId(Integer expediterId) {
        this.expediterId = expediterId;
    }

    @JsonProperty("store_to_user_eta")
    public Object getStoreToUserEta() {
        return storeToUserEta;
    }

    @JsonProperty("store_to_user_eta")
    public void setStoreToUserEta(Object storeToUserEta) {
        this.storeToUserEta = storeToUserEta;
    }

    @JsonProperty("cooking_time")
    public Object getCookingTime() {
        return cookingTime;
    }

    @JsonProperty("cooking_time")
    public void setCookingTime(Object cookingTime) {
        this.cookingTime = cookingTime;
    }

    @JsonProperty("split_id")
    public Object getSplitId() {
        return splitId;
    }

    @JsonProperty("split_id")
    public void setSplitId(Object splitId) {
        this.splitId = splitId;
    }

    @JsonProperty("exito_id")
    public Object getExitoId() {
        return exitoId;
    }

    @JsonProperty("exito_id")
    public void setExitoId(Object exitoId) {
        this.exitoId = exitoId;
    }

    @JsonProperty("whim_store_id")
    public Object getWhimStoreId() {
        return whimStoreId;
    }

    @JsonProperty("whim_store_id")
    public void setWhimStoreId(Object whimStoreId) {
        this.whimStoreId = whimStoreId;
    }

    @JsonProperty("order_released")
    public Boolean getOrderReleased() {
        return orderReleased;
    }

    @JsonProperty("order_released")
    public void setOrderReleased(Boolean orderReleased) {
        this.orderReleased = orderReleased;
    }

    @JsonProperty("cooking_time_started_at")
    public Object getCookingTimeStartedAt() {
        return cookingTimeStartedAt;
    }

    @JsonProperty("cooking_time_started_at")
    public void setCookingTimeStartedAt(Object cookingTimeStartedAt) {
        this.cookingTimeStartedAt = cookingTimeStartedAt;
    }

    @JsonProperty("fraud_status")
    public Object getFraudStatus() {
        return fraudStatus;
    }

    @JsonProperty("fraud_status")
    public void setFraudStatus(Object fraudStatus) {
        this.fraudStatus = fraudStatus;
    }

    @JsonProperty("min_earning")
    public Object getMinEarning() {
        return minEarning;
    }

    @JsonProperty("min_earning")
    public void setMinEarning(Object minEarning) {
        this.minEarning = minEarning;
    }

    @JsonProperty("max_earning")
    public Object getMaxEarning() {
        return maxEarning;
    }

    @JsonProperty("max_earning")
    public void setMaxEarning(Object maxEarning) {
        this.maxEarning = maxEarning;
    }

    @JsonProperty("init_eta")
    public Object getInitEta() {
        return initEta;
    }

    @JsonProperty("init_eta")
    public void setInitEta(Object initEta) {
        this.initEta = initEta;
    }

    @JsonProperty("picking_time")
    public Object getPickingTime() {
        return pickingTime;
    }

    @JsonProperty("picking_time")
    public void setPickingTime(Object pickingTime) {
        this.pickingTime = pickingTime;
    }

    @JsonProperty("level_earning")
    public String getLevelEarning() {
        return levelEarning;
    }

    @JsonProperty("level_earning")
    public void setLevelEarning(String levelEarning) {
        this.levelEarning = levelEarning;
    }

    @JsonProperty("init_time")
    public Object getInitTime() {
        return initTime;
    }

    @JsonProperty("init_time")
    public void setInitTime(Object initTime) {
        this.initTime = initTime;
    }

    @JsonProperty("place_at_utc")
    public Object getPlaceAtUtc() {
        return placeAtUtc;
    }

    @JsonProperty("place_at_utc")
    public void setPlaceAtUtc(Object placeAtUtc) {
        this.placeAtUtc = placeAtUtc;
    }

    @JsonProperty("time_zone")
    public Object getTimeZone() {
        return timeZone;
    }

    @JsonProperty("time_zone")
    public void setTimeZone(Object timeZone) {
        this.timeZone = timeZone;
    }

    @JsonProperty("totalwithtip")
    public Integer getTotalwithtip() {
        return totalwithtip;
    }

    @JsonProperty("totalwithtip")
    public void setTotalwithtip(Integer totalwithtip) {
        this.totalwithtip = totalwithtip;
    }

    @JsonProperty("arrived_at")
    public Object getArrivedAt() {
        return arrivedAt;
    }

    @JsonProperty("arrived_at")
    public void setArrivedAt(Object arrivedAt) {
        this.arrivedAt = arrivedAt;
    }

    @JsonProperty("modifications")
    public List<Object> getModifications() {
        return modifications;
    }

    @JsonProperty("modifications")
    public void setModifications(List<Object> modifications) {
        this.modifications = modifications;
    }

    @JsonProperty("discount_old")
    public DiscountOld getDiscountOld() {
        return discountOld;
    }

    @JsonProperty("discount_old")
    public void setDiscountOld(DiscountOld discountOld) {
        this.discountOld = discountOld;
    }

    @JsonProperty("discount_details_leave_apply")
    public List<Object> getDiscountDetailsLeaveApply() {
        return discountDetailsLeaveApply;
    }

    @JsonProperty("discount_details_leave_apply")
    public void setDiscountDetailsLeaveApply(List<Object> discountDetailsLeaveApply) {
        this.discountDetailsLeaveApply = discountDetailsLeaveApply;
    }

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @JsonProperty("stores")
    public List<Store> getStores() {
        return stores;
    }

    @JsonProperty("stores")
    public void setStores(List<Store> stores) {
        this.stores = stores;
    }

    @JsonProperty("all_whims")
    public List<Object> getAllWhims() {
        return allWhims;
    }

    @JsonProperty("all_whims")
    public void setAllWhims(List<Object> allWhims) {
        this.allWhims = allWhims;
    }

    @JsonProperty("headers")
    public List<Header> getHeaders() {
        return headers;
    }

    @JsonProperty("headers")
    public void setHeaders(List<Header> headers) {
        this.headers = headers;
    }

    @JsonProperty("calculated_information")
    public CalculatedInformation getCalculatedInformation() {
        return calculatedInformation;
    }

    @JsonProperty("calculated_information")
    public void setCalculatedInformation(CalculatedInformation calculatedInformation) {
        this.calculatedInformation = calculatedInformation;
    }

    @JsonProperty("storekeeper")
    public Object getStorekeeper() {
        return storekeeper;
    }

    @JsonProperty("storekeeper")
    public void setStorekeeper(Object storekeeper) {
        this.storekeeper = storekeeper;
    }

    @JsonProperty("sum_applied_credits")
    public List<Object> getSumAppliedCredits() {
        return sumAppliedCredits;
    }

    @JsonProperty("sum_applied_credits")
    public void setSumAppliedCredits(List<Object> sumAppliedCredits) {
        this.sumAppliedCredits = sumAppliedCredits;
    }

    @JsonProperty("sum_charges")
    public List<SumCharge> getSumCharges() {
        return sumCharges;
    }

    @JsonProperty("sum_charges")
    public void setSumCharges(List<SumCharge> sumCharges) {
        this.sumCharges = sumCharges;
    }

    @JsonProperty("total_price_whims")
    public Object getTotalPriceWhims() {
        return totalPriceWhims;
    }

    @JsonProperty("total_price_whims")
    public void setTotalPriceWhims(Object totalPriceWhims) {
        this.totalPriceWhims = totalPriceWhims;
    }

    @JsonProperty("whims")
    public List<Object> getWhims() {
        return whims;
    }

    @JsonProperty("whims")
    public void setWhims(List<Object> whims) {
        this.whims = whims;
    }

    @JsonProperty("chat_messages")
    public List<Object> getChatMessages() {
        return chatMessages;
    }

    @JsonProperty("chat_messages")
    public void setChatMessages(List<Object> chatMessages) {
        this.chatMessages = chatMessages;
    }

    @JsonProperty("debit_credits")
    public List<Object> getDebitCredits() {
        return debitCredits;
    }

    @JsonProperty("debit_credits")
    public void setDebitCredits(List<Object> debitCredits) {
        this.debitCredits = debitCredits;
    }

    @JsonProperty("storekeeper_earnings")
    public List<Object> getStorekeeperEarnings() {
        return storekeeperEarnings;
    }

    @JsonProperty("storekeeper_earnings")
    public void setStorekeeperEarnings(List<Object> storekeeperEarnings) {
        this.storekeeperEarnings = storekeeperEarnings;
    }

    @JsonProperty("charges")
    public List<Charge> getCharges() {
        return charges;
    }

    @JsonProperty("charges")
    public void setCharges(List<Charge> charges) {
        this.charges = charges;
    }

    @JsonProperty("expediter")
    public Expediter getExpediter() {
        return expediter;
    }

    @JsonProperty("expediter")
    public void setExpediter(Expediter expediter) {
        this.expediter = expediter;
    }

    @JsonProperty("order_value_modifications")
    public List<Object> getOrderValueModifications() {
        return orderValueModifications;
    }

    @JsonProperty("order_value_modifications")
    public void setOrderValueModifications(List<Object> orderValueModifications) {
        this.orderValueModifications = orderValueModifications;
    }

    @JsonProperty("order_products")
    public List<OrderProduct> getOrderProducts() {
        return orderProducts;
    }

    @JsonProperty("order_products")
    public void setOrderProducts(List<OrderProduct> orderProducts) {
        this.orderProducts = orderProducts;
    }

    @JsonProperty("total_products_price_with_topping")
    public List<TotalProductsPriceWithTopping> getTotalProductsPriceWithTopping() {
        return totalProductsPriceWithTopping;
    }

    @JsonProperty("total_products_price_with_topping")
    public void setTotalProductsPriceWithTopping(List<TotalProductsPriceWithTopping> totalProductsPriceWithTopping) {
        this.totalProductsPriceWithTopping = totalProductsPriceWithTopping;
    }

    @JsonProperty("order_partner_details")
    public List<Object> getOrderPartnerDetails() {
        return orderPartnerDetails;
    }

    @JsonProperty("order_partner_details")
    public void setOrderPartnerDetails(List<Object> orderPartnerDetails) {
        this.orderPartnerDetails = orderPartnerDetails;
    }

    @JsonProperty("order_partner")
    public Object getOrderPartner() {
        return orderPartner;
    }

    @JsonProperty("order_partner")
    public void setOrderPartner(Object orderPartner) {
        this.orderPartner = orderPartner;
    }

    @JsonProperty("application_order_state")
    public Object getApplicationOrderState() {
        return applicationOrderState;
    }

    @JsonProperty("application_order_state")
    public void setApplicationOrderState(Object applicationOrderState) {
        this.applicationOrderState = applicationOrderState;
    }

    @JsonProperty("rappi_pay_debit")
    public Object getRappiPayDebit() {
        return rappiPayDebit;
    }

    @JsonProperty("rappi_pay_debit")
    public void setRappiPayDebit(Object rappiPayDebit) {
        this.rappiPayDebit = rappiPayDebit;
    }

    @JsonProperty("offers")
    public Object getOffers() {
        return offers;
    }

    @JsonProperty("offers")
    public void setOffers(Object offers) {
        this.offers = offers;
    }

    @JsonProperty("offer")
    public Object getOffer() {
        return offer;
    }

    @JsonProperty("offer")
    public void setOffer(Object offer) {
        this.offer = offer;
    }

    @JsonProperty("debit_rappi_credits")
    public Integer getDebitRappiCredits() {
        return debitRappiCredits;
    }

    @JsonProperty("debit_rappi_credits")
    public void setDebitRappiCredits(Integer debitRappiCredits) {
        this.debitRappiCredits = debitRappiCredits;
    }

    @JsonProperty("address")
    public Address getAddress() {
        return address;
    }

    @JsonProperty("address")
    public void setAddress(Address address) {
        this.address = address;
    }

    @JsonProperty("history")
    public History getHistory() {
        return history;
    }

    @JsonProperty("history")
    public void setHistory(History history) {
        this.history = history;
    }

    @JsonProperty("total_earnings")
    public Integer getTotalEarnings() {
        return totalEarnings;
    }

    @JsonProperty("total_earnings")
    public void setTotalEarnings(Integer totalEarnings) {
        this.totalEarnings = totalEarnings;
    }

    @JsonProperty("total_earnings_from_user")
    public Integer getTotalEarningsFromUser() {
        return totalEarningsFromUser;
    }

    @JsonProperty("total_earnings_from_user")
    public void setTotalEarningsFromUser(Integer totalEarningsFromUser) {
        this.totalEarningsFromUser = totalEarningsFromUser;
    }

    @JsonProperty("total_earnings_from_rappi")
    public Integer getTotalEarningsFromRappi() {
        return totalEarningsFromRappi;
    }

    @JsonProperty("total_earnings_from_rappi")
    public void setTotalEarningsFromRappi(Integer totalEarningsFromRappi) {
        this.totalEarningsFromRappi = totalEarningsFromRappi;
    }

    @JsonProperty("earning_with_out_basic_earning")
    public Integer getEarningWithOutBasicEarning() {
        return earningWithOutBasicEarning;
    }

    @JsonProperty("earning_with_out_basic_earning")
    public void setEarningWithOutBasicEarning(Integer earningWithOutBasicEarning) {
        this.earningWithOutBasicEarning = earningWithOutBasicEarning;
    }

    @JsonProperty("normal_service_cost")
    public Integer getNormalServiceCost() {
        return normalServiceCost;
    }

    @JsonProperty("normal_service_cost")
    public void setNormalServiceCost(Integer normalServiceCost) {
        this.normalServiceCost = normalServiceCost;
    }

    @JsonProperty("storekeeper_type")
    public String getStorekeeperType() {
        return storekeeperType;
    }

    @JsonProperty("storekeeper_type")
    public void setStorekeeperType(String storekeeperType) {
        this.storekeeperType = storekeeperType;
    }

    @JsonProperty("total_chats_storekeeper")
    public Integer getTotalChatsStorekeeper() {
        return totalChatsStorekeeper;
    }

    @JsonProperty("total_chats_storekeeper")
    public void setTotalChatsStorekeeper(Integer totalChatsStorekeeper) {
        this.totalChatsStorekeeper = totalChatsStorekeeper;
    }

    @JsonProperty("total_chats_user")
    public Integer getTotalChatsUser() {
        return totalChatsUser;
    }

    @JsonProperty("total_chats_user")
    public void setTotalChatsUser(Integer totalChatsUser) {
        this.totalChatsUser = totalChatsUser;
    }

    @JsonProperty("discount_by_credits")
    public Object getDiscountByCredits() {
        return discountByCredits;
    }

    @JsonProperty("discount_by_credits")
    public void setDiscountByCredits(Object discountByCredits) {
        this.discountByCredits = discountByCredits;
    }

    @JsonProperty("is_order_free")
    public Boolean getIsOrderFree() {
        return isOrderFree;
    }

    @JsonProperty("is_order_free")
    public void setIsOrderFree(Boolean isOrderFree) {
        this.isOrderFree = isOrderFree;
    }

    @JsonProperty("store_brand")
    public StoreBrand getStoreBrand() {
        return storeBrand;
    }

    @JsonProperty("store_brand")
    public void setStoreBrand(StoreBrand storeBrand) {
        this.storeBrand = storeBrand;
    }

    @JsonProperty("total_charges_products")
    public Integer getTotalChargesProducts() {
        return totalChargesProducts;
    }

    @JsonProperty("total_charges_products")
    public void setTotalChargesProducts(Integer totalChargesProducts) {
        this.totalChargesProducts = totalChargesProducts;
    }

    @JsonProperty("order_courier_comment")
    public Object getOrderCourierComment() {
        return orderCourierComment;
    }

    @JsonProperty("order_courier_comment")
    public void setOrderCourierComment(Object orderCourierComment) {
        this.orderCourierComment = orderCourierComment;
    }

    @JsonProperty("total_products_with_toppings")
    public Integer getTotalProductsWithToppings() {
        return totalProductsWithToppings;
    }

    @JsonProperty("total_products_with_toppings")
    public void setTotalProductsWithToppings(Integer totalProductsWithToppings) {
        this.totalProductsWithToppings = totalProductsWithToppings;
    }

    @JsonProperty("need_to_pay_order_in_store")
    public Boolean getNeedToPayOrderInStore() {
        return needToPayOrderInStore;
    }

    @JsonProperty("need_to_pay_order_in_store")
    public void setNeedToPayOrderInStore(Boolean needToPayOrderInStore) {
        this.needToPayOrderInStore = needToPayOrderInStore;
    }

    @JsonProperty("can_take_bill_photo")
    public Boolean getCanTakeBillPhoto() {
        return canTakeBillPhoto;
    }

    @JsonProperty("can_take_bill_photo")
    public void setCanTakeBillPhoto(Boolean canTakeBillPhoto) {
        this.canTakeBillPhoto = canTakeBillPhoto;
    }

    @JsonProperty("must_take_bill_photo")
    public Boolean getMustTakeBillPhoto() {
        return mustTakeBillPhoto;
    }

    @JsonProperty("must_take_bill_photo")
    public void setMustTakeBillPhoto(Boolean mustTakeBillPhoto) {
        this.mustTakeBillPhoto = mustTakeBillPhoto;
    }

    @JsonProperty("update_firebase_position")
    public Boolean getUpdateFirebasePosition() {
        return updateFirebasePosition;
    }

    @JsonProperty("update_firebase_position")
    public void setUpdateFirebasePosition(Boolean updateFirebasePosition) {
        this.updateFirebasePosition = updateFirebasePosition;
    }

    @JsonProperty("order_type")
    public String getOrderType() {
        return orderType;
    }

    @JsonProperty("order_type")
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    @JsonProperty("price_difference_reported")
    public Boolean getPriceDifferenceReported() {
        return priceDifferenceReported;
    }

    @JsonProperty("price_difference_reported")
    public void setPriceDifferenceReported(Boolean priceDifferenceReported) {
        this.priceDifferenceReported = priceDifferenceReported;
    }

    @JsonProperty("shopper_conditions")
    public Object getShopperConditions() {
        return shopperConditions;
    }

    @JsonProperty("shopper_conditions")
    public void setShopperConditions(Object shopperConditions) {
        this.shopperConditions = shopperConditions;
    }

    @JsonProperty("store_to_user_distance")
    public Integer getStoreToUserDistance() {
        return storeToUserDistance;
    }

    @JsonProperty("store_to_user_distance")
    public void setStoreToUserDistance(Integer storeToUserDistance) {
        this.storeToUserDistance = storeToUserDistance;
    }

    @JsonProperty("received_product_photo")
    public ReceivedProductPhoto getReceivedProductPhoto() {
        return receivedProductPhoto;
    }

    @JsonProperty("received_product_photo")
    public void setReceivedProductPhoto(ReceivedProductPhoto receivedProductPhoto) {
        this.receivedProductPhoto = receivedProductPhoto;
    }

    @JsonProperty("total_discount")
    public Integer getTotalDiscount() {
        return totalDiscount;
    }

    @JsonProperty("total_discount")
    public void setTotalDiscount(Integer totalDiscount) {
        this.totalDiscount = totalDiscount;
    }

    @JsonProperty("total_without_discount")
    public Integer getTotalWithoutDiscount() {
        return totalWithoutDiscount;
    }

    @JsonProperty("total_without_discount")
    public void setTotalWithoutDiscount(Integer totalWithoutDiscount) {
        this.totalWithoutDiscount = totalWithoutDiscount;
    }

    @JsonProperty("total_with_tip_without_discount")
    public Integer getTotalWithTipWithoutDiscount() {
        return totalWithTipWithoutDiscount;
    }

    @JsonProperty("total_with_tip_without_discount")
    public void setTotalWithTipWithoutDiscount(Integer totalWithTipWithoutDiscount) {
        this.totalWithTipWithoutDiscount = totalWithTipWithoutDiscount;
    }

    @JsonProperty("total_products")
    public Integer getTotalProducts() {
        return totalProducts;
    }

    @JsonProperty("total_products")
    public void setTotalProducts(Integer totalProducts) {
        this.totalProducts = totalProducts;
    }

    @JsonProperty("total_charges")
    public Integer getTotalCharges() {
        return totalCharges;
    }

    @JsonProperty("total_charges")
    public void setTotalCharges(Integer totalCharges) {
        this.totalCharges = totalCharges;
    }

    @JsonProperty("store_type")
    public String getStoreType() {
        return storeType;
    }

    @JsonProperty("store_type")
    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    @JsonProperty("state_message")
    public Object getStateMessage() {
        return stateMessage;
    }

    @JsonProperty("state_message")
    public void setStateMessage(Object stateMessage) {
        this.stateMessage = stateMessage;
    }

    @JsonProperty("states_workflow")
    public List<Object> getStatesWorkflow() {
        return statesWorkflow;
    }

    @JsonProperty("states_workflow")
    public void setStatesWorkflow(List<Object> statesWorkflow) {
        this.statesWorkflow = statesWorkflow;
    }

    @JsonProperty("state_current")
    public String getStateCurrent() {
        return stateCurrent;
    }

    @JsonProperty("state_current")
    public void setStateCurrent(String stateCurrent) {
        this.stateCurrent = stateCurrent;
    }

    @JsonProperty("state_current_image")
    public String getStateCurrentImage() {
        return stateCurrentImage;
    }

    @JsonProperty("state_current_image")
    public void setStateCurrentImage(String stateCurrentImage) {
        this.stateCurrentImage = stateCurrentImage;
    }

    @JsonProperty("state_current_shows_expanded_chat")
    public String getStateCurrentShowsExpandedChat() {
        return stateCurrentShowsExpandedChat;
    }

    @JsonProperty("state_current_shows_expanded_chat")
    public void setStateCurrentShowsExpandedChat(String stateCurrentShowsExpandedChat) {
        this.stateCurrentShowsExpandedChat = stateCurrentShowsExpandedChat;
    }

    @JsonProperty("order_modifications")
    public List<Object> getOrderModifications() {
        return orderModifications;
    }

    @JsonProperty("order_modifications")
    public void setOrderModifications(List<Object> orderModifications) {
        this.orderModifications = orderModifications;
    }

    @JsonProperty("notifications")
    public List<Object> getNotifications() {
        return notifications;
    }

    @JsonProperty("notifications")
    public void setNotifications(List<Object> notifications) {
        this.notifications = notifications;
    }

}
