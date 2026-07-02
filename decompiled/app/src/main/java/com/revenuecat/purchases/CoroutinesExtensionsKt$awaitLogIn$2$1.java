package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC4512fJ0;
import com.daaw.AbstractC4801gJ0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC1416Ks;
import com.daaw.NQ;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "it", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class CoroutinesExtensionsKt$awaitLogIn$2$1 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ InterfaceC1416Ks $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsKt$awaitLogIn$2$1(InterfaceC1416Ks interfaceC1416Ks) {
        super(1);
        this.$continuation = interfaceC1416Ks;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G91.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        G10.g(purchasesError, "it");
        InterfaceC1416Ks interfaceC1416Ks = this.$continuation;
        AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
        interfaceC1416Ks.x(AbstractC4512fJ0.a(AbstractC4801gJ0.a(new PurchasesException(purchasesError))));
    }
}
