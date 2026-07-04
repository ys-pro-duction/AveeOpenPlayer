package com.revenuecat.purchases.amazon.listener;

import android.app.Activity;
import android.os.Handler;
import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.ProductDataResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;
import com.daaw.G10;
import com.daaw.InterfaceC3429bR;
import com.daaw.NQ;
import com.revenuecat.purchases.models.StoreProduct;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJg\u0010\u001d\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00112\u0018\u0010\u0019\u001a\u0014\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00040\u00162\u0012\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00040\u001aH&¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lcom/revenuecat/purchases/amazon/listener/PurchaseResponseListener;", "Lcom/amazon/device/iap/PurchasingListener;", "Lcom/amazon/device/iap/model/UserDataResponse;", "response", "Lcom/daaw/G91;", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/ProductDataResponse;", "onProductDataResponse", "(Lcom/amazon/device/iap/model/ProductDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "Landroid/os/Handler;", "mainHandler", "Landroid/app/Activity;", "activity", "", "appUserID", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "presentedOfferingIdentifier", "Lkotlin/Function2;", "Lcom/amazon/device/iap/model/Receipt;", "Lcom/amazon/device/iap/model/UserData;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "purchase", "(Landroid/os/Handler;Landroid/app/Activity;Ljava/lang/String;Lcom/revenuecat/purchases/models/StoreProduct;Ljava/lang/String;Lcom/daaw/bR;Lcom/daaw/NQ;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface PurchaseResponseListener extends PurchasingListener {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onProductDataResponse(PurchaseResponseListener purchaseResponseListener, ProductDataResponse productDataResponse) {
            G10.g(productDataResponse, "response");
        }

        public static void onPurchaseUpdatesResponse(PurchaseResponseListener purchaseResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            G10.g(purchaseUpdatesResponse, "response");
        }

        public static void onUserDataResponse(PurchaseResponseListener purchaseResponseListener, UserDataResponse userDataResponse) {
            G10.g(userDataResponse, "response");
        }
    }

    void onProductDataResponse(ProductDataResponse response);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response);

    void onUserDataResponse(UserDataResponse response);

    void purchase(Handler mainHandler, Activity activity, String appUserID, StoreProduct storeProduct, String presentedOfferingIdentifier, InterfaceC3429bR onSuccess, NQ onError);
}
