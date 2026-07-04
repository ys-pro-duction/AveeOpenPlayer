package com.revenuecat.purchases.google;

import com.android.billingclient.api.c;
import com.daaw.G10;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.common.LogUtilsKt;
import com.revenuecat.purchases.common.ReplaceProductInfo;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/android/billingclient/api/c$a;", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "Lcom/daaw/G91;", "setUpgradeInfo", "(Lcom/android/billingclient/api/c$a;Lcom/revenuecat/purchases/common/ReplaceProductInfo;)V", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class BillingFlowParamsExtensionsKt {
    public static final void setUpgradeInfo(c.a aVar, ReplaceProductInfo replaceProductInfo) {
        G10.g(aVar, "<this>");
        G10.g(replaceProductInfo, "replaceProductInfo");
        c.C0042c.a aVarA = c.C0042c.a();
        aVarA.b(replaceProductInfo.getOldPurchase().getPurchaseToken());
        ReplacementMode replacementMode = replaceProductInfo.getReplacementMode();
        if (replacementMode != null) {
            GoogleReplacementMode googleReplacementMode = replacementMode instanceof GoogleReplacementMode ? (GoogleReplacementMode) replacementMode : null;
            if (googleReplacementMode == null) {
                LogUtilsKt.errorLog$default("Got non-Google replacement mode", null, 2, null);
            } else {
                aVarA.d(googleReplacementMode.getPlayBillingClientMode());
            }
        }
        G10.f(aVarA, "newBuilder().apply {\n   …        }\n        }\n    }");
        aVar.e(aVarA.a());
    }
}
