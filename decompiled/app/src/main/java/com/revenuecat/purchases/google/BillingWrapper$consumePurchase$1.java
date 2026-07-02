package com.revenuecat.purchases.google;

import com.daaw.AbstractC4192e90;
import com.daaw.C7474pr;
import com.daaw.G10;
import com.daaw.G91;
import com.daaw.InterfaceC3429bR;
import com.daaw.InterfaceC7753qr;
import com.daaw.NQ;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.google.BillingWrapper$consumePurchase$1;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/revenuecat/purchases/PurchasesError;", "connectionError", "Lcom/daaw/G91;", "invoke", "(Lcom/revenuecat/purchases/PurchasesError;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
public final class BillingWrapper$consumePurchase$1 extends AbstractC4192e90 implements NQ {
    final /* synthetic */ InterfaceC3429bR $onConsumed;
    final /* synthetic */ String $token;
    final /* synthetic */ BillingWrapper this$0;

    /* JADX INFO: renamed from: com.revenuecat.purchases.google.BillingWrapper$consumePurchase$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/android/billingclient/api/a;", "Lcom/daaw/G91;", "invoke", "(Lcom/android/billingclient/api/a;)V", "<anonymous>"}, k = 3, mv = {1, 7, 1})
    public static final class AnonymousClass1 extends AbstractC4192e90 implements NQ {
        final /* synthetic */ InterfaceC3429bR $onConsumed;
        final /* synthetic */ String $token;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, InterfaceC3429bR interfaceC3429bR) {
            super(1);
            this.$token = str;
            this.$onConsumed = interfaceC3429bR;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$0(InterfaceC3429bR interfaceC3429bR, com.android.billingclient.api.d dVar, String str) {
            G10.g(interfaceC3429bR, "$tmp0");
            G10.g(dVar, "p0");
            G10.g(str, "p1");
            interfaceC3429bR.invoke(dVar, str);
        }

        @Override // com.daaw.NQ
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.android.billingclient.api.a) obj);
            return G91.a;
        }

        public final void invoke(com.android.billingclient.api.a aVar) {
            G10.g(aVar, "$this$withConnectedClient");
            C7474pr c7474prA = C7474pr.b().b(this.$token).a();
            final InterfaceC3429bR interfaceC3429bR = this.$onConsumed;
            aVar.b(c7474prA, new InterfaceC7753qr() { // from class: com.revenuecat.purchases.google.b
                @Override // com.daaw.InterfaceC7753qr
                public final void a(com.android.billingclient.api.d dVar, String str) {
                    BillingWrapper$consumePurchase$1.AnonymousClass1.invoke$lambda$0(interfaceC3429bR, dVar, str);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BillingWrapper$consumePurchase$1(BillingWrapper billingWrapper, String str, InterfaceC3429bR interfaceC3429bR) {
        super(1);
        this.this$0 = billingWrapper;
        this.$token = str;
        this.$onConsumed = interfaceC3429bR;
    }

    @Override // com.daaw.NQ
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((PurchasesError) obj);
        return G91.a;
    }

    public final void invoke(PurchasesError purchasesError) {
        if (purchasesError == null) {
            this.this$0.withConnectedClient(new AnonymousClass1(this.$token, this.$onConsumed));
        }
    }
}
