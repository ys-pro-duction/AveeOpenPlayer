package com.revenuecat.purchases;

import com.daaw.AbstractC7497pw;
import com.daaw.DM0;
import com.daaw.H10;
import com.daaw.I10;
import com.daaw.InterfaceC1416Ks;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001f\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0004H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a7\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\t*\u00020\u00002\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0017\u0010\u0012\u001a\u00020\u0011*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/Offerings;", "awaitOfferings", "(Lcom/revenuecat/purchases/Purchases;Lcom/daaw/Ks;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/PurchaseParams;", "purchaseParams", "Lcom/revenuecat/purchases/PurchaseResult;", "awaitPurchase", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/PurchaseParams;Lcom/daaw/Ks;)Ljava/lang/Object;", "", "", "productIds", "Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/revenuecat/purchases/models/StoreProduct;", "awaitGetProducts", "(Lcom/revenuecat/purchases/Purchases;Ljava/util/List;Lcom/revenuecat/purchases/ProductType;Lcom/daaw/Ks;)Ljava/lang/Object;", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitRestore", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CoroutinesExtensionsCommonKt {
    public static final /* synthetic */ Object awaitGetProducts(Purchases purchases, List list, ProductType productType, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        DM0 dm0 = new DM0(H10.b(interfaceC1416Ks));
        ListenerConversionsCommonKt.getProductsWith(purchases, list, productType, new CoroutinesExtensionsCommonKt$awaitGetProducts$2$2(dm0), new CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(dm0));
        Object objA = dm0.a();
        if (objA == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitGetProducts$default(Purchases purchases, List list, ProductType productType, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj) {
        if ((i & 2) != 0) {
            productType = null;
        }
        return awaitGetProducts(purchases, list, productType, interfaceC1416Ks);
    }

    public static final /* synthetic */ Object awaitOfferings(Purchases purchases, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        DM0 dm0 = new DM0(H10.b(interfaceC1416Ks));
        ListenerConversionsCommonKt.getOfferingsWith(purchases, new CoroutinesExtensionsCommonKt$awaitOfferings$2$2(dm0), new CoroutinesExtensionsCommonKt$awaitOfferings$2$1(dm0));
        Object objA = dm0.a();
        if (objA == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitPurchase(Purchases purchases, PurchaseParams purchaseParams, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        DM0 dm0 = new DM0(H10.b(interfaceC1416Ks));
        purchases.purchase(purchaseParams, ListenerConversionsCommonKt.purchaseCompletedCallback(new CoroutinesExtensionsCommonKt$awaitPurchase$2$1(dm0), new CoroutinesExtensionsCommonKt$awaitPurchase$2$2(dm0)));
        Object objA = dm0.a();
        if (objA == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitRestore(Purchases purchases, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        DM0 dm0 = new DM0(H10.b(interfaceC1416Ks));
        ListenerConversionsCommonKt.restorePurchasesWith(purchases, new CoroutinesExtensionsCommonKt$awaitRestore$2$1(dm0), new CoroutinesExtensionsCommonKt$awaitRestore$2$2(dm0));
        Object objA = dm0.a();
        if (objA == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objA;
    }
}
