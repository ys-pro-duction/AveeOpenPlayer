package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.android.billingclient.api.PurchaseHistoryRecord;
import com.daaw.G10;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.ReplacementMode;
import com.revenuecat.purchases.models.GoogleReplacementMode;
import com.revenuecat.purchases.models.PurchaseState;
import com.revenuecat.purchases.models.PurchaseType;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a8\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00012\u0006\u0010\r\u001a\u00020\u000eH\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0000\"\u001a\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0011"}, d2 = {"originalGooglePurchase", "Lcom/android/billingclient/api/Purchase;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "getOriginalGooglePurchase", "(Lcom/revenuecat/purchases/models/StoreTransaction;)Lcom/android/billingclient/api/Purchase;", "toStoreTransaction", "productType", "Lcom/revenuecat/purchases/ProductType;", "presentedOfferingIdentifier", "", "subscriptionOptionId", "replacementMode", "Lcom/revenuecat/purchases/models/GoogleReplacementMode;", "purchaseContext", "Lcom/revenuecat/purchases/google/PurchaseContext;", "Lcom/android/billingclient/api/PurchaseHistoryRecord;", "type", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StoreTransactionConversionsKt {
    public static final Purchase getOriginalGooglePurchase(StoreTransaction storeTransaction) {
        G10.g(storeTransaction, "<this>");
        String signature = storeTransaction.getSignature();
        if (signature == null) {
            return null;
        }
        if (storeTransaction.getPurchaseType() != PurchaseType.GOOGLE_PURCHASE) {
            signature = null;
        }
        if (signature != null) {
            return new Purchase(storeTransaction.getOriginalJson().toString(), signature);
        }
        return null;
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, ProductType productType, String str, String str2, GoogleReplacementMode googleReplacementMode) {
        G10.g(purchase, "<this>");
        G10.g(productType, "productType");
        String strA = purchase.a();
        List listC = purchase.c();
        G10.f(listC, "this.products");
        long jE = purchase.e();
        String strF = purchase.f();
        G10.f(strF, "this.purchaseToken");
        return new StoreTransaction(strA, (List<String>) listC, productType, jE, strF, PurchaseStateConversionsKt.toRevenueCatPurchaseState(purchase.d()), Boolean.valueOf(purchase.i()), purchase.g(), new JSONObject(purchase.b()), str, (String) null, PurchaseType.GOOGLE_PURCHASE, (String) null, str2, googleReplacementMode);
    }

    public static /* synthetic */ StoreTransaction toStoreTransaction$default(Purchase purchase, ProductType productType, String str, String str2, GoogleReplacementMode googleReplacementMode, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            googleReplacementMode = null;
        }
        return toStoreTransaction(purchase, productType, str, str2, googleReplacementMode);
    }

    public static final StoreTransaction toStoreTransaction(Purchase purchase, PurchaseContext purchaseContext) {
        G10.g(purchase, "<this>");
        G10.g(purchaseContext, "purchaseContext");
        return toStoreTransaction(purchase, purchaseContext.getProductType(), purchaseContext.getPresentedOfferingId(), purchaseContext.getSelectedSubscriptionOptionId(), purchaseContext.getReplacementMode());
    }

    public static final StoreTransaction toStoreTransaction(PurchaseHistoryRecord purchaseHistoryRecord, ProductType productType) {
        G10.g(purchaseHistoryRecord, "<this>");
        G10.g(productType, "type");
        List listB = purchaseHistoryRecord.b();
        G10.f(listB, "this.products");
        long jC = purchaseHistoryRecord.c();
        String strD = purchaseHistoryRecord.d();
        G10.f(strD, "this.purchaseToken");
        return new StoreTransaction((String) null, (List<String>) listB, productType, jC, strD, PurchaseState.UNSPECIFIED_STATE, (Boolean) null, purchaseHistoryRecord.e(), new JSONObject(purchaseHistoryRecord.a()), (String) null, (String) null, PurchaseType.GOOGLE_RESTORED_PURCHASE, (String) null, (String) null, (ReplacementMode) null);
    }
}
