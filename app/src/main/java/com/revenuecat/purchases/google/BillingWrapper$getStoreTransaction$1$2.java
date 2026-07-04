package com.revenuecat.purchases.google;

import com.android.billingclient.api.Purchase;
import com.daaw.AbstractC4192e90;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.NQ;
import com.revenuecat.purchases.ProductType;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/ProductType;", "type", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/ProductType;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class BillingWrapper$getStoreTransaction$1$2 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ NQ $completion;
    final /* synthetic */ PurchaseContext $context;
    final /* synthetic */ Purchase $purchase;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$getStoreTransaction$1$2(NQ nq, Purchase purchase, PurchaseContext purchaseContext) {
        super(1);
        this.$completion = nq;
        this.$purchase = purchase;
        this.$context = purchaseContext;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((ProductType) obj);
        return G91.a;
    }

    public final void invoke(ProductType productType) {
        G10.g(productType, "type");
        NQ nq = this.$completion;
        Purchase purchase = this.$purchase;
        PurchaseContext purchaseContext = this.$context;
        nq.invoke(StoreTransactionConversionsKt.toStoreTransaction$default(purchase, productType, purchaseContext != null ? purchaseContext.getPresentedOfferingId() : null, null, null, 12, null));
    }
}
