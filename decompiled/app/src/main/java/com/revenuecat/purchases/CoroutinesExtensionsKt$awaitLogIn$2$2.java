package com.revenuecat.purchases;

import com.daaw.AbstractC4192e90;
import com.daaw.AbstractC4512fJ0;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC1416Ks;
import com.daaw.InterfaceC3429bR;
import com.revenuecat.purchases.data.LogInResult;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/revenuecat/purchases/CustomerInfo;", "customerInfo", "", "created", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/CustomerInfo;Z)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class CoroutinesExtensionsKt$awaitLogIn$2$2 extends AbstractC4192e90 implements InterfaceC3429bR {
    final /* synthetic */ InterfaceC1416Ks $continuation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesExtensionsKt$awaitLogIn$2$2(InterfaceC1416Ks interfaceC1416Ks) {
        super(2);
        this.$continuation = interfaceC1416Ks;
    }

    @Override // com.daaw.InterfaceC3429bR
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((CustomerInfo) obj, ((Boolean) obj2).booleanValue());
        return G91.a;
    }

    public final void invoke(CustomerInfo customerInfo, boolean z) {
        G10.g(customerInfo, "customerInfo");
        InterfaceC1416Ks interfaceC1416Ks = this.$continuation;
        AbstractC4512fJ0.a aVar = AbstractC4512fJ0.B;
        interfaceC1416Ks.x(AbstractC4512fJ0.a(new LogInResult(customerInfo, z)));
    }
}
