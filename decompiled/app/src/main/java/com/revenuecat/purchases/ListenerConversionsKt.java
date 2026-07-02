package com.revenuecat.purchases;

import android.app.Activity;
import com.daaw.G10;
import com.daaw.InterfaceC3429bR;
import com.daaw.NQ;
import com.revenuecat.purchases.interfaces.LogInCallback;
import com.revenuecat.purchases.interfaces.ProductChangeCallback;
import com.revenuecat.purchases.interfaces.SyncPurchasesCallback;
import com.revenuecat.purchases.models.StoreProduct;
import com.revenuecat.purchases.models.StoreTransaction;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0006\u001aA\u0010\t\u001a\u00020\b2\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00002\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001aE\u0010\r\u001a\u00020\f2\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a7\u0010\u0010\u001a\u00020\u000f2\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001aY\u0010\u0017\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001ac\u0010\u0017\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\u00192\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u001b\u001ac\u0010\u001e\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u001a\u0010\u0004\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001aY\u0010\u001e\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\u001a\b\u0002\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00002\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0000H\u0007¢\u0006\u0004\b\u001e\u0010 \u001aI\u0010#\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\"\u001a\u00020!2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0000¢\u0006\u0004\b#\u0010$\u001a;\u0010%\u001a\u00020\u0003*\u00020\u00122\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b%\u0010&\u001a;\u0010'\u001a\u00020\u0003*\u00020\u00122\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b'\u0010&\u001aC\u0010'\u001a\u00020\u0003*\u00020\u00122\u0006\u0010)\u001a\u00020(2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b'\u0010*\u001a;\u0010+\u001a\u00020\u0003*\u00020\u00122\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b+\u0010&\u001aQ\u0010/\u001a\u00020\u0003*\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020!0,2\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150,\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b/\u00100\u001aO\u00101\u001a\u00020\u0003*\u00020\u00122\f\u0010-\u001a\b\u0012\u0004\u0012\u00020!0,2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u00052\u0018\u0010.\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150,\u0012\u0004\u0012\u00020\u00030\u0005H\u0007¢\u0006\u0004\b1\u00100¨\u00062"}, d2 = {"Lkotlin/Function2;", "Lcom/revenuecat/purchases/CustomerInfo;", "", "Lcom/daaw/G91;", "onSuccess", "Lkotlin/Function1;", "Lcom/revenuecat/purchases/PurchasesError;", "onError", "Lcom/revenuecat/purchases/interfaces/LogInCallback;", "logInSuccessListener", "(Lcom/daaw/bR;Lcom/daaw/NQ;)Lcom/revenuecat/purchases/interfaces/LogInCallback;", "Lcom/revenuecat/purchases/models/StoreTransaction;", "Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "productChangeCompletedListener", "(Lcom/daaw/bR;Lcom/daaw/bR;)Lcom/revenuecat/purchases/interfaces/ProductChangeCallback;", "Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "syncPurchasesListener", "(Lcom/daaw/NQ;Lcom/daaw/NQ;)Lcom/revenuecat/purchases/interfaces/SyncPurchasesCallback;", "Lcom/revenuecat/purchases/Purchases;", "Landroid/app/Activity;", "activity", "Lcom/revenuecat/purchases/models/StoreProduct;", "storeProduct", "purchaseProductWith", "(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/daaw/bR;Lcom/daaw/bR;)V", "Lcom/revenuecat/purchases/UpgradeInfo;", "upgradeInfo", "(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Lcom/revenuecat/purchases/models/StoreProduct;Lcom/revenuecat/purchases/UpgradeInfo;Lcom/daaw/bR;Lcom/daaw/bR;)V", "Lcom/revenuecat/purchases/Package;", "packageToPurchase", "purchasePackageWith", "(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/revenuecat/purchases/UpgradeInfo;Lcom/daaw/bR;Lcom/daaw/bR;)V", "(Lcom/revenuecat/purchases/Purchases;Landroid/app/Activity;Lcom/revenuecat/purchases/Package;Lcom/daaw/bR;Lcom/daaw/bR;)V", "", "appUserID", "logInWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lcom/daaw/NQ;Lcom/daaw/bR;)V", "logOutWith", "(Lcom/revenuecat/purchases/Purchases;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "getCustomerInfoWith", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "syncPurchasesWith", "", "skus", "onReceiveSkus", "getSubscriptionSkusWith", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/daaw/NQ;Lcom/daaw/NQ;)V", "getNonSubscriptionSkusWith", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class ListenerConversionsKt {
    public static final void getCustomerInfoWith(Purchases purchases, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(nq, "onError");
        G10.g(nq2, "onSuccess");
        purchases.getCustomerInfo(ListenerConversionsCommonKt.receiveCustomerInfoCallback(nq2, nq));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 1) != 0) {
            nq = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, nq, nq2);
    }

    public static final void getNonSubscriptionSkusWith(Purchases purchases, List<String> list, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(list, "skus");
        G10.g(nq, "onError");
        G10.g(nq2, "onReceiveSkus");
        purchases.getProducts(list, ProductType.INAPP, ListenerConversionsCommonKt.getStoreProductsCallback(nq2, nq));
    }

    public static final void getSubscriptionSkusWith(Purchases purchases, List<String> list, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(list, "skus");
        G10.g(nq, "onError");
        G10.g(nq2, "onReceiveSkus");
        purchases.getProducts(list, ProductType.SUBS, ListenerConversionsCommonKt.getStoreProductsCallback(nq2, nq));
    }

    public static /* synthetic */ void getSubscriptionSkusWith$default(Purchases purchases, List list, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 2) != 0) {
            nq = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getSubscriptionSkusWith(purchases, list, nq, nq2);
    }

    public static final LogInCallback logInSuccessListener(final InterfaceC3429bR interfaceC3429bR, final NQ nq) {
        G10.g(interfaceC3429bR, "onSuccess");
        G10.g(nq, "onError");
        return new LogInCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.logInSuccessListener.1
            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onError(PurchasesError error) {
                G10.g(error, "error");
                NQ nq2 = nq;
                if (nq2 != null) {
                }
            }

            @Override // com.revenuecat.purchases.interfaces.LogInCallback
            public void onReceived(CustomerInfo customerInfo, boolean created) {
                G10.g(customerInfo, "customerInfo");
                InterfaceC3429bR interfaceC3429bR2 = interfaceC3429bR;
                if (interfaceC3429bR2 != null) {
                }
            }
        };
    }

    public static final void logInWith(Purchases purchases, String str, NQ nq, InterfaceC3429bR interfaceC3429bR) {
        G10.g(purchases, "<this>");
        G10.g(str, "appUserID");
        G10.g(nq, "onError");
        G10.g(interfaceC3429bR, "onSuccess");
        purchases.logIn(str, logInSuccessListener(interfaceC3429bR, nq));
    }

    public static /* synthetic */ void logInWith$default(Purchases purchases, String str, NQ nq, InterfaceC3429bR interfaceC3429bR, int i, Object obj) {
        if ((i & 2) != 0) {
            nq = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logInWith(purchases, str, nq, interfaceC3429bR);
    }

    public static final void logOutWith(Purchases purchases, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(nq, "onError");
        G10.g(nq2, "onSuccess");
        purchases.logOut(ListenerConversionsCommonKt.receiveCustomerInfoCallback(nq2, nq));
    }

    public static /* synthetic */ void logOutWith$default(Purchases purchases, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 1) != 0) {
            nq = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        logOutWith(purchases, nq, nq2);
    }

    public static final ProductChangeCallback productChangeCompletedListener(final InterfaceC3429bR interfaceC3429bR, final InterfaceC3429bR interfaceC3429bR2) {
        G10.g(interfaceC3429bR, "onSuccess");
        G10.g(interfaceC3429bR2, "onError");
        return new ProductChangeCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.productChangeCompletedListener.1
            @Override // com.revenuecat.purchases.interfaces.ProductChangeCallback
            public void onCompleted(StoreTransaction purchase, CustomerInfo customerInfo) {
                G10.g(customerInfo, "customerInfo");
                interfaceC3429bR.invoke(purchase, customerInfo);
            }

            @Override // com.revenuecat.purchases.interfaces.PurchaseErrorCallback
            public void onError(PurchasesError error, boolean userCancelled) {
                G10.g(error, "error");
                interfaceC3429bR2.invoke(error, Boolean.valueOf(userCancelled));
            }
        };
    }

    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package r3, UpgradeInfo upgradeInfo, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2) {
        G10.g(purchases, "<this>");
        G10.g(activity, "activity");
        G10.g(r3, "packageToPurchase");
        G10.g(upgradeInfo, "upgradeInfo");
        G10.g(interfaceC3429bR, "onError");
        G10.g(interfaceC3429bR2, "onSuccess");
        purchases.purchasePackage(activity, r3, upgradeInfo, productChangeCompletedListener(interfaceC3429bR2, interfaceC3429bR));
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r8, UpgradeInfo upgradeInfo, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2, int i, Object obj) {
        if ((i & 8) != 0) {
            interfaceC3429bR = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, r8, upgradeInfo, interfaceC3429bR, interfaceC3429bR2);
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2) {
        G10.g(purchases, "<this>");
        G10.g(activity, "activity");
        G10.g(storeProduct, "storeProduct");
        G10.g(interfaceC3429bR, "onError");
        G10.g(interfaceC3429bR2, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, ListenerConversionsCommonKt.purchaseCompletedCallback(interfaceC3429bR2, interfaceC3429bR));
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC3429bR = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, interfaceC3429bR, interfaceC3429bR2);
    }

    public static final SyncPurchasesCallback syncPurchasesListener(final NQ nq, final NQ nq2) {
        G10.g(nq, "onSuccess");
        G10.g(nq2, "onError");
        return new SyncPurchasesCallback() { // from class: com.revenuecat.purchases.ListenerConversionsKt.syncPurchasesListener.1
            @Override // com.revenuecat.purchases.interfaces.SyncPurchasesCallback
            public void onError(PurchasesError error) {
                G10.g(error, "error");
                nq2.invoke(error);
            }

            @Override // com.revenuecat.purchases.interfaces.SyncPurchasesCallback
            public void onSuccess(CustomerInfo customerInfo) {
                G10.g(customerInfo, "customerInfo");
                nq.invoke(customerInfo);
            }
        };
    }

    public static final void syncPurchasesWith(Purchases purchases, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(nq, "onError");
        G10.g(nq2, "onSuccess");
        purchases.syncPurchases(syncPurchasesListener(nq2, nq));
    }

    public static /* synthetic */ void syncPurchasesWith$default(Purchases purchases, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 1) != 0) {
            nq = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        syncPurchasesWith(purchases, nq, nq2);
    }

    public static final void getCustomerInfoWith(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, NQ nq, NQ nq2) {
        G10.g(purchases, "<this>");
        G10.g(cacheFetchPolicy, "fetchPolicy");
        G10.g(nq, "onError");
        G10.g(nq2, "onSuccess");
        purchases.getCustomerInfo(cacheFetchPolicy, ListenerConversionsCommonKt.receiveCustomerInfoCallback(nq2, nq));
    }

    public static final void purchasePackageWith(Purchases purchases, Activity activity, Package r3, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2) {
        G10.g(purchases, "<this>");
        G10.g(activity, "activity");
        G10.g(r3, "packageToPurchase");
        G10.g(interfaceC3429bR, "onError");
        G10.g(interfaceC3429bR2, "onSuccess");
        purchases.purchasePackage(activity, r3, ListenerConversionsCommonKt.purchaseCompletedCallback(interfaceC3429bR2, interfaceC3429bR));
    }

    public static final void purchaseProductWith(Purchases purchases, Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2) {
        G10.g(purchases, "<this>");
        G10.g(activity, "activity");
        G10.g(storeProduct, "storeProduct");
        G10.g(upgradeInfo, "upgradeInfo");
        G10.g(interfaceC3429bR, "onError");
        G10.g(interfaceC3429bR2, "onSuccess");
        purchases.purchaseProduct(activity, storeProduct, upgradeInfo, productChangeCompletedListener(interfaceC3429bR2, interfaceC3429bR));
    }

    public static /* synthetic */ void getCustomerInfoWith$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, NQ nq, NQ nq2, int i, Object obj) {
        if ((i & 2) != 0) {
            nq = ListenerConversionsCommonKt.getON_ERROR_STUB();
        }
        getCustomerInfoWith(purchases, cacheFetchPolicy, nq, nq2);
    }

    public static /* synthetic */ void purchasePackageWith$default(Purchases purchases, Activity activity, Package r2, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2, int i, Object obj) {
        if ((i & 4) != 0) {
            interfaceC3429bR = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchasePackageWith(purchases, activity, r2, interfaceC3429bR, interfaceC3429bR2);
    }

    public static /* synthetic */ void purchaseProductWith$default(Purchases purchases, Activity activity, StoreProduct storeProduct, UpgradeInfo upgradeInfo, InterfaceC3429bR interfaceC3429bR, InterfaceC3429bR interfaceC3429bR2, int i, Object obj) {
        if ((i & 8) != 0) {
            interfaceC3429bR = ListenerConversionsCommonKt.getON_PURCHASE_ERROR_STUB();
        }
        purchaseProductWith(purchases, activity, storeProduct, upgradeInfo, interfaceC3429bR, interfaceC3429bR2);
    }
}
