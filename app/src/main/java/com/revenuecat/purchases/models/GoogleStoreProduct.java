package com.revenuecat.purchases.models;

import com.android.billingclient.api.f;
import com.daaw.AbstractC2911Yw;
import com.daaw.G10;
import com.google.android.gms.ads.AdRequest;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.models.GooglePurchasingData;
import java.util.ArrayList;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001Bk\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0015B/\b\u0012\u0012\u0006\u0010\u0016\u001a\u00020\u0000\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0014\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00012\u0006\u0010\u0019\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001dJ\u0010\u0010$\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b$\u0010\u001dJ\u0012\u0010%\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010'\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0011HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001dJ\u0088\u0001\u0010.\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b0\u0010\u001dJ\u0010\u00102\u001a\u000201HÖ\u0001¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104HÖ\u0003¢\u0006\u0004\b7\u00108R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00109\u001a\u0004\b:\u0010\u001dR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00109\u001a\u0004\b;\u0010\u001dR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010<\u001a\u0004\b=\u0010 R\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010>\u001a\u0004\b?\u0010\"R\u001a\u0010\t\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b@\u0010\u001dR\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00109\u001a\u0004\bA\u0010\u001dR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010B\u001a\u0004\bC\u0010&R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\bE\u0010(R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u0010*R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010,R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\bJ\u0010\u001dR\u001a\u0010N\u001a\u00020\u00028VX\u0097\u0004¢\u0006\f\u0012\u0004\bL\u0010M\u001a\u0004\bK\u0010\u001dR\u0014\u0010P\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010\u001dR\u0014\u0010T\u001a\u00020Q8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010S¨\u0006U"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "", "productId", "basePlanId", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/Price;", "price", "title", "description", "Lcom/revenuecat/purchases/models/Period;", "period", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "defaultOption", "Lcom/android/billingclient/api/f;", "productDetails", "presentedOfferingIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/android/billingclient/api/f;Ljava/lang/String;)V", "otherProduct", "subscriptionOptionsWithOfferingId", "(Lcom/revenuecat/purchases/models/GoogleStoreProduct;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/revenuecat/purchases/models/SubscriptionOptions;Ljava/lang/String;)V", "offeringId", "copyWithOfferingId", "(Ljava/lang/String;)Lcom/revenuecat/purchases/models/StoreProduct;", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/revenuecat/purchases/ProductType;", "component4", "()Lcom/revenuecat/purchases/models/Price;", "component5", "component6", "component7", "()Lcom/revenuecat/purchases/models/Period;", "component8", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "component9", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "component10", "()Lcom/android/billingclient/api/f;", "component11", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Lcom/revenuecat/purchases/models/Price;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Lcom/android/billingclient/api/f;Ljava/lang/String;)Lcom/revenuecat/purchases/models/GoogleStoreProduct;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "Lcom/revenuecat/purchases/ProductType;", "getType", "Lcom/revenuecat/purchases/models/Price;", "getPrice", "getTitle", "getDescription", "Lcom/revenuecat/purchases/models/Period;", "getPeriod", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getSubscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDefaultOption", "Lcom/android/billingclient/api/f;", "getProductDetails", "getPresentedOfferingIdentifier", "getSku", "getSku$annotations", "()V", ProxyAmazonBillingActivity.EXTRAS_SKU, "getId", "id", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GoogleStoreProduct implements StoreProduct {
    private final String basePlanId;
    private final SubscriptionOption defaultOption;
    private final String description;
    private final Period period;
    private final String presentedOfferingIdentifier;
    private final Price price;
    private final f productDetails;
    private final String productId;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    public GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, f fVar, String str5) {
        G10.g(str, "productId");
        G10.g(productType, "type");
        G10.g(price, "price");
        G10.g(str3, "title");
        G10.g(str4, "description");
        G10.g(fVar, "productDetails");
        this.productId = str;
        this.basePlanId = str2;
        this.type = productType;
        this.price = price;
        this.title = str3;
        this.description = str4;
        this.period = period;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.productDetails = fVar;
        this.presentedOfferingIdentifier = str5;
    }

    public static /* synthetic */ GoogleStoreProduct copy$default(GoogleStoreProduct googleStoreProduct, String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, f fVar, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googleStoreProduct.productId;
        }
        if ((i & 2) != 0) {
            str2 = googleStoreProduct.basePlanId;
        }
        if ((i & 4) != 0) {
            productType = googleStoreProduct.getType();
        }
        if ((i & 8) != 0) {
            price = googleStoreProduct.getPrice();
        }
        if ((i & 16) != 0) {
            str3 = googleStoreProduct.getTitle();
        }
        if ((i & 32) != 0) {
            str4 = googleStoreProduct.getDescription();
        }
        if ((i & 64) != 0) {
            period = googleStoreProduct.getPeriod();
        }
        if ((i & 128) != 0) {
            subscriptionOptions = googleStoreProduct.getSubscriptionOptions();
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            subscriptionOption = googleStoreProduct.getDefaultOption();
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            fVar = googleStoreProduct.productDetails;
        }
        if ((i & 1024) != 0) {
            str5 = googleStoreProduct.getPresentedOfferingIdentifier();
        }
        f fVar2 = fVar;
        String str6 = str5;
        SubscriptionOptions subscriptionOptions2 = subscriptionOptions;
        SubscriptionOption subscriptionOption2 = subscriptionOption;
        String str7 = str4;
        Period period2 = period;
        String str8 = str3;
        ProductType productType2 = productType;
        return googleStoreProduct.copy(str, str2, productType2, price, str8, str7, period2, subscriptionOptions2, subscriptionOption2, fVar2, str6);
    }

    public static /* synthetic */ void getSku$annotations() {
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final f getProductDetails() {
        return this.productDetails;
    }

    public final String component11() {
        return getPresentedOfferingIdentifier();
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    public final ProductType component3() {
        return getType();
    }

    public final Price component4() {
        return getPrice();
    }

    public final String component5() {
        return getTitle();
    }

    public final String component6() {
        return getDescription();
    }

    public final Period component7() {
        return getPeriod();
    }

    public final SubscriptionOptions component8() {
        return getSubscriptionOptions();
    }

    public final SubscriptionOption component9() {
        return getDefaultOption();
    }

    public final GoogleStoreProduct copy(String productId, String basePlanId, ProductType type, Price price, String title, String description, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption defaultOption, f productDetails, String presentedOfferingIdentifier) {
        G10.g(productId, "productId");
        G10.g(type, "type");
        G10.g(price, "price");
        G10.g(title, "title");
        G10.g(description, "description");
        G10.g(productDetails, "productDetails");
        return new GoogleStoreProduct(productId, basePlanId, type, price, title, description, period, subscriptionOptions, defaultOption, productDetails, presentedOfferingIdentifier);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithOfferingId(String offeringId) {
        ArrayList arrayList;
        G10.g(offeringId, "offeringId");
        SubscriptionOptions subscriptionOptions = getSubscriptionOptions();
        if (subscriptionOptions != null) {
            arrayList = new ArrayList();
            for (SubscriptionOption subscriptionOption : subscriptionOptions) {
                GoogleSubscriptionOption googleSubscriptionOption = subscriptionOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) subscriptionOption : null;
                GoogleSubscriptionOption googleSubscriptionOption2 = googleSubscriptionOption != null ? new GoogleSubscriptionOption(googleSubscriptionOption, offeringId) : null;
                if (googleSubscriptionOption2 != null) {
                    arrayList.add(googleSubscriptionOption2);
                }
            }
        } else {
            arrayList = null;
        }
        SubscriptionOption defaultOption = getDefaultOption();
        GoogleSubscriptionOption googleSubscriptionOption3 = defaultOption instanceof GoogleSubscriptionOption ? (GoogleSubscriptionOption) defaultOption : null;
        return new GoogleStoreProduct(this, googleSubscriptionOption3 != null ? new GoogleSubscriptionOption(googleSubscriptionOption3, offeringId) : null, arrayList != null ? new SubscriptionOptions(arrayList) : null, offeringId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleStoreProduct)) {
            return false;
        }
        GoogleStoreProduct googleStoreProduct = (GoogleStoreProduct) other;
        return G10.c(this.productId, googleStoreProduct.productId) && G10.c(this.basePlanId, googleStoreProduct.basePlanId) && getType() == googleStoreProduct.getType() && G10.c(getPrice(), googleStoreProduct.getPrice()) && G10.c(getTitle(), googleStoreProduct.getTitle()) && G10.c(getDescription(), googleStoreProduct.getDescription()) && G10.c(getPeriod(), googleStoreProduct.getPeriod()) && G10.c(getSubscriptionOptions(), googleStoreProduct.getSubscriptionOptions()) && G10.c(getDefaultOption(), googleStoreProduct.getDefaultOption()) && G10.c(this.productDetails, googleStoreProduct.productDetails) && G10.c(getPresentedOfferingIdentifier(), googleStoreProduct.getPresentedOfferingIdentifier());
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        if (this.basePlanId != null) {
            String str = this.productId + ':' + this.basePlanId;
            if (str != null) {
                return str;
            }
        }
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Period getPeriod() {
        return this.period;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public Price getPrice() {
        return this.price;
    }

    public final f getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public PurchasingData getPurchasingData() {
        return (getType() != ProductType.SUBS || getDefaultOption() == null) ? new GooglePurchasingData.InAppProduct(getId(), this.productDetails) : getDefaultOption().getPurchasingData();
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOptions getSubscriptionOptions() {
        return this.subscriptionOptions;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getTitle() {
        return this.title;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public ProductType getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.productId.hashCode() * 31;
        String str = this.basePlanId;
        return ((((((((((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + getType().hashCode()) * 31) + getPrice().hashCode()) * 31) + getTitle().hashCode()) * 31) + getDescription().hashCode()) * 31) + (getPeriod() == null ? 0 : getPeriod().hashCode())) * 31) + (getSubscriptionOptions() == null ? 0 : getSubscriptionOptions().hashCode())) * 31) + (getDefaultOption() == null ? 0 : getDefaultOption().hashCode())) * 31) + this.productDetails.hashCode()) * 31) + (getPresentedOfferingIdentifier() != null ? getPresentedOfferingIdentifier().hashCode() : 0);
    }

    public String toString() {
        return "GoogleStoreProduct(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", type=" + getType() + ", price=" + getPrice() + ", title=" + getTitle() + ", description=" + getDescription() + ", period=" + getPeriod() + ", subscriptionOptions=" + getSubscriptionOptions() + ", defaultOption=" + getDefaultOption() + ", productDetails=" + this.productDetails + ", presentedOfferingIdentifier=" + getPresentedOfferingIdentifier() + ')';
    }

    public /* synthetic */ GoogleStoreProduct(String str, String str2, ProductType productType, Price price, String str3, String str4, Period period, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, f fVar, String str5, int i, AbstractC2911Yw abstractC2911Yw) {
        this(str, str2, productType, price, str3, str4, period, subscriptionOptions, subscriptionOption, fVar, (i & 1024) != 0 ? null : str5);
    }

    private GoogleStoreProduct(GoogleStoreProduct googleStoreProduct, SubscriptionOption subscriptionOption, SubscriptionOptions subscriptionOptions, String str) {
        this(googleStoreProduct.productId, googleStoreProduct.basePlanId, googleStoreProduct.getType(), googleStoreProduct.getPrice(), googleStoreProduct.getTitle(), googleStoreProduct.getDescription(), googleStoreProduct.getPeriod(), subscriptionOptions, subscriptionOption, googleStoreProduct.productDetails, str);
    }
}
