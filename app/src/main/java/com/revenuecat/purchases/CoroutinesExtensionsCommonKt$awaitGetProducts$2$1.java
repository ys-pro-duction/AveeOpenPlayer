package com.revenuecat.purchases;

import com.daaw.AbstractC1831Os;
import com.daaw.AbstractC4512fJ0;
import com.daaw.AbstractC9591xR;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC1416Ks;
import com.daaw.NQ;
import com.revenuecat.purchases.models.StoreProduct;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class CoroutinesExtensionsCommonKt$awaitGetProducts$2$1 extends AbstractC9591xR implements NQ {
    public CoroutinesExtensionsCommonKt$awaitGetProducts$2$1(Object obj) {
        super(1, obj, AbstractC1831Os.class, "resume", "resume(Lkotlin/coroutines/Continuation;Ljava/lang/Object;)V", 1);
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((List<? extends StoreProduct>) obj);
        return G91.a;
    }

    public final void invoke(List<? extends StoreProduct> list) {
        G10.g(list, "p0");
        ((InterfaceC1416Ks) this.receiver).x(AbstractC4512fJ0.a(list));
    }
}
