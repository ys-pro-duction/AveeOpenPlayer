package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.LQ;
import com.revenuecat.purchases.common.offerings.OfferingsManager;
import com.revenuecat.purchases.interfaces.LogInCallback;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class PurchasesOrchestrator$logIn$2$1 extends AbstractC4192e90 implements InterfaceC3429bR {
    final /* synthetic */ LogInCallback $callback;
    final /* synthetic */ String $newAppUserID;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$logIn$2$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ LogInCallback $callback;
        final /* synthetic */ boolean $created;
        final /* synthetic */ CustomerInfo $customerInfo;
        final /* synthetic */ PurchasesOrchestrator this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(LogInCallback logInCallback, CustomerInfo customerInfo, boolean z, PurchasesOrchestrator purchasesOrchestrator) {
            super(0);
            this.$callback = logInCallback;
            this.$customerInfo = customerInfo;
            this.$created = z;
            this.this$0 = purchasesOrchestrator;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m85invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m85invoke() {
            LogInCallback logInCallback = this.$callback;
            if (logInCallback != null) {
                logInCallback.onReceived(this.$customerInfo, this.$created);
            }
            this.this$0.customerInfoUpdateHandler.notifyListeners(this.$customerInfo);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$logIn$2$1(PurchasesOrchestrator purchasesOrchestrator, String str, LogInCallback logInCallback) {
        super(2);
        this.this$0 = purchasesOrchestrator;
        this.$newAppUserID = str;
        this.$callback = logInCallback;
    }

    @Override // com.daaw.InterfaceC3429bR
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Throwable {
        invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
        return G91.a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z) throws Throwable {
        G10.g(customerInfo, "customerInfo");
        PurchasesOrchestrator purchasesOrchestrator = this.this$0;
        purchasesOrchestrator.dispatch(new AnonymousClass1(this.$callback, customerInfo, z, purchasesOrchestrator));
        OfferingsManager.fetchAndCacheOfferings$default(this.this$0.offeringsManager, this.$newAppUserID, this.this$0.getState$purchases_defaultsRelease().getAppInBackground(), null, null, 12, null);
    }
}
