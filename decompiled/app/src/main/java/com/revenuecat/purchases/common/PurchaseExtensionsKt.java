package com.revenuecat.purchases.common;

import com.android.billingclient.api.Purchase;
import com.daaw.AbstractC2455Um;
import com.daaw.G10;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\f\u0010\u0005\u001a\u00020\u0001*\u00020\u0002H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"firstProductId", "", "Lcom/android/billingclient/api/Purchase;", "getFirstProductId", "(Lcom/android/billingclient/api/Purchase;)Ljava/lang/String;", "toHumanReadableDescription", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class PurchaseExtensionsKt {
    public static final String getFirstProductId(Purchase purchase) {
        G10.g(purchase, "<this>");
        Object obj = purchase.c().get(0);
        String str = (String) obj;
        if (purchase.c().size() > 1) {
            LogWrapperKt.log(LogIntent.GOOGLE_WARNING, "There's more than one sku in the PurchaseHistoryRecord, but only one will be used.");
        }
        G10.f(obj, "products[0].also {\n     …_ONE_SKU)\n        }\n    }");
        return str;
    }

    public static final String toHumanReadableDescription(Purchase purchase) {
        G10.g(purchase, "<this>");
        StringBuilder sb = new StringBuilder();
        sb.append("productIds: ");
        List listC = purchase.c();
        G10.f(listC, "this.products");
        sb.append(AbstractC2455Um.n0(listC, null, "[", "]", 0, null, null, 57, null));
        sb.append(", orderId: ");
        sb.append(purchase.a());
        sb.append(", purchaseToken: ");
        sb.append(purchase.f());
        return sb.toString();
    }
}
