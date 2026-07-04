package com.revenuecat.purchases.google;

import com.daaw.G10;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/android/billingclient/api/d;", "", "toHumanReadableDescription", "(Lcom/android/billingclient/api/d;)Ljava/lang/String;", "", "isSuccessful", "(Lcom/android/billingclient/api/d;)Z", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BillingResultExtensionsKt {
    public static final boolean isSuccessful(com.android.billingclient.api.d dVar) {
        G10.g(dVar, "<this>");
        return dVar.b() == 0;
    }

    public static final String toHumanReadableDescription(com.android.billingclient.api.d dVar) {
        G10.g(dVar, "<this>");
        return "DebugMessage: " + dVar.a() + ". ErrorCode: " + ErrorsKt.getBillingResponseCodeName(dVar.b()) + '.';
    }
}
