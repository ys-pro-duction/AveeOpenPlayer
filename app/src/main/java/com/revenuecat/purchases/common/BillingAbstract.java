package com.revenuecat.purchases.common;

import android.app.Activity;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.LQ;
import com.daaw.NQ;
import com.revenuecat.purchases.ProductType;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import com.revenuecat.purchases.models.InAppMessageType;
import com.revenuecat.purchases.models.PurchasingData;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\n\b \u0018\u00002\u00020\u0001:\u0002TUB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H&¢\u0006\u0004\b\t\u0010\u0003J\u000f\u0010\n\u001a\u00020\u0006H$¢\u0006\u0004\b\n\u0010\u0003J\r\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\u0003JI\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0018\u0010\u0011\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u00060\u000e2\u0016\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000ej\u0002`\u0013H&¢\u0006\u0004\b\u0015\u0010\u0016J[\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\f0\u00192\u001c\u0010\u001d\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u000f\u0012\u0004\u0012\u00020\u00060\u000ej\u0002`\u001c2\u0016\u0010\u001e\u001a\u0012\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000ej\u0002`\u0013H&¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010$\u001a\u00020\u00062\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0010H&¢\u0006\u0004\b$\u0010%JO\u0010(\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\f2\u0012\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000eH&¢\u0006\u0004\b(\u0010)JG\u00102\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010-\u001a\u00020,2\b\u0010/\u001a\u0004\u0018\u00010.2\b\u00100\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00101\u001a\u0004\u0018\u00010!H&¢\u0006\u0004\b2\u00103J\u000f\u00104\u001a\u00020!H&¢\u0006\u0004\b4\u00105JK\u00108\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\f2\u001e\u00107\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u001006\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000eH&¢\u0006\u0004\b8\u0010\u0016JO\u0010<\u001a\u00020\u00062\u0006\u00109\u001a\u00020\f2\u0006\u0010:\u001a\u00020\f2\u0006\u0010;\u001a\u00020\f2\u0012\u00107\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00060\u000e2\u0012\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00060\u000eH\u0016¢\u0006\u0004\b<\u0010=J3\u0010B\u001a\u00020\u00062\u0006\u0010+\u001a\u00020*2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0\u000f2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00060@H&¢\u0006\u0004\bB\u0010CR.\u0010F\u001a\u0004\u0018\u00010D2\b\u0010E\u001a\u0004\u0018\u00010D8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR.\u0010N\u001a\u0004\u0018\u00010L2\b\u0010M\u001a\u0004\u0018\u00010L8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010O\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010S¨\u0006V"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract;", "", "<init>", "()V", "", "delayMilliseconds", "Lcom/daaw/G91;", "startConnectionOnMainThread", "(J)V", "startConnection", "endConnection", "close", "", "appUserID", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "onReceivePurchaseHistory", "Lcom/revenuecat/purchases/PurchasesError;", "Lcom/revenuecat/purchases/PurchasesErrorCallback;", "onReceivePurchaseHistoryError", "queryAllPurchases", "(Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/ProductType;", "productType", "", "productIds", "Lcom/revenuecat/purchases/models/StoreProduct;", "Lcom/revenuecat/purchases/common/StoreProductsCallback;", "onReceive", "onError", "queryProductDetailsAsync", "(Lcom/revenuecat/purchases/ProductType;Ljava/util/Set;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "", "shouldTryToConsume", "purchase", "consumeAndSave", "(ZLcom/revenuecat/purchases/models/StoreTransaction;)V", ProxyAmazonBillingActivity.EXTRAS_SKU, "onCompletion", "findPurchaseInPurchaseHistory", "(Ljava/lang/String;Lcom/revenuecat/purchases/ProductType;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/PurchasingData;", "purchasingData", "Lcom/revenuecat/purchases/common/ReplaceProductInfo;", "replaceProductInfo", "presentedOfferingIdentifier", "isPersonalizedPrice", "makePurchaseAsync", "(Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/PurchasingData;Lcom/revenuecat/purchases/common/ReplaceProductInfo;Ljava/lang/String;Ljava/lang/Boolean;)V", "isConnected", "()Z", "", "onSuccess", "queryPurchases", "productID", "purchaseToken", "storeUserID", "normalizePurchaseData", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/models/InAppMessageType;", "inAppMessageTypes", "Lkotlin/Function0;", "subscriptionStatusChange", "showInAppMessagesIfNeeded", "(Landroid/app/Activity;Ljava/util/List;Lcom/daaw/LQ;)V", "Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "<set-?>", "stateListener", "Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "getStateListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "setStateListener", "(Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;)V", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "value", "purchasesUpdatedListener", "Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "getPurchasesUpdatedListener", "()Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "setPurchasesUpdatedListener", "(Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;)V", "PurchasesUpdatedListener", "StateListener", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public abstract class BillingAbstract {
    private volatile PurchasesUpdatedListener purchasesUpdatedListener;
    private volatile StateListener stateListener;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract$PurchasesUpdatedListener;", "", "", "Lcom/revenuecat/purchases/models/StoreTransaction;", "purchases", "Lcom/daaw/G91;", "onPurchasesUpdated", "(Ljava/util/List;)V", "Lcom/revenuecat/purchases/PurchasesError;", "purchasesError", "onPurchasesFailedToUpdate", "(Lcom/revenuecat/purchases/PurchasesError;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface PurchasesUpdatedListener {
        void onPurchasesFailedToUpdate(PurchasesError purchasesError);

        void onPurchasesUpdated(List<StoreTransaction> purchases);
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/BillingAbstract$StateListener;", "", "Lcom/daaw/G91;", "onConnected", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public interface StateListener {
        void onConnected();
    }

    public static /* synthetic */ void makePurchaseAsync$default(BillingAbstract billingAbstract, Activity activity, String str, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String str2, Boolean bool, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makePurchaseAsync");
        }
        if ((i & 32) != 0) {
            bool = null;
        }
        billingAbstract.makePurchaseAsync(activity, str, purchasingData, replaceProductInfo, str2, bool);
    }

    public static /* synthetic */ void startConnectionOnMainThread$default(BillingAbstract billingAbstract, long j, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: startConnectionOnMainThread");
        }
        if ((i & 1) != 0) {
            j = 0;
        }
        billingAbstract.startConnectionOnMainThread(j);
    }

    public final void close() {
        setPurchasesUpdatedListener(null);
        endConnection();
    }

    public abstract void consumeAndSave(boolean shouldTryToConsume, StoreTransaction purchase);

    public abstract void endConnection();

    public abstract void findPurchaseInPurchaseHistory(String appUserID, ProductType productType, String sku, NQ onCompletion, NQ onError);

    public final synchronized PurchasesUpdatedListener getPurchasesUpdatedListener() {
        return this.purchasesUpdatedListener;
    }

    public final synchronized StateListener getStateListener() {
        return this.stateListener;
    }

    public abstract boolean isConnected();

    public abstract void makePurchaseAsync(Activity activity, String appUserID, PurchasingData purchasingData, ReplaceProductInfo replaceProductInfo, String presentedOfferingIdentifier, Boolean isPersonalizedPrice);

    public void normalizePurchaseData(String productID, String purchaseToken, String storeUserID, NQ onSuccess, NQ onError) {
        G10.g(productID, "productID");
        G10.g(purchaseToken, "purchaseToken");
        G10.g(storeUserID, "storeUserID");
        G10.g(onSuccess, "onSuccess");
        G10.g(onError, "onError");
        onSuccess.invoke(productID);
    }

    public abstract void queryAllPurchases(String appUserID, NQ onReceivePurchaseHistory, NQ onReceivePurchaseHistoryError);

    public abstract void queryProductDetailsAsync(ProductType productType, Set<String> productIds, NQ onReceive, NQ onError);

    public abstract void queryPurchases(String appUserID, NQ onSuccess, NQ onError);

    public final void setPurchasesUpdatedListener(PurchasesUpdatedListener purchasesUpdatedListener) {
        synchronized (this) {
            this.purchasesUpdatedListener = purchasesUpdatedListener;
            G91 g91 = G91.a;
        }
        if (purchasesUpdatedListener != null) {
            startConnectionOnMainThread$default(this, 0L, 1, null);
        } else {
            endConnection();
        }
    }

    public final synchronized void setStateListener(StateListener stateListener) {
        this.stateListener = stateListener;
    }

    public abstract void showInAppMessagesIfNeeded(Activity activity, List<? extends InAppMessageType> inAppMessageTypes, LQ subscriptionStatusChange);

    public abstract void startConnection();

    public abstract void startConnectionOnMainThread(long delayMilliseconds);
}
