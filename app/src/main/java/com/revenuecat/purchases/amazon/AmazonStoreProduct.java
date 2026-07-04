package com.revenuecat.purchases.amazon;

import com.daaw.AbstractC2911Yw;
import com.daaw.G10;
import com.google.android.gms.ads.AdRequest;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.amazon.AmazonPurchasingData;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.SubscriptionOption;
import com.revenuecat.purchases.models.SubscriptionOptions;
import kotlin.Metadata;
import org.conscrypt.PSKKeyManager;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0015J\t\u00101\u001a\u00020\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00103\u001a\u00020\u0013HÆ\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00105\u001a\u00020\u0005HÆ\u0003J\t\u00106\u001a\u00020\u0003HÆ\u0003J\t\u00107\u001a\u00020\u0003HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u00109\u001a\u00020\u000bHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\t\u0010<\u001a\u00020\u0003HÆ\u0003J\u008b\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0010\u0010>\u001a\u00020\u00012\u0006\u0010?\u001a\u00020\u0003H\u0016J\u0013\u0010@\u001a\u00020A2\b\u0010B\u001a\u0004\u0018\u00010CH\u0096\u0002J\b\u0010D\u001a\u00020EH\u0016J\t\u0010F\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0011\u0010\u0010\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0019R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0019R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0019R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010(\u001a\u00020\u00038VX\u0097\u0004¢\u0006\f\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0019R\u0016\u0010\f\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0014\u0010\u0006\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b.\u0010\u0019R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b/\u00100¨\u0006G"}, d2 = {"Lcom/revenuecat/purchases/amazon/AmazonStoreProduct;", "Lcom/revenuecat/purchases/models/StoreProduct;", "id", "", "type", "Lcom/revenuecat/purchases/ProductType;", "title", "description", "period", "Lcom/revenuecat/purchases/models/Period;", "price", "Lcom/revenuecat/purchases/models/Price;", "subscriptionOptions", "Lcom/revenuecat/purchases/models/SubscriptionOptions;", "defaultOption", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "iconUrl", "freeTrialPeriod", "originalProductJSON", "Lorg/json/JSONObject;", "presentedOfferingIdentifier", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lcom/revenuecat/purchases/models/Price;Lcom/revenuecat/purchases/models/SubscriptionOptions;Lcom/revenuecat/purchases/models/SubscriptionOption;Ljava/lang/String;Lcom/revenuecat/purchases/models/Period;Lorg/json/JSONObject;Ljava/lang/String;)V", "getDefaultOption", "()Lcom/revenuecat/purchases/models/SubscriptionOption;", "getDescription", "()Ljava/lang/String;", "getFreeTrialPeriod", "()Lcom/revenuecat/purchases/models/Period;", "getIconUrl", "getId", "getOriginalProductJSON", "()Lorg/json/JSONObject;", "getPeriod", "getPresentedOfferingIdentifier", "getPrice", "()Lcom/revenuecat/purchases/models/Price;", "purchasingData", "Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/amazon/AmazonPurchasingData;", ProxyAmazonBillingActivity.EXTRAS_SKU, "getSku$annotations", "()V", "getSku", "getSubscriptionOptions", "()Lcom/revenuecat/purchases/models/SubscriptionOptions;", "getTitle", "getType", "()Lcom/revenuecat/purchases/ProductType;", "component1", "component10", "component11", "component12", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "copyWithOfferingId", "offeringId", "equals", "", "other", "", "hashCode", "", "toString", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class AmazonStoreProduct implements StoreProduct {
    private final SubscriptionOption defaultOption;
    private final String description;
    private final Period freeTrialPeriod;
    private final String iconUrl;
    private final String id;
    private final JSONObject originalProductJSON;
    private final Period period;
    private final String presentedOfferingIdentifier;
    private final Price price;
    private final SubscriptionOptions subscriptionOptions;
    private final String title;
    private final ProductType type;

    public AmazonStoreProduct(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5) {
        G10.g(str, "id");
        G10.g(productType, "type");
        G10.g(str2, "title");
        G10.g(str3, "description");
        G10.g(price, "price");
        G10.g(str4, "iconUrl");
        G10.g(jSONObject, "originalProductJSON");
        this.id = str;
        this.type = productType;
        this.title = str2;
        this.description = str3;
        this.period = period;
        this.price = price;
        this.subscriptionOptions = subscriptionOptions;
        this.defaultOption = subscriptionOption;
        this.iconUrl = str4;
        this.freeTrialPeriod = period2;
        this.originalProductJSON = jSONObject;
        this.presentedOfferingIdentifier = str5;
    }

    public static /* synthetic */ AmazonStoreProduct copy$default(AmazonStoreProduct amazonStoreProduct, String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = amazonStoreProduct.getId();
        }
        if ((i & 2) != 0) {
            productType = amazonStoreProduct.getType();
        }
        if ((i & 4) != 0) {
            str2 = amazonStoreProduct.getTitle();
        }
        if ((i & 8) != 0) {
            str3 = amazonStoreProduct.getDescription();
        }
        if ((i & 16) != 0) {
            period = amazonStoreProduct.getPeriod();
        }
        if ((i & 32) != 0) {
            price = amazonStoreProduct.getPrice();
        }
        if ((i & 64) != 0) {
            subscriptionOptions = amazonStoreProduct.getSubscriptionOptions();
        }
        if ((i & 128) != 0) {
            subscriptionOption = amazonStoreProduct.getDefaultOption();
        }
        if ((i & PSKKeyManager.MAX_KEY_LENGTH_BYTES) != 0) {
            str4 = amazonStoreProduct.iconUrl;
        }
        if ((i & AdRequest.MAX_CONTENT_URL_LENGTH) != 0) {
            period2 = amazonStoreProduct.freeTrialPeriod;
        }
        if ((i & 1024) != 0) {
            jSONObject = amazonStoreProduct.originalProductJSON;
        }
        if ((i & 2048) != 0) {
            str5 = amazonStoreProduct.getPresentedOfferingIdentifier();
        }
        JSONObject jSONObject2 = jSONObject;
        String str6 = str5;
        String str7 = str4;
        Period period3 = period2;
        SubscriptionOptions subscriptionOptions2 = subscriptionOptions;
        SubscriptionOption subscriptionOption2 = subscriptionOption;
        Period period4 = period;
        Price price2 = price;
        return amazonStoreProduct.copy(str, productType, str2, str3, period4, price2, subscriptionOptions2, subscriptionOption2, str7, period3, jSONObject2, str6);
    }

    public static /* synthetic */ void getSku$annotations() {
    }

    public final String component1() {
        return getId();
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    /* JADX INFO: renamed from: component11, reason: from getter */
    public final JSONObject getOriginalProductJSON() {
        return this.originalProductJSON;
    }

    public final String component12() {
        return getPresentedOfferingIdentifier();
    }

    public final ProductType component2() {
        return getType();
    }

    public final String component3() {
        return getTitle();
    }

    public final String component4() {
        return getDescription();
    }

    public final Period component5() {
        return getPeriod();
    }

    public final Price component6() {
        return getPrice();
    }

    public final SubscriptionOptions component7() {
        return getSubscriptionOptions();
    }

    public final SubscriptionOption component8() {
        return getDefaultOption();
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getIconUrl() {
        return this.iconUrl;
    }

    public final AmazonStoreProduct copy(String id, ProductType type, String title, String description, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption defaultOption, String iconUrl, Period freeTrialPeriod, JSONObject originalProductJSON, String presentedOfferingIdentifier) {
        G10.g(id, "id");
        G10.g(type, "type");
        G10.g(title, "title");
        G10.g(description, "description");
        G10.g(price, "price");
        G10.g(iconUrl, "iconUrl");
        G10.g(originalProductJSON, "originalProductJSON");
        return new AmazonStoreProduct(id, type, title, description, period, price, subscriptionOptions, defaultOption, iconUrl, freeTrialPeriod, originalProductJSON, presentedOfferingIdentifier);
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public StoreProduct copyWithOfferingId(String offeringId) {
        G10.g(offeringId, "offeringId");
        return new AmazonStoreProduct(getId(), getType(), getTitle(), getDescription(), getPeriod(), getPrice(), getSubscriptionOptions(), getDefaultOption(), this.iconUrl, this.freeTrialPeriod, this.originalProductJSON, offeringId);
    }

    public boolean equals(Object other) {
        return (other instanceof AmazonStoreProduct) && G10.c(new ComparableData(this), new ComparableData((AmazonStoreProduct) other));
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public SubscriptionOption getDefaultOption() {
        return this.defaultOption;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getDescription() {
        return this.description;
    }

    public final Period getFreeTrialPeriod() {
        return this.freeTrialPeriod;
    }

    public final String getIconUrl() {
        return this.iconUrl;
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getId() {
        return this.id;
    }

    public final JSONObject getOriginalProductJSON() {
        return this.originalProductJSON;
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

    @Override // com.revenuecat.purchases.models.StoreProduct
    public String getSku() {
        return getId();
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
        return new ComparableData(this).hashCode();
    }

    public String toString() {
        return "AmazonStoreProduct(id=" + getId() + ", type=" + getType() + ", title=" + getTitle() + ", description=" + getDescription() + ", period=" + getPeriod() + ", price=" + getPrice() + ", subscriptionOptions=" + getSubscriptionOptions() + ", defaultOption=" + getDefaultOption() + ", iconUrl=" + this.iconUrl + ", freeTrialPeriod=" + this.freeTrialPeriod + ", originalProductJSON=" + this.originalProductJSON + ", presentedOfferingIdentifier=" + getPresentedOfferingIdentifier() + ')';
    }

    @Override // com.revenuecat.purchases.models.StoreProduct
    public AmazonPurchasingData getPurchasingData() {
        return new AmazonPurchasingData.Product(this);
    }

    public /* synthetic */ AmazonStoreProduct(String str, ProductType productType, String str2, String str3, Period period, Price price, SubscriptionOptions subscriptionOptions, SubscriptionOption subscriptionOption, String str4, Period period2, JSONObject jSONObject, String str5, int i, AbstractC2911Yw abstractC2911Yw) {
        this(str, productType, str2, str3, period, price, subscriptionOptions, subscriptionOption, str4, period2, jSONObject, (i & 2048) != 0 ? null : str5);
    }
}
