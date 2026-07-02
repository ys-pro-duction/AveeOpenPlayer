package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.NQ;
import com.revenuecat.purchases.common.LogIntent;
import com.revenuecat.purchases.common.LogWrapperKt;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "error", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ NQ $onError;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PostPendingTransactionsHelper$syncPendingPurchaseQueue$1$2(NQ nq) {
        super(1);
        this.$onError = nq;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G91.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        G10.g(purchasesError, "error");
        LogWrapperKt.log(LogIntent.GOOGLE_ERROR, purchasesError.toString());
        NQ nq = this.$onError;
        if (nq != null) {
            nq.invoke(purchasesError);
        }
    }
}
