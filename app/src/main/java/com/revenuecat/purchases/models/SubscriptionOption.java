package com.revenuecat.purchases.models;

import com.daaw.AbstractC2455Um;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001R\u0016\u0010\u0002\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u0004\u0018\u00010\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u000fR\u0018\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00070\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0012\u0010\u001c\u001a\u00020\u001dX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010 \u001a\b\u0012\u0004\u0012\u00020\r0\u0019X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u001b¨\u0006\""}, d2 = {"Lcom/revenuecat/purchases/models/SubscriptionOption;", "", "billingPeriod", "Lcom/revenuecat/purchases/models/Period;", "getBillingPeriod", "()Lcom/revenuecat/purchases/models/Period;", "freePhase", "Lcom/revenuecat/purchases/models/PricingPhase;", "getFreePhase", "()Lcom/revenuecat/purchases/models/PricingPhase;", "fullPricePhase", "getFullPricePhase", "id", "", "getId", "()Ljava/lang/String;", "introPhase", "getIntroPhase", "isBasePlan", "", "()Z", "isPrepaid", "presentedOfferingIdentifier", "getPresentedOfferingIdentifier", "pricingPhases", "", "getPricingPhases", "()Ljava/util/List;", "purchasingData", "Lcom/revenuecat/purchases/models/PurchasingData;", "getPurchasingData", "()Lcom/revenuecat/purchases/models/PurchasingData;", "tags", "getTags", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface SubscriptionOption {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static Period getBillingPeriod(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            if (fullPricePhase != null) {
                return fullPricePhase.getBillingPeriod();
            }
            return null;
        }

        public static PricingPhase getFreePhase(SubscriptionOption subscriptionOption) {
            Object next;
            Iterator it = AbstractC2455Um.Z(subscriptionOption.getPricingPhases(), 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PricingPhase) next).getPrice().getAmountMicros() == 0) {
                    break;
                }
            }
            return (PricingPhase) next;
        }

        public static PricingPhase getFullPricePhase(SubscriptionOption subscriptionOption) {
            return (PricingPhase) AbstractC2455Um.r0(subscriptionOption.getPricingPhases());
        }

        public static PricingPhase getIntroPhase(SubscriptionOption subscriptionOption) {
            Object next;
            Iterator it = AbstractC2455Um.Z(subscriptionOption.getPricingPhases(), 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (((PricingPhase) next).getPrice().getAmountMicros() > 0) {
                    break;
                }
            }
            return (PricingPhase) next;
        }

        public static boolean isBasePlan(SubscriptionOption subscriptionOption) {
            return subscriptionOption.getPricingPhases().size() == 1;
        }

        public static boolean isPrepaid(SubscriptionOption subscriptionOption) {
            PricingPhase fullPricePhase = subscriptionOption.getFullPricePhase();
            return (fullPricePhase != null ? fullPricePhase.getRecurrenceMode() : null) == RecurrenceMode.NON_RECURRING;
        }
    }

    Period getBillingPeriod();

    PricingPhase getFreePhase();

    PricingPhase getFullPricePhase();

    String getId();

    PricingPhase getIntroPhase();

    String getPresentedOfferingIdentifier();

    List<PricingPhase> getPricingPhases();

    PurchasingData getPurchasingData();

    List<String> getTags();

    boolean isBasePlan();

    boolean isPrepaid();
}
