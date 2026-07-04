package com.revenuecat.purchases.google;

import com.daaw.G10;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u0011"}, d2 = {"Lcom/revenuecat/purchases/google/PurchaseContext;", "", "productType", "Lcom/revenuecat/purchases/ProductType;", "presentedOfferingId", "", "selectedSubscriptionOptionId", "replacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "(Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/GoogleReplacementMode;)V", "getPresentedOfferingId", "()Ljava/lang/String;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "getReplacementMode", "()Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "getSelectedSubscriptionOptionId", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PurchaseContext {
    private final String presentedOfferingId;
    private final ProductType productType;
    private final GoogleReplacementMode replacementMode;
    private final String selectedSubscriptionOptionId;

    public PurchaseContext(ProductType productType, String str, String str2, GoogleReplacementMode googleReplacementMode) {
        G10.g(productType, "productType");
        this.productType = productType;
        this.presentedOfferingId = str;
        this.selectedSubscriptionOptionId = str2;
        this.replacementMode = googleReplacementMode;
    }

    public final String getPresentedOfferingId() {
        return this.presentedOfferingId;
    }

    public final ProductType getProductType() {
        return this.productType;
    }

    public final GoogleReplacementMode getReplacementMode() {
        return this.replacementMode;
    }

    public final String getSelectedSubscriptionOptionId() {
        return this.selectedSubscriptionOptionId;
    }
}
