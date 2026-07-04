package com.revenuecat.purchases.amazon;

import com.daaw.AbstractC1473Lg0;
import com.daaw.AbstractC3192ab0;
import com.daaw.G10;
import com.daaw.O90;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.common.caching.DeviceCache;
import com.revenuecat.purchases.utils.JSONObjectExtensionsKt;
import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\n\u001a\u00020\t2\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R\u001b\u0010\u0016\u001a\u00020\u00078@X\u0080\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonCache;", "", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "deviceCache", "<init>", "(Lcom/revenuecat/purchases/common/caching/DeviceCache;)V", "", "", "receiptsToSkus", "Lcom/daaw/G91;", "cacheSkusByToken", "(Ljava/util/Map;)V", "getReceiptSkus", "()Ljava/util/Map;", "token", "addSuccessfullyPostedToken", "(Ljava/lang/String;)V", "Lcom/revenuecat/purchases/common/caching/DeviceCache;", "amazonPostedTokensKey$delegate", "Lcom/daaw/O90;", "getAmazonPostedTokensKey$purchases_defaultsRelease", "()Ljava/lang/String;", "amazonPostedTokensKey", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class AmazonCache {

    /* JADX INFO: renamed from: amazonPostedTokensKey$delegate, reason: from kotlin metadata */
    private final O90 amazonPostedTokensKey;
    private final DeviceCache deviceCache;

    public AmazonCache(DeviceCache deviceCache) {
        G10.g(deviceCache, "deviceCache");
        this.deviceCache = deviceCache;
        this.amazonPostedTokensKey = AbstractC3192ab0.a(new AmazonCache$amazonPostedTokensKey$2(this));
    }

    public final synchronized void addSuccessfullyPostedToken(String token) {
        G10.g(token, "token");
        this.deviceCache.addSuccessfullyPostedToken(token);
    }

    public final synchronized void cacheSkusByToken(Map<String, String> receiptsToSkus) {
        G10.g(receiptsToSkus, "receiptsToSkus");
        LogIntent logIntent = LogIntent.DEBUG;
        String str = String.format(AmazonStrings.CACHING_RECEIPT_TERM_SKUS, Arrays.copyOf(new Object[]{receiptsToSkus}, 1));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        JSONObject jSONObject = new JSONObject(AbstractC1473Lg0.n(getReceiptSkus(), receiptsToSkus));
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("receiptsToSkus", jSONObject);
        DeviceCache deviceCache = this.deviceCache;
        String amazonPostedTokensKey$purchases_defaultsRelease = getAmazonPostedTokensKey$purchases_defaultsRelease();
        String string = jSONObject2.toString();
        G10.f(string, "jsonToCache.toString()");
        deviceCache.putString(amazonPostedTokensKey$purchases_defaultsRelease, string);
    }

    public final String getAmazonPostedTokensKey$purchases_defaultsRelease() {
        return (String) this.amazonPostedTokensKey.getValue();
    }

    public final synchronized Map<String, String> getReceiptSkus() {
        Map<String, String> mapH;
        try {
            JSONObject jSONObjectOrNull = this.deviceCache.getJSONObjectOrNull(getAmazonPostedTokensKey$purchases_defaultsRelease());
            JSONObject jSONObject = jSONObjectOrNull != null ? jSONObjectOrNull.getJSONObject("receiptsToSkus") : null;
            if (jSONObject == null || (mapH = JSONObjectExtensionsKt.toMap$default(jSONObject, false, 1, null)) == null) {
                mapH = AbstractC1473Lg0.h();
            }
        } catch (Throwable th) {
            throw th;
        }
        return mapH;
    }
}
