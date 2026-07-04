package com.revenuecat.purchases.google;

import com.android.billingclient.api.g;
import com.daaw.AbstractC1703Nm;
import com.daaw.C7015oC0;
import com.daaw.C7294pC0;
import com.daaw.G10;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\n\u001a\u00020\t*\u00020\u00002\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00000\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"", "Lcom/daaw/oC0;", "buildQueryPurchaseHistoryParams", "(Ljava/lang/String;)Lcom/daaw/oC0;", "Lcom/daaw/pC0;", "buildQueryPurchasesParams", "(Ljava/lang/String;)Lcom/daaw/pC0;", "", "productIds", "Lcom/android/billingclient/api/g;", "buildQueryProductDetailsParams", "(Ljava/lang/String;Ljava/util/Set;)Lcom/android/billingclient/api/g;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BillingClientParamBuildersKt {
    public static final com.android.billingclient.api.g buildQueryProductDetailsParams(String str, Set<String> set) {
        G10.g(str, "<this>");
        G10.g(set, "productIds");
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(AbstractC1703Nm.v(set2, 10));
        Iterator<T> it = set2.iterator();
        while (it.hasNext()) {
            arrayList.add(g.b.a().b((String) it.next()).c(str).a());
        }
        com.android.billingclient.api.g gVarA = com.android.billingclient.api.g.a().b(arrayList).a();
        G10.f(gVarA, "newBuilder()\n        .se…List(productList).build()");
        return gVarA;
    }

    public static final C7015oC0 buildQueryPurchaseHistoryParams(String str) {
        G10.g(str, "<this>");
        if (G10.c(str, "inapp") ? true : G10.c(str, "subs")) {
            return C7015oC0.a().b(str).a();
        }
        return null;
    }

    public static final C7294pC0 buildQueryPurchasesParams(String str) {
        G10.g(str, "<this>");
        if (G10.c(str, "inapp") ? true : G10.c(str, "subs")) {
            return C7294pC0.a().b(str).a();
        }
        return null;
    }
}
