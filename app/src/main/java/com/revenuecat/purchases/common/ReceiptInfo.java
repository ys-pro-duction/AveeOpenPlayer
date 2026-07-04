package com.revenuecat.purchases.common;

import com.daaw.AbstractC1599Mm;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC2911Yw;
import com.daaw.G10;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B[\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eJ\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010)\u001a\u00020*H\u0016J\b\u0010+\u001a\u00020\u0004H\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u001c\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00038@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u001a\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0017R\u0013\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0010¨\u0006,"}, d2 = {"Lcom/revenuecat/purchases/common/ReceiptInfo;", "", "productIDs", "", "", "offeringIdentifier", "subscriptionOptionId", "storeProduct", "Lcom/revenuecat/purchases/models/StoreProduct;", "price", "", "currency", "replacementMode", "Lcom/revenuecat/purchases/ReplacementMode;", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/Double;Ljava/lang/String;Lcom/revenuecat/purchases/ReplacementMode;)V", "getCurrency", "()Ljava/lang/String;", "duration", "getDuration", "getOfferingIdentifier", "platformProductIds", "Lcom/revenuecat/purchases/common/PlatformProductId;", "getPlatformProductIds$purchases_defaultsRelease", "()Ljava/util/List;", "getPrice", "()Ljava/lang/Double;", "Ljava/lang/Double;", "pricingPhases", "Lcom/revenuecat/purchases/models/PricingPhase;", "getPricingPhases", "getProductIDs", "getReplacementMode", "()Lcom/revenuecat/purchases/ReplacementMode;", "getStoreProduct", "()Lcom/revenuecat/purchases/models/StoreProduct;", "subscriptionOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getSubscriptionOptionId", "equals", "", "other", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class ReceiptInfo {
    private final String currency;
    private final String duration;
    private final String offeringIdentifier;
    private final Double price;
    private final List<PricingPhase> pricingPhases;
    private final List<String> productIDs;
    private final ReplacementMode replacementMode;
    private final StoreProduct storeProduct;
    private final SubscriptionOption subscriptionOption;
    private final String subscriptionOptionId;

    public ReceiptInfo(List<String> list, String str, String str2, StoreProduct storeProduct, Double d, String str3, ReplacementMode replacementMode) {
        SubscriptionOption subscriptionOption;
        SubscriptionOptions subscriptionOptions;
        SubscriptionOption next;
        Period period;
        String iso8601;
        G10.g(list, "productIDs");
        this.productIDs = list;
        this.offeringIdentifier = str;
        this.subscriptionOptionId = str2;
        this.storeProduct = storeProduct;
        this.price = d;
        this.currency = str3;
        this.replacementMode = replacementMode;
        this.duration = (storeProduct == null || (period = storeProduct.getPeriod()) == null || (iso8601 = period.getIso8601()) == null || iso8601.length() == 0) ? null : iso8601;
        if (storeProduct == null || (subscriptionOptions = storeProduct.getSubscriptionOptions()) == null) {
            subscriptionOption = null;
        } else {
            Iterator<SubscriptionOption> it = subscriptionOptions.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                } else {
                    next = it.next();
                    if (G10.c(next.getId(), this.subscriptionOptionId)) {
                        break;
                    }
                }
            }
            subscriptionOption = next;
        }
        this.subscriptionOption = subscriptionOption;
        this.pricingPhases = subscriptionOption != null ? subscriptionOption.getPricingPhases() : null;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!G10.c(ReceiptInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        G10.e(other, "null cannot be cast to non-null type com.revenuecat.purchases.common.ReceiptInfo");
        ReceiptInfo receiptInfo = (ReceiptInfo) other;
        return G10.c(this.productIDs, receiptInfo.productIDs) && G10.c(this.offeringIdentifier, receiptInfo.offeringIdentifier) && G10.c(this.storeProduct, receiptInfo.storeProduct) && G10.a(this.price, receiptInfo.price) && G10.c(this.currency, receiptInfo.currency) && G10.c(this.subscriptionOptionId, receiptInfo.subscriptionOptionId);
    }

    public final String getCurrency() {
        return this.currency;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final String getOfferingIdentifier() {
        return this.offeringIdentifier;
    }

    public final List<PlatformProductId> getPlatformProductIds$purchases_defaultsRelease() {
        PlatformProductId platformProductId;
        SubscriptionOption subscriptionOption = this.subscriptionOption;
        if (subscriptionOption == null || (platformProductId = ReceiptInfoKt.platformProductId(subscriptionOption)) == null) {
            StoreProduct storeProduct = this.storeProduct;
            platformProductId = storeProduct != null ? ReceiptInfoKt.platformProductId(storeProduct) : null;
        }
        List<String> list = this.productIDs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!G10.c((String) obj, platformProductId != null ? platformProductId.getProductId() : null)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC1703Nm.v(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new PlatformProductId((String) it.next()));
        }
        return AbstractC2455Um.z0(arrayList2, AbstractC1599Mm.o(platformProductId));
    }

    public final Double getPrice() {
        return this.price;
    }

    public final List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final List<String> getProductIDs() {
        return this.productIDs;
    }

    public final ReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final StoreProduct getStoreProduct() {
        return this.storeProduct;
    }

    public final String getSubscriptionOptionId() {
        return this.subscriptionOptionId;
    }

    public int hashCode() {
        int iHashCode = this.productIDs.hashCode() * 31;
        String str = this.offeringIdentifier;
        int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
        StoreProduct storeProduct = this.storeProduct;
        int iHashCode3 = (iHashCode2 + (storeProduct != null ? storeProduct.hashCode() : 0)) * 31;
        String str2 = this.subscriptionOptionId;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "ReceiptInfo(productIDs='" + AbstractC2455Um.n0(this.productIDs, null, null, null, 0, null, null, 63, null) + "', offeringIdentifier=" + this.offeringIdentifier + ", storeProduct=" + this.storeProduct + ", subscriptionOptionId=" + this.subscriptionOptionId + ", pricingPhases=" + this.pricingPhases + ", price=" + this.price + ", currency=" + this.currency + ", duration=" + this.duration + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReceiptInfo(List list, String str, String str2, StoreProduct storeProduct, Double d, String str3, ReplacementMode replacementMode, int i, AbstractC2911Yw abstractC2911Yw) {
        Price price;
        Price price2;
        str = (i & 2) != 0 ? null : str;
        str2 = (i & 4) != 0 ? null : str2;
        storeProduct = (i & 8) != 0 ? null : storeProduct;
        this(list, str, str2, storeProduct, (i & 16) != 0 ? (storeProduct == null || (price2 = storeProduct.getPrice()) == null) ? null : Double.valueOf(price2.getAmountMicros() / 1000000.0d) : d, (i & 32) != 0 ? (storeProduct == null || (price = storeProduct.getPrice()) == null) ? null : price.getCurrencyCode() : str3, (i & 64) != 0 ? null : replacementMode);
    }
}
