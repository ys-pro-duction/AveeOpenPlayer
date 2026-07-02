package com.revenuecat.purchases.models;

import com.android.billingclient.api.f;
import com.daaw.AbstractC2911Yw;
import com.daaw.BY0;
import com.daaw.G10;
import com.revenuecat.purchases.models.GooglePurchasingData;
import com.revenuecat.purchases.models.SubscriptionOption;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u000fB\u001b\b\u0010\u0012\u0006\u0010\u0010\u001a\u00020\u0000\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000e\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0013J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0013Jp\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0013J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0013R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b+\u0010\u0013R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0017R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b.\u0010\u0017R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010/\u001a\u0004\b0\u0010\u001aR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b1\u0010\u0013R\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b2\u0010\u0013R\u0014\u00104\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u0010\u0013R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107¨\u00069"}, d2 = {"Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "productId", "basePlanId", "offerId", "", "Lcom/revenuecat/purchases/models/PricingPhase;", "pricingPhases", "tags", "Lcom/android/billingclient/api/f;", "productDetails", "offerToken", "presentedOfferingIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/android/billingclient/api/f;Ljava/lang/String;Ljava/lang/String;)V", "subscriptionOption", "(Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Ljava/util/List;", "component5", "component6", "()Lcom/android/billingclient/api/f;", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/android/billingclient/api/f;Ljava/lang/String;Ljava/lang/String;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getProductId", "getBasePlanId", "getOfferId", "Ljava/util/List;", "getPricingPhases", "getTags", "Lcom/android/billingclient/api/f;", "getProductDetails", "getOfferToken", "getPresentedOfferingIdentifier", "getId", "id", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final /* data */ class GoogleSubscriptionOption implements SubscriptionOption {
    private final String basePlanId;
    private final String offerId;
    private final String offerToken;
    private final String presentedOfferingIdentifier;
    private final List<PricingPhase> pricingPhases;
    private final f productDetails;
    private final String productId;
    private final List<String> tags;

    public GoogleSubscriptionOption(String str, String str2, String str3, List<PricingPhase> list, List<String> list2, f fVar, String str4, String str5) {
        G10.g(str, "productId");
        G10.g(str2, "basePlanId");
        G10.g(list, "pricingPhases");
        G10.g(list2, "tags");
        G10.g(fVar, "productDetails");
        G10.g(str4, "offerToken");
        this.productId = str;
        this.basePlanId = str2;
        this.offerId = str3;
        this.pricingPhases = list;
        this.tags = list2;
        this.productDetails = fVar;
        this.offerToken = str4;
        this.presentedOfferingIdentifier = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoogleSubscriptionOption copy$default(GoogleSubscriptionOption googleSubscriptionOption, String str, String str2, String str3, List list, List list2, f fVar, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = googleSubscriptionOption.productId;
        }
        if ((i & 2) != 0) {
            str2 = googleSubscriptionOption.basePlanId;
        }
        if ((i & 4) != 0) {
            str3 = googleSubscriptionOption.offerId;
        }
        if ((i & 8) != 0) {
            list = googleSubscriptionOption.getPricingPhases();
        }
        if ((i & 16) != 0) {
            list2 = googleSubscriptionOption.getTags();
        }
        if ((i & 32) != 0) {
            fVar = googleSubscriptionOption.productDetails;
        }
        if ((i & 64) != 0) {
            str4 = googleSubscriptionOption.offerToken;
        }
        if ((i & 128) != 0) {
            str5 = googleSubscriptionOption.getPresentedOfferingIdentifier();
        }
        String str6 = str4;
        String str7 = str5;
        List list3 = list2;
        f fVar2 = fVar;
        return googleSubscriptionOption.copy(str, str2, str3, list, list3, fVar2, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getProductId() {
        return this.productId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getBasePlanId() {
        return this.basePlanId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOfferId() {
        return this.offerId;
    }

    public final List<PricingPhase> component4() {
        return getPricingPhases();
    }

    public final List<String> component5() {
        return getTags();
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final f getProductDetails() {
        return this.productDetails;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getOfferToken() {
        return this.offerToken;
    }

    public final String component8() {
        return getPresentedOfferingIdentifier();
    }

    public final GoogleSubscriptionOption copy(String productId, String basePlanId, String offerId, List<PricingPhase> pricingPhases, List<String> tags, f productDetails, String offerToken, String presentedOfferingIdentifier) {
        G10.g(productId, "productId");
        G10.g(basePlanId, "basePlanId");
        G10.g(pricingPhases, "pricingPhases");
        G10.g(tags, "tags");
        G10.g(productDetails, "productDetails");
        G10.g(offerToken, "offerToken");
        return new GoogleSubscriptionOption(productId, basePlanId, offerId, pricingPhases, tags, productDetails, offerToken, presentedOfferingIdentifier);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoogleSubscriptionOption)) {
            return false;
        }
        GoogleSubscriptionOption googleSubscriptionOption = (GoogleSubscriptionOption) other;
        return G10.c(this.productId, googleSubscriptionOption.productId) && G10.c(this.basePlanId, googleSubscriptionOption.basePlanId) && G10.c(this.offerId, googleSubscriptionOption.offerId) && G10.c(getPricingPhases(), googleSubscriptionOption.getPricingPhases()) && G10.c(getTags(), googleSubscriptionOption.getTags()) && G10.c(this.productDetails, googleSubscriptionOption.productDetails) && G10.c(this.offerToken, googleSubscriptionOption.offerToken) && G10.c(getPresentedOfferingIdentifier(), googleSubscriptionOption.getPresentedOfferingIdentifier());
    }

    public final String getBasePlanId() {
        return this.basePlanId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public Period getBillingPeriod() {
        return SubscriptionOption.DefaultImpls.getBillingPeriod(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFreePhase() {
        return SubscriptionOption.DefaultImpls.getFreePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getFullPricePhase() {
        return SubscriptionOption.DefaultImpls.getFullPricePhase(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getId() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.basePlanId);
        String str2 = this.offerId;
        if (str2 == null || BY0.O(str2)) {
            str = "";
        } else {
            str = ':' + this.offerId;
        }
        sb.append(str);
        return sb.toString();
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PricingPhase getIntroPhase() {
        return SubscriptionOption.DefaultImpls.getIntroPhase(this);
    }

    public final String getOfferId() {
        return this.offerId;
    }

    public final String getOfferToken() {
        return this.offerToken;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public String getPresentedOfferingIdentifier() {
        return this.presentedOfferingIdentifier;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<PricingPhase> getPricingPhases() {
        return this.pricingPhases;
    }

    public final f getProductDetails() {
        return this.productDetails;
    }

    public final String getProductId() {
        return this.productId;
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public PurchasingData getPurchasingData() {
        return new GooglePurchasingData.Subscription(this.productId, getId(), this.productDetails, this.offerToken);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public List<String> getTags() {
        return this.tags;
    }

    public int hashCode() {
        int iHashCode = ((this.productId.hashCode() * 31) + this.basePlanId.hashCode()) * 31;
        String str = this.offerId;
        return ((((((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + getPricingPhases().hashCode()) * 31) + getTags().hashCode()) * 31) + this.productDetails.hashCode()) * 31) + this.offerToken.hashCode()) * 31) + (getPresentedOfferingIdentifier() != null ? getPresentedOfferingIdentifier().hashCode() : 0);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isBasePlan() {
        return SubscriptionOption.DefaultImpls.isBasePlan(this);
    }

    @Override // com.revenuecat.purchases.models.SubscriptionOption
    public boolean isPrepaid() {
        return SubscriptionOption.DefaultImpls.isPrepaid(this);
    }

    public String toString() {
        return "GoogleSubscriptionOption(productId=" + this.productId + ", basePlanId=" + this.basePlanId + ", offerId=" + this.offerId + ", pricingPhases=" + getPricingPhases() + ", tags=" + getTags() + ", productDetails=" + this.productDetails + ", offerToken=" + this.offerToken + ", presentedOfferingIdentifier=" + getPresentedOfferingIdentifier() + ')';
    }

    public /* synthetic */ GoogleSubscriptionOption(String str, String str2, String str3, List list, List list2, f fVar, String str4, String str5, int i, AbstractC2911Yw abstractC2911Yw) {
        this(str, str2, str3, list, list2, fVar, str4, (i & 128) != 0 ? null : str5);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public GoogleSubscriptionOption(GoogleSubscriptionOption googleSubscriptionOption, String str) {
        this(googleSubscriptionOption.productId, googleSubscriptionOption.basePlanId, googleSubscriptionOption.offerId, googleSubscriptionOption.getPricingPhases(), googleSubscriptionOption.getTags(), googleSubscriptionOption.productDetails, googleSubscriptionOption.offerToken, str);
        G10.g(googleSubscriptionOption, "subscriptionOption");
    }
}
