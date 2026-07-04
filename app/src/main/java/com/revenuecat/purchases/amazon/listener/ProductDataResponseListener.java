package com.revenuecat.purchases.amazon.listener;

import com.amazon.device.iap.PurchasingListener;
import com.amazon.device.iap.model.PurchaseResponse;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.UserDataResponse;
import com.daaw.G10;
import com.daaw.NQ;
import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJS\u0010\u0017\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u000e2\u0018\u0010\u0014\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\u0004\u0012\u00020\u00040\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u0011H&¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lcom/revenuecat/purchases/amazon/listener/ProductDataResponseListener;", "Lcom/amazon/device/iap/PurchasingListener;", "Lcom/amazon/device/iap/model/UserDataResponse;", "response", "Lcom/daaw/G91;", "onUserDataResponse", "(Lcom/amazon/device/iap/model/UserDataResponse;)V", "Lcom/amazon/device/iap/model/PurchaseResponse;", "onPurchaseResponse", "(Lcom/amazon/device/iap/model/PurchaseResponse;)V", "Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;", "onPurchaseUpdatesResponse", "(Lcom/amazon/device/iap/model/PurchaseUpdatesResponse;)V", "", "", "skus", "marketplace", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "onReceive", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "getProductData", "(Ljava/util/Set;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public interface ProductDataResponseListener extends PurchasingListener {

    @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class DefaultImpls {
        public static void onPurchaseResponse(ProductDataResponseListener productDataResponseListener, PurchaseResponse purchaseResponse) {
            G10.g(purchaseResponse, "response");
        }

        public static void onPurchaseUpdatesResponse(ProductDataResponseListener productDataResponseListener, PurchaseUpdatesResponse purchaseUpdatesResponse) {
            G10.g(purchaseUpdatesResponse, "response");
        }

        public static void onUserDataResponse(ProductDataResponseListener productDataResponseListener, UserDataResponse userDataResponse) {
            G10.g(userDataResponse, "response");
        }
    }

    void getProductData(Set<String> skus, String marketplace, NQ onReceive, NQ onError);

    void onPurchaseResponse(PurchaseResponse response);

    void onPurchaseUpdatesResponse(PurchaseUpdatesResponse response);

    void onUserDataResponse(UserDataResponse response);
}
