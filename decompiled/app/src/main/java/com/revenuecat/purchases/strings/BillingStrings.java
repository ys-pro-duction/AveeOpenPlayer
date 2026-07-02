package com.revenuecat.purchases.strings;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0015\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/strings/BillingStrings;", "", "()V", "BILLING_CLIENT_DISCONNECTED", "", "BILLING_CLIENT_ENDING", "BILLING_CLIENT_ERROR", "BILLING_CLIENT_RETRY", "BILLING_CLIENT_STARTING", "BILLING_CONNECTION_ERROR_INAPP_MESSAGES", "BILLING_INAPP_MESSAGE_NONE", "BILLING_INAPP_MESSAGE_UNEXPECTED_CODE", "BILLING_INAPP_MESSAGE_UPDATE", "BILLING_INTENT_FAILED", "BILLING_PURCHASE_HISTORY_RECORD_MORE_THAN_ONE_SKU", "BILLING_PURCHASE_MORE_THAN_ONE_SKU", "BILLING_SERVICE_DISCONNECTED", "BILLING_SERVICE_SETUP_FINISHED", "BILLING_UNAVAILABLE", "BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES", "BILLING_WRAPPER_PURCHASES_ERROR", "BILLING_WRAPPER_PURCHASES_UPDATED", "CANNOT_CALL_CAN_MAKE_PAYMENTS", "ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING", "NULL_ACTIVITY_INTENT", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class BillingStrings {
    public static final String BILLING_CLIENT_DISCONNECTED = "Billing is disconnected and purchase methods won't work. Stacktrace: %s";
    public static final String BILLING_CLIENT_ENDING = "Ending connection for %s";
    public static final String BILLING_CLIENT_ERROR = "Billing Service Setup finished with error code: %s";
    public static final String BILLING_CLIENT_RETRY = "Retrying BillingClient connection after backoff of %s milliseconds.";
    public static final String BILLING_CLIENT_STARTING = "Starting connection for %s";
    public static final String BILLING_CONNECTION_ERROR_INAPP_MESSAGES = "Error connecting to billing client to display in-app messages: %s";
    public static final String BILLING_INAPP_MESSAGE_NONE = "No Google Play in-app message was available.";
    public static final String BILLING_INAPP_MESSAGE_UNEXPECTED_CODE = "Unexpected billing code: %s";
    public static final String BILLING_INAPP_MESSAGE_UPDATE = "Subscription status was updated from in-app message.";
    public static final String BILLING_INTENT_FAILED = "Failed to launch billing intent. %s";
    public static final String BILLING_PURCHASE_HISTORY_RECORD_MORE_THAN_ONE_SKU = "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.";
    public static final String BILLING_PURCHASE_MORE_THAN_ONE_SKU = "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.";
    public static final String BILLING_SERVICE_DISCONNECTED = "Billing Service disconnected for %s";
    public static final String BILLING_SERVICE_SETUP_FINISHED = "Billing Service Setup finished for %s";
    public static final String BILLING_UNAVAILABLE = "Billing is not available in this device. %s";
    public static final String BILLING_UNSPECIFIED_INAPP_MESSAGE_TYPES = "Tried to show in-app messages without specifying any types. Please add what types of in-app message you want to display.";
    public static final String BILLING_WRAPPER_PURCHASES_ERROR = "BillingWrapper purchases failed to update: %s";
    public static final String BILLING_WRAPPER_PURCHASES_UPDATED = "BillingWrapper purchases updated: %s";
    public static final String CANNOT_CALL_CAN_MAKE_PAYMENTS = "canMakePayments requires the Google Play Store. Skipping any checks and returning true.";
    public static final String ILLEGAL_STATE_EXCEPTION_WHEN_CONNECTING = "There was an IllegalStateException when connecting to BillingClient. This has been reported to occur on Samsung devices on unknown circumstances.\nException: %s";
    public static final BillingStrings INSTANCE = new BillingStrings();
    public static final String NULL_ACTIVITY_INTENT = "Activity passed into launchBillingFlow has a null intent, which may cause a crash. See https://github.com/RevenueCat/purchases-android/issues/381 for more information.";

    private BillingStrings() {
    }
}
