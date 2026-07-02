package com.revenuecat.purchases;

import android.os.Handler;
import com.android.billingclient.api.d;
import com.daaw.G10;
import com.daaw.InterfaceC7135of;
import com.revenuecat.purchases.PurchasesOrchestrator$Companion$canMakePayments$2$1;
import com.revenuecat.purchases.google.BillingResultExtensionsKt;
import com.revenuecat.purchases.interfaces.Callback;
import com.revenuecat.purchases.models.BillingFeature;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/revenuecat/purchases/PurchasesOrchestrator$Companion$canMakePayments$2$1", "Lcom/daaw/of;", "Lcom/android/billingclient/api/d;", "billingResult", "Lcom/daaw/G91;", "onBillingSetupFinished", "(Lcom/android/billingclient/api/d;)V", "onBillingServiceDisconnected", "()V", "purchases_defaultsRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PurchasesOrchestrator$Companion$canMakePayments$2$1 implements InterfaceC7135of {
    final /* synthetic */ com.android.billingclient.api.a $billingClient;
    final /* synthetic */ Callback<Boolean> $callback;
    final /* synthetic */ List<BillingFeature> $features;
    final /* synthetic */ Handler $mainHandler;

    /* JADX WARN: Multi-variable type inference failed */
    public PurchasesOrchestrator$Companion$canMakePayments$2$1(Handler handler, Callback<Boolean> callback, com.android.billingclient.api.a aVar, List<? extends BillingFeature> list) {
        this.$mainHandler = handler;
        this.$callback = callback;
        this.$billingClient = aVar;
        this.$features = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingServiceDisconnected$lambda$2(com.android.billingclient.api.a aVar, Callback callback) {
        G10.g(aVar, "$billingClient");
        G10.g(callback, "$callback");
        try {
            aVar.c();
        } catch (IllegalArgumentException unused) {
        } finally {
            callback.onReceived(Boolean.FALSE);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onBillingSetupFinished$lambda$1(d dVar, Callback callback, com.android.billingclient.api.a aVar, List list) {
        G10.g(dVar, "$billingResult");
        G10.g(callback, "$callback");
        G10.g(aVar, "$billingClient");
        G10.g(list, "$features");
        try {
            if (!BillingResultExtensionsKt.isSuccessful(dVar)) {
                callback.onReceived(Boolean.FALSE);
                aVar.c();
                return;
            }
            List list2 = list;
            boolean z = true;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    d dVarD = aVar.d(((BillingFeature) it.next()).getPlayBillingClientName());
                    G10.f(dVarD, "billingClient.isFeatureS…it.playBillingClientName)");
                    if (!BillingResultExtensionsKt.isSuccessful(dVarD)) {
                        z = false;
                        break;
                    }
                }
            }
            aVar.c();
            callback.onReceived(Boolean.valueOf(z));
        } catch (IllegalArgumentException unused) {
            callback.onReceived(Boolean.FALSE);
        }
    }

    @Override // com.daaw.InterfaceC7135of
    public void onBillingServiceDisconnected() {
        Handler handler = this.$mainHandler;
        final com.android.billingclient.api.a aVar = this.$billingClient;
        final Callback<Boolean> callback = this.$callback;
        handler.post(new Runnable() { // from class: com.daaw.ZB0
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingServiceDisconnected$lambda$2(aVar, callback);
            }
        });
    }

    @Override // com.daaw.InterfaceC7135of
    public void onBillingSetupFinished(final d billingResult) {
        G10.g(billingResult, "billingResult");
        Handler handler = this.$mainHandler;
        final Callback<Boolean> callback = this.$callback;
        final com.android.billingclient.api.a aVar = this.$billingClient;
        final List<BillingFeature> list = this.$features;
        handler.post(new Runnable() { // from class: com.daaw.aC0
            @Override // java.lang.Runnable
            public final void run() {
                PurchasesOrchestrator$Companion$canMakePayments$2$1.onBillingSetupFinished$lambda$1(billingResult, callback, aVar, list);
            }
        });
    }
}
