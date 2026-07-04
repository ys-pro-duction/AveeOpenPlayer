package com.revenuecat.purchases;

import com.daaw.AbstractC7497pw;
import com.daaw.DM0;
import com.daaw.H10;
import com.daaw.I10;
import com.daaw.InterfaceC1416Ks;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a!\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001f\u0010\t\u001a\u00020\b*\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\u0003*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0017\u0010\r\u001a\u00020\u0003*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/Purchases;", "Lcom/revenuecat/purchases/CacheFetchPolicy;", "fetchPolicy", "Lcom/revenuecat/purchases/CustomerInfo;", "awaitCustomerInfo", "(Lcom/revenuecat/purchases/Purchases;Lcom/revenuecat/purchases/CacheFetchPolicy;Lcom/daaw/Ks;)Ljava/lang/Object;", "", "appUserID", "Lcom/revenuecat/purchases/data/LogInResult;", "awaitLogIn", "(Lcom/revenuecat/purchases/Purchases;Ljava/lang/String;Lcom/daaw/Ks;)Ljava/lang/Object;", "awaitLogOut", "(Lcom/revenuecat/purchases/Purchases;Lcom/daaw/Ks;)Ljava/lang/Object;", "awaitSyncPurchases", "purchases_defaultsRelease"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class CoroutinesExtensionsKt {
    public static final /* synthetic */ Object awaitCustomerInfo(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        DM0 dm0 = new DM0(H10.b(interfaceC1416Ks));
        ListenerConversionsKt.getCustomerInfoWith(purchases, cacheFetchPolicy, new CoroutinesExtensionsKt$awaitCustomerInfo$2$2(dm0), new CoroutinesExtensionsKt$awaitCustomerInfo$2$1(dm0));
        Object objA = dm0.a();
        if (objA == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objA;
    }

    public static /* synthetic */ Object awaitCustomerInfo$default(Purchases purchases, CacheFetchPolicy cacheFetchPolicy, InterfaceC1416Ks interfaceC1416Ks, int i, Object obj) {
        if ((i & 1) != 0) {
            cacheFetchPolicy = CacheFetchPolicy.INSTANCE.m66default();
        }
        return awaitCustomerInfo(purchases, cacheFetchPolicy, interfaceC1416Ks);
    }

    public static final /* synthetic */ Object awaitLogIn(Purchases purchases, String str, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        DM0 dm0 = new DM0(H10.b(interfaceC1416Ks));
        ListenerConversionsKt.logInWith(purchases, str, new CoroutinesExtensionsKt$awaitLogIn$2$1(dm0), new CoroutinesExtensionsKt$awaitLogIn$2$2(dm0));
        Object objA = dm0.a();
        if (objA == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitLogOut(Purchases purchases, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        DM0 dm0 = new DM0(H10.b(interfaceC1416Ks));
        ListenerConversionsKt.logOutWith(purchases, new CoroutinesExtensionsKt$awaitLogOut$2$1(dm0), new CoroutinesExtensionsKt$awaitLogOut$2$2(dm0));
        Object objA = dm0.a();
        if (objA == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objA;
    }

    public static final /* synthetic */ Object awaitSyncPurchases(Purchases purchases, InterfaceC1416Ks interfaceC1416Ks) throws Throwable {
        DM0 dm0 = new DM0(H10.b(interfaceC1416Ks));
        ListenerConversionsKt.syncPurchasesWith(purchases, new CoroutinesExtensionsKt$awaitSyncPurchases$2$2(dm0), new CoroutinesExtensionsKt$awaitSyncPurchases$2$1(dm0));
        Object objA = dm0.a();
        if (objA == I10.c()) {
            AbstractC7497pw.c(interfaceC1416Ks);
        }
        return objA;
    }
}
