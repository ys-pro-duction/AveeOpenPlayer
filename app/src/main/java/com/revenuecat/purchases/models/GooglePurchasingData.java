package com.revenuecat.purchases.models;

import com.android.billingclient.api.f;
import com.daaw.AbstractC2911Yw;
import com.daaw.C6902no0;
import com.daaw.G10;
import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0007\bB\u0007\b\u0004¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0002\t\n¨\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData;", "Lcom/revenuecat/purchases/models/PurchasingData;", "()V", "productType", "Lcom/revenuecat/purchases/ProductType;", "getProductType", "()Lcom/revenuecat/purchases/ProductType;", "InAppProduct", "Subscription", "Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class GooglePurchasingData implements PurchasingData {

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b¨\u0006\u001b"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "Lcom/android/billingclient/api/f;", "productDetails", "<init>", "(Ljava/lang/String;Lcom/android/billingclient/api/f;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/android/billingclient/api/f;", "copy", "(Ljava/lang/String;Lcom/android/billingclient/api/f;)Lcom/revenuecat/purchases/models/GooglePurchasingData$InAppProduct;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "Lcom/android/billingclient/api/f;", "getProductDetails", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class InAppProduct extends GooglePurchasingData {
        private final f productDetails;
        private final String productId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InAppProduct(String str, f fVar) {
            super(null);
            G10.g(str, "productId");
            G10.g(fVar, "productDetails");
            this.productId = str;
            this.productDetails = fVar;
        }

        public static /* synthetic */ InAppProduct copy$default(InAppProduct inAppProduct, String str, f fVar, int i, Object obj) {
            if ((i & 1) != 0) {
                str = inAppProduct.getProductId();
            }
            if ((i & 2) != 0) {
                fVar = inAppProduct.productDetails;
            }
            return inAppProduct.copy(str, fVar);
        }

        public final String component1() {
            return getProductId();
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final f getProductDetails() {
            return this.productDetails;
        }

        public final InAppProduct copy(String productId, f productDetails) {
            G10.g(productId, "productId");
            G10.g(productDetails, "productDetails");
            return new InAppProduct(productId, productDetails);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InAppProduct)) {
                return false;
            }
            InAppProduct inAppProduct = (InAppProduct) other;
            return G10.c(getProductId(), inAppProduct.getProductId()) && G10.c(this.productDetails, inAppProduct.productDetails);
        }

        public final f getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public int hashCode() {
            return (getProductId().hashCode() * 31) + this.productDetails.hashCode();
        }

        public String toString() {
            return "InAppProduct(productId=" + getProductId() + ", productDetails=" + this.productDetails + ')';
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ8\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001b\u001a\u0004\b\u001d\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b \u0010\u000b¨\u0006!"}, d2 = {"Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "Lcom/revenuecat/purchases/models/GooglePurchasingData;", "", "productId", "optionId", "Lcom/android/billingclient/api/f;", "productDetails", "token", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/f;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/android/billingclient/api/f;", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/android/billingclient/api/f;Ljava/lang/String;)Lcom/revenuecat/purchases/models/GooglePurchasingData$Subscription;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getOptionId", "Lcom/android/billingclient/api/f;", "getProductDetails", "getToken", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final /* data */ class Subscription extends GooglePurchasingData {
        private final String optionId;
        private final f productDetails;
        private final String productId;
        private final String token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Subscription(String str, String str2, f fVar, String str3) {
            super(null);
            G10.g(str, "productId");
            G10.g(str2, "optionId");
            G10.g(fVar, "productDetails");
            G10.g(str3, "token");
            this.productId = str;
            this.optionId = str2;
            this.productDetails = fVar;
            this.token = str3;
        }

        public static /* synthetic */ Subscription copy$default(Subscription subscription, String str, String str2, f fVar, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = subscription.getProductId();
            }
            if ((i & 2) != 0) {
                str2 = subscription.optionId;
            }
            if ((i & 4) != 0) {
                fVar = subscription.productDetails;
            }
            if ((i & 8) != 0) {
                str3 = subscription.token;
            }
            return subscription.copy(str, str2, fVar, str3);
        }

        public final String component1() {
            return getProductId();
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final String getOptionId() {
            return this.optionId;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final f getProductDetails() {
            return this.productDetails;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getToken() {
            return this.token;
        }

        public final Subscription copy(String productId, String optionId, f productDetails, String token) {
            G10.g(productId, "productId");
            G10.g(optionId, "optionId");
            G10.g(productDetails, "productDetails");
            G10.g(token, "token");
            return new Subscription(productId, optionId, productDetails, token);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Subscription)) {
                return false;
            }
            Subscription subscription = (Subscription) other;
            return G10.c(getProductId(), subscription.getProductId()) && G10.c(this.optionId, subscription.optionId) && G10.c(this.productDetails, subscription.productDetails) && G10.c(this.token, subscription.token);
        }

        public final String getOptionId() {
            return this.optionId;
        }

        public final f getProductDetails() {
            return this.productDetails;
        }

        @Override // com.revenuecat.purchases.models.PurchasingData
        public String getProductId() {
            return this.productId;
        }

        public final String getToken() {
            return this.token;
        }

        public int hashCode() {
            return (((((getProductId().hashCode() * 31) + this.optionId.hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.token.hashCode();
        }

        public String toString() {
            return "Subscription(productId=" + getProductId() + ", optionId=" + this.optionId + ", productDetails=" + this.productDetails + ", token=" + this.token + ')';
        }
    }

    public /* synthetic */ GooglePurchasingData(AbstractC2911Yw abstractC2911Yw) {
        this();
    }

    @Override // com.revenuecat.purchases.models.PurchasingData
    public ProductType getProductType() {
        if (this instanceof InAppProduct) {
            return ProductType.INAPP;
        }
        if (this instanceof Subscription) {
            return ProductType.SUBS;
        }
        throw new C6902no0();
    }

    private GooglePurchasingData() {
    }
}
