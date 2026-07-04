package com.revenuecat.purchases.common;

import com.daaw.G10;
import com.revenuecat.purchases.EntitlementInfo;
import com.revenuecat.purchases.EntitlementInfos;
import com.revenuecat.purchases.OwnershipType;
import com.revenuecat.purchases.PeriodType;
import com.revenuecat.purchases.Store;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.responses.CustomerInfoResponseJsonKeys;
import com.revenuecat.purchases.common.responses.EntitlementsResponseJsonKeys;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.strings.PurchaseStrings;
import com.revenuecat.purchases.utils.DateActive;
import com.revenuecat.purchases.utils.DateHelper;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002\u001a\"\u0010\b\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002\u001a,\u0010\f\u001a\u00020\r*\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a,\u0010\u0012\u001a\u00020\u0013*\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u0011H\u0000\u001a\u0014\u0010\u0016\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000\u001a\u0014\u0010\u0018\u001a\u00020\u0019*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000\u001a\u0014\u0010\u001a\u001a\u00020\u001b*\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\nH\u0000¨\u0006\u001c"}, d2 = {"getWillRenew", "", ProductResponseJsonKeys.STORE, "Lcom/revenuecat/purchases/Store;", "expirationDate", "Ljava/util/Date;", "unsubscribeDetectedAt", "billingIssueDetectedAt", "isDateActive", "identifier", "", "requestDate", "buildEntitlementInfo", "Lcom/revenuecat/purchases/EntitlementInfo;", "Lorg/json/JSONObject;", "productData", "verificationResult", "Lcom/revenuecat/purchases/VerificationResult;", "buildEntitlementInfos", "Lcom/revenuecat/purchases/EntitlementInfos;", CustomerInfoResponseJsonKeys.SUBSCRIPTIONS, "nonSubscriptionsLatestPurchases", "getStore", "name", "optOwnershipType", "Lcom/revenuecat/purchases/OwnershipType;", "optPeriodType", "Lcom/revenuecat/purchases/PeriodType;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class EntitlementInfoFactoriesKt {
    public static final EntitlementInfo buildEntitlementInfo(JSONObject jSONObject, String str, JSONObject jSONObject2, Date date, VerificationResult verificationResult) throws JSONException {
        G10.g(jSONObject, "<this>");
        G10.g(str, "identifier");
        G10.g(jSONObject2, "productData");
        G10.g(date, "requestDate");
        G10.g(verificationResult, "verificationResult");
        Date dateOptDate = JSONObjectExtensionsKt.optDate(jSONObject, "expires_date");
        Date dateOptDate2 = JSONObjectExtensionsKt.optDate(jSONObject2, ProductResponseJsonKeys.UNSUBSCRIBE_DETECTED_AT);
        Date dateOptDate3 = JSONObjectExtensionsKt.optDate(jSONObject2, ProductResponseJsonKeys.BILLING_ISSUES_DETECTED_AT);
        Store store = getStore(jSONObject2, ProductResponseJsonKeys.STORE);
        boolean zIsDateActive = isDateActive(str, dateOptDate, date);
        boolean willRenew = getWillRenew(store, dateOptDate, dateOptDate2, dateOptDate3);
        PeriodType periodTypeOptPeriodType = optPeriodType(jSONObject2, ProductResponseJsonKeys.PERIOD_TYPE);
        Date date2 = JSONObjectExtensionsKt.getDate(jSONObject, "purchase_date");
        Date date3 = JSONObjectExtensionsKt.getDate(jSONObject2, "original_purchase_date");
        String string = jSONObject.getString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
        G10.f(string, "getString(EntitlementsRe…nKeys.PRODUCT_IDENTIFIER)");
        return new EntitlementInfo(str, zIsDateActive, willRenew, periodTypeOptPeriodType, date2, date3, dateOptDate, store, string, JSONObjectExtensionsKt.optNullableString(jSONObject, "product_plan_identifier"), jSONObject2.getBoolean(ProductResponseJsonKeys.IS_SANDBOX), dateOptDate2, dateOptDate3, optOwnershipType(jSONObject2, ProductResponseJsonKeys.OWNERSHIP_TYPE), jSONObject, verificationResult);
    }

    public static final EntitlementInfos buildEntitlementInfos(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, Date date, VerificationResult verificationResult) {
        G10.g(jSONObject, "<this>");
        G10.g(jSONObject2, CustomerInfoResponseJsonKeys.SUBSCRIPTIONS);
        G10.g(jSONObject3, "nonSubscriptionsLatestPurchases");
        G10.g(date, "requestDate");
        G10.g(verificationResult, "verificationResult");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        G10.f(itKeys, "keys()");
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            JSONObject jSONObject4 = jSONObject.getJSONObject(next);
            String strOptString = jSONObject4.optString(EntitlementsResponseJsonKeys.PRODUCT_IDENTIFIER);
            G10.f(strOptString, "it");
            if (strOptString.length() <= 0) {
                strOptString = null;
            }
            if (strOptString != null) {
                if (jSONObject2.has(strOptString)) {
                    G10.f(next, "entitlementId");
                    G10.f(jSONObject4, "entitlement");
                    JSONObject jSONObject5 = jSONObject2.getJSONObject(strOptString);
                    G10.f(jSONObject5, "subscriptions.getJSONObject(productIdentifier)");
                    linkedHashMap.put(next, buildEntitlementInfo(jSONObject4, next, jSONObject5, date, verificationResult));
                } else if (jSONObject3.has(strOptString)) {
                    G10.f(next, "entitlementId");
                    G10.f(jSONObject4, "entitlement");
                    JSONObject jSONObject6 = jSONObject3.getJSONObject(strOptString);
                    G10.f(jSONObject6, "nonSubscriptionsLatestPu…Object(productIdentifier)");
                    linkedHashMap.put(next, buildEntitlementInfo(jSONObject4, next, jSONObject6, date, verificationResult));
                }
            }
        }
        return new EntitlementInfos(linkedHashMap, verificationResult);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static final Store getStore(JSONObject jSONObject, String str) throws JSONException {
        G10.g(jSONObject, "<this>");
        G10.g(str, "name");
        String string = jSONObject.getString(str);
        if (string != null) {
            switch (string.hashCode()) {
                case -1414265340:
                    if (string.equals("amazon")) {
                        return Store.AMAZON;
                    }
                    break;
                case -891985843:
                    if (string.equals("stripe")) {
                        return Store.STRIPE;
                    }
                    break;
                case 564036179:
                    if (string.equals("mac_app_store")) {
                        return Store.MAC_APP_STORE;
                    }
                    break;
                case 756050958:
                    if (string.equals("promotional")) {
                        return Store.PROMOTIONAL;
                    }
                    break;
                case 1842542915:
                    if (string.equals("app_store")) {
                        return Store.APP_STORE;
                    }
                    break;
                case 1925951510:
                    if (string.equals("play_store")) {
                        return Store.PLAY_STORE;
                    }
                    break;
            }
        }
        return Store.UNKNOWN_STORE;
    }

    private static final boolean getWillRenew(Store store, Date date, Date date2, Date date3) {
        return ((store == Store.PROMOTIONAL) || (date == null) || (date2 != null) || (date3 != null)) ? false : true;
    }

    private static final boolean isDateActive(String str, Date date, Date date2) {
        DateActive dateActiveM114isDateActiveSxA4cEA$default = DateHelper.Companion.m114isDateActiveSxA4cEA$default(DateHelper.INSTANCE, date, date2, 0L, 4, null);
        if (!dateActiveM114isDateActiveSxA4cEA$default.isActive() && !dateActiveM114isDateActiveSxA4cEA$default.getInGracePeriod()) {
            String str2 = String.format(PurchaseStrings.ENTITLEMENT_EXPIRED_OUTSIDE_GRACE_PERIOD, Arrays.copyOf(new Object[]{str, date, date2}, 3));
            G10.f(str2, "format(this, *args)");
            LogUtilsKt.warnLog(str2);
        }
        return dateActiveM114isDateActiveSxA4cEA$default.isActive();
    }

    public static final OwnershipType optOwnershipType(JSONObject jSONObject, String str) {
        G10.g(jSONObject, "<this>");
        G10.g(str, "name");
        String strOptString = jSONObject.optString(str);
        return G10.c(strOptString, "PURCHASED") ? OwnershipType.PURCHASED : G10.c(strOptString, "FAMILY_SHARED") ? OwnershipType.FAMILY_SHARED : OwnershipType.UNKNOWN;
    }

    public static final PeriodType optPeriodType(JSONObject jSONObject, String str) {
        G10.g(jSONObject, "<this>");
        G10.g(str, "name");
        String strOptString = jSONObject.optString(str);
        if (strOptString != null) {
            int iHashCode = strOptString.hashCode();
            if (iHashCode != -1039745817) {
                if (iHashCode != 100361836) {
                    if (iHashCode == 110628630 && strOptString.equals("trial")) {
                        return PeriodType.TRIAL;
                    }
                } else if (strOptString.equals("intro")) {
                    return PeriodType.INTRO;
                }
            } else if (strOptString.equals("normal")) {
                return PeriodType.NORMAL;
            }
        }
        return PeriodType.NORMAL;
    }
}
