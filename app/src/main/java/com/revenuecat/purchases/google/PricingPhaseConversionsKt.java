package com.revenuecat.purchases.google;

import com.android.billingclient.api.f;
import com.daaw.G10;
import com.revenuecat.purchases.models.Period;
import com.revenuecat.purchases.models.Price;
import com.revenuecat.purchases.models.PricingPhase;
import com.revenuecat.purchases.models.RecurrenceMode;
import com.revenuecat.purchases.models.RecurrenceModeKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/android/billingclient/api/f$c;", "Lcom/revenuecat/purchases/models/PricingPhase;", "toRevenueCatPricingPhase", "(Lcom/android/billingclient/api/f$c;)Lcom/revenuecat/purchases/models/PricingPhase;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PricingPhaseConversionsKt {
    public static final PricingPhase toRevenueCatPricingPhase(f.c cVar) {
        G10.g(cVar, "<this>");
        Period.Companion companion = Period.INSTANCE;
        String strB = cVar.b();
        G10.f(strB, "billingPeriod");
        Period periodCreate = companion.create(strB);
        RecurrenceMode recurrenceMode = RecurrenceModeKt.toRecurrenceMode(Integer.valueOf(cVar.f()));
        Integer numValueOf = Integer.valueOf(cVar.a());
        String strC = cVar.c();
        G10.f(strC, "formattedPrice");
        long jD = cVar.d();
        String strE = cVar.e();
        G10.f(strE, "priceCurrencyCode");
        return new PricingPhase(periodCreate, recurrenceMode, numValueOf, new Price(strC, jD, strE));
    }
}
