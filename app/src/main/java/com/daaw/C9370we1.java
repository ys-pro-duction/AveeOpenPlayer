package com.daaw;

import androidx.lifecycle.y;
import com.daaw.C9928ye1;
import com.revenuecat.purchases.common.responses.ProductResponseJsonKeys;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;

/* JADX INFO: renamed from: com.daaw.we1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C9370we1 {
    public final C0313Ae1 a;
    public final y.c b;
    public final AbstractC5247hu c;

    public C9370we1(C0313Ae1 c0313Ae1, y.c cVar, AbstractC5247hu abstractC5247hu) {
        G10.g(c0313Ae1, ProductResponseJsonKeys.STORE);
        G10.g(cVar, "factory");
        G10.g(abstractC5247hu, "extras");
        this.a = c0313Ae1;
        this.b = cVar;
        this.c = abstractC5247hu;
    }

    public static /* synthetic */ AbstractC8526te1 b(C9370we1 c9370we1, J50 j50, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            str = C9928ye1.a.c(j50);
        }
        return c9370we1.a(j50, str);
    }

    public final AbstractC8526te1 a(J50 j50, String str) {
        G10.g(j50, "modelClass");
        G10.g(str, SubscriberAttributeKt.JSON_NAME_KEY);
        AbstractC8526te1 abstractC8526te1B = this.a.b(str);
        if (!j50.l(abstractC8526te1B)) {
            C3804cm0 c3804cm0 = new C3804cm0(this.c);
            c3804cm0.c(C9928ye1.a.a, str);
            AbstractC8526te1 abstractC8526te1A = AbstractC9649xe1.a(this.b, j50, c3804cm0);
            this.a.d(str, abstractC8526te1A);
            return abstractC8526te1A;
        }
        Object obj = this.b;
        if (obj instanceof y.e) {
            G10.d(abstractC8526te1B);
            ((y.e) obj).d(abstractC8526te1B);
        }
        G10.e(abstractC8526te1B, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
        return abstractC8526te1B;
    }
}
