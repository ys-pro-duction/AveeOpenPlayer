package com.revenuecat.purchases.amazon;

import com.daaw.G10;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u001a\u0010\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0000¨\u0006\u0006"}, d2 = {"errorGettingReceiptInfo", "Lcom/revenuecat/purchases/PurchasesError;", "error", "missingTermSkuError", "response", "Lorg/json/JSONObject;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ErrorsKt {
    public static final PurchasesError errorGettingReceiptInfo(PurchasesError purchasesError) {
        G10.g(purchasesError, "error");
        return new PurchasesError(PurchasesErrorCode.InvalidReceiptError, "Couldn't get Amazon receipt data from RevenueCat backend. Error: " + purchasesError);
    }

    public static final PurchasesError missingTermSkuError(JSONObject jSONObject) {
        G10.g(jSONObject, "response");
        return new PurchasesError(PurchasesErrorCode.UnexpectedBackendResponseError, "Amazon receipt data response is missing termSku. Response:\n" + jSONObject);
    }
}
