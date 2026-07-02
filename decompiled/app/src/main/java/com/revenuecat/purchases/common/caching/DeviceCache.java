package com.revenuecat.purchases.common.caching;

import android.content.SharedPreferences;
import com.daaw.AY0;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.AbstractC3192ab0;
import com.daaw.AbstractC9867yQ0;
import com.daaw.G10;
import com.daaw.O90;
import com.revenuecat.purchases.CustomerInfo;
import com.revenuecat.purchases.VerificationResult;
import com.revenuecat.purchases.common.CustomerInfoFactory;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.UtilsKt;
import com.revenuecat.purchases.common.offlineentitlements.ProductEntitlementMapping;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.OfflineEntitlementsStrings;
import com.revenuecat.purchases.strings.ReceiptStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import java.util.Arrays;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b3\b\u0010\u0018\u0000 {2\u00020\u0001:\u0001{B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\u000b\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\n*\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0017\u001a\u00020\u00162\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001c\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010\u001fJ\u0015\u0010!\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b!\u0010\"J\u0015\u0010#\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b#\u0010\"J\u0015\u0010$\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b&\u0010%J\u0017\u0010(\u001a\u0004\u0018\u00010'2\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u001d\u0010+\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010*\u001a\u00020'¢\u0006\u0004\b+\u0010,J\u001d\u0010/\u001a\u00020-2\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\u0015\u0010\u000f\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\"J\u0015\u00101\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b1\u0010\"J\u0015\u00102\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\"J\u001d\u00103\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0011¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0016¢\u0006\u0004\b5\u00106J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0004\b7\u00108J\u0015\u0010:\u001a\u00020\u00162\u0006\u00109\u001a\u00020\u0004¢\u0006\u0004\b:\u0010\"J\u001b\u0010<\u001a\u00020\u00162\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\u0014¢\u0006\u0004\b<\u0010\u0018J'\u0010@\u001a\b\u0012\u0004\u0012\u00020>0?2\u0012\u0010;\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020>0=¢\u0006\u0004\b@\u0010AJ\u000f\u0010C\u001a\u0004\u0018\u00010B¢\u0006\u0004\bC\u0010DJ\u0015\u0010F\u001a\u00020\u00162\u0006\u0010E\u001a\u00020B¢\u0006\u0004\bF\u0010GJ\r\u0010H\u001a\u00020\u0016¢\u0006\u0004\bH\u00106J\u0015\u0010K\u001a\u00020\u00162\u0006\u0010J\u001a\u00020I¢\u0006\u0004\bK\u0010LJ\r\u0010M\u001a\u00020\u0016¢\u0006\u0004\bM\u00106J\r\u0010N\u001a\u00020-¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u0004\u0018\u00010I¢\u0006\u0004\bP\u0010QJ\u0019\u0010S\u001a\u0004\u0018\u00010B2\u0006\u0010R\u001a\u00020\u0004H\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010W\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\u00042\u0006\u0010V\u001a\u00020\u0004H\u0016¢\u0006\u0004\bW\u0010XJ\u0015\u0010Y\u001a\u00020\u00162\u0006\u0010U\u001a\u00020\u0004¢\u0006\u0004\bY\u0010\"J\u001b\u0010Z\u001a\b\u0012\u0004\u0012\u00020\u00040\u00142\u0006\u0010U\u001a\u00020\u0004¢\u0006\u0004\bZ\u0010[J\u0015\u0010\\\u001a\u00020\u00042\u0006\u0010R\u001a\u00020\u0004¢\u0006\u0004\b\\\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010]R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010^R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010_R\u001b\u0010c\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b`\u0010a\u001a\u0004\bb\u0010\u001fR\u001b\u0010f\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bd\u0010a\u001a\u0004\be\u0010\u001fR\u001b\u0010i\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bg\u0010a\u001a\u0004\bh\u0010\u001fR\u001a\u0010j\u001a\u00020\u00048\u0000X\u0080D¢\u0006\f\n\u0004\bj\u0010^\u001a\u0004\bk\u0010\u001fR\u001b\u0010n\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\bl\u0010a\u001a\u0004\bm\u0010\u001fR\u001b\u0010q\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bo\u0010a\u001a\u0004\bp\u0010\u001fR\u001b\u0010t\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\br\u0010a\u001a\u0004\bs\u0010\u001fR\u001b\u0010w\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bu\u0010a\u001a\u0004\bv\u0010\u001fR\u001b\u0010z\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bx\u0010a\u001a\u0004\by\u0010\u001f¨\u0006|"}, d2 = {"Lcom/revenuecat/purchases/common/caching/DeviceCache;", "", "Landroid/content/SharedPreferences;", "preferences", "", "apiKey", "Lcom/revenuecat/purchases/common/DateProvider;", "dateProvider", "<init>", "(Landroid/content/SharedPreferences;Ljava/lang/String;Lcom/revenuecat/purchases/common/DateProvider;)V", "Landroid/content/SharedPreferences$Editor;", "clearCustomerInfo", "(Landroid/content/SharedPreferences$Editor;)Landroid/content/SharedPreferences$Editor;", "clearAppUserID", "appUserID", "clearCustomerInfoCacheTimestamp", "(Landroid/content/SharedPreferences$Editor;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;", "Ljava/util/Date;", "getCustomerInfoCachesLastUpdated", "(Ljava/lang/String;)Ljava/util/Date;", "", "newSet", "Lcom/daaw/G91;", "setSavedTokenHashes", "(Ljava/util/Set;)V", "date", "setProductEntitlementMappingCacheTimestamp", "(Ljava/util/Date;)V", "getProductEntitlementMappingLastUpdated", "()Ljava/util/Date;", "getLegacyCachedAppUserID", "()Ljava/lang/String;", "getCachedAppUserID", "cacheAppUserID", "(Ljava/lang/String;)V", "clearCachesForAppUserID", "customerInfoCacheKey", "(Ljava/lang/String;)Ljava/lang/String;", "customerInfoLastUpdatedCacheKey", "Lcom/revenuecat/purchases/CustomerInfo;", "getCachedCustomerInfo", "(Ljava/lang/String;)Lcom/revenuecat/purchases/CustomerInfo;", "info", "cacheCustomerInfo", "(Ljava/lang/String;Lcom/revenuecat/purchases/CustomerInfo;)V", "", "appInBackground", "isCustomerInfoCacheStale", "(Ljava/lang/String;Z)Z", "clearCustomerInfoCache", "setCustomerInfoCacheTimestampToNow", "setCustomerInfoCacheTimestamp", "(Ljava/lang/String;Ljava/util/Date;)V", "cleanupOldAttributionData", "()V", "getPreviouslySentHashedTokens", "()Ljava/util/Set;", "token", "addSuccessfullyPostedToken", "hashedTokens", "cleanPreviouslySentTokens", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "", "getActivePurchasesNotInCache", "(Ljava/util/Map;)Ljava/util/List;", "Lorg/json/JSONObject;", "getOfferingsResponseCache", "()Lorg/json/JSONObject;", "offeringsResponse", "cacheOfferingsResponse", "(Lorg/json/JSONObject;)V", "clearOfferingsResponseCache", "Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", "productEntitlementMapping", "cacheProductEntitlementMapping", "(Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;)V", "setProductEntitlementMappingCacheTimestampToNow", "isProductEntitlementMappingCacheStale", "()Z", "getProductEntitlementMapping", "()Lcom/revenuecat/purchases/common/offlineentitlements/ProductEntitlementMapping;", SubscriberAttributeKt.JSON_NAME_KEY, "getJSONObjectOrNull", "(Ljava/lang/String;)Lorg/json/JSONObject;", "cacheKey", "value", "putString", "(Ljava/lang/String;Ljava/lang/String;)V", "remove", "findKeysThatStartWith", "(Ljava/lang/String;)Ljava/util/Set;", "newKey", "Landroid/content/SharedPreferences;", "Ljava/lang/String;", "Lcom/revenuecat/purchases/common/DateProvider;", "apiKeyPrefix$delegate", "Lcom/daaw/O90;", "getApiKeyPrefix", "apiKeyPrefix", "legacyAppUserIDCacheKey$delegate", "getLegacyAppUserIDCacheKey", "legacyAppUserIDCacheKey", "appUserIDCacheKey$delegate", "getAppUserIDCacheKey", "appUserIDCacheKey", "attributionCacheKey", "getAttributionCacheKey$purchases_defaultsRelease", "tokensCacheKey$delegate", "getTokensCacheKey", "tokensCacheKey", "productEntitlementMappingCacheKey$delegate", "getProductEntitlementMappingCacheKey", "productEntitlementMappingCacheKey", "productEntitlementMappingLastUpdatedCacheKey$delegate", "getProductEntitlementMappingLastUpdatedCacheKey", "productEntitlementMappingLastUpdatedCacheKey", "customerInfoCachesLastUpdatedCacheBaseKey$delegate", "getCustomerInfoCachesLastUpdatedCacheBaseKey", "customerInfoCachesLastUpdatedCacheBaseKey", "offeringsResponseCacheKey$delegate", "getOfferingsResponseCacheKey", "offeringsResponseCacheKey", "Companion", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public class DeviceCache {
    private static final String CUSTOMER_INFO_REQUEST_DATE_KEY = "customer_info_request_date";
    private static final String CUSTOMER_INFO_SCHEMA_VERSION_KEY = "schema_version";
    private static final String CUSTOMER_INFO_VERIFICATION_RESULT_KEY = "verification_result";
    private final String apiKey;

    /* JADX INFO: renamed from: apiKeyPrefix$delegate, reason: from kotlin metadata */
    private final O90 apiKeyPrefix;

    /* JADX INFO: renamed from: appUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final O90 appUserIDCacheKey;
    private final String attributionCacheKey;

    /* JADX INFO: renamed from: customerInfoCachesLastUpdatedCacheBaseKey$delegate, reason: from kotlin metadata */
    private final O90 customerInfoCachesLastUpdatedCacheBaseKey;
    private final DateProvider dateProvider;

    /* JADX INFO: renamed from: legacyAppUserIDCacheKey$delegate, reason: from kotlin metadata */
    private final O90 legacyAppUserIDCacheKey;

    /* JADX INFO: renamed from: offeringsResponseCacheKey$delegate, reason: from kotlin metadata */
    private final O90 offeringsResponseCacheKey;
    private final SharedPreferences preferences;

    /* JADX INFO: renamed from: productEntitlementMappingCacheKey$delegate, reason: from kotlin metadata */
    private final O90 productEntitlementMappingCacheKey;

    /* JADX INFO: renamed from: productEntitlementMappingLastUpdatedCacheKey$delegate, reason: from kotlin metadata */
    private final O90 productEntitlementMappingLastUpdatedCacheKey;

    /* JADX INFO: renamed from: tokensCacheKey$delegate, reason: from kotlin metadata */
    private final O90 tokensCacheKey;

    public DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider) {
        G10.g(sharedPreferences, "preferences");
        G10.g(str, "apiKey");
        G10.g(dateProvider, "dateProvider");
        this.preferences = sharedPreferences;
        this.apiKey = str;
        this.dateProvider = dateProvider;
        this.apiKeyPrefix = AbstractC3192ab0.a(new DeviceCache$apiKeyPrefix$2(this));
        this.legacyAppUserIDCacheKey = AbstractC3192ab0.a(new DeviceCache$legacyAppUserIDCacheKey$2(this));
        this.appUserIDCacheKey = AbstractC3192ab0.a(new DeviceCache$appUserIDCacheKey$2(this));
        this.attributionCacheKey = "com.revenuecat.purchases..attribution";
        this.tokensCacheKey = AbstractC3192ab0.a(new DeviceCache$tokensCacheKey$2(this));
        this.productEntitlementMappingCacheKey = AbstractC3192ab0.a(new DeviceCache$productEntitlementMappingCacheKey$2(this));
        this.productEntitlementMappingLastUpdatedCacheKey = AbstractC3192ab0.a(new DeviceCache$productEntitlementMappingLastUpdatedCacheKey$2(this));
        this.customerInfoCachesLastUpdatedCacheBaseKey = AbstractC3192ab0.a(new DeviceCache$customerInfoCachesLastUpdatedCacheBaseKey$2(this));
        this.offeringsResponseCacheKey = AbstractC3192ab0.a(new DeviceCache$offeringsResponseCacheKey$2(this));
    }

    private final SharedPreferences.Editor clearAppUserID(SharedPreferences.Editor editor) {
        editor.remove(getAppUserIDCacheKey());
        editor.remove(getLegacyAppUserIDCacheKey());
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfo(SharedPreferences.Editor editor) {
        String cachedAppUserID = getCachedAppUserID();
        if (cachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(cachedAppUserID));
        }
        String legacyCachedAppUserID = getLegacyCachedAppUserID();
        if (legacyCachedAppUserID != null) {
            editor.remove(customerInfoCacheKey(legacyCachedAppUserID));
        }
        return editor;
    }

    private final SharedPreferences.Editor clearCustomerInfoCacheTimestamp(SharedPreferences.Editor editor, String str) {
        editor.remove(customerInfoLastUpdatedCacheKey(str));
        return editor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getApiKeyPrefix() {
        return (String) this.apiKeyPrefix.getValue();
    }

    private final synchronized Date getCustomerInfoCachesLastUpdated(String appUserID) {
        return new Date(this.preferences.getLong(customerInfoLastUpdatedCacheKey(appUserID), 0L));
    }

    private final String getCustomerInfoCachesLastUpdatedCacheBaseKey() {
        return (String) this.customerInfoCachesLastUpdatedCacheBaseKey.getValue();
    }

    private final String getOfferingsResponseCacheKey() {
        return (String) this.offeringsResponseCacheKey.getValue();
    }

    private final String getProductEntitlementMappingCacheKey() {
        return (String) this.productEntitlementMappingCacheKey.getValue();
    }

    private final Date getProductEntitlementMappingLastUpdated() {
        if (this.preferences.contains(getProductEntitlementMappingLastUpdatedCacheKey())) {
            return new Date(this.preferences.getLong(getProductEntitlementMappingLastUpdatedCacheKey(), -1L));
        }
        return null;
    }

    private final String getProductEntitlementMappingLastUpdatedCacheKey() {
        return (String) this.productEntitlementMappingLastUpdatedCacheKey.getValue();
    }

    private final void setProductEntitlementMappingCacheTimestamp(Date date) {
        this.preferences.edit().putLong(getProductEntitlementMappingLastUpdatedCacheKey(), date.getTime()).apply();
    }

    private final synchronized void setSavedTokenHashes(Set<String> newSet) {
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(ReceiptStrings.SAVING_TOKENS, Arrays.copyOf(new Object[]{newSet}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        this.preferences.edit().putStringSet(getTokensCacheKey(), newSet).apply();
    }

    public final synchronized void addSuccessfullyPostedToken(String token) {
        G10.g(token, "token");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(ReceiptStrings.SAVING_TOKENS_WITH_HASH, Arrays.copyOf(new Object[]{token, UtilsKt.sha1(token)}, 2));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Set<String> previouslySentHashedTokens = getPreviouslySentHashedTokens();
        String str2 = String.format(ReceiptStrings.TOKENS_IN_CACHE, Arrays.copyOf(new Object[]{previouslySentHashedTokens}, 1));
        G10.f(str2, "format(this, *args)");
        LogWrapperKt.log(logIntent, str2);
        Set<String> setP0 = AbstractC2455Um.P0(previouslySentHashedTokens);
        setP0.add(UtilsKt.sha1(token));
        setSavedTokenHashes(setP0);
    }

    public final synchronized void cacheAppUserID(String appUserID) {
        G10.g(appUserID, "appUserID");
        this.preferences.edit().putString(getAppUserIDCacheKey(), appUserID).apply();
    }

    public final synchronized void cacheCustomerInfo(String appUserID, CustomerInfo info) {
        G10.g(appUserID, "appUserID");
        G10.g(info, "info");
        JSONObject rawData = info.getRawData();
        rawData.put(CUSTOMER_INFO_SCHEMA_VERSION_KEY, 3);
        rawData.put("verification_result", info.getEntitlements().getVerification().name());
        rawData.put(CUSTOMER_INFO_REQUEST_DATE_KEY, info.getRequestDate().getTime());
        this.preferences.edit().putString(customerInfoCacheKey(appUserID), rawData.toString()).apply();
        setCustomerInfoCacheTimestampToNow(appUserID);
    }

    public final synchronized void cacheOfferingsResponse(JSONObject offeringsResponse) {
        G10.g(offeringsResponse, "offeringsResponse");
        this.preferences.edit().putString(getOfferingsResponseCacheKey(), offeringsResponse.toString()).apply();
    }

    public final synchronized void cacheProductEntitlementMapping(ProductEntitlementMapping productEntitlementMapping) {
        G10.g(productEntitlementMapping, "productEntitlementMapping");
        this.preferences.edit().putString(getProductEntitlementMappingCacheKey(), productEntitlementMapping.toJson().toString()).apply();
        setProductEntitlementMappingCacheTimestampToNow();
    }

    public final synchronized void cleanPreviouslySentTokens(Set<String> hashedTokens) {
        G10.g(hashedTokens, "hashedTokens");
        LogWrapperKt.log(LogIntent.DEBUG, ReceiptStrings.CLEANING_PREV_SENT_HASHED_TOKEN);
        setSavedTokenHashes(AbstractC2455Um.j0(hashedTokens, getPreviouslySentHashedTokens()));
    }

    public final synchronized void cleanupOldAttributionData() {
        try {
            SharedPreferences.Editor editorEdit = this.preferences.edit();
            for (String str : this.preferences.getAll().keySet()) {
                if (str != null && AY0.u(str, this.attributionCacheKey, false, 2, null)) {
                    editorEdit.remove(str);
                }
            }
            editorEdit.apply();
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void clearCachesForAppUserID(String appUserID) {
        G10.g(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        G10.f(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(clearAppUserID(clearCustomerInfo(editorEdit)), appUserID).apply();
    }

    public final synchronized void clearCustomerInfoCache(String appUserID) {
        G10.g(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        G10.f(editorEdit, "editor");
        clearCustomerInfoCacheTimestamp(editorEdit, appUserID);
        editorEdit.remove(customerInfoCacheKey(appUserID));
        editorEdit.apply();
    }

    public final synchronized void clearOfferingsResponseCache() {
        this.preferences.edit().remove(getOfferingsResponseCacheKey()).apply();
    }

    public final String customerInfoCacheKey(String appUserID) {
        G10.g(appUserID, "appUserID");
        return getLegacyAppUserIDCacheKey() + '.' + appUserID;
    }

    public final String customerInfoLastUpdatedCacheKey(String appUserID) {
        G10.g(appUserID, "appUserID");
        return getCustomerInfoCachesLastUpdatedCacheBaseKey() + '.' + appUserID;
    }

    public final Set<String> findKeysThatStartWith(String cacheKey) {
        G10.g(cacheKey, "cacheKey");
        try {
            Map<String, ?> all = this.preferences.getAll();
            if (all != null) {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, ?> entry : all.entrySet()) {
                    String key = entry.getKey();
                    G10.f(key, "it");
                    if (AY0.u(key, cacheKey, false, 2, null)) {
                        linkedHashMap.put(entry.getKey(), entry.getValue());
                    }
                }
                Set<String> setKeySet = linkedHashMap.keySet();
                if (setKeySet != null) {
                    return setKeySet;
                }
            }
            return AbstractC9867yQ0.d();
        } catch (NullPointerException unused) {
            return AbstractC9867yQ0.d();
        }
    }

    public final synchronized List<StoreTransaction> getActivePurchasesNotInCache(Map<String, StoreTransaction> hashedTokens) {
        G10.g(hashedTokens, "hashedTokens");
        return AbstractC2455Um.M0(AbstractC1473Lg0.l(hashedTokens, getPreviouslySentHashedTokens()).values());
    }

    public final String getAppUserIDCacheKey() {
        return (String) this.appUserIDCacheKey.getValue();
    }

    /* JADX INFO: renamed from: getAttributionCacheKey$purchases_defaultsRelease, reason: from getter */
    public final String getAttributionCacheKey() {
        return this.attributionCacheKey;
    }

    public final synchronized String getCachedAppUserID() {
        return this.preferences.getString(getAppUserIDCacheKey(), null);
    }

    public final CustomerInfo getCachedCustomerInfo(String appUserID) {
        G10.g(appUserID, "appUserID");
        String string = this.preferences.getString(customerInfoCacheKey(appUserID), null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                int iOptInt = jSONObject.optInt(CUSTOMER_INFO_SCHEMA_VERSION_KEY);
                String string2 = jSONObject.has("verification_result") ? jSONObject.getString("verification_result") : "NOT_REQUESTED";
                Long lValueOf = Long.valueOf(jSONObject.optLong(CUSTOMER_INFO_REQUEST_DATE_KEY));
                if (lValueOf.longValue() <= 0) {
                    lValueOf = null;
                }
                Date date = lValueOf != null ? new Date(lValueOf.longValue()) : null;
                jSONObject.remove("verification_result");
                jSONObject.remove(CUSTOMER_INFO_REQUEST_DATE_KEY);
                G10.f(string2, "verificationResultString");
                VerificationResult verificationResultValueOf = VerificationResult.valueOf(string2);
                if (iOptInt == 3) {
                    return CustomerInfoFactory.INSTANCE.buildCustomerInfo(jSONObject, date, verificationResultValueOf);
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public JSONObject getJSONObjectOrNull(String key) {
        G10.g(key, SubscriberAttributeKt.JSON_NAME_KEY);
        String string = this.preferences.getString(key, null);
        if (string == null) {
            return null;
        }
        try {
            return new JSONObject(string);
        } catch (JSONException unused) {
            return null;
        }
    }

    public final String getLegacyAppUserIDCacheKey() {
        return (String) this.legacyAppUserIDCacheKey.getValue();
    }

    public final synchronized String getLegacyCachedAppUserID() {
        return this.preferences.getString(getLegacyAppUserIDCacheKey(), null);
    }

    public final synchronized JSONObject getOfferingsResponseCache() {
        return getJSONObjectOrNull(getOfferingsResponseCacheKey());
    }

    public final synchronized Set<String> getPreviouslySentHashedTokens() {
        Set<String> setD;
        try {
            try {
                Set<String> stringSet = this.preferences.getStringSet(getTokensCacheKey(), AbstractC9867yQ0.d());
                if (stringSet == null || (setD = AbstractC2455Um.Q0(stringSet)) == null) {
                    setD = AbstractC9867yQ0.d();
                }
                LogIntent logIntent = LogIntent.DEBUG;
                String str = String.format(ReceiptStrings.TOKENS_ALREADY_POSTED, Arrays.copyOf(new Object[]{setD}, 1));
                G10.f(str, "format(this, *args)");
                LogWrapperKt.log(logIntent, str);
            } catch (ClassCastException unused) {
                setD = AbstractC9867yQ0.d();
            }
        } catch (Throwable th) {
            throw th;
        }
        return setD;
    }

    public final synchronized ProductEntitlementMapping getProductEntitlementMapping() {
        ProductEntitlementMapping productEntitlementMappingFromJson = null;
        String string = this.preferences.getString(getProductEntitlementMappingCacheKey(), null);
        if (string == null) {
            return null;
        }
        try {
            productEntitlementMappingFromJson = ProductEntitlementMapping.INSTANCE.fromJson(new JSONObject(string));
        } catch (JSONException e) {
            String str = String.format(OfflineEntitlementsStrings.ERROR_PARSING_PRODUCT_ENTITLEMENT_MAPPING, Arrays.copyOf(new Object[]{string}, 1));
            G10.f(str, "format(this, *args)");
            LogUtilsKt.errorLog(str, e);
            this.preferences.edit().remove(getProductEntitlementMappingCacheKey()).apply();
        }
        return productEntitlementMappingFromJson;
    }

    public final String getTokensCacheKey() {
        return (String) this.tokensCacheKey.getValue();
    }

    public final synchronized boolean isCustomerInfoCacheStale(String appUserID, boolean appInBackground) {
        G10.g(appUserID, "appUserID");
        return DateExtensionsKt.isCacheStale(getCustomerInfoCachesLastUpdated(appUserID), appInBackground, this.dateProvider);
    }

    public final synchronized boolean isProductEntitlementMappingCacheStale() {
        return DateExtensionsKt.m98isCacheStale8Mi8wO0(getProductEntitlementMappingLastUpdated(), DeviceCacheKt.PRODUCT_ENTITLEMENT_MAPPING_CACHE_REFRESH_PERIOD, this.dateProvider);
    }

    public final String newKey(String key) {
        G10.g(key, SubscriberAttributeKt.JSON_NAME_KEY);
        return getApiKeyPrefix() + '.' + key;
    }

    public void putString(String cacheKey, String value) {
        G10.g(cacheKey, "cacheKey");
        G10.g(value, "value");
        this.preferences.edit().putString(cacheKey, value).apply();
    }

    public final void remove(String cacheKey) {
        G10.g(cacheKey, "cacheKey");
        this.preferences.edit().remove(cacheKey).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestamp(String appUserID, Date date) {
        G10.g(appUserID, "appUserID");
        G10.g(date, "date");
        this.preferences.edit().putLong(customerInfoLastUpdatedCacheKey(appUserID), date.getTime()).apply();
    }

    public final synchronized void setCustomerInfoCacheTimestampToNow(String appUserID) {
        G10.g(appUserID, "appUserID");
        setCustomerInfoCacheTimestamp(appUserID, this.dateProvider.getNow());
    }

    public final synchronized void setProductEntitlementMappingCacheTimestampToNow() {
        setProductEntitlementMappingCacheTimestamp(this.dateProvider.getNow());
    }

    public final synchronized void clearCustomerInfoCacheTimestamp(String appUserID) {
        G10.g(appUserID, "appUserID");
        SharedPreferences.Editor editorEdit = this.preferences.edit();
        G10.f(editorEdit, "preferences.edit()");
        clearCustomerInfoCacheTimestamp(editorEdit, appUserID).apply();
    }

    public /* synthetic */ DeviceCache(SharedPreferences sharedPreferences, String str, DateProvider dateProvider, int i, AbstractC2911Yw abstractC2911Yw) {
        this(sharedPreferences, str, (i & 4) != 0 ? new DefaultDateProvider() : dateProvider);
    }
}
