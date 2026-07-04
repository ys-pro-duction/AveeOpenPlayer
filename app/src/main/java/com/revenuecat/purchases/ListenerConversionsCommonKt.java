package com.revenuecat.purchases;

import com.daaw.G10;
import com.daaw.InterfaceC3429bR;
import com.daaw.NQ;
import com.revenuecat.purchases.interfaces.GetStoreProductsCallback;
import com.revenuecat.purchases.interfaces.PurchaseCallback;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u001aC\u0010\t\u001a\u00020\b2\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a=\u0010\u0010\u001a\u00020\u000f2\u0018\u0010\u000e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000bH\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u0017\u001a\u00020\u00162\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000b2\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u000bH\u0000¢\u0006\u0004\b\u0017\u0010\u0018\u001a;\u0010\u001a\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b\u001a\u0010\u001b\u001aQ\u0010\u001e\u001a\u00020\u0003*\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aO\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010$\u001aY\u0010#\u001a\u00020\u0003*\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\f2\b\u0010&\u001a\u0004\u0018\u00010%2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0018\u0010\"\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b#\u0010'\u001a;\u0010(\u001a\u00020\u0003*\u00020\u00192\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\u0004\b(\u0010\u001b\"&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00030\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\",\u0010-\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100¨\u00061"}, d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/CustomerInfo;", "Lcom/daaw/G91;", "onSuccess", "Lcom/revenuecat/purchases/PurchasesError;", "", "onError", "Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "purchaseCompletedCallback", "(Lcom/daaw/bR;Lcom/daaw/bR;)Lcom/revenuecat/purchases/interfaces/PurchaseCallback;", "Lkotlin/Function1;", "", "Lcom/revenuecat/purchases/models/StoreProduct;", "onReceived", "Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "getStoreProductsCallback", "(Lcom/daaw/NQ;Lcom/daaw/NQ;)Lcom/revenuecat/purchases/interfaces/GetStoreProductsCallback;", "Lcom/revenuecat/purchases/Offerings;", "Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "receiveOfferingsCallback", "(Lcom/daaw/NQ;Lcom/daaw/NQ;)Lcom/revenuecat/purchases/interfaces/ReceiveOfferingsCallback;", "Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "receiveCustomerInfoCallback", "(Lcom/daaw/NQ;Lcom/daaw/NQ;)Lcom/revenuecat/purchases/interfaces/ReceiveCustomerInfoCallback;", "Lcom/revenuecat/purchases/Purchases;", "getOfferingsWith", "(Lcom/revenuecat/purchases/Purchases;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "purchaseWith", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lcom/daaw/bR;Lcom/daaw/bR;)V", "", "productIds", "onGetStoreProducts", "getProductsWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "Lcom/revenuecat/purchases/ProductType;", "type", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "restorePurchasesWith", "ON_ERROR_STUB", "Lcom/daaw/NQ;", "getON_ERROR_STUB", "()Lcom/daaw/NQ;", "ON_PURCHASE_ERROR_STUB", "Lcom/daaw/bR;", "getON_PURCHASE_ERROR_STUB", "()Lcom/daaw/bR;", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ListenerConversionsCommonKt {
    private static final NQ ON_ERROR_STUB = ListenerConversionsCommonKt$ON_ERROR_STUB$1.INSTANCE;
    private static final InterfaceC3429bR ON_PURCHASE_ERROR_STUB = ListenerConversionsCommonKt$ON_PURCHASE_ERROR_STUB$1.INSTANCE;

    public static final NQ getON_ERROR_STUB() {
        return ON_ERROR_STUB;
    }

    public static final InterfaceC3429bR getON_PURCHASE_ERROR_STUB() {
        return ON_PURCHASE_ERROR_STUB;
    }

    public static final void getOfferingsWith(Purchases purchases, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(nq, "onError");
        G10.g(nq2, "onSuccess");
        purchases.getOfferings(receiveOfferingsCallback(nq2, nq));
    }

    public static /* synthetic */ void getOfferingsWith$default(Purchases purchases, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 1) != 0) {
            nq = ON_ERROR_STUB;
        }
        getOfferingsWith(purchases, nq, nq2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> list, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(list, "productIds");
        G10.g(nq, "onError");
        G10.g(nq2, "onGetStoreProducts");
        purchases.getProducts(list, getStoreProductsCallback(nq2, nq));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 2) != 0) {
            nq = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, nq, nq2);
    }

    public static final GetStoreProductsCallback getStoreProductsCallback(final NQ nq, final NQ nq2) {
        G10.g(nq, "onReceived");
        G10.g(nq2, "onError");
        return new GetStoreProductsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.getStoreProductsCallback.1
            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onError(PurchasesError error) {
                G10.g(error, "error");
                nq2.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.GetStoreProductsCallback
            public void onReceived(List<? extends StoreProduct> storeProducts) {
                G10.g(storeProducts, "storeProducts");
                nq.invoke(storeProducts);
            }
        };
    }

    public static final PurchaseCallback purchaseCompletedCallback(final InterfaceC3429bR interfaceC3429bR, final InterfaceC3429bR interfaceC3429bR2) {
        G10.g(interfaceC3429bR, "onSuccess");
        G10.g(interfaceC3429bR2, "onError");
        return new PurchaseCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.purchaseCompletedCallback.1
            @Override // com.revenuecat.purchases.interfaces.PurchaseCallback
            public void onCompleted(StoreTransaction storeTransaction, CustomerInfo customerInfo) {
                G10.g(storeTransaction, "storeTransaction");
                G10.g(customerInfo, "customerInfo");
                interfaceC3429bR.invoke(storeTransaction, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError error, boolean userCancelled) {
                G10.g(error, "error");
                interfaceC3429bR2.invoke(error, Boolean.valueOf(userCancelled));
            }
        };
    }

    public static final void purchaseWith(Purchases purchases, PurchaseParams purchaseParams, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2) {
        G10.g(purchases, "<this>");
        G10.g(purchaseParams, "purchaseParams");
        G10.g(interfaceC3429bR, "onError");
        G10.g(interfaceC3429bR2, "onSuccess");
        purchases.purchase(purchaseParams, purchaseCompletedCallback(interfaceC3429bR2, interfaceC3429bR));
    }

    public static /* synthetic */ void purchaseWith$default(Purchases purchases, PurchaseParams purchaseParams, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2, int i, Object obj) {
        if ((i & 2) != 0) {
            interfaceC3429bR = ON_PURCHASE_ERROR_STUB;
        }
        purchaseWith(purchases, purchaseParams, interfaceC3429bR, interfaceC3429bR2);
    }

    public static final ReceiveCustomerInfoCallback receiveCustomerInfoCallback(final NQ nq, final NQ nq2) {
        G10.g(nq, "onSuccess");
        G10.g(nq2, "onError");
        return new ReceiveCustomerInfoCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveCustomerInfoCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onError(PurchasesError error) {
                G10.g(error, "error");
                NQ nq3 = nq2;
                if (nq3 != null) {
                }
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback
            public void onReceived(CustomerInfo customerInfo) {
                G10.g(customerInfo, "customerInfo");
                NQ nq3 = nq;
                if (nq3 != null) {
                }
            }
        };
    }

    public static final ReceiveOfferingsCallback receiveOfferingsCallback(final NQ nq, final NQ nq2) {
        G10.g(nq, "onSuccess");
        G10.g(nq2, "onError");
        return new ReceiveOfferingsCallback() { // from class: com.revenuecat.purchases.ListenerConversionsCommonKt.receiveOfferingsCallback.1
            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onError(PurchasesError error) {
                G10.g(error, "error");
                nq2.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.ReceiveOfferingsCallback
            public void onReceived(Offerings offerings) {
                G10.g(offerings, "offerings");
                nq.invoke(offerings);
            }
        };
    }

    public static final void restorePurchasesWith(Purchases purchases, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(nq, "onError");
        G10.g(nq2, "onSuccess");
        purchases.restorePurchases(receiveCustomerInfoCallback(nq2, nq));
    }

    public static /* synthetic */ void restorePurchasesWith$default(Purchases purchases, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 1) != 0) {
            nq = ON_ERROR_STUB;
        }
        restorePurchasesWith(purchases, nq, nq2);
    }

    public static final void getProductsWith(Purchases purchases, List<String> list, ProductType productType, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(list, "productIds");
        G10.g(nq, "onError");
        G10.g(nq2, "onGetStoreProducts");
        purchases.getProducts(list, productType, getStoreProductsCallback(nq2, nq));
    }

    public static /* synthetic */ void getProductsWith$default(Purchases purchases, List list, ProductType productType, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 4) != 0) {
            nq = ON_ERROR_STUB;
        }
        getProductsWith(purchases, list, productType, nq, nq2);
    }
}
