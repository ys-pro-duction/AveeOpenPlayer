package com.revenuecat.purchases;

import com.daaw.AbstractC2455Um;
import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.LQ;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import com.revenuecat.purchases.interfaces.ReceiveCustomerInfoCallback;
import com.revenuecat.purchases.models.StoreTransaction;
import com.revenuecat.purchases.strings.RestoreStrings;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/models/StoreTransaction;", "<anonymous parameter 0>", "Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/models/StoreTransaction;Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class PurchasesOrchestrator$restorePurchases$1$2$1$2 extends AbstractC4192e90 implements InterfaceC3429bR {
    final /* synthetic */ ReceiveCustomerInfoCallback $callback;
    final /* synthetic */ StoreTransaction $purchase;
    final /* synthetic */ List<StoreTransaction> $sortedByTime;
    final /* synthetic */ PurchasesOrchestrator this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.PurchasesOrchestrator$restorePurchases$1$2$1$2$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/daaw/G91;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements LQ {
        final /* synthetic */ ReceiveCustomerInfoCallback $callback;
        final /* synthetic */ PurchasesError $error;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(ReceiveCustomerInfoCallback receiveCustomerInfoCallback, PurchasesError purchasesError) {
            super(0);
            this.$callback = receiveCustomerInfoCallback;
            this.$error = purchasesError;
        }

        @Override // com.daaw.LQ
        public /* bridge */ /* synthetic */ Object invoke() {
            m90invoke();
            return G91.a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m90invoke() {
            this.$callback.onError(this.$error);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PurchasesOrchestrator$restorePurchases$1$2$1$2(StoreTransaction storeTransaction, List<StoreTransaction> list, PurchasesOrchestrator purchasesOrchestrator, ReceiveCustomerInfoCallback receiveCustomerInfoCallback) {
        super(2);
        this.$purchase = storeTransaction;
        this.$sortedByTime = list;
        this.this$0 = purchasesOrchestrator;
        this.$callback = receiveCustomerInfoCallback;
    }

    @Override // com.daaw.InterfaceC3429bR
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((StoreTransaction) obj, (PurchasesError) obj2);
        return G91.a;
    }

    public final void invoke(StoreTransaction storeTransaction, PurchasesError purchasesError) {
        G10.g(storeTransaction, "<anonymous parameter 0>");
        G10.g(purchasesError, "error");
        LogIntent logIntent = LogIntent.RC_ERROR;
        String str = String.format(RestoreStrings.RESTORING_PURCHASE_ERROR, Arrays.copyOf(new Object[]{this.$purchase, purchasesError}, 2));
        G10.f(str, "format(this, *args)");
        LogWrapperKt.log(logIntent, str);
        if (G10.c(AbstractC2455Um.p0(this.$sortedByTime), this.$purchase)) {
            this.this$0.dispatch(new AnonymousClass1(this.$callback, purchasesError));
        }
    }
}
