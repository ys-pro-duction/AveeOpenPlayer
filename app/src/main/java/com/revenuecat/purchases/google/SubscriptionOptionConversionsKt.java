package com.revenuecat.purchases.google;

import com.android.billingclient.api.f;
import com.daaw.AbstractC1703Nm;
import com.daaw.AbstractC2455Um;
import com.daaw.G10;
import com.revenuecat.purchases.models.GoogleSubscriptionOption;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\"\u001a\u0010\n\u001a\u0004\u0018\u00010\u0001*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t\"\u0018\u0010\f\u001a\u00020\u000b*\u00020\u00008@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/android/billingclient/api/f$e;", "", "productId", "Lcom/android/billingclient/api/f;", "productDetails", "Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "toSubscriptionOption", "(Lcom/android/billingclient/api/f$e;Ljava/lang/String;Lcom/android/billingclient/api/f;)Lcom/revenuecat/purchases/models/GoogleSubscriptionOption;", "getSubscriptionBillingPeriod", "(Lcom/android/billingclient/api/f$e;)Ljava/lang/String;", "subscriptionBillingPeriod", "", "isBasePlan", "(Lcom/android/billingclient/api/f$e;)Z", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class SubscriptionOptionConversionsKt {
    public static final String getSubscriptionBillingPeriod(f.e eVar) {
        G10.g(eVar, "<this>");
        List listA = eVar.e().a();
        G10.f(listA, "this.pricingPhases.pricingPhaseList");
        f.c cVar = (f.c) AbstractC2455Um.r0(listA);
        if (cVar != null) {
            return cVar.b();
        }
        return null;
    }

    public static final boolean isBasePlan(f.e eVar) {
        G10.g(eVar, "<this>");
        return eVar.e().a().size() == 1;
    }

    public static final GoogleSubscriptionOption toSubscriptionOption(f.e eVar, String str, com.android.billingclient.api.f fVar) {
        G10.g(eVar, "<this>");
        G10.g(str, "productId");
        G10.g(fVar, "productDetails");
        List listA = eVar.e().a();
        G10.f(listA, "pricingPhases.pricingPhaseList");
        List<f.c> list = listA;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(list, 10));
        for (f.c cVar : list) {
            G10.f(cVar, "it");
            arrayList.add(PricingPhaseConversionsKt.toRevenueCatPricingPhase(cVar));
        }
        String strA = eVar.a();
        G10.f(strA, "basePlanId");
        String strB = eVar.b();
        List listC = eVar.c();
        G10.f(listC, "offerTags");
        String strD = eVar.d();
        G10.f(strD, "offerToken");
        return new GoogleSubscriptionOption(str, strA, strB, arrayList, listC, fVar, strD, null, 128, null);
    }
}
