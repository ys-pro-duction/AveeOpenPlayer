package com.revenuecat.purchases.subscriberattributes.caching;

import com.daaw.AbstractC1369Kg0;
import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC3192ab0;
import com.daaw.C0576Cs0;
import com.daaw.D61;
import com.daaw.G10;
import com.daaw.O90;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.strings.AttributionStrings;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttribute;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributesFactoriesKt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ?\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r*\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r2\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0013\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u000e2\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0016\u001a&\u0012\b\u0012\u00060\u0006j\u0002`\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r0\u000bj\u0002`\u0015¢\u0006\u0004\b\u0016\u0010\u0017J)\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r2\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u000e¢\u0006\u0004\b\u0016\u0010\u0018J1\u0010\u0019\u001a&\u0012\b\u0012\u00060\u0006j\u0002`\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r0\u000bj\u0002`\u0015¢\u0006\u0004\b\u0019\u0010\u0017J%\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r2\u0006\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u0019\u0010\u0018J\u0019\u0010\u001a\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u000e¢\u0006\u0004\b\u001a\u0010\nJ\u0019\u0010\u001b\u001a\u00020\b2\n\u0010\u000f\u001a\u00060\u0006j\u0002`\u000e¢\u0006\u0004\b\u001b\u0010\nJ\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001c\u0010\nJ?\u0010 \u001a\u00020\b*\u00020\u00022*\u0010\u001d\u001a&\u0012\b\u0012\u00060\u0006j\u0002`\u000e\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\f0\u000bj\u0002`\r0\u000bj\u0002`\u0015H\u0000¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010#R\u001b\u0010(\u001a\u00020\u00068@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "currentAppUserID", "Lcom/daaw/G91;", "deleteSyncedSubscriberAttributesForOtherUsers", "(Ljava/lang/String;)V", "", "Lcom/revenuecat/purchases/subscriberattributes/SubscriberAttribute;", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributeMap;", "Lcom/revenuecat/purchases/subscriberattributes/caching/AppUserID;", "appUserID", "filterUnsynced", "(Ljava/util/Map;Ljava/lang/String;)Ljava/util/Map;", "attributesToBeSet", "setAttributes", "(Ljava/lang/String;Ljava/util/Map;)V", "Lcom/revenuecat/purchases/subscriberattributes/caching/SubscriberAttributesPerAppUserIDMap;", "getAllStoredSubscriberAttributes", "()Ljava/util/Map;", "(Ljava/lang/String;)Ljava/util/Map;", "getUnsyncedSubscriberAttributes", "clearAllSubscriberAttributesFromUser", "clearSubscriberAttributesIfSyncedForSubscriber", "cleanUpSubscriberAttributeCache", "updatedSubscriberAttributesForAll", "putAttributes$purchases_defaultsRelease", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;Ljava/util/Map;)V", "putAttributes", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "getDeviceCache$purchases_defaultsRelease", "()Lcom/revenuecat/purchases/common/caching/DeviceCache;", "subscriberAttributesCacheKey$delegate", "Lcom/daaw/O90;", "getSubscriberAttributesCacheKey$purchases_defaultsRelease", "()Ljava/lang/String;", "subscriberAttributesCacheKey", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class SubscriberAttributesCache {
    private final DeviceCache deviceCache;

    /* JADX INFO: renamed from: subscriberAttributesCacheKey$delegate, reason: from kotlin metadata */
    private final O90 subscriberAttributesCacheKey;

    public SubscriberAttributesCache(DeviceCache deviceCache) {
        G10.g(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.subscriberAttributesCacheKey = AbstractC3192ab0.a(new SubscriberAttributesCache$subscriberAttributesCacheKey$2(this));
    }

    private final synchronized void deleteSyncedSubscriberAttributesForOtherUsers(String currentAppUserID) {
        C0576Cs0 c0576Cs0A;
        try {
            LogIntent logIntent = LogIntent.DEBUG;
            String str = String.format(AttributionStrings.DELETING_ATTRIBUTES_OTHER_USERS, Arrays.copyOf(new Object[]{currentAppUserID}, 1));
            G10.f(str, "format(this, *args)");
            LogWrapperKt.log(logIntent, str);
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            ArrayList arrayList = new ArrayList(allStoredSubscriberAttributes.size());
            for (Map.Entry<String, Map<String, SubscriberAttribute>> entry : allStoredSubscriberAttributes.entrySet()) {
                String key = entry.getKey();
                Map<String, SubscriberAttribute> value = entry.getValue();
                if (G10.c(currentAppUserID, key)) {
                    c0576Cs0A = D61.a(key, value);
                } else {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    for (Map.Entry<String, SubscriberAttribute> entry2 : value.entrySet()) {
                        if (!entry2.getValue().isSynced()) {
                            linkedHashMap.put(entry2.getKey(), entry2.getValue());
                        }
                    }
                    c0576Cs0A = D61.a(key, linkedHashMap);
                }
                arrayList.add(c0576Cs0A);
            }
            Map mapT = AbstractC1473Lg0.t(arrayList);
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry3 : mapT.entrySet()) {
                if (!((Map) entry3.getValue()).isEmpty()) {
                    linkedHashMap2.put(entry3.getKey(), entry3.getValue());
                }
            }
            putAttributes$purchases_defaultsRelease(this.deviceCache, linkedHashMap2);
        } catch (Throwable th) {
            throw th;
        }
    }

    private final Map<String, SubscriberAttribute> filterUnsynced(Map<String, SubscriberAttribute> map, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, SubscriberAttribute> entry : map.entrySet()) {
            if (!entry.getValue().isSynced()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LogIntent logIntent = LogIntent.DEBUG;
        StringBuilder sb = new StringBuilder();
        String str2 = String.format(AttributionStrings.UNSYNCED_ATTRIBUTES_COUNT, Arrays.copyOf(new Object[]{Integer.valueOf(linkedHashMap.size()), str}, 2));
        G10.f(str2, "format(this, *args)");
        sb.append(str2);
        sb.append(!linkedHashMap.isEmpty() ? AbstractC2455Um.n0(linkedHashMap.values(), "\n", null, null, 0, null, null, 62, null) : "");
        LogWrapperKt.log(logIntent, sb.toString());
        return linkedHashMap;
    }

    public final synchronized void cleanUpSubscriberAttributeCache(String currentAppUserID) {
        G10.g(currentAppUserID, "currentAppUserID");
        SubscriberAttributesMigrationExtensionsKt.migrateSubscriberAttributesIfNeeded(this);
        deleteSyncedSubscriberAttributesForOtherUsers(currentAppUserID);
    }

    public final synchronized void clearAllSubscriberAttributesFromUser(String appUserID) {
        G10.g(appUserID, "appUserID");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AttributionStrings.DELETING_ATTRIBUTES, Arrays.copyOf(new Object[]{appUserID}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        Map mapX = AbstractC1473Lg0.x(getAllStoredSubscriberAttributes());
        mapX.remove(appUserID);
        putAttributes$purchases_defaultsRelease(this.deviceCache, AbstractC1473Lg0.v(mapX));
    }

    public final synchronized void clearSubscriberAttributesIfSyncedForSubscriber(String appUserID) {
        G10.g(appUserID, "appUserID");
        if (getUnsyncedSubscriberAttributes(appUserID).isEmpty()) {
            clearAllSubscriberAttributesFromUser(appUserID);
        }
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getAllStoredSubscriberAttributes() {
        Map<String, Map<String, SubscriberAttribute>> mapH;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getSubscriberAttributesCacheKey$purchases_defaultsRelease());
            if (jSONObjectOrNull == null || (mapH = SubscriberAttributesFactoriesKt.buildSubscriberAttributesMapPerUser(jSONObjectOrNull)) == null) {
                mapH = AbstractC1473Lg0.h();
            }
        } finally {
        }
        return mapH;
    }

    /* JADX INFO: renamed from: getDeviceCache$purchases_defaultsRelease, reason: from getter */
    public final DeviceCache getDeviceCache() {
        return this.deviceCache;
    }

    public final String getSubscriberAttributesCacheKey$purchases_defaultsRelease() {
        return (String) this.subscriberAttributesCacheKey.getValue();
    }

    public final synchronized Map<String, Map<String, SubscriberAttribute>> getUnsyncedSubscriberAttributes() {
        LinkedHashMap linkedHashMap;
        try {
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap(AbstractC1369Kg0.d(allStoredSubscriberAttributes.size()));
            for (Object obj : allStoredSubscriberAttributes.entrySet()) {
                Object key = ((Map.Entry) obj).getKey();
                Map.Entry entry = (Map.Entry) obj;
                linkedHashMap2.put(key, filterUnsynced((Map) entry.getValue(), (String) entry.getKey()));
            }
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                if (!((Map) entry2.getValue()).isEmpty()) {
                    linkedHashMap.put(entry2.getKey(), entry2.getValue());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return linkedHashMap;
    }

    public final void putAttributes$purchases_defaultsRelease(DeviceCache deviceCache, Map<String, ? extends Map<String, SubscriberAttribute>> map) {
        G10.g(deviceCache, "<this>");
        G10.g(map, "updatedSubscriberAttributesForAll");
        DeviceCache deviceCache2 = this.deviceCache;
        String subscriberAttributesCacheKey$purchases_defaultsRelease = getSubscriberAttributesCacheKey$purchases_defaultsRelease();
        String string = CachingHelpersKt.toJSONObject(map).toString();
        G10.f(string, "updatedSubscriberAttribu…toJSONObject().toString()");
        deviceCache2.putString(subscriberAttributesCacheKey$purchases_defaultsRelease, string);
    }

    public final synchronized void setAttributes(String appUserID, Map<String, SubscriberAttribute> attributesToBeSet) {
        try {
            G10.g(appUserID, "appUserID");
            G10.g(attributesToBeSet, "attributesToBeSet");
            Map<String, Map<String, SubscriberAttribute>> allStoredSubscriberAttributes = getAllStoredSubscriberAttributes();
            Map<String, SubscriberAttribute> mapH = allStoredSubscriberAttributes.get(appUserID);
            if (mapH == null) {
                mapH = AbstractC1473Lg0.h();
            }
            putAttributes$purchases_defaultsRelease(this.deviceCache, AbstractC1473Lg0.n(allStoredSubscriberAttributes, AbstractC1369Kg0.e(D61.a(appUserID, AbstractC1473Lg0.n(mapH, attributesToBeSet)))));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Map<String, SubscriberAttribute> getAllStoredSubscriberAttributes(String appUserID) {
        Map<String, SubscriberAttribute> mapH;
        G10.g(appUserID, "appUserID");
        mapH = getAllStoredSubscriberAttributes().get(appUserID);
        if (mapH == null) {
            mapH = AbstractC1473Lg0.h();
        }
        return mapH;
    }

    public final synchronized Map<String, SubscriberAttribute> getUnsyncedSubscriberAttributes(String appUserID) {
        G10.g(appUserID, "appUserID");
        return filterUnsynced(getAllStoredSubscriberAttributes(appUserID), appUserID);
    }
}
